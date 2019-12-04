/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_9;

/**
 *
 * @author Lenovo
 */
public class Abinario {
    private void addNodo( Nodo nodo, Nodo raiz ) {
   
    if ( raiz == null ) {
    
        this.setRaiz(nodo);
    }
    else {
        
        if ( nodo.getValor() <= raiz.getValor() ) {
         
            if (raiz.getHojaIzquierda() == null) {
                raiz.setHojaIzquierda(nodo);
            }
            else {
                addNodo( nodo , raiz.getHojaIzquierda() );
            }
        }
        else {
          
            if (raiz.getHojaDerecha() == null) {
                raiz.setHojaDerecha(nodo);
            }
            else {
                addNodo( nodo, raiz.getHojaDerecha() );
            }
        }
    }
   }

    private void setRaiz(Nodo nodo) {
        
    }
}
    

