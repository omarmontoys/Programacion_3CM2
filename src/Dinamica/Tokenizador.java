package Dinamica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 *
 * @author OMAR
 */
public class Tokenizador {
     
    public static void main(String[] args){
        StringTokenizer tokens;
        String cadena = "2,3\n4,5";
        
        File fichero = new File("C:\\Users\\OMAR\\Desktop\\3er semestre\\token.txt");
        try {
            FileWriter fr = new FileWriter(fichero);
            BufferedWriter br = new BufferedWriter(fr);
            
            br.write(cadena);
            
            br.close();
            
        } catch (IOException ex) {
            System.err.println("No se encontro el archivo");
        }
        tokens = new StringTokenizer(cadena,":");
        cadena = "";
        while(tokens.hasMoreElements()){
            cadena = cadena + tokens.nextToken(cadena);
        }
    System.out.println(cadena);
    }
    
}
