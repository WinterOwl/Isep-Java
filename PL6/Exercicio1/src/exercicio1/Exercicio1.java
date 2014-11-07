/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author i140870 a) A funcionalidade deste algoritmo é calcular a media dos
 * numeros pares introduzidos com uma sequencia de 10 numeros
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, s = 0, c = 0, minimo = 0;
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);
        for (i = 0; i < v.length; i++) {
            v[i] = ler.nextInt();
        }
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
            }
        }
        if (c != 0) {
            System.out.println(((double) s) / c);
        } else {
            System.out.println("Operação impossível de realizar");
        }
        minimo = escrevemenornumero(v);
        System.out.println(minimo);
    }

    public static int escrevemenornumero(int[] numero) {
        int minimo = numero[0];
        for (int i = 0; i < numero.length; i++) {
            if (minimo > numero[i]) {
                minimo = numero[i];
            }
        }
        return minimo;
    }

    public void mostraindices(int[] numero, int minimo) {
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == minimo) {
                System.out.println("Indice--" + i);
            }

        }
    }

}
