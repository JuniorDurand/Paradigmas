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
    ArrayList <Client> Clients = new ArrayList();
    
    
    public double bill(){// Conta total da mesa
        double bill = 0.0;
        for(Client x : Clients){
            bill += x.totalPerClient();
        }
        return bill;
    }
    
}
