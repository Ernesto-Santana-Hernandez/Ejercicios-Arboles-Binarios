/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_11_13_12;

/**
 *
 * @author Lenovo
 */
public class Nodo {
     int dato;
     Nodo der;
     Nodo izq;
    
    Nodo(int dat)
    {
        this.dato=dat;
        this.der=null;
        this.izq=null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
    
}
