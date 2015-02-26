/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author i140870
 */
public class Pessoa
{
    private String nome;
    private int idade;
    
    public Pessoa(){}
    public Pessoa(String nome)
    {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    @Override
    public String toString()
    {
       return nome+" tem "+idade+" anos."; 
    }
}
