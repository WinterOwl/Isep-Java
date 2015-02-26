/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio5;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio5
{
    public static int comuns(int n1, int n2)
    {
        int resto1, resto2, contador = 0;
        while(n1 > 0 && n2 > 0)
        {
            resto1 = n1 % 10;
            resto2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            
            if(resto1 == resto2)
                contador++;
        }
        return contador;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int N, n1, n2, maior = 0, mNum = 0;
        Scanner scn = new Scanner(System.in);
        do
        {
            System.out.print("Insira o numero de valores a inserir: ");
            N = scn.nextInt();
        } while(N <= 0);
        
        for(int i = 0; i < N; i++)
        {
            System.out.print("Insira o numero 1: ");
            n1 = scn.nextInt();

            System.out.print("Insira o numero 2: ");
            n2 = scn.nextInt();
 
            if(maior < comuns(n1, n2))
            {
                maior = comuns(n1, n2);
                mNum = n1;
            }
        }
        System.out.println("O numero com mais digitos em comum é: " + mNum);
    }
    
}
