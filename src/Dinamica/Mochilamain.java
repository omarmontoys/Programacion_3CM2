package Dinamica;
/**
 *
 * @author OMAR
 */
import Dinamica.Items;
import java.util.ArrayList;

public class Mochilamain{
    
     public static void main (String[] args){
      
       tokenizador2 tok = new tokenizador2();
        tok.tokenizar();
        ArrayList<Items> aux = tok.getArticulos();
        Mochila1 mochi = new Mochila1();
   
    
    System.out.println();
     }
}


