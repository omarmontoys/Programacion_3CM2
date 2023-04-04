package Polimorfismo;
/**
* @author OMAR
 */
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double Salario){
        super(nombre, apellido, nss);
         establecerSalarioSemanal(Salario);
    }
    public void establecerSalarioSemanal(double salario){
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    @Override
    public String toString(){
        return String.format("empleado asalariado %s\n%s: $%,.2f",super.toString(),
       "salario semanal", obtenerSalarioSemanal() );
     }

}
