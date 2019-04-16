/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import entities.Client;
import java.util.ArrayList;
/**
 *
 * @author durand
 */
public class Table {
    int identifier;
    Scanner input = new Scanner(System.in);
    ArrayList <Client> Clients;
    
    public Table(int ident){
        this.identifier = ident;
        Clients = new ArrayList();
}


    public double bill(){// Conta total da mesa
        double bill = 0.0;
        for(Client x : Clients){
            bill += x.totalPerClient();
        }
        return bill;
    }
    
    public void addClient(String name){
        Clients.add(new Client(name));
    }
    
    public void printReportTable(){
        Sistem.out.println("Mesa: "+this.identifier);
        for(Client x : Clients){
            x.printReportClient();
        }
    }

    public void cadastrarPedido(){
        String nome;
        Sistem.out.println("Digite o nome do cliente");
        nome = nextLine();

    }

    
}
