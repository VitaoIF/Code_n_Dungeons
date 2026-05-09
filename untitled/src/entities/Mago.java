package entities;

public class Mago extends Classe{

    public Mago() {
        super(8);
    }

    @Override
    public int calcularAtaque(Personagem p) {
        return 0;
    }

    @Override
    public int rolarVida() {
        return super.rolarVida();
    }

    @Override
    public String toString(){
        return "Mago";
    }
}
