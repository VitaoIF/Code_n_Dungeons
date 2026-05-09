package entities;

public class Elfo extends Raca{

    @Override
    public void bonusEmHabilidades(Personagem p) {
        p.setDestreza(p.getDestreza() + 2);
    }
}
