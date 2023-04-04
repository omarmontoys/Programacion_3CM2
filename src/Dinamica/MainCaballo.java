package Dinamica;
import javax.swing.JFrame;

/**
 * @author OMAR
 */
public class MainCaballo extends JFrame {
    
    private final Tablero_ajedrez c1;
    
    public MainCaballo() throws Exception{
        this.setTitle("Salto del Caballo");
        this.setBounds(0, 0, 536, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(3);
        c1 = new Tablero_ajedrez(1,1);
        this.add(c1);
        this.setVisible(true);
        Thread.sleep(1000);
        c1.resolverProblema();
             }
    
    public static void main(String[] args) throws Exception{
        MainCaballo m1 = new MainCaballo();
       
    }
    }
