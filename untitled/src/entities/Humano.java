package entities;

public class Humano extends Raca{

    @Override
    public void bonusEmHabilidades(Personagem p) {
        p.setForca(p.getForca() + 1);
        p.setDestreza(p.getDestreza() + 1);
        p.setConstituicao(p.getConstituicao() + 1);
        p.setSabedoria(p.getSabedoria() + 1);
        p.setInteligencia(p.getInteligencia() + 1);
        p.setCarisma(p.getCarisma() + 1);
    }
}
