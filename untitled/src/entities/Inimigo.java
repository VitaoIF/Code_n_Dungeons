package entities;

import java.util.Random;

public class Inimigo extends Personagem{

    public Inimigo() {
    }

    public Inimigo(Integer carisma, Classe classe, Integer constituicao, Integer destreza, Integer forca, Integer inteligencia, Integer nivel, String nomePersonagem, Integer sabedoria) {
        super(carisma, classe, constituicao, destreza, forca, inteligencia, nivel, nomePersonagem, sabedoria);
    }

    @Override
    public int atacar() {
        return new Random().nextInt(20) + 1 + calcularModificador(getForca());
    }

}
