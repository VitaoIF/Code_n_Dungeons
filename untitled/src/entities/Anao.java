package entities;

public class Anao extends Raca{
    @Override
    public void bonusEmHabilidades(Personagem p) {
        p.setConstituicao(p.getConstituicao() + 2);
    }
}
