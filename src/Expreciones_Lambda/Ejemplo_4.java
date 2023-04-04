package Expreciones_Lambda;

/**
 *
 * @author OMAR
 */
public class Ejemplo_4 {
    
    public static void main(String[] args){
        ModificacionCadena exclamacion = (t) -> "¡" + t + "!";
       imprimir("Java es tremendo", exclamacion);
       
       System.out.println();
       
       imprimir("hola", exclamacion);
    }
    
    public static void imprimir(String texto, ModificacionCadena formato){
        String resultado = formato.ejecutar(texto);
        
        System.out.println(resultado);
    }
    
    interface ModificacionCadena{
        String ejecutar(String texto);
    }
}
