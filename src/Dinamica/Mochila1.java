package Dinamica;
import java.util.ArrayList;
/**
 *
 * @author OMAR
 */
public class Mochila1 {
    private int W;
    private int peso;
    private int beneficio;
    ArrayList<Items> Lista;
    int matriz[][] = new int [5][5];
    public Mochila1(){            
                   W  =  0;
                   peso  =  0;
                   beneficio  =  0;                  
       }  
     public Mochila1(ArrayList<Items> Lista){
            W = 20;
            
          }
    
    public int Calcular(){
    for(int w =0; w<W; w++){
        matriz[0][w] = 0;
    }
    for(int i =1;i<6; i++ ){
        matriz[i][0] = 0;
    }
    for(int i = 1;i<6;i++){
        for(int w = 0; w < W; w++){
            if(peso <= w){
                if(beneficio + matriz[i - 1][w-beneficio] > matriz[i-1][w]){
                    matriz[i][w] = beneficio + matriz[i-1][w- peso];                   
                }else{
                    matriz[i][w] = matriz[i-1][w];
                }
            }else{
                matriz[i][w] = matriz[i-1][w];
            }
        }
    }
        return 0;
        
    }
   
}
