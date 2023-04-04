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
public class Ordenamiento_Mezcla {
    public int [] mezcladirecta(int[] arreglo){
        int i, j, k;
        if(arreglo.length > 1){
            int nElementosIzq = arreglo.length/2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int [nElementosIzq];
            int arregloDer [] = new int[nElementosDer];
            //copiando los elementos de prte primera de los arreglos
            for(i = 0; i < nElementosIzq; i++){
                arregloIzq[i] = arreglo[i];
            }
           for(i = nElementosIzq; i < nElementosIzq + nElementosDer; i++){
                arregloDer[i - nElementosIzq ] = arreglo[i];
            }
           //Recursividad
           arregloIzq = mezcladirecta(arregloIzq);
           arregloDer = mezcladirecta(arregloDer);
           i = 0;
           j = 0;
           k = 0;
           while(arregloIzq.length != j && arregloDer.length != k){
            if (arregloIzq[j] < arregloDer[k]){
                arreglo[i] = arregloIzq[j];
                i++;
                j++;
            }else{
                arreglo[i] = arregloDer[k];
                i++;
                k++;
            }
        }
           //Arreglo final
           while(arregloIzq.length != j){
               arreglo[i] = arregloIzq[j];
               i++;
               j++;
           }
        while(arregloDer.length != k){
            arreglo[i] = arregloDer[k];
            i++;
            k++;
        }
    }//fin  del if
    return arreglo;
}
    public void mostrarArreglo(int[] arreglo){
        int k;
        for(k = 0; k < arreglo.length;k++){
            System.out.print("["+ arreglo[k] + "]");
        }
        System.out.println();
    }
     public  int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
     public static int[] Burbujaoptimizado(int vec[]){
                final int N=vec.length;
                for(int i=N-1;i>0;i--){
                        for(int j=0;j<i;j++){
                                if(vec[j]>vec[j+1]){
                                        int temp=vec[j];
                                        vec[j]=vec[j+1];
                                        vec[j+1]=temp;
                                }
                        }
                }
                return vec;
        }
     public  int [] InsertSort(int [] array){
    
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
            return(array);
     }
     
         
     
      public int[] sort(int array[],int left, int right ){
          
        if(left < right){
            int middle = (left + right)/2;
            
            sort(array, left, middle);
            sort(array, middle + 1, right);
            
            merge(array, left, middle, right);
        }
        return array;
    }
    public void merge(int array[], int left, int middle, int right){
        
        int n1 = middle - left +1;
        int n2 = right - middle;
        
        int leftArray[] = new int[n1];
        int rightArray[] = new int [n2];
        int i = 0, j = 0;
        for (i = 0; i < n2; j++){
            leftArray[i] = array[left + i];
           
        }
        for ( j = 0; i<n2;j++){
            rightArray[j] = array[middle + j+1];
        }
        int k = left;
  
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    


   public void ordenarquicksort (int [] array)
        {
            array = quicksort1(array);
        }
        public int [] quicksort1 (int numeros[])
        {
                return quicksort2 (numeros,0,numeros.length-1);
        }    
        public int [] quicksort2 (int numeros[],int izq,int der)
        {
            if(izq>der)
                return numeros;
            int i = izq, d = der;
            if(izq!=der)
            {
                int pivote;
                int aux;
                pivote = izq; 
                while(izq!=der)
                {
                    while(numeros[der] >= numeros[pivote] && izq<der)
                        der--;
                        while(numeros[izq]<numeros[pivote] && izq<der)
                            izq++;
                    if(der!=izq)
                    {
                        aux = numeros[der];
                        numeros[der] = numeros[izq];
                        numeros[izq] = aux;
                    }
                    if(izq==der)
                    {
                        quicksort2(numeros,i,izq-1);
                        quicksort2(numeros,izq+1,d);
                    }
                    }
                    }
            else 
                return numeros;
            return numeros;
        }
        
        public static <E> long calculateETOrdered(int repetitions, int n) {

    long startTime = System.nanoTime();



    long endTime = System.nanoTime();

    return (endTime-startTime);

}
    
     
     
}
        

    

  

   
     

