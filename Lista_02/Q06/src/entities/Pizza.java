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
public class Pizza extends Item {
    public Pizza(int quant){
        this.quantity = quant;
        this.name = "Pizza";
        this.price = 14.90;
    }
    
}
