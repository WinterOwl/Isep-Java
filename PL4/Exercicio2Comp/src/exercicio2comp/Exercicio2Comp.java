/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio2comp;

import java.util.Scanner;

/**
 *
 * @author i140870
 */
public class Exercicio2Comp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n)
    {
        for(int a=0, b=1, i=0; i<n; b+=a, a=b-a, i++)
            System.out.println(a + " ");         
    }
    
}
