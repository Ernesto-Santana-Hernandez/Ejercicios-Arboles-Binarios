
package P2_13_11;

/**
 *
 * @author Lenovo
 */
public class Arbol {

    Object[] raiz;

    public Arbol(Object[] nodo) {
        this.raiz = nodo;
    }

    public void InsertarNodo(Object[] nodo, int num) {
        nodo[1] = num;
        if (raiz == null) {
            raiz = nodo;
        } else {
            if ((int) nodo[1] < (int) raiz[1]) {
                if (raiz[0] == null) {
                    raiz[0] = (nodo);
                } else {
                    InsertarNodo(nodo, (int) raiz[1]);
                }
            } else {
                if ((int) nodo[1] > (int) raiz[1]) {
                    if (raiz[2] == null) {
                        raiz[2] = (nodo);
                    } else {
                        InsertarNodo(nodo, (int) raiz[1]);
                    }
                }
            }
        }
    }
}
