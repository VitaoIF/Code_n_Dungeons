import entities.Player;
import utils.Dados;
import utils.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        Menu.criacaoPersonagem(player);

        int[] total = Dados.pontosDeHabilidades();

        System.out.print("Pontos disponiveis: ");
        for (int atributos: total){
            System.out.print(atributos + ", ");
        }
        System.out.println();

        System.out.println("Escolha onde despejar os pontos ");
        System.out.println("""
                [ 1 ] Força\s
                [ 2 ] Destreza\s
                [ 3 ] Constituição\s
                [ 4 ] Inteligência\s
                [ 5 ] Sabedoria\s
                [ 6 ] Carisma""");
        for (int j : total) {
            System.out.print("Onde colocar o valor " + j + ": ");
            int opcao = sc.nextInt();

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

        System.out.println("Força: " + player.getForca());
        System.out.println("Destreza: " + player.getDestreza());
        System.out.println("Constituição: " + player.getConstituicao());
        System.out.println("Inteligência: " + player.getInteligencia());
        System.out.println("Sabedoria: " + player.getSabedoria());
        System.out.println("Carisma: " + player.getCarisma());

    }
}
