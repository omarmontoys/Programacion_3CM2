package Herencia;
/**
 * @author OMAR
 */
public class ClaseB  extends ClaseC{
    
    private String strClaseB;
    private int intClaseB;

    public ClaseB() {
        System.out.println();
            this.strClaseB = "";
        this.intClaseB = 0;
    }

    public ClaseB(String strClaseB, int intClaseB) {
        System.out.println();
        this.strClaseB = strClaseB;
        this.intClaseB = intClaseB;
    }

    /**
     * @return the strClaseB
     */
    public String getStrClaseB() {
        return strClaseB;
    }

    /**
     * @param strClaseB the strClaseB to set
     */
    public void setStrClaseB(String strClaseB) {
        this.strClaseB = strClaseB;
    }

    /**
     * @return the intClaseB
     */
    public int getIntClaseB() {
        return intClaseB;
    }

    /**
     * @param intClaseB the intClaseB to set
     */
    public void setIntClaseB(int intClaseB) {
        this.intClaseB = intClaseB;
    }
    
    
}
