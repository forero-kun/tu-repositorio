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
public class ListasDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        DoubleLinkedList listica = new DoubleLinkedList();
        int opcion=0,elemento;
        do{
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar un Nodo al inicio\n"
                        + "2.Agregar un Nodo al final\n"
                        + "3.Mostrar la lista de Inicio a Fin\n"
                        + "4.Mostrar la lista de fin a inicio\n"
                        + "5.Buscar un dato en la lista\n"
                        + "6.Ingresar nuevos Nodos de mayor a menor\n"
                        + "7.Eliminar un Nodo\n"
                        + "8.Ingresar nuevos Nodos al verificar si un Nodo existe en la lista\n"
                        + "9.Salir\n"
                        + "¿Qué deseas hacer?","Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo","Agregando Nodo al inicio",
                                JOptionPane.INFORMATION_MESSAGE));
                        listica.agregarAlinicio(elemento);
                        break;
                    case 2:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo","Agregando Nodo al final",
                                JOptionPane.INFORMATION_MESSAGE));
                        listica.agregarAlFinal(elemento);
                        break;
                    case 3:
                        if(!listica.estVacia()){
                            listica.MostrarListaInicioFin();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay Nodos aun",
                                    "Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!listica.estVacia()){
                            listica.MostrarListafINInicio();
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay Nodos aun",
                                    "Lista vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento que deseas buscar","Buscando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        if(listica.repetido(elemento)){
                            JOptionPane.showMessageDialog(null,"El dato SI existe",
                                "Existe",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null,"El dato NO existe",
                                "NO existe",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento del Nodo","Agregando de mayor a menor",
                                JOptionPane.INFORMATION_MESSAGE));
                        listica.AgregarDeMayorAMenor(elemento);
                        break;
                    case 7:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento que quieres eliminar","Eliminando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        listica.EliminarElmento(elemento);
                        break;
                    case 8:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el elemento que deseas buscar","Verificando Nodo",
                                JOptionPane.INFORMATION_MESSAGE));
                        if(listica.repetido(elemento)){
                            listica.agregarAlFinal(156);
                            listica.agregarAlFinal(537);
                            listica.agregarAlinicio(290);
                            listica.agregarAlinicio(484);
                            JOptionPane.showMessageDialog(null,"Datos Añadidos exitosamente",
                                "Exito!",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            listica.Excepti();
                        }
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null,"Aplicacion finalizada",
                                "Fiiin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"La opcion no esta en el menu", "Error",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
            }
        }while(opcion!=9);
    }
    
}
