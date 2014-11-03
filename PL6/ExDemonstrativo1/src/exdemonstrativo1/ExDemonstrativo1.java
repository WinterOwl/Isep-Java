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
    
    public static int lerQuantidade()
    {
        int valor;
        do
        {
            System.out.print("valor: ");
            valor=input.nextInt();
        } while(valor <=0);
        return(valor);
    }
    
    public static void lerValores(String[] vNomes, int []vNotas, int tam)
    {
        for(int i = 0; i < tam; i++)
        {
            input.nextLine();
            System.out.print("Nome: ");
            vNomes[i]=input.nextLine();
            System.out.print("Nota: ");
            vNotas[i]=input.nextInt();
        }
    }
    
    public static int encontrarMaximo(int[] vNotas, int dim)
    {
        int max;
        
        max=vNotas[0];
        
        for(int i = 1; i < dim; i++)
        {
            if(max<vNotas[i])
                max=vNotas[i];
        }
        return(max);
    }
    
    public static void escreverPorValor(String[] vNomes, int[] vNotas, int dim, int vRef)
    {
        for(int i = 0; i < dim; i++)
        {
            if(vRef==vNotas[i])
                System.out.println(vNomes[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int qtd, maximo;
        String[] vecNomes;
        int[] vecNotas;
        qtd = lerQuantidade();
        vecNomes = new String[qtd];
        vecNotas = new int[qtd];
        lerValores(vecNomes, vecNotas, qtd);
        maximo = encontrarMaximo(vecNotas, qtd);
        escreverPorValor(vecNomes, vecNotas, qtd, maximo);
    }
    
}
