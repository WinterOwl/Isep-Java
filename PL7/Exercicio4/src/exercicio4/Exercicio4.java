/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio4;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio4
{
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void contarElementosIguais(int valor, int[][] m1, int[][] m2)
    {
        for(int i = 0; i < m1.length; i++)
        {
            for(int j = 0; j < m1[0].length; j++)
            {
                if(m1[i][j] != null)
                {
                    m2[i][0] = m1[i][j];

                    if(m2[i] == m1[j])
                    {
                        m2[i][1]++;
                        m1[j][0] = ;
                    }
                }
            }
        }
    }
    
    public static void procurarMatriz(int[][] m1, int[][] m2)
    {
        for(int i = 0; i < m1.length; i++)
        {
            for(int j = 0; j < m1[0].length; j++)
            {
                if(m1[i][j] != null)
                {
                    
                    contarElementosIguais(m1[i][j],m1, m2);
                    
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        int[][] m = {{2,2,4,6}, {8,3,12,5}, {71,52,63,12},{20,14,63,21}};
        int[][] m2 = new int[4][4];
        procurarMatriz(m,m2);
        
    }
    
}
