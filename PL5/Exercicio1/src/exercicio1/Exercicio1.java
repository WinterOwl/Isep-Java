/*
 a) Os modulos descritos testam a string presente na variavel pal, determinando (em letra minuscula) se são palíndromos.


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio1
{

    public static boolean metodo1(String pal)
    {
        boolean resposta = true;
        pal = pal.toLowerCase();
        int tamanho = pal.length();
        
        for (int i = 0; i < tamanho / 2; i++)
        {
            if (pal.charAt(i) != pal.charAt(tamanho - 1 - i))
            {
                resposta = false;
                break;
            }
        }
        return resposta;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String palavra;
        int contador = 0;

        Scanner input = new Scanner(System.in);
        
        do
        {
            System.out.print("Insira a palavra a ser testada: ");
            palavra = input.next();
            contador++;
        } while (!metodo1(palavra));
       
        System.out.print("A palavra \"" + palavra + "\" é palindroma, e foi a " + contador + " palavra a ser testada.");
        
    }

}
