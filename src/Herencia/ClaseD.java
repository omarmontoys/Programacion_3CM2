package Herencia;
/**
  * @author OMAR
 */
public class ClaseD {
    
    private String strClaseD;
    private int intClaseD;

    public ClaseD() {
        System.out.println();
        this.strClaseD = "";
        this.intClaseD = 0;
    }

    public ClaseD(String strClaseD, int intClaseD) {
        System.out.println();
        this.strClaseD = strClaseD;
        this.intClaseD = intClaseD;
    }

    /**
     * @return the strClaseD
     */
    public String getStrClaseD() {
        return strClaseD;
    }

    /**
     * @param strClaseD the strClaseD to set
     */
    public void setStrClaseD(String strClaseD) {
        this.strClaseD = strClaseD;
    }

    /**
     * @return the intClaseD
     */
    public int getIntClaseD() {
        return intClaseD;
    }

    /**
     * @param intClaseD the intClaseD to set
     */
    public void setIntClaseD(int intClaseD) {
        this.intClaseD = intClaseD;
    }
    
    
}
