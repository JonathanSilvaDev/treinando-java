package jogo.personagens;

import jogo.objetos.Arma;

import java.util.ArrayList;

public class Heroi {
    private int quantidadeHabilidades;
    private ArrayList<Arma> armas;
    private int pontosDeVida;
    private int forca;
    String categoria;

    //construtor 1
    public Heroi(String categoria, int pontosDeVida, int forca, int quantidadeHabilidades){
        this.categoria = categoria;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
        this.quantidadeHabilidades = quantidadeHabilidades;
    }

    //construtor 2
    public Heroi(String categoria, int pontosDeVida){
        this.categoria = categoria;
        this.pontosDeVida = pontosDeVida;
    }

    //definindo getter
    public String getCategoria(){
        return "A categoria deste herói é: " + this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getForca(){
        return this.forca;
    }

    public void setForca(int forca){
       if (forca <= 0){
           this.forca = 1;
       }else{
           this.forca = forca;
       }
    }

}
