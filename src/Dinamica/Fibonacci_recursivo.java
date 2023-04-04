
package Dinamica;
import java.util.Scanner;
 /**
 *
 * @author OMAR
 */
public class Fibonacci_recursivo {
      
     public static void main(String[] args) {
 
          Scanner sc = new Scanner(System.in);
          System.out.print("Introduce el número de elementos a mostrar de la serie: ");
          int limite = sc.nextInt();
          sc.close();
 
          for(int i = 0; i<limite; i++){
               System.out.print(fib(i) + ", ");
          }
     }
      public static  int fib(int n){
      if(n==0 || n==1) return 1;
      return fib(n-1) + fib(n-2);
     }
 
}