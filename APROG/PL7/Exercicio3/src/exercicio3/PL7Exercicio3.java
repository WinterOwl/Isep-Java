/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author ruimoreira
 */
public class PL7Exercicio3 {

    static Scanner in = new Scanner(System.in);

    public static int calculasomalinhas(int[][] m, int linha) {
        int soma = 0, cont = 0;
        for (int j = 0; j < m[linha].length; j++) {
            soma += m[linha][cont];

            cont++;

        }

        return soma;
    }

    public static int calculasomacolunas(int[][] m, int coluna) {
        int somacolunas = 0, cont = 0;
        for (int i = 0; i < m[0].length; i++) {
            somacolunas += m[i][coluna];
            cont++;
        }
        return somacolunas;
    }

    public static int calculadiagonal(int[][] m) {
        int soma = 0, cont = 0;
        for (int i = m.length - 1; i >= 0; i--) {
            soma += m[i][cont];
            cont++;
        }
        return soma;
    }

    public static int calculadiagonal2(int[][] m) {
        int soma = 0, cont = m[0].length - 1;
        for (int i = 0; i < m.length; i++) {
            soma += m[i][cont];
            cont--;
        }
        return soma;
    }

    public static boolean QuadradoPerfeito(int[] somas) {
        int igual = somas[0], soma = 0;
        boolean var = false;
        System.out.println("somas.legth-->"+somas.length);
        for (int i = 1; i < somas.length; i++) {
            System.out.println("somas " + somas[i] + " =" + igual);
            if (igual == somas[i]) {
                soma += 1;
            }

            if (soma == i) {
                return true;
            } else {
                return false;
            }
        }
        return var;
    }
   public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
   }
    public static void main(String[] args) {
        int[][] quadradomagico = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};

        int[] somas;
        int pos = 0;
        somas = new int[quadradomagico.length + quadradomagico[0].length + 2];
        mostrarMatriz(quadradomagico);
        for (int j = 0; j < quadradomagico.length; j++) {
            somas[j] = calculasomacolunas(quadradomagico, j);
            pos++;
        }
        for (int j = 0; j < quadradomagico[0].length; j++) {
            somas[pos] = calculasomalinhas(quadradomagico, j);
            pos++;
        }
        somas[pos] = calculadiagonal(quadradomagico);
        somas[pos + 1] = calculadiagonal2(quadradomagico);
        if (QuadradoPerfeito(somas)) {
            System.out.println("É quadrado Perfeito");
        } else {
            System.out.println("Não é Quadrado Perfeito");
        }
    }

}
