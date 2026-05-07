package utils;

import java.util.Arrays;
import java.util.Random;

public class Dados {
    private static final Random random = new Random();

    public static int d20() {
        return random.nextInt(20) + 1;
    }

    public static int d6() {
        return random.nextInt(6) + 1;
    }

    public static int roll(int faces) {
        return random.nextInt(faces) + 1;
    }

    public static int[] pontosDeHabilidades(){
        int[] pontos = new int[4];
        int[] total = new int[6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                pontos[j] = Dados.d6();
            }
            Arrays.sort(pontos);
            total[i] = pontos[1] + pontos[2] + pontos[3];
        }

        return total;
    }
}
