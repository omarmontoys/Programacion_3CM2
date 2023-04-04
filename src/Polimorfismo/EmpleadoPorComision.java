package Polimorfismo;
/**
 * @author OMAR
 */
public class EmpleadoPorComision  extends Empleado{
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(double ventas, double tarifa, String Nombre, String apellido, String nss) {
        super(Nombre, apellido, nss);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
    public void establecerTarifaComision(double tarifa){
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0)? tarifa : 0.0;
    }
    private double obtenerTarifaComicion(){
        return tarifaComision;
    }
    public void establecerVentasBrutas(double ventas){
        ventasBrutas = (ventas < 0.0)? 0.0 : ventas;
    }
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    @Override
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %2f","empleado por comision",super.toString(),
                "ventas brutas", obtenerVentasBrutas(),"tarifa de comision", obtenerTarifaComision());
    }
    
    
    
    
    
    
}
