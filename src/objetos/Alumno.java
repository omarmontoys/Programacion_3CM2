package objetos;
/**
 * @author OMAR
 */
public class Alumno {
    
        private int edad;
        private double altura;
        private double peso;
        private String nombre;
        private int  matricula;
        private double promedio;
        private int semestre;
        
        //  constructor por defecto
        public Alumno(){
            
                   edad  =  0;
                   altura  =  0.0;
                   peso  =  0.0;
                   nombre  =  "";
                   matricula = 0;
                   promedio = 0.0;
                   semestre = 0;
       }  
         //segundo constructor
        public Alumno(int edad, double altura, String nombre, double peso,double promedio){
            this.edad = edad;
            this.altura = altura;
            this.nombre = nombre;
            this.peso = peso;
            this.promedio = promedio;
        }
         // comportamiento
        public void saludar(){
           System.out.println("Hola");
          }
        // Encapsulamiento  metodo para consultar
        public double getedad(){
            return this.edad;
        }
        public double getaltura(){
            return this.altura;
        }
        public double getpeso(){
            return this.peso;
        }
        public String getnombre(){
            return this.nombre;
        }
        public int getmatricula(){
            return this.matricula;
        }
        public double getpromedio(){
            return this.promedio;
        }
        public int getsemestre(){
            return this.semestre;
        }
        // metodo para acceder
        public void setedad(int n){
            edad = n;
        }
        public void setaltura(double p){
            altura = p;
        }
        public void setpeso(double g){
            peso = g;
        }
        public void setnombre(String aux){
            nombre = aux;
        }
        public void setmatricula(int h){
            matricula = h;
        }
        public void setpromedio(double ñ){
            promedio = ñ;
        }
        public void setsemestre(int y){
            semestre = y;
        }

}
