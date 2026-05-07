import entities.Player;
import utils.Dados;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] total = Dados.pontosDeHabilidades();

        System.out.println(Arrays.toString(total));
    }
}
