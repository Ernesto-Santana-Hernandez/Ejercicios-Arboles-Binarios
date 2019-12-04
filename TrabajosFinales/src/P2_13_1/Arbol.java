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
public class Arbol {

    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;

    }

    Arbol() {
        
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void agregar(Nodo nodo, Nodo raiz) {
        if (raiz == null) {
            this.setRaiz(nodo);

        } else {
            if ((int) nodo.getDato() <= (int) raiz.getDato()) {
                if (raiz.getIzdo() == null) {
                    raiz.setIzdo(nodo);
                } else {
                    agregar(nodo, raiz.getIzdo());
                }
            } else {
            }
        }
    }

    public void agregarNodo(Nodo nodo) {
        this.agregar(nodo, this.raiz);
    }

    public void recorrerPostorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            recorrerPostorden(nodo.izdo);
            recorrerPostorden(nodo.dcho);
            System.out.println("Dato: " + nodo.getDato());
        }

    }

    public void Inorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
            Inorden(nodo.getIzdo());
            System.out.println("Dato: " + nodo.getDato());
            Inorden(nodo.dcho);
        }
    }
}
