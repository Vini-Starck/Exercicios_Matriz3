package exerciciosapii_matriz3;

import java.util.Random;


public class matriz {
    /**
     * insere
     * @param m 
     */
    public static void inserir(int[][]m){
         Random rd = new Random();
        
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j] = rd.nextInt(10); // gera números de 0 a 20.
            }
        }
    }
    
    public static void exibir(int[][]m){
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(i<=j){
                    System.out.print(m[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }  
    }
}
