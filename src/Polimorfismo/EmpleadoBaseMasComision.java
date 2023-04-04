package Polimorfismo;
/**
 * @author OMAR
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double tarifa, double ventas, double salario){
        super(ventas, tarifa, nombre, apellido, nss);
        establecerSalarioBase(salario);
    }
    
    public void establecerSalarioBase(double salario){
        salarioBase = (salario < 0.0)? 0.0 : salario;
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }
    
    @Override
    public String toString(){
         return String.format("%s: %s; %s : $%,.2f","con salario base",super.toString(),
                "salario base", obtenerSalarioBase());
   
    }
    
}
