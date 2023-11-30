package jogo.mapas;

import jogo.personagens.Monstro;

import java.util.ArrayList;
import java.util.Random;

public class Masmorra {

   public int quantidadeDeSalas;
   private int quantidadeDeArmadilhas;
   public ArrayList<Monstro> monstros = new ArrayList<>();


   public void abrirPorta(){
     System.out.println("A porta abriu");
     Monstro monstro = revelarMonstros();
     if(monstro == null){
       System.out.println("Você está salvo");
     }else {
       System.out.println("Inicie a luta");
     }
   }

   private Monstro revelarMonstros(){
     Random random = new Random();
     int numeroSorteado = random.nextInt(2);
     if(numeroSorteado == 0){
       return null;
     }
      return new Monstro(2,10);
   }

    public Masmorra(int quantidadeDeSalas, ArrayList<Monstro> monstros){
        this.monstros = monstros;
        this.quantidadeDeSalas = quantidadeDeSalas;

        Random random = new Random();

        this.quantidadeDeArmadilhas = random.nextInt(10);


    }

}
