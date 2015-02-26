/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3;

import java.util.Scanner;

/**
 *
 * @author i140870
 * 
 * a) Elimina a primeira ocorrencia de um nome no vector caso este seja igual ao nome nome inserido pelo utilizador 
 * 
 */
public class Exercicio3 {

    static Scanner ler = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        String nomes[] = new String[100];
        String m = "1-Ler Nomes\n2-Enigma Nome\n3-Listar\n4-Terminar\n\nEscolha uma opção: ";
        char op;
        do {
            System.out.println(m);
            op = ler.next().charAt(0);
            switch (op) {
                case '1':
                    n = lerNomes(nomes);
                    break;
                case '2':
                    if(n <= 0)
                        System.out.println("[Erro] Deverá inserir Nomes primeiro!");
                    else
                    {
                        System.out.print("Nome: ");
                        String nome = ler.nextLine();
                        n = enigma(nomes, nome, n);
                    }
                    break;
                case '3':
                    if(n <= 0)
                        System.out.println("Não exitem nomes para listar.");
                    else
                        listar(nomes, n);
                    break;
                case '4':
                break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != '4');
    }

    private static int lerNomes(String[] vec) {
        String nome;
        int i = 0;
        
        ler.nextLine();
        System.out.print("Nome: ");
        nome = ler.nextLine();
        
        while(!nome.contentEquals("FIM") && i < vec.length)
        {
            vec[i] = nome;
            i++;
            
            System.out.print("Nome: ");
            nome = ler.nextLine();
        }
        
        return i;
        // Lê uma sequência de nomes terminada com a palavra FIM. 
        // Armazena os nomes em vec e retorna o número desses nomes. 
    }

    private static void listar(String[] vec, int n) {
        for(int i = 0; i < n; i++)
            System.out.println(vec[i]);
        // Apresenta os primeiros n elementos de vec 
    }

    private static int enigma(String[] nomes, String nome, int n) {
        int i = 0;
        while (i < n && !nomes[i].equalsIgnoreCase(nome)) {
            i++;
        }
        if (i == n) {
            return n;
        } else {
            for (int j = i; j < n - 1; j++) {
                nomes[j] = nomes[j + 1];
            }
            return --n;
        }

    }
    
}
