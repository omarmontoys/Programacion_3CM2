
package AlgoritmosdeOrdena;

/**
 *
 * @author OMAR
 */
public class Merge_sort {
        
    public void sort(int arr[],int left, int right ){
        if(left < right){
            int middle = (left + right)/2;
            
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            
            merge(arr, left, middle, right);
        }
        
    }
    public void merge(int arr[], int left, int middle, int right){
        
        int n1 = middle - left +1;
        int n2 = right - middle;
        
        int leftArray[] = new int[n1];
        int rightArray[] = new int [n2];
        int i = 0, j = 0;
        for (i = 0; i < n2; j++){
            leftArray[i] = arr[left + i];
           
        }
        for ( j = 0; i<n2;j++){
            rightArray[j] = arr[middle + j+1];
        }
        int k = left;
  
        while(i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else{
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; ++i){
            System.out.println(arr[i] + " ");
            
        }
        System.out.println();
    }
  
    
}
