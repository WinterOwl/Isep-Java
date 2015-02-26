/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3comp2;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio3Comp2
{
    static final int MAX = 40;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int contador1, numero, enc = 0, resto, contador2 = 0, verifica = 0, auxiliar = 0;
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        numero = scn.nextInt();
        
        while (contador2 <= MAX && verifica == 0)
        {
            auxiliar = numero;
            contador1 = 0;
            contador2 = 0;
            while (numero > 0)
            {
                resto = numero % 10;
                numero = numero / 10;
                contador1 += 1;
                
                if (auxiliar % resto == 0)
                    contador2 += 1;
            }
            if (contador1 != contador2)
            {
                System.out.print("Insira o proximo numero: ");
                numero = scn.nextInt();
            }
            else 
            {
                verifica = 1;
                System.out.println("Ja foi encontrado um numero");
            }
        }
    }
    
}
