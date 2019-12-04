/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_13;

/**
 *
 * @author Lenovo
 */
public class Arbol {

    private Nodo raiz;

    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
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
            if (nodo.getDato() <= raiz.getDato()) {
                if (raiz.getIzdo() == null) {
                    raiz.setIzdo(nodo);
                }
            } else {
                agregar(nodo, raiz.getIzdo());
            }
        }
    }

    public void agregarNodo(Nodo nodo) {
        this.agregar(nodo, this.raiz);
    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo == null) {
            return;
        } else {
        }
        System.out.println("Dato: " + nodo.getDato());
        recorrerPreorden(nodo.getIzdo());
        recorrerPreorden(nodo.getDcho());
    }

    public void mostrarvaloresdentrodelrango(Nodo nodo, int x1, int x2) {

        if (nodo == null) {
        } else {
            if (nodo.getDato() >= x1 && nodo.getDato() <= x2) {

                System.out.println("" + nodo.getDato());
            }
            recorrerPreorden(nodo.getIzdo());
            recorrerPreorden(nodo.getDcho());
        }
    }
}
