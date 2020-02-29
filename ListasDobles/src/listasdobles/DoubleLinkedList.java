/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class DoubleLinkedList {
    private NodoDoble inicio,fin;
    public DoubleLinkedList()
    {
        inicio=fin=null;
    }
    
    //Metodo para saber si la lista esta vacia
    public boolean estVacia(){
        return inicio==null;
    }
    
    //Metodo para agregar Nodos al final
    public void agregarAlFinal(int el){
        if(!estVacia()){
            fin=new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    
    //Metodo para agregar al inicio
    public void agregarAlinicio(int el){
        if(!estVacia()){
            inicio=new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }
    
    //Metodo para mostrar la lista de inicio a fin
    public void MostrarListaInicioFin() {
        if(!estVacia()){
            String datos="<=>";
            NodoDoble current=inicio;
            while(current!=null){
                datos += "["+current.dato+"]<=>";
                current = current.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de inicio a Fin",JOptionPane.INFORMATION_MESSAGE);
        }
    }    
    
    //Metodo para mostrar la lista de inicio a fin
    public void MostrarListafINInicio() {
        if(!estVacia()){
            String datos="<=>";
            NodoDoble current=fin;
            while(current!=null){
                datos += "["+current.dato+"]<=>";
                current = current.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de inicio a Fin",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Metodo para saber si un dato esta repetido
    public boolean repetido(int el){
        boolean repe = false;
        NodoDoble current = inicio;
        while(current != null){
                if(current.dato==el){
                    repe = true;
                    break;                    
                }else{
                    repe = false;
                }                
                current = current.siguiente;
            }
        return repe;
    }    
   
    //Metodo para Eliminar un elemento
    public void EliminarElmento(int el) throws Exception{
        if (!estVacia()) {
            if (inicio == fin && el == inicio.GetDato()) {
                inicio = fin = null;
            } else if (el == inicio.GetDato()) {
                inicio = inicio.GetSiguiente();
            } else {
                NodoDoble ante, temporal;
                ante = inicio;
                temporal = inicio.GetSiguiente();
                while (temporal != null && temporal.GetDato() != el) {
                    ante = ante.GetSiguiente();
                    temporal = temporal.GetSiguiente();
                }
                if (temporal != null) {
                    ante.SetSiguiente(temporal.GetSiguiente());
                    if (temporal == fin) {
                        fin = ante;
                    }
                }
            }
        }else{
            throw new Exception("No existen datos por borrar!!!");
        }
    }
    
    //Metodo para lazar excepcion
    public void Excepti() throws Exception{        
            throw new Exception("El dato especificado NO existe en la lista!!!");              
    }
    
    //metodo para agregar de mayor a menor
    public void AgregarDeMayorAMenor(int el) throws Exception{
        if(repetido(el)){
            throw new Exception("El dato ya existe en la lista!!!");
        }else{
            /*
        Crear un nodo para el nuevo dato.
        Si la lista esta vacía, o el valor del primer elemento de la lista 
        es mayor que el nuevo, insertar el nuevo nodo en la primera posición 
        de la lista y modificar la cabecera respectivamente.
        
         */
        NodoDoble newNode = new NodoDoble(el);
        if (estVacia() || inicio.GetDato() == el) {
            newNode.SetSiguiente(inicio);
            inicio = newNode;
        } else {
            /* 
        Si no se cumple el caso anterior, buscar el lugar adecuado 
            para la inserción: recorrer la lista conservando el nodo actual. 
            Inicializar nodo actual con el valor de primera posición, 
            y avanzar mientras el siguiente nodo no sea nulo y el dato 
            que contiene la siguiente posición sea mayor o igual que 
            el dato a insertar.
             */
            NodoDoble current = inicio;//
            while (current.GetSiguiente() != null
                    && current.siguiente.GetDato() >= el) {
                current = current.GetSiguiente();
            }
            /*
            Con esto se señala al nodo adecuado, 
            a continuación insertar el nuevo nodo a continuación de él.
             */
            newNode.SetSiguiente(current.GetSiguiente());
            current.SetSiguiente(newNode);
        }
        }        
    }
}
