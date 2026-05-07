package entities;

import java.util.Random;

public abstract class Classe {
    private int dadoDeVida;

    protected Random random = new Random();

    public abstract int calcularAtaque(Personagem p);

    public int rolarVida() {
        return random.nextInt(dadoDeVida) + 1;
    }

    public Classe(int dadoDeVida) {
        this.dadoDeVida = dadoDeVida;
    }

    public int getDadoDeVida() {
        return dadoDeVida;
    }

    public void setDadoDeVida(int dadoDeVida) {
        this.dadoDeVida = dadoDeVida;
    }
}
