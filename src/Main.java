import jogo.mapas.Masmorra;
import jogo.personagens.Heroi;
import jogo.personagens.Monstro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Masmorra temploDaAgua = new Masmorra(20, new ArrayList<Monstro>());

        Heroi link = new Heroi("Ladino", 20, 89, 5);
        Heroi elfo2 = new Heroi("mago", 75, 55, 5);
        Heroi elfo3= new Heroi("guerreiro", 60, 47, 5);

        link.setCategoria("Super elfo");
        elfo2.setForca(-100);
        System.out.println(elfo2.getForca());

        System.out.println(link.getCategoria());
        System.out.println(elfo2.getCategoria());
        System.out.println(elfo3.getCategoria());










    }
}

