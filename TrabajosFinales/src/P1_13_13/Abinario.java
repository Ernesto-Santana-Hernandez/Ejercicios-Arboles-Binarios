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
public class Abinario {

    public static void main(String[] args) {
        // TODO code application logic here
        Arbol ar = new Arbol(23);
        Nodo nuevo = new Nodo(14);
        ar.agregar(nuevo, ar.getRaiz());
        ar.recorrerPreorden(ar.getRaiz());
    }
}
