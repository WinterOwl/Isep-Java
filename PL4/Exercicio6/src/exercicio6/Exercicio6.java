/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author ruimoreira
 */
public class Exercicio6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
      int num=1,contadorPares1=0,contadorPares2=0;
      String sNum;
       
      do
      { 
        if((num % 2) == 0)
            contadorPares1++;
      
        sNum=JOptionPane.showInputDialog("Insira numero para a sequencia 1: ");
        num=Integer.parseInt(sNum);
        
      } while(num != 0);
      
      do
      {
        sNum=JOptionPane.showInputDialog("Insira numero para a sequencia 2: ");
        num=Integer.parseInt(sNum);
        
        if((num % 2) == 0)
              contadorPares2++;
        
      } while(num != -1);
      
      if(contadorPares1 == contadorPares2)
          JOptionPane.showMessageDialog(null,"Ambas as sequencias têm " + contadorPares1 + " numeros pares.");
      else if(contadorPares1 > contadorPares2)
          JOptionPane.showMessageDialog(null,"A sequencia 1 tem mas pares do que a segunda sequencia.");
      else
        JOptionPane.showMessageDialog(null,"A sequencia 2 tem mas pares do que a primeira sequencia.");   
      
    }
    
}
