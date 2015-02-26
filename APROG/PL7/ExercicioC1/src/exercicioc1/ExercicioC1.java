/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioc1;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class ExercicioC1 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner input = new Scanner(System.in);
    
    public static boolean existeElemento(String Elemento, String[][] m1, int op, int nElem)
    {
        for(int i = 0; i < (nElem); i++)
        {
            if(Elemento.contentEquals(m1[i][op]))
                return true;
        }
        return false;
    }
    
    public static int encontrarElemento(String Elemento, String[][] m1, int op, int nElem)
    {
        for(int i = 0; i < (nElem); i++)
        {
            if(Elemento.contentEquals(m1[i][op]))
                return i;
        }
        return -1;
    }
    
    public static int inserirProdutos(String[][] m1, int nElem)
    {
        if(nElem >= m1.length)
            System.out.println("Já atingiu o numero maximo de produtos.");
        else
        {
            String codProduto, prateleira;
            do
            {
                System.out.print("Insira o codigo do produto: ");
                codProduto = input.next();
            } while(existeElemento(codProduto, m1, 0, nElem));
            
            m1[nElem][0] = codProduto;
            
            do
            {
                System.out.print("Insira a prateleira do produto: ");
                prateleira = input.next();
            } while(existeElemento(prateleira, m1, 1, nElem));
            
            m1[nElem][1] = prateleira;
            
            return (++nElem);
        }
        return (nElem);
    }
    public static void modificarPrateleira(String[][] m1, int nElem)
    {
        System.out.print("\nModificar através de:\n1)Codigo de Produto"
                + "\n2)Prateleira de Produto\nOpção: ");
        int op = input.nextInt();
        while(op != 1 && op != 2)
        {
            System.out.print("[Opçao Invalida] Opção: ");
            op = input.nextInt();
        }
        
        if(op == 1)
        {
            System.out.print("Insira o Codigo de produto: ");
            String codProd = input.next();
            
            while(!existeElemento(codProd, m1, 0,nElem))
            {
                System.out.print("[Codigo Inexistente] Insira o Codigo novamente:");
                codProd = input.next();
            }
            
            int pos =  encontrarElemento(codProd, m1, 0,nElem);
            
            System.out.print("Insira a nova prateleira do produto: ");
            String prateleira = input.next();
            
            while(existeElemento(prateleira, m1, 1,nElem))
            {
                System.out.print("[Prateleira Ocupada] Insira a prateleira novamente:");
                prateleira = input.next();
            }
            m1[pos][1] = prateleira;
        }
        else
        {
            System.out.print("Insira a prateleira de produto: ");
            String prateleira = input.next();
            
            while(!existeElemento(prateleira, m1, 1,nElem))
            {
                System.out.print("[Prateleira Inexistente] Insira a prateleira novamente:");
                prateleira = input.next();
            }
            
            int pos =  encontrarElemento(prateleira, m1, 1,nElem);
            
            System.out.print("Insira a nova prateleira do produto: ");
            String nPrateleira = input.next();
            
            while(existeElemento(nPrateleira, m1, 1, nElem))
            {
                System.out.print("[Prateleira Ocupada] Insira a prateleira novamente:");
                nPrateleira = input.next();
            }
            m1[pos][1] = nPrateleira;
        }
    }
    
    public static void mostrarMatriz(String[][] m, int nElem) {
        for (int i = 0; i < nElem; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int removerProdutos(String[][] m1, int nElem)
    {
        System.out.print("\nRemover através de:\n1)Codigo de Produto"
                + "\n2)Prateleira de Produto\nOpção: ");
        int op = input.nextInt();
        while(op != 1 && op != 2)
        {
            System.out.print("[Opçao Invalida] Opção: ");
            op = input.nextInt();
        }
        
        if(op == 1)
        {
            System.out.print("Insira o Codigo de produto: ");
            String codProd = input.next();
            
            while(!existeElemento(codProd, m1, 0,nElem))
            {
                System.out.print("[Codigo Inexistente] Insira o Codigo novamente:");
                codProd = input.next();
            }
            
            int pos =  encontrarElemento(codProd, m1, 0,nElem);
            
            m1[pos][0] = null;
            m1[pos][1] = null;
             nElem--;
             ordenarMatriz(m1, nElem, pos);
           
            
        }
        else
        {
            System.out.print("Insira a prateleira de produto: ");
            String prateleira = input.next();
            
            while(!existeElemento(prateleira, m1, 1,nElem))
            {
                System.out.print("[Prateleira Inexistente] Insira a prateleira novamente:");
                prateleira = input.next();
            }
            
            int pos =  encontrarElemento(prateleira, m1, 1,nElem);
            
            m1[pos][0] = null;
            m1[pos][1] = null;
            nElem--;
            ordenarMatriz(m1, nElem, pos);
        }
        return nElem;
    }
    
    public static void ordenarMatriz(String[][] m1, int nElem, int pos)
    {
        String[][] aux = new String[1][1];
        for(int i = pos; i < nElem; i++)
        {
            aux[0] = m1[i];
            m1[i] = m1[i+1];
            m1[i+1] = aux[0];
        }
    }
    
    
    public static void ordenarMatrizPrateleiras(String[][] m1, int nElem)
    {
        String[][] aux = new String[1][1];
        for(int i = 0; i < nElem; i++)
        {
            for(int j = i+1; j < nElem; j++)
            {
                if(m1[i][1].compareToIgnoreCase(m1[j][1]) > 0)
                {        
                    aux[0] = m1[j];
                    m1[j] = m1[i];
                    m1[i] = aux[0];
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        String[][] produtos;
        int tam, nProdutos = 0;
        
        System.out.print("Insira o numero maximo de produtos a inserir: ");
        tam=input.nextInt();
        
        produtos = new String[tam][2];
        
        String m = "\n\n1-Inserir Produto\n2-Modificar Prateleira"
                + "\n3-Remover Produto\n4-Listar por Prateleira\n5-Terminar\n\nEscolha uma opção: ";
        char op;
        do {
            System.out.print(m);
            op = input.next().charAt(0);
            switch (op) {
                case '1':
                    nProdutos = inserirProdutos(produtos, nProdutos);
                    break;
                case '2':
                    modificarPrateleira(produtos, nProdutos);
                    break;
                case '3':
                    nProdutos=removerProdutos(produtos, nProdutos);
                    break;
                case '4':
                     ordenarMatrizPrateleiras(produtos, nProdutos);
                     System.out.println("Codigo Produto - Prateleira");
                     mostrarMatriz(produtos, nProdutos);
                break;
                case '5':
                    break; 
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '5');
    }
    
}
