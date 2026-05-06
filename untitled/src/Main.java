import entities.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player1 = new Player("Dorn", "Monge", 1, "Humano", "Victor", 12, 16, 13, 10, 15, 10);
        player1.modificadorForca(player1.getForca());
        player1.modificadorInteligencia(player1.getInteligencia());
        player1.modificadorDestreza(player1.getDestreza());
        player1.modificadorConstituicao(player1.getConstituicao());
        player1.modificadorSabedoria(player1.getSabedoria());
        player1.modificadorCarisma(player1.getCarisma());

        System.out.println(player1.getModificadorForca());
        System.out.println(player1.getModificadorDestreza());
        System.out.println(player1.getModificadorConstituicao());
        System.out.println(player1.getModificadorInteligencia());
        System.out.println(player1.getModificadorSabedoria());
        System.out.println(player1.getModificadorCarisma());

    }
}