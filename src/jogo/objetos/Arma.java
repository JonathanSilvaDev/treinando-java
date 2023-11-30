package jogo.objetos;

public class Arma {

   public String tipo;
   public int bonusDano;
   public boolean ehLongoAlcance;



    public Arma(String tipo, int bonusDano, boolean ehLongoAlcance){
        this.tipo = tipo;
        this.bonusDano = bonusDano;
        this.ehLongoAlcance = ehLongoAlcance;
    }
}
