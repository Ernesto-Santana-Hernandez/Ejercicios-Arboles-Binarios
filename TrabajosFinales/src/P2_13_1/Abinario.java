/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_13_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Abinario {

    public static void main(String[] args) {

        Arbol ar = new Arbol();
        Nodo nuevo = new Nodo(14);
        ar.agregar(nuevo, ar.getRaiz());

        int NumSS;
        String Nom;
        String Dir;

        NumSS = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Numero de Seguridad Social: "));
        Nom = JOptionPane.showInputDialog("Ingresa el Nombre: ");
        Dir = JOptionPane.showInputDialog("Ingresa la Direccion; ");

        System.out.println("Los Datos ingresados son:" + "\n Nombre: " + Nom + "\n Numero de seguro social: " + NumSS + "\n Direccion: " + Dir);

    }

}
