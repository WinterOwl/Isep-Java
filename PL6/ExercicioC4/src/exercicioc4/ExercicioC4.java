/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioc4;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class ExercicioC4
{
    static Scanner input = new Scanner(System.in);
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int op = 0;
        do
        {
            System.out.print("\n1-Novo Jogo\n"
                            + "2-Sair\n"
                            + "Opção: ");
            op = input.nextInt();
            
            switch (op)
            {
                case 1:
                    novoJogo();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Insira uma opção valida.");
            }
        } while(op != 2);
        
    }
    
    public static void novoJogo()
    {
        int N=1, num;
        boolean ganhou = false;
        
        System.out.print("\nInsira o numero de algarismos a serem gerados: ");
        N = input.nextInt();
        
        int[] vNumRand = new int[N];
        int[] cpVNumRand = new int[N];
        int[] vNum = new int[N];
        
        for(int i = 0 ; i < N; i++)
        {
            if(i==0)
                vNumRand[i] = (int)(1+(Math.random() * 9));
            else
                vNumRand[i] = (int)(Math.random() * 10);
        }
        do
        {
            do
            {
            copiarVector(vNumRand, cpVNumRand, N);//cpVNumRand = vNumRand;
            System.out.print("Insira um numero: ");
            num = input.nextInt();
            } while(numAlgarismos(num) != N);

            passarParaArray(vNum, N, num);

            if(certos(cpVNumRand, vNum, N) == N)
                ganhou = true;
            else
            {
                System.out.println("Certos="+certos(cpVNumRand, vNum, N));
                System.out.println("Deslocados="+deslocados(cpVNumRand, vNum, N));
            }
        } while(!ganhou);
        System.out.println("Parabéns Ganhou!");
    }
    
    public static void copiarVector(int[] original, int[] copia, int N)
    {
        for(int i = 0; i < N; i++)
            copia[i] = original[i];
    }
    
    public static int deslocados(int[] v1, int[] v2, int N)
    {
        int contador = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(v1[i] == v2[j] && i != j && v1[j] != -1 && v2[j] != -1)
                    contador++;
            }
        }
        return contador;
    }
    
    public static int certos(int[] v1, int[] v2, int N)
    {
        int contador = 0;
        for(int i = 0; i < N; i++)
        {
            if(v1[i] == v2[i])
            {
                v1[i] = -1;
                v2[i] = -1;
                contador++; 
            }
        }
        return contador;
    }
    public static int numAlgarismos(int num)
    {
        int i = 0;
        while(num > 0)
        {
            num/=10;
            i++;
        }
        return i;
    }

    public static void passarParaArray(int[] vNum, int N, int num)
    {
        int i = N-1, resto;
        while(num > 0)
        {
            resto = num % 10;
            num/=10;
            vNum[i] = resto;
            i--;
        }
    }
    public static void mostrarListagem(int[] vector, int tam)
    {
        for(int i = 0; i < tam; i++)
            if(i < tam-1)
                System.out.print(vector[i] + "->");
            else
                System.out.println(vector[i]);
    }

}
