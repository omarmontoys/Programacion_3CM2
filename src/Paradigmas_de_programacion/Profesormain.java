package Paradigmas_de_programacion;

import objetos.Profesor;
public class Profesormain {
    
   public static void main (String[]args){
       // para poder generar un objeto se genera una instancia
       // se utiliza al operador "new"
       // para crear tambien se ejecuta el metodo constructor
//        Profesor Mario = new Profesor();
//        Mario.edad = 25;
//        Mario.altura = 1.85;
//        Mario.peso =  86; 
//        Mario.cedulaprofesional = 238565;
//        Mario.correo = "Mario135856@gamil.com";
//        Mario.curp = "MROC1255425564A5";
//        
//        Profesor Ania = new Profesor ();
//        Ania.edad = 21;
//        Ania.altura = 1.60;
//        Ania.peso = 56;
//        
//        Profesor alejandro = new Profesor(50, 2.00, "Daniel", 83.5);
//        alejandro.nombre = "Gabriel";
Profesor mario = new Profesor();
mario.setnombre("Gabriel");
mario.setaltura(1.85);
mario.setedad(18);
mario.setpeso(89);
mario.setcedulaprofesional(2021587465);
mario.setcorreo("mariozacatecas@gmail.com");
mario.setcurp("MRJE20548HZSNMMA5");
        System.out.println();
    }
}