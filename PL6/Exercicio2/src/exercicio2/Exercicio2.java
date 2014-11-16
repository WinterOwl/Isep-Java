/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class Exercicio2
{
    
    static Scanner input = new Scanner(System.in);
    
    public static void lerDadosFunc(String[] nomes, int[] vencs, int tam)
    {
        String nome;
        int venc, i = 0;
        
        input.nextLine();
        System.out.print("Insira o nome: ");
        nome = input.nextLine();
        
        while(!nome.contentEquals("tt") && i < tam)
        {
            do
            {
                System.out.print("Insira o vencimento: ");
                venc = input.nextInt();
            } while(venc <= 0);
            
            nomes[i] = nome;
            vencs[i] = venc;
            i++;
            
            input.nextLine();
            System.out.print("Insira o nome: ");
            nome = input.nextLine();
        }
    }
    
    public static int mediaVenc(String[] nomes, int[] vencs,int tam)
    {
        int i=0, total=0;
        while(i < tam && vencs[i] != 0)
        {
            total += vencs[i]; 
            i++;
        }
        return (total/i);
    }
    
    public static void listarNomeInfParam(String[] nomes, int[] vencs,int tam, int valor)
    {
       System.out.println("Nomes dos funcionários com vencimentos inferiores a " + valor +": ");
       for(int i = 0; i < tam; i++)
           if(vencs[i] < valor && vencs[i] > 0)
               System.out.println("   -" + nomes[i]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int op, nElem = 50, valor;
        String[] nomes = new String[nElem];
        int[] vencimentos = new int[nElem];
        int media;
        
        do
        {
            System.out.print("\n1-Ler valores\n2-Listar nomes dos funcionários com vencimentos inferiores à média"
                    + "\n3-Listar funcionarios com vencimento inferior ao valor a ser inserido\n4-Sair\nOpção: ");
            op = input.nextInt();
            switch (op)
            {
                case 1:
                    lerDadosFunc(nomes, vencimentos, nElem);
                    break;
                case 2:
                    media = mediaVenc(nomes, vencimentos, nElem);
                    listarNomeInfParam(nomes, vencimentos, nElem, media);
                    break;
                case 3:
                    System.out.print("Insira o valor que definirá o limite: ");
                    valor = input.nextInt();
                    listarNomeInfParam(nomes, vencimentos, nElem, valor);
                    break;
                default:
                    System.out.println("Insira uma opção valida.");
            }
        } while(op != 4);
    }
    
}
