package Dinamica;
/**
* @author OMAR
 */
public class Metodo_Rabin_Karp {
    
    
    public static void main(String[] args ){
        char [] Texto ={'H','o','l','a',' ','m','u','n','d','o'};
        String cadena1 = new String(Texto);
        char[] Palabra = {'H','o','l','a'};
        String cadena2 = new String(Palabra);
           int c;
           int m  = Texto.length;
           c = hasheocadena1(m, cadena1);
           int f ;
           int k = Palabra.length;
           f = hasheocadena2(k, cadena2);
           
              }
    public static int hasheocadena1(int m, String cadena1) {
      int hash = 0;
      int v;
      System.out.println("Codigo Ascii de la cadena 1 Texto\n");
        for (int i = 0; i < m ; i++) {
        v = cadena1.charAt(i);
        
        System.out.println(v);
        hash++;
}
        return 0;

        
    }
    public static int hasheocadena2(int k, String cadena2) {
     int hash2 = 0;
      int z;
      System.out.println("Codigo Ascii de la cadena 2 Palabra:\n");
        for (int i = 0; i < k ; i++) {
        z = cadena2.charAt(i);
        
        System.out.println(z);
        hash2++;
}
        
        return hash2;
    
}
      public static int encontrar(int n, int m, String[] Cadena1, String[] Cadena2){
      if(m>n){
          return-1;
      }
      else{
          int j;
          for(int i = 0; i<=(n-m); i++){
              j =0;
              while(j<m && hash((Cadena2[j])==hash(Cadena1[i+j]))){
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
