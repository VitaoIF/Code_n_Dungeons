package entities;

public class Ladino extends Classe {

    public Ladino() {
        super(8);
    }

    @Override
    public int calcularAtaque(Personagem p){
        return p.rolarD20() + p.calcularModificador(p.getDestreza());
    }
}
