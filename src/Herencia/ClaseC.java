package Herencia;
/**
 * @author OMAR
 */
public class ClaseC extends ClaseD {
    
    private String strClaseC;
    private int intClaseC;

    public ClaseC() {
           System.out.println();
        this.strClaseC = "";
        this.intClaseC = 0;
 }

    public ClaseC(String strClaseC, int intClaseC) {
        System.out.println();
        this.strClaseC = strClaseC;
        this.intClaseC = intClaseC;
}
    /**
     * @return the strClaseC
     */
    public String getStrClaseC() {
        return strClaseC;
    }

    /**
     * @param strClaseC the strClaseC to set
     */
    public void setStrClaseC(String strClaseC) {
        this.strClaseC = strClaseC;
    }

    /**
     * @return the intClaseC
     */
    public int getIntClaseC() {
        return intClaseC;
    }

    /**
     * @param intClaseC the intClaseC to set
     */
    public void setIntClaseC(int intClaseC) {
        this.intClaseC = intClaseC;
    }
    
    
}
