/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author ruimoreira
 */
public class PL7Exercicio2 {

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Coluna " + (i + 1) + "= " + v[i]);
        }
    }

    public static int[] calcMedColuna(int[][] m) {
        int[] vector = new int[m[0].length];
        for (int c = 0; c < m[0].length; c++) {
            for (int l = 0; l < m.length; l++) {
                vector[c] += m[l][c];
            }
           vector[c] /= m[c].length;
        }
        return vector;
    }
    
    public static float calcMedGlobal(int[][] m) {
        float media = 0;
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                media += (float)m[l][c];
            }
        }
        media = (float) (media / (float)(m.length * m[0].length));
        return media;
    }
    
     public static void TransporMatriz(int[][] m) {
        int[][] transposta = null;
        transposta = new int[m[0].length][m.length];
       for (int i = 0; i < m.length; i++)  
        {  
            for (int j = 0; j < m[0].length; j++)  
            {  
                transposta[j][i] = m[i][j];  
            }  
        }  
        System.out.println("\nMatriz Transposta");
        mostrarMatriz(transposta); 
    }
    
    /**
     *
     * A) O algoritmo procura para cada linha o maior elemento presente.
     *
     *
     * @param args the command
     * line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 1}};

        mostrarMatriz(m);
        int[] vect = calcMedColuna(m);
        mostrarVector(vect);
        System.out.println("\nMedia Global: " + calcMedGlobal(m));
        TransporMatriz(m);
    }
}
