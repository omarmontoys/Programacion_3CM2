package Interfaces;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author OMAR
 */
public class Cuadricula_central extends JPanel {
    
    private JButton btnC;
    private JButton btnCE;
    
    public Cuadricula_central(){
      setLayout(new GridLayout(1, 2));
      this.btnC = new JButton("C");
      this.btnCE = new JButton("CE");
      add(this.btnC);
      add(this.btnCE);
      
      setVisible(true);
}

    /**
     * @return the btnC
     */
    public JButton getBtnC() {
        return btnC;
    }

    /**
     * @param btnC the btnC to set
     */
    public void setBtnC(JButton btnC) {
        this.btnC = btnC;
    }

    /**
     * @return the btnCE
     */
    public JButton getBtnCE() {
        return btnCE;
    }

    /**
     * @param btnCE the btnCE to set
     */
    public void setBtnCE(JButton btnCE) {
        this.btnCE = btnCE;
    }
}
