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
    static Scanner input = new Scanner(System.in);
    
    public static void lerValores(int[] vector, int tam)
    {
        for(int i = 0; i < tam; i++)
        {
            System.out.print("Insira o valor para o " + (i+1) + " elemento: ");
            vector[i] = input.nextInt();
        }
    }
    
    public static void invVector(int[] vector, int tam)
    {   
        int aux;
        for(int i = 0; i < tam/2; i++)
        {
            aux = vector[i];
            vector[i] = vector[tam - 1 - i];
            vector[tam - 1 - i] = aux;
        }
    }
    
    public static void rotVector(int[] vector, int tam)
    {
        int aux = vector[tam-1];
        
        for(int i = (tam-1); i > 0; i--)
            vector[i] = vector[i-1];
        
        vector[0] = aux;
    }
    
    public static void mostrarVector(int[] vector, int tam)
    {
        for(int i = 0; i < tam; i++)
            if(i < tam-1)
                System.out.print(vector[i] + "->");
            else
                System.out.println(vector[i]);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.print("Insira o numero de elementos: ");
        int nElem = input.nextInt();
        int[] vector = new int[nElem];
         lerValores(vector, nElem);
        invVector(vector, nElem);
        System.out.print("Vector invertido: ");
        mostrarVector(vector, nElem);
        rotVector(vector, nElem);
        System.out.print("Vector rodado para a direita: ");
        mostrarVector(vector, nElem);
    }
    
}
