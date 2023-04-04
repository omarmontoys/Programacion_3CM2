package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author OMAR
 */
public class Cuadricula_superior extends JPanel {
    
   private JTextField caja; 
   
   public Cuadricula_superior(){
       
       setLayout(new BorderLayout());
       this.caja = new JTextField();
       add(caja,BorderLayout.CENTER);
       setBackground(Color.red);
       setVisible(true);
       
   }

    /**
     * @return the caja
     */
    public JTextField getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(JTextField caja) {
        this.caja = caja;
    }
    
    
}
