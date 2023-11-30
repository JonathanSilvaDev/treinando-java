package jogo.personagens;

public class Monstro {

   private int forca;
   private int pontosDeVida;


    public Monstro(int forca, int pontosDeVida){
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;

    }


    public int getForca(){
        return this.forca;
    }
    public void setForca(int forca){
        this.forca = forca;
    }
    public int getPontosDeVida(){
        return this.pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }


}
