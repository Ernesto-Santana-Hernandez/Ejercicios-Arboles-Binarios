/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_13_6;

/**
 *
 * @author Lenovo
 */
public class arbol {
     private abb nodo;
     private abb raiz;
     private boolean dato;
     private Object Izdo;
     private Object Dere;

    public arbol(abb nodo, abb raiz, boolean dato, Object Izdo, Object Dere) {
        this.nodo = nodo;
        this.raiz = raiz;
        this.dato = dato;
        this.Izdo = Izdo;
        this.Dere = Dere;
    }

     
    public abb getNodo() {
        return nodo;
    }

    public void setNodo(abb nodo) {
        this.nodo = nodo;
    }

    public abb getRaiz() {
        return raiz;
    }

    public void setRaiz(abb raiz) {
        this.raiz = raiz;
    }

    public boolean isDato() {
        return dato;
    }

    public void setDato(boolean dato) {
        this.dato = dato;
    }

    public Object getIzdo() {
        return Izdo;
    }

    public void setIzdo(Object Izdo) {
        this.Izdo = Izdo;
    }

    public Object getDere() {
        return Dere;
    }

    public void setDere(Object Dere) {
        this.Dere = Dere;
    }

     
}