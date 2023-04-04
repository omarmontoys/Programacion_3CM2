package Herencia;
/**
 * @author OMAR
 */
public class ClaseA    extends ClaseC {
    private String strClaseA;
    private int intClaseA;

    public ClaseA() {
        System.out.println();
            this.strClaseA = "";
        this.intClaseA = 0;
    }

    public ClaseA(String strClaseA, int intClaseA) {
        System.out.println();
        this.strClaseA = strClaseA;
        this.intClaseA = intClaseA;
    }

    /**
     * @return the strClaseA
     */
    public String getStrClaseA() {
        return strClaseA;
    }

    /**
     * @param strClaseA the strClaseA to set
     */
    public void setStrClaseA(String strClaseA) {
        this.strClaseA = strClaseA;
    }

    /**
     * @return the intClaseA
     */
    public int getIntClaseA() {
        return intClaseA;
    }

    /**
     * @param intClaseA the intClaseA to set
     */
    public void setIntClaseA(int intClaseA) {
        this.intClaseA = intClaseA;
    }
    
    
    
}
