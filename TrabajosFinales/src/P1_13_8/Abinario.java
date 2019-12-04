
package P1_13_8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Abinario {
    public static void main(String[] args) {
        Arbol abo = new Arbol();
        int var;
        int valor;
        Scanner texto = new Scanner(System.in);
        System.out.println(" Insertando los siguientes valores: ");
        for (int i = 1; i <= 10; i++) {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            abo.agregar(valor);
        }

        do {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.- Cantidad de nodos del arbol");
            System.out.println("2.- cantidad de nodos hoja");
            System.out.println("3.- Altura del arbol");
            System.out.println("4.- Balance");
            System.out.println("0.- Salir");
            var = texto.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Cantidad de nodos del árbol:" + abo.cantidad());
                    break;
                case 2:
                    System.out.println("Cantidad de nodos hoja:" + abo.cantidadNodosHoja());
                    break;
                case 3:
                    System.out.println("La alturra del arbol es:" + abo.retornarAltura());
                    break;
                case 4:
                    abo.imprimirBalance();
                    break;
            }
        } while (var != 0);

    }

}
