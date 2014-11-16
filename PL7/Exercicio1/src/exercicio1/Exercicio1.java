/*
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
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void preencherVector(int[] vec)
    {
        for(int i = 0; i < vec.length; i++)
        {
            System.out.print("Insira o valor " + (i+1) + ": ");
            vec[i] = input.nextInt();
        }
    }
    
    public static void ordenarVector(int[] vec)
    {
        int aux;
        for(int i = 0; i < vec.length-1; i++)
            for(int j = i+1; j < vec.length; j++)
                if(vec[i] < vec[j])
                {
                    aux = vec[j];
                    vec[j] = vec[i];
                    vec[i] = aux;
                }
    }
    
    public static void mostrarVector(int[] v, int tam)
    {
        for (int i = 0; i < tam; i++)
        {
            System.out.println("Valor " + (i + 1) + " = " + v[i]);
        }
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        int m;
        System.out.print("Insira o numero de elementos a introduzir: ");
        int n = input.nextInt();
        do
        {
            System.out.print("Insira a quantidade de numeros maiores que pretende visualizar: ");
            m = input.nextInt();
        } while(m < 0 || m > n);

        int[] vec = new int[n];
        
        preencherVector(vec);
        
        ordenarVector(vec);
        
        mostrarVector(vec, m);
    }
}
