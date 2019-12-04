/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_10_P2_3_4_5;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Abinario {
    public static void main(String[] args) {
      
            Arbol arbol = new Arbol();
            Nodo nodo = null ;
        int valor;
        String Dato;
        String res="si";
      //EJERCICIO 13.3
        do{
        int menu=Integer.parseInt(JOptionPane.showInputDialog("Selecciona la operación que deseas realizar: \n1)Insertar caracter \n2)Buscar caracter \n3)Recorrido en orden \n4)Recorrido en preorden \n5)Recorrido en postorden \6)Salir"));
        
        switch(menu){
            case 1:
                  System.out.println("VALORES INSERTADOS: ");
                    Dato = JOptionPane.showInputDialog("Escribe el dato a insertar");
                    
            valor = Integer.parseInt(Dato);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
            
        
            break;
            case 2:
                //buscar
                int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato que deseas buscar"));
           
                if(arbol.buscar(elemento)==null){
                    System.out.println("El nodo "+elemento+" no se encuentra");
                }else{
                    System.out.println("Nodo encontrado, dato: "+arbol.buscar(elemento));
                }
                break;
            case 3:
                 System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();
            
            break;
                    case 4:
                  
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();
        
                    case 5:
                          System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPosorden();
        break;
                    case 6:
                        System.exit(0);
        }
        }
          while(res.equalsIgnoreCase("si"));
          res=JOptionPane.showInputDialog("Desea realizar otra operación\nsi/no");
        
        
        //EJERCICIO 13.10
        Arbol a = new Arbol();
        System.out.println("El arbol está completo: "+a.EsCompleto(nodo));
       
        
       Nodo a1 = null,a2 = null;
       
        //EJERCICIO 13.4
         System.out.println("Son identicos: "+a.identicos(a1, a2));
    
      //EJERCICIO 13.5
         System.out.println("Nodo máximo: "+a.valorMaximo(nodo));
        
      
    }
}
