package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author OMAR
 */
public class Listener_Calculadora implements ActionListener{
    
    PanelBotones c;
    Cuadricula_superior g;

    public Listener_Calculadora(PanelBotones c, Cuadricula_superior g) {
        this.c = c;
         this.g = g;
    }
    
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
          if(e.getSource() == this.c.getBtn1()){
          g.getCaja().setText(g.getCaja().getText() + "1");

        }
   
    }}
    
    

