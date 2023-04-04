package objetos;
/**
 * @author OMAR
 */
public class Profesor {
       private int edad;
        private double altura;
        private double peso;
        private String nombre;
        private int cedulaprofesional;
        private String curp;
        private String correo;
        
        //  constructor por defecto
        public Profesor(){
            
                   edad  =  0;
                   altura  =  0.0;
                   peso  =  0.0;
                   nombre  =  "";
                   cedulaprofesional = 0;
                   curp = "";
                   correo="";
       }  
       //segundo constructor
        public Profesor(int edad, double altura, String nombre, double peso){
            this.edad = edad;
            this.altura = altura;
            this.nombre = nombre;
            this.peso = peso;
        }
        // comportamiento
        public void saludar(){
            System.out.println("Hola");
       }
        //Encapsulamiento
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
        public int getcedulaprofesional(){
            return this.cedulaprofesional;
        }
        public String getcurp(){
            return this.curp;
        }
        public String getcorreo(){
            return this.correo;
        }
        // metodo para acceder
        public void setedad(int n){
            edad = n;
        }
        public void setaltura(double k){
            altura = k;
        }
        public void setpeso(double u){
            peso = u;
        }
        public void setnombre(String s){
            nombre = s;
        }
        public void setcedulaprofesional(int v){
            cedulaprofesional =  v;
        }
        public void setcurp(String y){
            curp = y;
        }
        public void setcorreo(String w){
            correo = w;
        }
}
