package Paradigmas_de_programacion;
import objetos.Alumno;
/**
 * @author OMAR
 */
public class Alumnomain {
        
    public static void main (String[]args){
       // para poder generar un objeto se genera una instancia
       // se utiliza al operador "new"
       // para crear tambien se ejecuta el metodo constructor
//        Alumno Juan = new Alumno();
//        Juan.edad = 25;
//        Juan.altura = 1.85;
//        Juan.peso =  86; 
//        Juan.matricula = 2021567851;
//        Juan.promedio = 8.2;
//        Juan.semestre = 3;
//        
//        Alumno Ania = new Alumno ();
//        Ania.edad = 21;
//        Ania.altura = 1.60;
//        Ania.peso = 56;
//        Ania.matricula = 2021569751;
//        
//        
//        Alumno alejandro = new Alumno(54, 2.00,"Jesus",85.6, 8.5);
//        alejandro.nombre = "Rogelio";
Alumno mario = new Alumno();
mario.setnombre("Gabriel");
mario.setaltura(1.85);
mario.setedad(18);
mario.setpeso(89);
mario.setmatricula(2021587465);
mario.setpromedio(8.5);
mario.setsemestre(3);
        System.out.println();
    }
}