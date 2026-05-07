package entities;

public class Guerreiro extends Classe {

    public Guerreiro() {
        super(10);
    }

    @Override
    public int calcularAtaque(Personagem p){
        return p.rolarD20() + p.calcularModificador(p.getForca());
    }
}