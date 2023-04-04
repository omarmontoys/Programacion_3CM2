
package analisis_y_diseño_de_algoritmos;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author OMAR
 */
public class Grafica2  extends JPanel{

    private static final long serialVersionUID = 1L;
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(100, 100, 500, 500);
    }
    
    public static void main(String[]args){
        JFrame ventana = new JFrame ("Graficos");
        Grafica2 objeto1 = new Grafica2();
        ventana.add(objeto1);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
        
