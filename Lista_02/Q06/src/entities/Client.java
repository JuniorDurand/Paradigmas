/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
import entities.Client;
/**
 *
 * @author durand
 */
public class Client {
    String name;
    ArrayList <Orders> requests = new ArrayList();
}
