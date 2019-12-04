/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_10_P2_3_4_5;

/**
 *
 * @author Lenovo
 */
public class Arbol {
     private Nodo raiz;
    int cant;
    int altura;
    //construir un arbol vacio
    public Arbol()
    {
        raiz = null;
        
    }
    
    //insertar un nuevo ndo en el arbol de busqueda binaria
    public  void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new Nodo(valorInsertar); //crea nodo raiz
        else
            raiz.insertar(valorInsertar); //llama al metodo insertar        
    }
    
    // EMPIEZA EL RECORRIDO EN PREORDEN
    public  void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    //meoto recursivo para recorrido en preorden
    
    private void ayudantePreorden(Nodo nodo)
    {
        if(nodo == null)
            return;
        
        System.out.print(nodo.datos + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo
        ayudantePreorden(nodo.nododerecho);     //recorre subarbol derecho
    }
    
    //EMPEZAR RECORRIDO INORDEN
    public  void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }
    
    //meoto recursivo para recorrido inorden
    private void ayudanteInorden( Nodo nodo)
    {
        if(nodo == null)
            return;
        
        ayudanteInorden(nodo.nodoizquierdo);
        System.out.print(nodo.datos + " ");
        ayudanteInorden(nodo.nododerecho);
    }
    
    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);        
    }
    
    //meotod recursivo para recorrido posorden
    private void ayudantePosorden(Nodo nodo)
    {
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
    }
    public Nodo buscar( int d){
        Nodo aux;
        aux=raiz;
 
        while(aux.datos != d){
            if(d<aux.datos){
                aux=aux.nodoizquierdo;
            }else{
                aux=aux.nododerecho;
            }
            if(aux==null){
                return null;
            }
        }
    return aux;
    }
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    public void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.nodoizquierdo, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.nododerecho, nivel + 1);
        }
    }
    
    
    public boolean EsCompleto(Nodo nodo){
        Nodo altura;  
    if(nodo==null){
      
        return true;  //Arbol está vacío
    }
    else{
        Nodo lh = nodo.nodoizquierdo.altura;
        Nodo rh = nodo.nododerecho.altura;
      
            return false;
            }
}
    //EJERCICIO 13.4
    public boolean identicos(Nodo a, Nodo b) {
        boolean result = false;
        if ((a == null) && (b == null)) {
            result = true;
        } else if ((a == null) || (b == null)) {
            result = false;
        } else if (a.datos== b.datos) {
            result = identicos(a.nodoizquierdo, b.nododerecho) && identicos(a.nodoizquierdo, b.nododerecho);
        } else {
            return result;
        }
        return result;
    }

    public boolean identicos(Arbol a1, Arbol a2) {
        return identicos(a1.raiz, a2.raiz);
    }

    public int valorMaximo(Nodo nodo) {
        int max = nodo.datos;
        if (nodo.nodoizquierdo != null) {
            max = Math.max(max, valorMaximo(nodo.nodoizquierdo));
        }
        if (nodo.nododerecho != null) {
            max = Math.max(max, valorMaximo(nodo.nododerecho));
        }
        return max;
    }
}
