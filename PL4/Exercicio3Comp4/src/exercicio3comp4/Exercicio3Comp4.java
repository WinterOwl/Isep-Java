/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3comp4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio3Comp4
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, certo, contador=0, maxtentativas;
        double ada;
        Random rn = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o numero maximo de tentativas: ");
        maxtentativas = s.nextInt();
        System.out.print("Insira o numero: ");
        numero = s.nextInt();
        ada = Math.random();
        certo =rn.nextInt(1000) + 5;
        System.out.println(certo);
        while(contador<maxtentativas && numero!=certo)
        {
           contador+=1;
           if(numero<certo)
               System.out.println("Tente um numero maior");
           else if(numero > certo)
               System.out.println("Tente um numero mais pequeno");
           
           System.out.print("Insira o numero: ");
           numero = s.nextInt();
        }
        if(contador==maxtentativas)
            System.out.println("Tem de melhorar a sua concentração");
        else
            System.out.println("Parabéns conseguiu acertar no numero e necessitou de "+contador+" tentativas");
        
    }
    
}
