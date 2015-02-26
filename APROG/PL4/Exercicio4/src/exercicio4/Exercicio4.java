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
        double max, soma, contadorPerf=0, contador=0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira a quantidade de numeros perfeitos: ");
        max = scn.nextInt();
        
        while(contadorPerf < max)
        {
            contador++;
        
            soma = 0;
            for(double j = 1; j <= contador/2; j++)
            {
                if((contador % j) == 0)
                    soma += j;
            }
            if(soma == contador)
            {
                contadorPerf++;
                System.out.println(contador);
            }
        }
        if(contadorPerf==0)
            System.out.println("Não foram encontrados numeros perfeitos"
                    + " entre 1 e "+max);
    
    }
    
}
