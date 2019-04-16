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
        
        
    }

    public void menu(){
        System.out.println("1 - cadastrar mesa");
        System.out.println("2 - modificar mesa");
        System.out.println("3 - fechar mesa");
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
        boolean flag = false;
        do{ 
            flag = false;
            System.out.print("Digite o numero identificador da mesa");
            ident = input.nextInt();
            for(Table x: Tables){
                if(x.identifier == ident){
                    flag = true;
                    x.cadastrarPedido();
                }
            }
        }while(flag)
        Tables.add(new Table(ident));
    }


}
