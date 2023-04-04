package Paradigmas_de_programacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
* @author OMAR
 */
public class FormularioVacunacion extends JFrame implements ActionListener {
    
    JLabel etinombre,etiedad, eticurp,
            etidomicilio, eticolonia, eticodigopostal, etiestado, 
            etimunicipio, eticomunidad, eticorreoelectronico,etitelcasa, 
            etitelmovil, etipadecimientos, etisexo, eticovid;
    
    JTextField txtnombre,txtedad,txtcurp,
            txtdomicilio, txtcolonia, txtcodigopostal, txtestado, 
            txtmunicipio, txtcomunidad, txtcorreoelectronico,txttelcasa, 
            txttelmovil, txtpadecimientos, txtsexo, txtcovid;
    JButton boton;
    JTextArea area;
    JPanel panel;
    
    public FormularioVacunacion(){
        etinombre = new JLabel ("Nombre");
        etinombre.setBounds(10, 20, 80, 20);
        
        eticurp = new JLabel ("Curp");
        eticurp.setBounds(10, 50, 80, 20);
        
        etiedad = new JLabel ("Edad");
        etiedad.setBounds(10, 80, 80, 20);
        
        etidomicilio= new JLabel ("Domicilio");
        etidomicilio.setBounds(10, 110, 80, 20);
        
        eticolonia = new JLabel ("Colonia");
        eticolonia.setBounds(10, 140, 80, 20);
        
        eticodigopostal = new JLabel ("Codigo Postal");
        eticodigopostal.setBounds(10, 170, 80, 20);
        
        etiestado = new JLabel ("Estado");
        etiestado.setBounds(10, 200, 80, 20);
        
        etimunicipio = new JLabel ("Municipio");
        etimunicipio.setBounds(10, 230, 80, 20);
        
        eticomunidad = new JLabel ("Comunidad");
        eticomunidad.setBounds(10, 260, 80, 20);
        
        eticorreoelectronico = new JLabel ("Estado");
        eticorreoelectronico.setBounds(10, 290, 80, 20);
        
        etitelcasa = new JLabel ("Tel. casa");
        etitelcasa.setBounds(10, 320, 80, 20);
        
        etitelmovil = new JLabel ("Tel. movil");
        etitelmovil.setBounds(10, 350, 80, 20);
        
        etipadecimientos = new JLabel ("Padece de alguna enfermedad ¿Cual?");
        etipadecimientos.setBounds(10, 380, 250, 20);
        
        etisexo = new JLabel ("Sexo");
        etisexo.setBounds(10, 410, 80, 20);
        
        eticovid = new JLabel ("¿Has padecido covid?");
        eticovid.setBounds(10, 440, 250, 20);
        
        txtnombre = new  JTextField();
        txtnombre.setBounds(100, 20, 200, 20);
        
        txtcurp = new JTextField();
        txtcurp.setBounds(100, 50, 200, 20);
        
        txtedad = new JTextField();
        txtedad.setBounds(100, 80, 120, 20);
        
        txtdomicilio= new JTextField();
        txtdomicilio.setBounds(100, 110, 150, 20);
        
        txtcolonia = new JTextField();
        txtcolonia.setBounds(100, 140, 100, 20);
        
        txtcodigopostal = new JTextField();
        txtcodigopostal.setBounds(100, 170, 100, 20);
        
        txtestado = new JTextField();
        txtestado.setBounds(100, 200, 100, 20);
        
        txtmunicipio = new JTextField();
        txtmunicipio.setBounds(100, 230, 100, 20);
        
        txtcomunidad = new JTextField();
        txtcomunidad.setBounds(100, 260, 100, 20);
        
        txtcorreoelectronico = new JTextField();
        txtcorreoelectronico.setBounds(100, 290, 200, 20);
        
        txttelcasa = new JTextField();
        txttelcasa.setBounds(100, 320, 100, 20);
        
        txttelmovil = new JTextField();
        txttelmovil.setBounds(100, 350, 100, 20);
        
        txtpadecimientos = new JTextField();
        txtpadecimientos.setBounds(280, 380, 150, 20);
        
        txtsexo = new JTextField();
        txtsexo.setBounds(100, 410, 80, 20);
        
        txtcovid = new JTextField();
        txtcovid.setBounds(150, 440, 100, 20);
        
        boton = new JButton("Capturar");
        boton.setBounds(600, 600, 100, 20);
        boton.addActionListener(this);
        
        area = new JTextArea();
        area.setBounds(500,50,300,500);
        
        panel = new JPanel ();
        panel.setLayout(null);
        
        panel.add(etinombre);
            panel.add(eticurp);
            panel.add(etiedad);
            panel.add(etidomicilio);
            panel.add(eticolonia);
            panel.add(eticodigopostal);
            panel.add(etiestado);
            panel.add(etimunicipio);
            panel.add(eticomunidad);
            panel.add(eticorreoelectronico);
            panel.add(etitelcasa);
            panel.add(etitelmovil);
            panel.add(etipadecimientos);
            panel.add(etisexo);
            panel.add(eticovid); 
            panel.add(txtnombre);
              panel.add(txtcurp);
                panel.add(txtedad);
                panel.add(txtdomicilio);
                panel.add(txtcolonia);
                panel.add(txtcodigopostal);
                panel.add(txtestado);
                panel.add(txtmunicipio);
                panel.add(txtcomunidad);
                panel.add(txtcorreoelectronico);
                panel.add(txttelcasa);
                panel.add(txttelmovil);
                panel.add(txtpadecimientos);
                panel.add(txtsexo);
                panel.add(txtcovid);
                
                    panel.add(boton);
                        panel.add(area);
        
                        add(panel);
                        setSize(900,900);
                       setVisible(true);
        
        
    }
    
    public static void  main(String[] args){
        
        FormularioVacunacion p= new FormularioVacunacion();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if(e.getSource()==boton){
            Capturar();
        }
        
    }
    
    void Capturar(){
        
        area.setText("Los datos capturados son : \n Nombre : " + txtnombre.getText()+ 
                " \n Curp : " +txtcurp.getText()+ "\n Edad : " +txtedad.getText()+ "\n Domicilio : " +txtdomicilio.getText()+
                "\n Colonia : " +txtcolonia.getText()+ "\n Codigo Postal : " +txtcodigopostal.getText()+ "\n Estado : " +txtestado.getText()+
                "\n Municipio : " +txtmunicipio.getText()+ "\n Comunidad : " +txtcomunidad.getText()+ 
                "\n CorreoElectronico : " +txtcorreoelectronico.getText()+ "\n Tel. Casa : " +txttelcasa.getText()+
                "\n Tel. Movil : "+ txttelmovil.getText()+ "\n Padecimientos : "+ txtpadecimientos.getText()+
                "\n Sexo : "+ txtsexo.getText()+ "\n Padecio Covid : "+ txtcovid.getText());
        
    }
            
}
