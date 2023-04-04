package Expreciones_Lambda;

/**
 *
 * @author OMAR
 */
public interface Ejemplo_2 {
    
    // Un bloque lambda que encuentra el divisor positivo
// más pequeño de un valor int.

interface FuncNum {
    int func (int n);
}

class LambdaDemo{
    public static void main(String[] args) {
        // Este bloque lambda devuelve el divisor positivo más pequeño de un valor
        FuncNum divPeq= (n) ->{
            int res=1;

            // Obtenga el valor absoluto de n.
            n = n<0 ? -n:n;

            for (int i=2; i<=n/i;i++)
                if ((n%i)==0) {
                    res = i;
                    break;
                }
            return res;
        };
         System.out.println("El divisor más pequeño de 12 es: "+divPeq.func(12));
         System.out.println("El divisor más pequeño de 15 es: "+divPeq.func(-15));
    }
}
    
}
