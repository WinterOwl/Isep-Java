/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author ruimoreira
 */
public class Exercicio2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int nDias, temp, max;
        String sNDias, sTemp;
        
        sNDias = JOptionPane.showInputDialog("Insira o numero de dias: ");
        nDias = Integer.parseInt(sNDias);
        
        sTemp = JOptionPane.showInputDialog("Insira a temperatura do dia 1: ");
        temp = Integer.parseInt(sTemp);
        max = temp;
        
        for(int i = 2; i <= nDias; i++)
        {
            sTemp = JOptionPane.showInputDialog("Insira a temperatura do dia " + i + ": ");
            temp = Integer.parseInt(sTemp);
            
            if(temp > max)
                max = temp;
        }
        
        if(max >= -30 && max < 9)
            JOptionPane.showMessageDialog(null, "Muito Frio");
        else if(max >= 9 && max < 15)
            JOptionPane.showMessageDialog(null, "Frio");
        else if(max >= 15 && max < 20)
            JOptionPane.showMessageDialog(null, "Ameno");
        else if(max >= 20 && max < 30)
            JOptionPane.showMessageDialog(null, "Quente");
        else
            JOptionPane.showMessageDialog(null, "Temperatura Extrema");
    }
    
}
