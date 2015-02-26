/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1pl7;

/**
 *
 * @author i140870
 */
public class Exercicio1PL7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 1}};
        MostraMatriz(m);
       
    }

public static void MostraMatriz(int[][] m){
    int x;
    for(int i=0;i< m.length;i++){
        for (int j = 0; j < m[i].length; j++) {
   
            System.out.println(m[i][j]+"");
            System.out.println();
          
        }
    }
}
public static float calculaMedia(int[][] m){
    int soma=0,j;
    float Media=0;
    for(int i=0;i< m.length;i++){
        for (j = 0; j < m[i].length; j++) {
          soma+=m[i][j];
        }
    Media=soma/j;
    } 
    return Media;
}
}
