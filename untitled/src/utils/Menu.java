package utils;

import entities.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Menu {

    Personagem player = new Player();

    public Menu(Personagem player) {
        this.player = player;
    }

    public static void criacaoPersonagem(Player player) {

         player.setNomePersonagem(JOptionPane.showInputDialog(
                "=- Bem-Vindo a Criação de Personagem -=\n " +
                        "Nome do personagem:"
        ));

        int escolhaClasse = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe sua classe: \n" +
                        "[ 1 ] Guerreiro\n" +
                        "[ 2 ] Ladino\n" +
                        "[ 3 ] Mago\n"
        ));

        Classe classeEscolhida = Menu.verificarClasse(escolhaClasse);
        player.setClasse(classeEscolhida);


        player.setNivel(1);
        int[] total = Dados.pontosDeHabilidades();
        distribuirPontos(total, player);


        JOptionPane.showMessageDialog(null,
                "-= Cabeçalho do Personagem =-" +
                        "\nNome: " + player.getNomePersonagem() +
                        "\nClasse: " + player.getClasse() +
                        "\nNível: " + player.getNivel() +
                        "\n-= Habilidades do Personagem =-" +
                        "\nForça: " + player.getForca() +
                        "\nDestreza: " + player.getDestreza() +
                        "\nConstituição: " + player.getConstituicao() +
                        "\nInteligência: " + player.getInteligencia() +
                        "\nSabedoria: " + player.getSabedoria() +
                        "\nCarisma: " + player.getSabedoria()
        );

        criacaoDeInimigo();
    }

    public static void criacaoDeInimigo(){
        Personagem inimigo = new Inimigo();
        ArrayList<String> nomes = new ArrayList<>(List.of("Dragon born", "Liu Kang", "Catarina Killer", "Pikachu", "BiruLeibe"));

        Random random = new Random();
        int nomeEscolhido = random.nextInt(0, nomes.size());
        inimigo.setNomePersonagem(nomes.get(nomeEscolhido));
        inimigo.setNivel(1);

        //Definindo classe
        int classeEscolhida = random.nextInt(1, 4);
        System.out.println(classeEscolhida);
        if (classeEscolhida == 1) {
            inimigo.setClasse(new Guerreiro());
        } else if (classeEscolhida == 2){
            inimigo.setClasse(new Ladino());
        } else if (classeEscolhida == 3){
            inimigo.setClasse(new Mago());
        }

        //Definindo Habilidades
        int[] total = Dados.pontosDeHabilidades();

        inimigo.setForca(total[0]);
        inimigo.setDestreza(total[1]);
        inimigo.setConstituicao(total[2]);
        inimigo.setInteligencia(total[3]);
        inimigo.setSabedoria(total[4]);
        inimigo.setCarisma(total[5]);

        //Apresentação do vilão
        JOptionPane.showMessageDialog(null, "-= Cabeçalho do Vilão =-" +
                "\nNome: " + inimigo.getNomePersonagem() +
                "\nClasse: " + inimigo.getClasse() +
                "\nNível: " + inimigo.getNivel() +
                "\n-= Habilidades do Vilão =-" +
                "\nForça: " + inimigo.getForca() +
                "\nDestreza: " + inimigo.getDestreza() +
                "\nConstituição: " + inimigo.getConstituicao() +
                "\nInteligência: " + inimigo.getInteligencia() +
                "\nSabedoria: " + inimigo.getSabedoria() +
                "\nCarisma: " +  inimigo.getCarisma());
    }

    public static Classe verificarClasse(int escolhaClasse) {

        if (escolhaClasse == 1) {
            return new Guerreiro();
        } else if (escolhaClasse == 2) {
            return new Ladino();
        } else if (escolhaClasse == 3) {
            return new Mago();
        }

        return null;
    }

    public static void distribuirPontos(int[] total, Player player){
        for (int j: total) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Pontos disponiveis: "+ Arrays.toString(total) +
                    "\nEscolha onde despejar os pontos \n" +
                    "[ 1 ] Força: " + player.getForca() +
                    "\n[ 2 ] Destreza: " + player.getDestreza() +
                    "\n[ 3 ] Constituição: " + player.getConstituicao() +
                    "\n[ 4 ] Inteligência: " + player.getInteligencia() +
                    "\n[ 5 ] Sabedoria: " + player.getSabedoria() +
                    "\n[ 6 ] Carisma: " + player.getCarisma() +
                    "\nOnde colocar o valor " + j + ": "));

            switch (opcao) {
                case 1:
                    player.setForca(j);
                    break;
                case 2:
                    player.setDestreza(j);
                    break;
                case 3:
                    player.setConstituicao(j);
                    break;
                case 4:
                    player.setInteligencia(j);
                    break;
                case 5:
                    player.setSabedoria(j);
                    break;
                case 6:
                    player.setCarisma(j);
                    break;
            }
        }
    }
}
