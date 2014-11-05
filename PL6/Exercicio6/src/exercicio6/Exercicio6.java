/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class Exercicio6
{

    static Scanner input = new Scanner(System.in);
    
    public static int inserirVistante(String[] nomes, int tam, int nElem)
    {
        input.nextLine();
        System.out.print("Insira o nome do visitante: ");
        nomes[nElem] = input.nextLine();
        return ++nElem;
    }
    
    public static void listarVistantes(String[] nomes, int nElem)
    {
        if(nElem == 0)
            System.out.println("Não existem visitantes.");
        else
        {
            System.out.println("Visitantes: ");
            for(int i = 0; i < nElem; i++)
            {
                System.out.println("   -" + nomes[i]);
            }
        }
    }
    
    public static void actualizarVistante(String[] nomes, int nElem) // actualiza a primeira ocorrencia
    {
        if(nElem == 0)
            System.out.println("Não existem visitantes.");
        else
        {
            input.nextLine();
            System.out.print("Introduza o nome a alterar: ");
            String nome = input.nextLine();

            for(int i = 0; i < nElem; i++)
            {
                if(nomes[i].contentEquals(nome))
                {
                    System.out.print("Introduza o novo nome: ");
                    nomes[i] = input.nextLine();
                    i = nElem;
                }
            }
        }
    }
    
    public static int removerVisitante(String[] nomes, int nElem)
    {
        if(nElem == 0)
            System.out.println("Não existem visitantes.");
        else
        {
            boolean ordenar = false;
            input.nextLine();
            System.out.print("Introduza o nome a remover: ");
            String nome = input.nextLine();
            
            for(int i = 0; i < nElem; i++)
            {
                if(nomes[i].contentEquals(nome) || ordenar)
                {
                    ordenar = true;
                    nomes[i] = nomes[i+1];
                }
            }
            if(ordenar)
                nElem--;
        }
        return nElem;
    }
    
    public static void listarVistantesPorInicial(String[] nomes, int nElem) // Procura por String
    {
        if(nElem == 0)
            System.out.println("Não existem visitantes.");
        else
        {
            boolean primeiro = true;
            System.out.print("Insira a inicial a procurar: ");
            String inicial = input.next();
            
            for(int i = 0; i < nElem; i++)
            {
                if(nomes[i].charAt(0) == inicial.charAt(0))
                {
                    if(primeiro)
                    {
                        System.out.println("Os nomes encontrados são com a inicial '"+inicial.charAt(0)
                                +"': ");
                        primeiro = false;
                    }
                    System.out.println("   -"+nomes[i]);
                }
            }
            if(primeiro)
                System.out.println("Não foram encontrados visitantes com a inicial '" 
                        + inicial.charAt(0) + "'.");
        }
    }
    public static void listarVistantesRepetidos(String[] nomes, int nElem)
    {
        if(nElem == 0)
            System.out.println("Não existem visitantes.");
        else
        {
            boolean encontrados = false;
            
            for(int i = 0; i < nElem; i++)
            {
                for(int j = i+1; j < nElem; j++)
                {
                    if(nomes[i].contentEquals(nomes[j]))
                    {
                        if(!encontrados)
                        {
                            System.out.println("Os nomes repetidos são: ");
                            encontrados= true;
                        }
                        System.out.println("   -"+nomes[i]);
                        j = nElem;
                    }
               }
            }
            if(!encontrados)
                System.out.println("Não existem nomes repetidos.");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int tam = 100, op, nElem = 0;
        String[] nomes = new String[tam];
        
        do
        {
            System.out.print("\n1-Inserir um visitante\n"
                            + "2-Listar todos os visitantes\n"
                            + "3-Actualizar um nome dado\n"
                            + "4-Eliminar um visitante dado\n"
                            + "5-Listar os nomes começados por uma dada letra\n"
                            + "6-Listar nomes repetidos\n"
                            + "7-Sair\n"
                            + "Opção: ")
                    ;
            op = input.nextInt();
            
            switch (op)
            {
                case 1:
                    nElem=inserirVistante(nomes, tam, nElem);
                    break;
                case 2:
                    listarVistantes(nomes, nElem);
                    break;
                case 3:
                    actualizarVistante(nomes, nElem);
                    break;
                case 4:
                    nElem=removerVisitante(nomes, nElem);
                    break;
                case 5:
                    listarVistantesPorInicial(nomes, nElem);
                    break;
                case 6:
                    listarVistantesRepetidos(nomes, nElem);
                    break;
                case 7:
                    break;
                
                default:
                    System.out.println("Insira uma opção valida.");
            }
        } while(op != 7);
        
    }
    
}
