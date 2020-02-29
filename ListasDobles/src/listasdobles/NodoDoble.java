/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

/**
 *
 * @author santi
 */
public class NodoDoble {
    public int dato;    
    NodoDoble siguiente, anterior;
    
    //Contructor para cunado ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){        
        dato=el;
        siguiente=s;
        anterior=a;
    }
    
    //Contructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el,null,null);
    }
    
    //metodo para pasar al siguiente 
    public NodoDoble GetSiguiente(){
        return siguiente;
    }
    
    //metodo para pasar el anterior 
    public NodoDoble GetAnterior(){
        return anterior;
    }
    
    //Metodo para retornar el dato
    public int GetDato(){
        return dato;
    }
    
    //Metodo para cambiar de valor el dato siguiente
    public void SetSiguiente(NodoDoble siguiente){
        this.siguiente = siguiente;
    }
}
