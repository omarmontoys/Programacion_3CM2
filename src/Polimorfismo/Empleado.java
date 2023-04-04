package Polimorfismo;
/**
 * @author OMAR
 */
public abstract class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;

    public Empleado(String Nombre, String apellido, String nss) {
        this.primerNombre = Nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
    }
    
    public void establecerPrimerNombre(String Nombre){
        primerNombre = Nombre;
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApellidoPaterno(String apellido){
        apellidoPaterno = apellido;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    public void obtenerNumeroSeguroSocial(String nss){
        numeroSeguroSocial = nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    @Override
    public String toString(){
        return String.format("%s %s \nnumero de seguro social: %s", obtenerPrimerNombre(),
                obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
        }
    public abstract double ingresos();
}
