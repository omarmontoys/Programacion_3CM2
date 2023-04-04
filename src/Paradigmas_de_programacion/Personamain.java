package Paradigmas_de_programacion;
/**
  * @author OMAR
 */
import objetos.Persona;


public class Personamain {
    
    public static void main (String[]args){
       // para poder generar un objeto se genera una instancia
       // se utiliza al operador "new"
       // para crear tambien se ejecuta el metodo constructor
//        Persona omar = new Persona();
//        omar.edad = 25;
//        omar.altura = 1.85;
//        omar.peso =  86; 
//        omar.nombre =  "Omar Montoya";
//        
//        Persona maria = new Persona ();
//        maria.edad = 21;
//        maria.altura = 1.60;
//        maria.peso = 56;
//        
//        Persona alejandro = new Persona(8, 1.70, "Alejandro");
//        alejandro.nombre = "Gabriel";
Persona omar = new Persona();
omar.setnombre("Montoya32");
omar.setaltura(1.85);
omar.setedad(18);
omar.setpeso(89);
        
        
        System.out.println();
    }
}
