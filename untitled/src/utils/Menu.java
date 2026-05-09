package utils;

import entities.*;

import javax.swing.JOptionPane;
import java.util.Arrays;


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

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe sua classe: \n" +
                        "[ 1 ] Guerreiro\n" +
                        "[ 2 ] Ladino\n" +
                        "[ 3 ] Mago\n"
        ));

        Classe classeEscolhida = Menu.verificarClasse(opcao);
        player.setClasse(classeEscolhida);

        player.setNivel(Integer.parseInt(JOptionPane.showInputDialog("Informe o seu nível: ")));
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
    }

    public static Classe verificarClasse(int opcao) {

        if (opcao == 1) {
            return new Guerreiro();
        } else if (opcao == 2) {
            return new Ladino();
        } else if (opcao == 3) {
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
