/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
/**
 *
 * @author durand
 */
public class Orders {
    ArrayList <Item> ListItems = new ArrayList();





    public double getTotalPrice() {
        double totalPrice = 0.0;
        for(Item x: ListItems){
            totalPrice += x.getTotalPrice();
        }
        return totalPrice;
    }
    
    public void addItem(String type, int quantity){
        if(type == "pizza"){
            ListItems.add(new Pizza(quantity));
        }else if(type == "refrigerante"){
            ListItems.add(new Pizza(quantity));
        }
    }




}