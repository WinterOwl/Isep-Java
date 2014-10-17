/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author i140870
 */
public class Exercicio7
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        int a,b,aux,num,c,d,e;
        String auxA,auxB, auxD;
        
        auxA=JOptionPane.showInputDialog("Valor a: ");
        a=Integer.parseInt(auxA);
        auxB=JOptionPane.showInputDialog("Valor b: ");
        b=Integer.parseInt(auxB);
        
        if(a > b)
        {
            aux=a;
            a=b;
            b=aux;
        }
        e=0;
        
        auxD=JOptionPane.showInputDialog("Valor d:");
        d=Integer.parseInt(auxD);
        
        for(c=1;c<=d;c++)
        {
            do
            {
              auxD=JOptionPane.showInputDialog("Valor numero:");
              num=Integer.parseInt(auxD);   
            } while(num<0);
            
            if((num % a) == 0 && (b % num) == 0)
                e++;
        
        }
        JOptionPane.showMessageDialog(null,"..."+e);

    }
    
}
