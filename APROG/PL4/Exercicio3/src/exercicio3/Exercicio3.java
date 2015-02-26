/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author ruimoreira
 */
public class Exercicio3
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int idade, contador = 0, soma = 0, percentagem;
        String nome, sIdade;
        
        
        nome = JOptionPane.showInputDialog("Insira o nome: ");
        
            
        while(nome.equals("zzz") == false)
        {
            do
            {
                
                sIdade = JOptionPane.showInputDialog("Insira a idade: ");
                idade = Integer.parseInt(sIdade);   
                
            } while(idade <= 0 || idade > 150);
                    
            contador++;

            if(idade >= 18)
                soma ++;

            JOptionPane.showMessageDialog(null, nome);

            nome = JOptionPane.showInputDialog("Insira o nome: ");
        }
        
        if(contador > 0)
        {
            percentagem = (int)(((float)soma/(float)contador) * (int)100);
            JOptionPane.showMessageDialog(null, percentagem + "%");
        }
        else
            JOptionPane.showMessageDialog(null, "Não foram inseridos valores validos");
    }
    
}
