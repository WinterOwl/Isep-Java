/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3comp1;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio3Comp1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int maxpar, minimpar, percentagempares, pares = 0, soma = 0, numero;
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        numero = scn.nextInt();
        
        if (numero % 2 == 0)
        {
            maxpar = numero;
            minimpar = -1;
        }
        else
        {
            minimpar = numero;
            maxpar = 0;
        }
        while (numero > 0)
        {
            soma += 1;
            if (numero % 2 == 0)
            {
                pares += 1;
                if (numero > maxpar)
                    maxpar = numero;
            }
            if ((numero % 2 == 1) && (numero < minimpar || minimpar == -1))
                minimpar = numero;
            
            System.out.print("Insira o numero: ");
            numero = scn.nextInt();
        }
        percentagempares = ((100 * pares) / soma);
        System.out.println("O maior numero par introduizido foi: " + maxpar);
        System.out.println("O menor numero impar introduizido foi: " + minimpar);
        System.out.println("A percentagem de numeros pares introduzidos foi: " + percentagempares + "%");

    }

}
