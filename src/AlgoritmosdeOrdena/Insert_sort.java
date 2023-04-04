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
public class Insert_sort {
    

        public static void main(String[]args){
            int[]arreglo = {5,7,9,8,2,6,66,55,33,14};
            Insert_sort o = new Insert_sort();
            o.ordenarinsersord(arreglo);
            for(int i = 0;i<arreglo.length;i++){
                System.out.println(arreglo[i]);
            }
        }
         public  void ordenarinsersord(int[] array){
            int aux;
            int cont1;
            int cont2;
            for (cont1 = 1; cont1 < array.length; cont1++)
            {
                aux = array[cont1];
                for(cont2 = cont1 - 1;cont2 >= 0 && array[cont2]>aux;cont2--)
                {
                    array[cont2+1]=array[cont2];
                    array[cont2]=aux;
                }
            }
         }
        
    
}
