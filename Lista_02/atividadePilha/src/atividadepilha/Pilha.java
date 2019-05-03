/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividadepilha;

/**
 *
 * @author durand
 */
public class Pilha {
    ArrayList<Object> elms;
    
    public Pilha(){
        elms = new ArrayList<>();
    }

    public Object Pop(){
        if(!(elms.isEmpty())){
            Object aux = elms.get(0);
            elms.remove(0);
            return aux;
        }
    }
    public void Push(Object elm){
        elms.add(0,elm);
    }
    public Object Topo(){
        return elms.get(0);
    }
    public boolean Vazia(){
        return elms.isEmpty()
    }
    public int Tamanho(){
        return elms.size();
    }
}
