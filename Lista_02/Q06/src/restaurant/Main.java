/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import entities.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author durand
 */
public class Main {
    Scanner input = new Scanner(System.in);
    ArrayList <Table> Tables = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main prog = new Main();
        int opcao = 0;
        do{
            prog.menu();
            switch(opcao){
                case 1:prog.cadastrarMesa(); break;
                case 2:prog.cadastrarPedido();break;
                case 3:prog.cancelarPedido();break;
                case 4:prog.fecharMesa();break;
                case 5:prog.printReportTotal();break;
                case 6:break;
                default: System.out.println("Digite uma opção valida");
            }

        }while(opcao != 6);
        
        
    }





    public void menu(){
        System.out.println("1 - cadastrar mesa");
        System.out.println("2 - cadastrar pedido");
        System.out.println("3 - cancelar pedido");
        System.out.println("4 - Fechar Mesa");
        System.out.println("5 - Relatorio Total");
        System.out.println("6 - Sair");
    }
    public void cadastrarMesa(){
        int ident;
        boolean flag = false;
        do{ 
            flag = false;
            System.out.print("Digite o numero identificador da mesa");
            ident = input.nextInt();
            for(Table x: Tables){
                if(x.identifier == ident){
                    flag = true;
                    System.out.println("Identificador invalido");
                }
            }
        }while(flag);
        Tables.add(new Table(ident));
    }
    public void cadastrarPedido(){
        int ident;
        boolean flag = true;
        do{ 
            flag = true;
            System.out.print("Digite o numero identificador da mesa:");
            ident = input.nextInt();
            for(Table x: Tables){
                if(x.identifier == ident){
                    flag = false;
                    x.cadastrarPedido();
                }
            }
            if(flag){
                System.out.println("Mesa não encontrada");
            }
        }while(flag);
    }

    public void cancelarPedido(){
        int ident;
        boolean flag = true;
        do{ 
            flag = true;
            System.out.print("Digite o numero identificador da mesa:");
            ident = input.nextInt();
            for(Table x: Tables){
                if(x.identifier == ident){
                    flag = false;
                    x.cancelarPedido();
                }
            }
            if(flag){
                System.out.println("Mesa não encontrada");
            }
        }while(flag);
    }

    public double fecharMesa(){
        int ident;
        boolean flag = true;
        do{ 
            flag = true;
            System.out.print("Digite o numero identificador da mesa:");
            ident = input.nextInt();
            for(Table x: Tables){
                if(x.identifier == ident){
                    flag = false;
                    return x.bill();
                }
            }
            if(flag){
                System.out.println("Mesa não encontrada");
            }
        }while(flag);
        return 0;
    }
    public void printReportTotal(){
        for(Table x: Tables){
            x.printReportTable();
        }
    }
}
