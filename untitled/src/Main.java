import entities.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome do seu personagem: ");
        String nomePersonagem = sc.nextLine();

        System.out.print("Qual a classe do seu personagem: ");
        String classe = sc.nextLine();

        System.out.print("Qual a raça do seu personagem: ");
        String raca = sc.nextLine();

        System.out.print("Qual o seu nome jogador: ");
        String nomeJogador = sc.nextLine();

        System.out.print("Qual o nivel do seu personagem: ");
        int nivel = sc.nextInt();

        Player player1 = new Player(nomePersonagem, classe, nivel, raca, nomeJogador);

        System.out.println(player1.toString());
    }
}