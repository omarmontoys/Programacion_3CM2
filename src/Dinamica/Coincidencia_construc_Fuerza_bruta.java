package Dinamica;
/**
 * @author OMAR
 */
public class Coincidencia_construc_Fuerza_bruta {
    
     
  public static void main(String[] args ){
     // char[] texto = {'h','o','l','a',' ','m','u','n','d','o'};
      String[] Cadena1 = {"h","o","l","a"," ","m","u","n","d","o"};   
      //char[] palabra = {'h','o','l','a'};
      //String Cadena2 = new String(palabra);
      String[] Cadena2 =  {"h","o","l","a"};
      System.out.println(Cadena1);
      System.out.println(Cadena2);
      int n = Cadena1.length;
      int m = Cadena2.length;
      
      int comprobar = encontrar(n,m,Cadena1,Cadena2);
      if(comprobar != 1){
          System.out.println("Se encontro la palabra");
        
          
      }else{
          System.out.println("No se encontro la palabra");
      }
      
}
  public static int encontrar(int n, int m, String[] Cadena1, String[] Cadena2){
      if(m>n){
          return-1;
      }
      else{
          int j;
          for(int i = 0; i<=(n-m); i++){
              j =0;
              while(j<m && (Cadena2[j] == null ? Cadena1[i+j] == null : Cadena2[j].equals(Cadena1[i+j]))){
                  System.out.println("La posicion de la cadena 2 es : "+ i);
                  j++;
                  
              }
              if(j==m){
                return i;
              }
          }
          return -1;
      }
     
  
  }
  
  
}
