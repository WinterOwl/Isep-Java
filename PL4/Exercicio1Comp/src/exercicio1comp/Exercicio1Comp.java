/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1comp;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio1Comp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int i, numero, numaux = 0, produto1 = 1, resto = 0;
        Scanner scn = new Scanner(System.in);
        numero = scn.nextInt();
        numaux = numero;
        
        while (numaux > 0)
        {
            while (numero > 0)
            {
                resto = numero % 10;
                numero /= 10;
                produto1 *= resto;
            }
            
            System.out.println("Produto--->"+produto1);
            numaux = produto1;
            numero=numaux;
            produto1 = 1;   
        }
    }
    
}
