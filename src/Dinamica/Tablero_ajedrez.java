package Dinamica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * @author OMAR
 */
public class Tablero_ajedrez extends JPanel {
    private int[][] tablero = new int[9][9];
    private int x0, y0;
    private boolean exito;
    private int [][] movimientos = new int[][] { {-2,1}, { -1, 2 },{ 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -1, -2 }, { -2, -1 } };

    public Tablero_ajedrez(int i, int j) throws Exception {
        this.setBounds(0,0,535,536);
        if(i < 1 || i > tablero.length - 1 || j < 1 || j > tablero.length -1){
            throw new Exception("Posicion invalida!!!!");
            }
        x0 = i;
        y0 = j;
        for(int  x = 1; x <= tablero.length - 1; x++){
            for(int y = 1; y <= tablero.length - 1; y++){
                tablero[x][y] = 0;
            }
            
        }
        tablero[x0][y0]= 1;
        this.setVisible(true);
                
    }
    
    public boolean resolverProblema(){
        saltodelcaballo(x0, y0, 2);
        if(exito){
            imprimirMatriz();
        }else{
            System.out.println("No se tuvo exito mi pana");
        }
        return exito;
    }
    
    private void saltodelcaballo(int x, int y, int numSalto){
        
        for(int k = 0; k < 8 && !exito; k++){
            int nx = x + movimientos[k][0];
            int ny = y + movimientos[k][1];
            
            if(nx >= 1 && nx <= tablero.length - 1 && ny >= 1 && ny <= tablero.length - 1 && tablero[nx][ny] == 0){
                tablero[nx][ny] = numSalto;
                if(numSalto == 59){
                    exito = true;
                }else {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
        
                    
                    
                    }
                    repaint();
                    saltodelcaballo(nx,ny, numSalto + 1);
                    
                    if(!exito){
                        tablero[nx][ny] = 0;
                        
                    }
                }
                
            }
            
            
            
        }
        
       
    }
    
    public void imprimirMatriz(){
        for(int x = 1; x < tablero.length; x++){
            for(int y = 1;  y < tablero[0].length; y++){
                System.out.println(tablero[x][y] + " ");
            }
            System.out.println();
        }
        //System.out.println();
    }
   
    public void paint (Graphics g){
        super.paint(g);
        boolean blanco = true;
        int longX =getWidth() / 8;
        int longY = getHeight() / 8;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j <  9; j++){
                if(blanco){
                    g.setColor(Color.WHITE);
                    blanco = false;
                } else{
                    g.setColor(Color.BLACK);
                    blanco = true;
                }
                g.fillRect(i * longX, j * longY, longX, longY);
            }
        }
        g.setFont(new Font(g.getFont().getFontName(),6,22));
        g.setColor(Color.GRAY);
        for(int i = 1; i < tablero.length; i++){
            for(int j = 1; j < tablero[0].length; j++){
                g.drawString(String.valueOf(tablero[i][j]),(j - 1) * longX +25,(i) * longY - 25);            }
        }
    }


    
}
