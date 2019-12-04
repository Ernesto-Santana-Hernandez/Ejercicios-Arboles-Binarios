/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_13_1;

/**
 *
 * @author Lenovo
 */
public class Nodo {

    private int dato;
    protected Nodo izdo;
    protected Nodo dcho;

    public Nodo(int dato) {
        this.dato = dato;
        izdo = dcho = null;
    }

    public Nodo(Object dato, Nodo izquierdo, Nodo derecho) {

    }

    public Nodo(int dato, Nodo izdo, Nodo dcho) {
        this.dato = dato;
        this.izdo = izdo;
        this.dcho = dcho;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
}
