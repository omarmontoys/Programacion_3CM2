/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dinamica;

import java.util.ArrayList;

/**
 *
 * @author OMAR
 */
public class tokenmain {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tokenizador2 tok = new tokenizador2();
        tok.tokenizar();
        ArrayList<Items> aux = tok.getArticulos();
        
         System.out.println();
    }
       
}
