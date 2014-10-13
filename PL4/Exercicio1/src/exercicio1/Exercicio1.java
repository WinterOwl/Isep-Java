/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author i140870
 */
public class Exercicio1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
     int max, soma=0, contador=0, i, num;
     double media;
     String sMax, sNum;
     
     sMax = JOptionPane.showInputDialog("Insira a quantidade de numeros a introduzir: ");
     
     max = Integer.parseInt(sMax);
     
     for(i=1; i<= max; i++)
     {
         sNum= JOptionPane.showInputDialog("Insira a numero: ");
         
         num = Integer.parseInt(sNum);
         
         if(num % 2 == 0)
         {
            contador++;
            soma += num;
         }
     }
     
     if(contador != 0)
     {
         media = soma/contador;
         JOptionPane.showMessageDialog(null, "Media: " + media);
     }
     else
         JOptionPane.showMessageDialog(null, "Não Existe");
     
    }
    
}
