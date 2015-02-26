/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class Exercicio5
{
    static Scanner input = new Scanner(System.in);
    
    public static int lerNomes(String [] nomes, int tam)
    {
        int i = 0;
        String nome;
        System.out.print("Insira o nome: ");
        nome = input.nextLine();
        while(!nome.contentEquals("FIM") && i < tam)
        {
            nomes[i] = nome;
            i++;
            System.out.print("Insira o nome: ");
            nome = input.nextLine();
        }
        return i;
    }
    
    public static String apelido(String nome)
    {
        return nome.substring(nome.lastIndexOf(" ")+1);
    }
    
    public static void mostrarListagem(String[] vector, int tam)
    {
        for(int i = 0; i < tam; i++)
            if(i < tam-1)
                System.out.print(vector[i] + "->");
            else
                System.out.println(vector[i]);
    }
    
    public static int preencherVetorApelidosS(String[] v1,String[] v2, int tam)
    {
        int j=0;
        String apelido;
        for(int i = 0; i < tam; i++)
        {
            apelido = apelido(v1[i]);
            if(apelido.startsWith("S"))
            {
                v2[j] = v1[i];
                j++;
            }
        }
        return j;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int nElem = 100;
        String[] nomes = new String[nElem];
        String[] apelidos = new String[nElem];
        
        int tam = lerNomes(nomes, nElem);
    
        mostrarListagem(nomes, tam);
        
        int nApelidos = preencherVetorApelidosS(nomes, apelidos, tam);
        
        mostrarListagem(apelidos, nApelidos);
        
        System.out.println(((float)nApelidos / tam) * 100 + "%");
    }
    
}
