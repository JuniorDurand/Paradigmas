/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author durand
 */
public class Item {
    protected String name;
    protected int quantity;
    protected double price;
    protected double totalPrice;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
    
    @Override
    public String toString(){
        return name +" " + String.valueOf(price) +" "+ String.valueOf(quantity) +" "+ String.valueOf(getTotalPrice()); 
    }
    
}
