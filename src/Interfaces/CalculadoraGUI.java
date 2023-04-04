package Interfaces;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
* @author OMAR
 */
public class CalculadoraGUI extends JFrame {
    
     private PanelBotones c;
        private Cuadricula_superior cs;
        private Cuadricula_central b;

    public CalculadoraGUI(String nombre) {
        setTitle("Calculadora");
        setLayout(new BorderLayout());
//        BorderLayout guinda = new BorderLayout();
//        PanelBotones panelBotones = new PanelBotones();
//        guinda.addLayoutComponent(panelBotones,BorderLayout.CENTER);
//        setSize(300, 600);
//        setVisible(true);
         
       cs = new Cuadricula_superior();
       b = new Cuadricula_central();
       c = new PanelBotones(this);
        add(cs,BorderLayout.NORTH);
        add(b,BorderLayout.SOUTH);
        add(c,BorderLayout.CENTER);
        
        setSize(300, 600);
        setVisible(rootPaneCheckingEnabled);
        
        
    }

    /**
     * @return the c
     */
    public PanelBotones getC() {
        return c;
    }

    /**
     * @return the cs
     */
    public Cuadricula_superior getCs() {
        return cs;
    }

    /**
     * @return the b
     */
    public Cuadricula_central getB() {
        return b;
    }
    
    
        
}
