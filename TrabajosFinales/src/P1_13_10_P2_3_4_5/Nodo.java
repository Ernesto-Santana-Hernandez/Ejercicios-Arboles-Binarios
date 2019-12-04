
package P1_13_10_P2_3_4_5;

/**
 *
 * @author Lenovo
 */
public class Nodo {
    //miembros de acceso
    Nodo nodoizquierdo;
    int datos;
    Nodo nododerecho;
    Nodo altura;
    
    //iniciar dato y hacer de este nodo un nodo hoja
    public Nodo(int datosNodo)
    {
        datos = datosNodo;
        nodoizquierdo = nododerecho = null; //el nodo no tiene hijos
    }
    
    //buscar punto de insercion e inserter nodo nuevo
    public synchronized void insertar(int valorInsertar)
    {
        //insertar en subarbol izquierdo
        if(valorInsertar < datos)
        {
            //insertar en subarbol izquierdo
            if(nodoizquierdo == null)
                nodoizquierdo = new Nodo(valorInsertar);
            else    //continua recorriendo subarbol izquierdo
                nodoizquierdo.insertar(valorInsertar);
        }
        
        //insertar nodo derecho
        else if(valorInsertar > datos)
        {
            //insertar nuevo nodoArbol
            if(nododerecho == null)
                nododerecho = new Nodo(valorInsertar);
            else
                nododerecho.insertar(valorInsertar);
        }
    } // fin del metodo insertar
}

