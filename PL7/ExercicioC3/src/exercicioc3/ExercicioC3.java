/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioc3;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class ExercicioC3
{
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void lerSudoku(int[][] m1)
    {
        for(int i = 0; i < m1.length; i++)
        {
            for(int j = 0; j < m1[i].length; j++)
            {
                System.out.print("Insira o valor da linha " + (i+1) + 
                        " coluna " + (j+1) + ": ");
                m1[i][j] = input.nextInt();
                while(m1[i][j] < 1 || m1[i][j] > 9)
                {
                    System.out.print("[Erro] Insira o valor da linha " + (i+1) + 
                        " coluna " + (j+1) + ": ");
                    m1[i][j] = input.nextInt();
                }
            }
        }
    }
    
    public static int compararElementosVector(int[] vec)
    {
        int iguais=-1;
        for(int i = 0; i < vec.length-1; i++)
        {
            for(int j = i+1; j < vec.length; j++)
            {
                if(vec[i] == vec[j])
                    iguais++;
            }
        }
        return iguais;
    }
    
    public static Boolean validarLinhas(int[][] m1)
    {
        for(int l = 0; l < m1.length; l++)
        {
            if(compararElementosVector(m1[l]) != -1)
                return false; 
        }
        return true;
    }
    
    public static Boolean validarColunas(int[][] m1)
    {
        for(int c = 0; c < m1[0].length; c++)
        {
             for(int l = 0; l < m1.length; l++)
             {
                 for(int i = l+1; i < m1.length; i++)
                    if(m1[l][c] == m1[i][c])
                        return false;
             }
        }
        return true;
    }
    
    public static Boolean obterSubMatriz(int[][] m, int lInicial, int cInicial, int lFinal, int cFinal)
    {
        int[] vec = new int[9];
        int contador=0;
       
        for(int l = lInicial; l < lFinal; l++)
        {
            for(int c = cInicial; c < cFinal; c++)
            {
                vec[contador] = m[l][c];
                contador++;
            }
        }
        
        if(compararElementosVector(vec) == -1)
            return true;
        else
            return false;
    }
    
    public static Boolean validarSubMatrizes(int[][] m1)
    {
        Boolean resultado;
        for(int l = 0; l < 3; l ++)
        {
            for(int c = 0; c < 3; c++)
            {
                resultado=obterSubMatriz(m1, l*3, c*3, l*3+3,c*3+3);
                if(resultado == false)
                    return false;
            }
        }
        return true;
                
    }
    
    public static Boolean validarSudoku(int[][] m1)
    {
        int condicoes = 0;
        
        if(validarLinhas(m1))
            condicoes++;
        else
            return false;
        
        if(validarColunas(m1))
            condicoes++;
        else
            return false;
        
        if(validarSubMatrizes(m1))
            condicoes++;
        else
            return false;
        
        return true;
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int[][] sudoku = {{8,3,5,4,1,6,9,2,7}, {2,9,6,8,5,7,4,3,1}, {4,1,7,2,9,3,6,5,8},{5,6,9,1,3,4,7,8,2},{1,2,3,6,7,8,5,4,9},{7,4,8,5,2,9,1,6,3},
        {6,5,2,7,8,1,3,9,4}, {9,8,1,3,4,5,2,7,6}, {3,7,4,9,6,2,8,1,5}};
        
        System.out.print(validarSudoku(sudoku));
        //lerSudoku(sudoku);
        
        
    }
    
}
