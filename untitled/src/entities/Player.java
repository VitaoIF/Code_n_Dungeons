package entities;

public class Player extends Personagem{

    private String nomeJogador;

    public Player() {
    }

    public Player(Integer carisma, String classe, Integer constituicao, Integer destreza, Integer forca, Integer inteligencia, Integer nivel, String nomePersonagem, String raca, Integer sabedoria, String nomeJogador) {
        super(carisma, classe, constituicao, destreza, forca, inteligencia, nivel, nomePersonagem, raca, sabedoria);
        this.nomeJogador = nomeJogador;
    }

    @Override
    public String toString(){
        return "\n-= INFORMAÇÕES DO CABEÇALHO =- \n"
                + "Nome Personagem: " + getNomePersonagem() + "\n"
                + "Classe: " + getClasse() + "\n"
                + "Nivel: " + getNivel() + "\n"
                + "Raça: " + getRaca() + "\n"
                + "Nome Jogador: " + this.nomeJogador + "\n"
                +"\n-= INFORMAÇÕES DOS ATRIBUTOS =- \n"
                + "Força: "+ getForca() + "\n"
                + "Destreza: " + getDestreza() + "\n"
                + "Constituição: " + getConstituicao() + "\n"
                + "Inteligência: " + getInteligencia() + "\n"
                + "Sabedoria: " + getSabedoria() + "\n"
                + "Carisma: " + getCarisma();
    }
}
