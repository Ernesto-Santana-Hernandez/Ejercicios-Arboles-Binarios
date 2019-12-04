/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2_13_12;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class abb {
    public static void main(String[] args) {
        int dato[]={0,0,55,50,60,40,33,11,0};
       int Izq[]={0,8,0,0,3,6,7,0,0};
       int Der[]={0,0,0,2,0,4,0,0,0};
       Scanner leer=new Scanner(System.in);
       int raiss=5, elemento, pos = 0, pad = 0, ptr, salva;
       String op;
       do
       {
           System.out.println("Dame el elemento que quieres buscar: ");
           elemento=leer.nextInt();
 
           if(raiss==0)
           {
               pos=0;
               pad=0;
           }
 
           if(elemento==dato[raiss])
           {
               pos=raiss;
               pad=0;
           }
 
           if(elemento<dato[raiss])
           {
               ptr=Izq[raiss];
               salva=raiss;
           }
           else
           {
               ptr=Der[raiss];
               salva=raiss;
           }
 
           while(ptr!=0) 
           {
               if(elemento==dato[ptr])
               {
                   pos=ptr;
                   pad=salva;
                   ptr=0;
               }
 
               if(elemento<dato[ptr])
               {
                   salva=ptr;
                   ptr=Izq[ptr];
               }else{
                   salva=ptr;
                   ptr=Der[ptr];
               }
           }
 
           if(pos==0 || pad==salva)
           {
               System.out.println("Búsqueda sin resultado!");
           }else{
            System.out.println("El elemento " + elemento + " se encontró en " + pos);
            if(pad==0)
            {
                System.out.println("Es el nodo raíz");
            }else{
                System.out.println("Su padre " + dato[pad]);
            }
           }
 
           System.out.println("¿Deseas buscar otro elemento? (si/no): ");
           op=leer.toString();
       }while(op=="no");
    }
 

}
