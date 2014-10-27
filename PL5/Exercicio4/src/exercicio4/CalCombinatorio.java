/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author i140870
 */
public class CalCombinatorio {

    /**
     * Calcular o factorial de um número
     *     
     * @param num número inteiro não negativo
     * @return o valor do factorial do num
    */
    private static long factorial(long num) {
        long fact = 1;
        for (long i = num; i > 1; i = i - 1) 
            fact = fact * i;
        
        return fact;
    }

    /**
     * Calcula o combinações de n p a p
     *     
     * @param n número inteiro não negativo
     * @param p número inteiro não negativo
     * @return o valor combinações de n p a p ou -1 caso n<p
    */
    public static long combinacoes(long n, long p) {
        if (n < p) 
            return -1;
        
        return factorial(n) / (factorial(p) * factorial(n - p));
    }
    
    public static int arranjo(int n, int p) {
        if (n < 1) 
            return -1;
        
        return (int) (factorial((long)n) / (factorial((long)n - (long)p)));
    }
    
}
