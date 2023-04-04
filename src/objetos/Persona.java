package objetos;
/**
 * @author OMAR
 */
public class Persona {
        private int edad;
        private double altura;
        private double peso;
        private String nombre;
             
        //  constructor por defecto
        public Persona(){
            
                   edad  =  0;
                   altura  =  0.0;
                   peso  =  0.0;
                   nombre  =  "";
       }  
        //segundo constructor
        public Persona(int edad, double altura, String nombre){
            this.edad = edad;
            this.altura = altura;
            this.nombre = nombre;
          }
         // comportamiento
         public void saludar(){
               System.out.println("Hola");
           }
        // Encapsulamiento, metodo de consultar
        public int getedad(){
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
        // Metodo para acceder
        
       public void setedad(int x){
          edad = x;            
       }
       public void setaltura(double n){
           altura = n;
       }
       public void setpeso(double m){
           peso = m;
       }
       public void setnombre(String aux){
           nombre = aux;
       }
                
}
