package jogo.mapas;

import jogo.personagens.Monstro;

import java.util.ArrayList;
import java.util.Random;

public class Masmorra {

   public int quantidadeDeSalas;
   private int quantidadeDeArmadilhas;
    public ArrayList<Monstro> monstros = new ArrayList<>();



    public Masmorra(int quantidadeDeSalas, ArrayList<Monstro> monstros){
        this.monstros = monstros;
        this.quantidadeDeSalas = quantidadeDeSalas;

        Random random = new Random();

        this.quantidadeDeArmadilhas = random.nextInt(10);


    }

}
