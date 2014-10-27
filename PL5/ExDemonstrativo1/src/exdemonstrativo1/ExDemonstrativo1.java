/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exdemonstrativo1;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class ExDemonstrativo1
{
    static Scanner input = new Scanner(System.in);
    
    public static int lerNoIntervalo(int limI, int limS)
    {
        int numero;
        do
        {
            System.out.print("Insira o numero: ");
            numero = input.nextInt();
        } while(numero < limI || numero > limS);
        return numero;
    }
    public static void escreverTabuada(int numero)
    {
        for(int j = 1; j <= 10; j++)
            System.out.println(numero + "x" + j + "= " + (numero*j));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int N, limI, limS;
        int numero;
        
        do
        {
            System.out.println("Qtd tabuabas?");
            N = input.nextInt();
        } while(N <= 0);
        
        do
        {
            System.out.println("Lim inferior?");
            limI = input.nextInt();
            System.out.println("Lim superior?");
            limS = input.nextInt();
        } while(limI >= limS || limI < 0 || limS < 0);
        
        for(int i = 1; i <= N; i++)
        {
            numero = lerNoIntervalo(limI, limS);
            escreverTabuada(numero);
        }
        
    }
    
}
