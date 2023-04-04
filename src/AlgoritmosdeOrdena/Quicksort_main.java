/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosdeOrdena;

/**
 *
 * @author OMAR
 */
public class Quicksort_main {
    public static void main (String[] args){
        
        int arreglo[] = {5,5,8,7,4,5,4,4,5,8,5,7,44,4,5,88,6,65};
            Quicksort o = new Quicksort();
            o.ordenarquicksort(arreglo);
            
            for(int i = 0; i<arreglo.length;i++)
            {
                System.out.println(arreglo[i]);
            }
    }
}
