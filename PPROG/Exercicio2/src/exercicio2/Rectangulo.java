/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author i140870
 */
public class Rectangulo
{
    private int altura;
    private int largura;
    
    public Rectangulo() {}
    public Rectangulo(int altura, int largura)
    {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura)
    {
        this.altura = altura;
    }

    public int getLargura()
    {
        return largura;
    }

    public void setLargura(int largura)
    {
        this.largura = largura;
    }
    
    public int calcularArea()
    {
        return (altura*largura);
    }
    public int calcularPerimetro()
    {
        return (2*altura+2*largura);
    }
}
