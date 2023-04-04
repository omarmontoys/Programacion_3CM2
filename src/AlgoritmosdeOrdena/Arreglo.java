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
public class Arreglo {
    
        
    public static void main(String[] args){
        long startTime = System.nanoTime();
        Ordenamiento_Mezcla ordenar = new Ordenamiento_Mezcla();
        int vector1[] = {8,5,88,44,33,77,55,1,5,7,2,9,4,152,251,158,9,-5,-9};
        System.out.println("Arreglo vector2 Original");
        ordenar.mostrarArreglo(vector1);
        System.out.println("Arreglo vector2 Ordenado por mezcla directa");
        vector1=ordenar.quicksort1(vector1);
        ordenar.mostrarArreglo(vector1);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        double tiempo = (double)((endTime - startTime)/1000);
        System.out.println(tiempo + "segundos");
                }
        
}
    
      

