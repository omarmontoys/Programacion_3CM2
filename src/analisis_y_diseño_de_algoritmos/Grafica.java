
package analisis_y_diseño_de_algoritmos;

/**
 *
 * @author OMAR
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import  javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


 
public class  Grafica extends JFrame {

    public JPanel panel;
    

   public Grafica(){
       setSize(500, 500);        // Estblecemos el tamoño de la ventana
       setTitle("Graficador de funciones");     // Titulo de la ventana
      // setLocation(100,200);          //Etablecemos la posicion inicial de la ventana
       //setBounds(100,200,500,500);    //Ejecuta setSize y setLocation a la vez, disminuyen las linas codigo
       setLocationRelativeTo(null);    //Establecemos la ventana en el centro
       //this.getContentPane().setBackground(Color.BLACK);   //Color de la ventana
    
       iniciarcomponentes();
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
   }
   
   private void iniciarcomponentes(){
          
        colocarPaneles();
       
        colocarEtiqueta();
       
        colocarBotones();
        
        colocarCajadetexto();
        
     
  }
   private void colocarPaneles(){
         panel = new JPanel();    //Creacion de un panel
       //panel.setBackground(Color.red); // Color del Panel
        panel.setLayout(null); //Desactivando diseño
       
        this.getContentPane().add(panel); // Agregamos el panel a la ventana
   }
   private void colocarEtiqueta(){
   
   JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);// Creamos una etiqueta, establecemos el texto de la etiqueta y centramos el texto en la etiqueta
       //etiqueta.setText("Hola");// Establece texto en la etiqueta
       etiqueta.setBounds(10,10,50,20);// Localizacion del texto
       etiqueta.setForeground(Color.WHITE);
       etiqueta.setOpaque(true);
       etiqueta.setBackground(Color.BLACK);//Cambiar color de la etiqueta
       etiqueta.setFont(new Font("arial",Font.PLAIN,20));
       panel.add(etiqueta); // Agregamos al panel
   }
   private void colocarBotones(){
       
       JButton boton1 = new JButton();
       boton1.setText("click");// Establece texto en el boton
       boton1.setBounds(100, 100, 100, 40);
       boton1.setEnabled(true);//Establecemos el encentido del boton
       boton1.setMnemonic('a');//Definir atajo en teclado
       boton1.setForeground(Color.BLACK);// Define el color de la letra del boton
       boton1.setFont(new Font("",Font.BOLD,20));//Define la fuente de la letra
       panel.add(boton1);
       
   }
   private void colocarCajadetexto(){
       JTextField cajaTexto = new JTextField();
       cajaTexto.setBounds(50,50 ,100, 30);
       panel.add(cajaTexto);
   }
 
}
       
          

  

