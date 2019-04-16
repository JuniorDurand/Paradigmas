/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;

/**
 *
 * @author durand
 */
public class Main {
    Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Table> Tables = new ArrayList();
        int opcao;
        do{
            switch(opcao){
                case 1:cadastrarMesa(); break;
                case 2:

            }

        }while(opcao != 5);
        
        
    }

    public void menu(){
        System.out.println("1 - cadastrar mesa");
        System.out.println("2 - cadastrar pedido");
        System.out.println("3 - cancelar pedido mesa");
        System.out.println("4 - Relatorio total");
        System.out.println("5 - fechar");
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
        }while(flag)
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
        }while(flag)
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
        }while(flag)
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
        }while(flag)
    }
    public void printReportTotal(){
        for(Table x: Tables){
            x.printReportTable();
        }
    }

}
