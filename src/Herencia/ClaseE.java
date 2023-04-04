package Herencia;
/**
 * @author OMAR
 */
public class ClaseE  extends ClaseD{
     private String strClaseE;
    private int intClaseE;

    public ClaseE() {
        System.out.println();
        this.strClaseE = "";
        this.intClaseE = 0;
    }

    public ClaseE(String strClaseE, int intClaseE) {
        System.out.println();
        this.strClaseE = strClaseE;
        this.intClaseE = intClaseE;
    }

    /**
     * @return the strClaseE
     */
    public String getStrClaseE() {
        return strClaseE;
    }

    /**
     * @param strClaseE the strClaseE to set
     */
    public void setStrClaseE(String strClaseE) {
        this.strClaseE = strClaseE;
    }

    /**
     * @return the intClaseE
     */
    public int getIntClaseE() {
        return intClaseE;
    }

    /**
     * @param intClaseE the intClaseE to set
     */
    public void setIntClaseE(int intClaseE) {
        this.intClaseE = intClaseE;
    }
    
    
}
