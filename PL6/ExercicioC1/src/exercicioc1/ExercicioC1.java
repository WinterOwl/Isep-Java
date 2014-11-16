/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioc1;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class ExercicioC1 {

    static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vec1, vec2;
        int nNumeros;
        System.out.println("Quantos numeros irá conter cada vetor:");
        nNumeros = in.nextInt();
        vec1 = new int[nNumeros];
        vec2 = new int[nNumeros];
        lenumerosvetor(vec1, vec2);
        pontodeIntersecao(vec1, vec2);
    }

    public static void lenumerosvetor(int[] vec, int[] vec2) {
        int numero = 0, valor, vetorlegnth = vec.length + vec.length;

        for (int i = 0; i < vec.length; i++) {

            System.out.println("Vetor 1:");
            numero = in.nextInt();

            while (PVetor(vec, numero) != -1) {
                System.out.println("Numero já existe no vetor insira um novo numero:");
                numero = in.nextInt();
            }
            vec[i] = numero;
        }
        for (int i = 0; i < vec.length; i++) {

            System.out.println("Vetor 2:");
            numero = in.nextInt();

            while (PVetor(vec2, numero) != -1) {
                System.out.println("Numero já existe no vetor2 insira um novo numero:");
                numero = in.nextInt();
            }
            vec2[i] = numero;
        }

    }

    public static int PVetor(int[] vec1, int numero) {
        int posicao = -1;
        for (int i = 0; i < vec1.length; i++) {
            if (vec1[i] == numero) {
                posicao = i;
            }

        }
        return posicao;
    }

    public static void pontodeIntersecao(int[] vec1, int[] vec2) {
        System.out.print("Pontos de Interseção {");
        for (int i = 0; i < vec1.length; i++) {
            if (PVetor(vec2, vec1[i]) != -1) {
                System.out.print(" " + vec1[i] + " ");
            }
        }
        System.out.println("}");
    }

}
