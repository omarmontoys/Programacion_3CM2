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
public class Burbuja_optimizado {
    
            public static void main(String[] args) {
                int vec[]={45,17,23,67,21};
                System.out.println("Vector original");
                imprimirVector(vec);
                System.out.println("\n");
                vec=ordenacionBurbuja(vec);
                imprimirVector(vec);
        }

        public static int[] ordenacionBurbuja(int vec[]){
                final int N=vec.length;
                for(int i=N-1;i>0;i--){
                        for(int j=0;j<i;j++){
                                if(vec[j]>vec[j+1]){
                                        int temp=vec[j];
                                        vec[j]=vec[j+1];
                                        vec[j+1]=temp;
                                }
                        }
                        System.out.print("iteracion: "+(N-i)+": ");imprimirVector(vec);System.out.println();
                }
                return vec;
        }
        
        public static void imprimirVector(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }

}
