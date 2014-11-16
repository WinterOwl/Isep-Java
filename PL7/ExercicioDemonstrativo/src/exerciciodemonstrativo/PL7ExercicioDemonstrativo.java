/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciodemonstrativo;

import java.util.Scanner;

/**
 *
 * @author MarcoSLB
 */
public class PL7ExercicioDemonstrativo
{
    
    static Scanner in = new Scanner(System.in);
    
    public static int lerDimensao(String msg)
    {
        int val;
        do
        {
            System.out.print(msg);
            val = in.nextInt();
        } while(val <= 0);
        return(val);
    }
    
    public static void lerMatriz(int[][]m, int nL, int nC)
    {
        int l, c;
        
        for(l=0; l < nL; l++) // Equivalente a ter m.length
        {
            for(c=0; c < nL; c++) // Equivalente a ter m[0] || m[l].length
            {
                System.out.println("n[" + l + "][" + c + "]");
                m[l][c] = in.nextInt();
            }
        }
    }
    
    public static int[] somarLinhasMatriz(int[][]m, int nL, int nC)
    {
        int l, c;
        int[] vSoma = new int [nL];
        
        for(l=0; l < nL; l++)
        {
            vSoma[l] = 0;
            for(c=0; c < nC; c++)
                vSoma[l] += m[l][c]; 
        }
        
        return(vSoma);
    }
    
    public static void ordenarVectorDecrescente(int[] vec, int[][] m, int nL, int nC)
    {
        int aux;
        for(int i = 0; i < nL-1; i++)
        {
            for(int j = i+1; j < nL; j++)
                if(vec[j]>vec[i])
                {
                    aux = vec[i];
                    vec[i]=vec[j];
                    vec[j]=aux;
                    trocarLinhasMatriz(m,i,j,nC);
                }
        }
    }
    
    public static void trocarLinhasMatriz(int[][] m, int i, int j, int nC)
    {
        int aux;
//      int[] aux = m[i];
//      m[i]=m[j];
//      m[j] = aux;
          
        for(int k = 0; k < nC; k++)
        {
            aux = m[i][k];
            m[i][k]=m[j][k];
            m[j][k]=aux;
        }
    }

    public static void escreverMatriz(int[][] m, int nL, int nC)
    {
        for(int l=0; l < nL; l++)
        {
            for(int c = 0; c < nC; c++)
                System.out.print(m[l][c]);
        
            System.out.println();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int nLinhas, nColunas;
        int [][] matriz;
        
        nLinhas = lerDimensao("Numero de linhas: ");
        nColunas = lerDimensao("Numero de colunas: ");
        matriz = new int [nLinhas] [nColunas];
        lerMatriz(matriz, nLinhas, nColunas);
        
        int[] vecSoma = new int[nLinhas];
        vecSoma=somarLinhasMatriz(matriz, nLinhas, nColunas);
        ordenarVectorDecrescente(vecSoma, matriz, nLinhas, nColunas);
        escreverMatriz(matriz, nLinhas, nColunas);
    }
    
}
