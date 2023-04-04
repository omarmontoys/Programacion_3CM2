package Expreciones_Lambda;

/**
 *
 * @author OMAR
 */
public interface Ejemplo_1 {
    
    // Demostrar dos expresiones lambda simples.

// Una interfaz Funcional
interface MiValor {
    double getValor();
}

// Otra interfaz funcional
interface MiValParam {
    double getValor(double v);
}

class LambdaDemo{
    public static void main(String[] args) {
        MiValor miValor; // declarar una referencia de interfaz

        // Aquí, la expresión lambda es simplemente una expresión constante.
        // Cuando se asigna a miValor, se construye una instancia de clase
        // en la que la expresión lambda implementa el método getValor() en MiValor.
        miValor=()->28.6; //Una simple expresión lambda

        // Llama a getValor(), el cual es provisto por la expresión lambda previamente asignada.
        System.out.println("Un valor constante: "+miValor.getValor());

        // Ahora, se crea una expresión lambda parametrizada y se le asigna a una referencia MiValParam.
        // Esta expresión lambda devuelve lo recíproco de su argumento.
        MiValParam miValParam= (n)->1.0/n;

        // Llama a getValor(v) a través de la referencia miValParam.
        System.out.println("El recíproco de 4 es: "+miValParam.getValor(4.0));
        System.out.println("El recíproco de 5 es: "+miValParam.getValor(5.0));

        // Una expresión lambda debe ser compatible con el método definido en la interfaz funcional.
        // Por lo tanto, esto no funcionará:
        // miValor=()->"Tres"; // Error! String no compatible con double!
        // miValParam=()->Math.random(); // Error! Parámetro requerido!
    }
}
    
}
