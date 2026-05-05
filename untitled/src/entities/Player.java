package entities;

public class Player extends Personagem{

    private String nomeJogador;


    public Player() {
    }


    @Override
    public String toString(){
        return "\n-= INFORMAÇÕES DO CABEÇALHO =- \n"
                + "Nome Personagem: " + this.nomePersonagem + "\n"
                + "Classe: " + this.classe + "\n"
                + "Nivel: " + this.nivel + "\n"
                + "Raça: " + this.raca + "\n"
                + "Nome Jogador: " + this.nomeJogador + "\n"
                +"\n-= INFORMAÇÕES DOS ATRIBUTOS =- \n"
                + "Força: "+ this.forca + "\n"
                + "Destreza: " + this.destreza + "\n"
                + "Constituição: " + this.constituicao + "\n"
                + "Inteligência: " + this.inteligencia + "\n"
                + "Sabedoria: " + this.sabedoria + "\n"
                + "Carisma: " + this.carisma;
    }
}
