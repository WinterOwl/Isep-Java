/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class Exercicio4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    int max, soma, contadorPerf=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira o limite superior do intervalo: ");
        max = scn.nextInt();
        
        for(int i = 1; i <= max; i++)
        {
            soma = 0;
            for(int j = 1; j < i; j++)
            {
                if((i % j) == 0)
                    soma += j;
            }
            if(soma == i)
            {
                contadorPerf++;
                System.out.println(i);
            }
        }
        if(contadorPerf==0)
            System.out.println("Não foram encontrados numeros perfeitos"
                    + " entre 1 e "+max);
    
    }
    
}
