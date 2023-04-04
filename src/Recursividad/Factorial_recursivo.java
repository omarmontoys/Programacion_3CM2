
package Recursividad;
/**
 * @author OMAR
 */
  import java.util.Scanner;
public class Factorial_recursivo {
  
    public static void main(String[] args) {
     
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }
         
        System.out.println("\nEl factorial de " + num + " es: " + factorial(num));
    }
     
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }

}
