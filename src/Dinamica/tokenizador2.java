package Dinamica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author OMAR
 */
public class tokenizador2 {
    
      
    private ArrayList<Items> articulos;

    public tokenizador2() {
        this.articulos = new ArrayList<>();
    }
    
    public void tokenizar(){
        
        try {
            //llamamos el metodo que permite cargar la ventana
            JFileChooser file = new JFileChooser();
            file.setCurrentDirectory(new File("./"));
            file.showOpenDialog(file);
            //abrimos el archivo seleccionado
            File abre = file.getSelectedFile();
             //recorremos el archivo y lo leemos
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                String aux;
                StringTokenizer st;
                while ((aux = lee.readLine()) != null) {
                    st = new StringTokenizer(aux, ",");
                    int peso = Integer.parseInt(st.nextToken());
                    int beneficio = Integer.parseInt(st.nextToken());
                    this.getArticulos().add(new Items(peso, beneficio));
                }
                lee.close();
                //System.out.println(lista.size());
               
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
            
        }
       
    
    }

    /**
     * @return the articulos
     */
    public ArrayList<Items> getArticulos() {
        return articulos;
    }
    
    
}
