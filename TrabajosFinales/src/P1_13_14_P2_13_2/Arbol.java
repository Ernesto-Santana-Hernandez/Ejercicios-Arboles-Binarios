/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1_13_14_P2_13_2;
/**
 *
 * @author Lenovo
 */
public class Arbol {
    private Nodo raiz;
      int altura;
    
    public Arbol(Nodo raiz)  {
        this.raiz = raiz;
        
    }

 

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
     public void agregar (Nodo nodo, Nodo raiz) {
        if(raiz == null){
            this.setRaiz(nodo);
            
        } else {
               if ((int)nodo.getDato () <= (int)raiz.getDato ()) {
                 if(raiz.getIzdo() == null){
                     raiz.setIzdo(nodo);
                 }else{
                     agregar(nodo, raiz.getIzdo());
                 }
             } else {
             }
    }
    }
    
  public void agregarNodo(Nodo nodo){
        this.agregar(nodo, this.raiz);
    }
    
    public void recorrerPostorden(Nodo nodo) {
        if (nodo == null){
        return;
        } else {
            recorrerPostorden(nodo.izdo);
            recorrerPostorden(nodo.dcho);
            System.out.println("Dato: " + nodo.getDato());
        } 
        
    }
    
    public void Inorden(Nodo nodo){
        if(nodo == null){
            return;
        } else {
            Inorden(nodo.getIzdo());
            System.out.println("Dato: " + nodo.getDato());
            Inorden(nodo.dcho);
        }
    }
     public Nodo buscar( int d){
        Nodo aux;
        aux=raiz;
     while(aux.hashCode() != d){
            if(d<aux.hashCode()){
                aux=aux.dcho;
            }else{
                aux=aux.dcho;
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
            retornarAltura(reco.izdo, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.dcho, nivel + 1);
        }
    }
    
}
