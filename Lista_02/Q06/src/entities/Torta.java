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
public class Torta extends Item{
   public Torta(int quant) {
        this.name = "torta";
        this.quantity = quant;
        this.price = 24.99;
    }
    
}
