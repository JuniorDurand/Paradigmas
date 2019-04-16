/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.ArrayList;
import entities.Client;
import java.util.Scanner;
/**
 *
 * @author durand
 */
public class Client {
    String name;
    Orders requests;
    Scanner input = new Scanner(System.in);
       
    public Client(String name){
        this.name = name;
        requests = new Orders();
    }
    
    public double totalPerClient(){
        return requests.getTotalPrice();

    }
    
    public void addRequests(){
        String nameRequest;
        int quantityRequest;
        System.out.print("Digite o nome do pedido:");
        nameRequest = input.next();
        System.out.print("Digite a quantidade do pedido:");
        quantityRequest = input.nextInt();
        requests.addItem( nameRequest, quantityRequest);
    }

    public void cancelRequests(){
        String nameRequest;
        int quantityRequest;
        System.out.print("Digite o nome do pedido a ser cancelado:");
        nameRequest = input.next();
        System.out.print("Digite a quantidade do pedido a ser cancelado:");
        quantityRequest = input.nextInt();
        requests.cancelItem( nameRequest, quantityRequest);
    }
    
    public void printReportClient(){
        System.out.println("Client: "+this.name);
        System.out.println("Pedidos:");
        requests.printReportItems();
        
    }
    public void cadastrarPedido(String name){
        
    }

 }
