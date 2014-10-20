/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3comp3;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio3Comp3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int numero, maior, menor, digito;
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        numero = scn.nextInt();
        menor = -1;
        maior = 0;
        while (numero > 0)
        {
            if (numero > maior)
            {
                maior = numero;
                while (maior > 0)
                {
                    digito = maior % 10;
                    maior = maior / 10;
                    if (digito % 2 == 0 && menor == -1)
                        menor = digito;
                    else if (digito % 2 != 0 && digito < menor)
                        maior = digito;
                }
            }
            System.out.print("Insira o proximo numero: ");
            numero = scn.nextInt();
        }
        if (menor == -1) {
            System.out.println("Não foram introduzidos numeros impares.");
        } else {
            System.out.println("O maior é:" + maior);
        }
    }
    
}
