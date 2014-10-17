/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author ruimoreira
 */
public class Exercicio5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int numero,d,aux=1,res=0;
        String sNum;
        
        sNum=JOptionPane.showInputDialog("Numero: ");
        numero=Integer.parseInt(sNum);
        
        while(numero != 0)
        {
            d = numero % 10;
            
            if((d % 2)==1)
            {
                res += d * aux;
                aux *= 10;
            }
            
            numero /= 10;
        }
        JOptionPane.showMessageDialog(null,"O resultado é: " + res);
    }
    
}
