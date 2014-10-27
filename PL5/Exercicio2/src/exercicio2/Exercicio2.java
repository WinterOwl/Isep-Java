/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio2;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio2
{
    static Scanner input = new Scanner(System.in);
    
    public static void imprimirGrafico(int maxAlu, int maxDisc)
    {
        int nota, negativas=0, positivas=0;
        String disciplina;
        
        for(int i = 1; i <= maxDisc; i++)
        {
            System.out.print("Disciplina: ");
            disciplina = input.next();
            
            for(int j = 1; j <= maxAlu; j++)
            {
                do
                {
                    System.out.print("Insira nota do aluno " + j + ": ");
                    nota = input.nextInt();
                } while(nota < 0 || nota > 20);
                
                if(nota < 10)
                    negativas++;
                else
                    positivas++;
            }
            
            
            System.out.print("- Positivas: ");
            for(int n = 1; n <= positivas; n++)
            {
                if(n != positivas)
                    System.out.print("*");
                else
                    System.out.println("*");
            }
            
            System.out.print("- Negativas: ");
            for(int n = 1; n <= negativas; n++)
            {
                if(n != negativas)
                    System.out.print("*");
                else
                    System.out.println("*");
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int maxAlu, maxDisc;
        
        do
        {
            System.out.print("Insira o numero de alunos da turma: ");
            maxAlu = input.nextInt();
        } while(maxAlu < 0);
        
        do
        {
            System.out.print("Insira o numero de disciplinas: ");
            maxDisc = input.nextInt();
        } while(maxDisc < 0);
        
        imprimirGrafico(maxAlu, maxDisc);
    }
    
}
