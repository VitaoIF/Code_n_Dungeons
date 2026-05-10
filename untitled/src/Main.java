import entities.*;
import utils.Dados;
import utils.Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        Personagem inimigo = new Inimigo();
        Menu.criacaoPersonagem(player);

        //Definindo nome
        ArrayList<String> nomes = new ArrayList<>(List.of("Dragon born", "Liu Kang", "Catarina Killer", "Pikachu", "BiruLeibe"));

        Random random = new Random();
        int nomeEscolhido = random.nextInt(0, nomes.size());
        inimigo.setNomePersonagem(nomes.get(nomeEscolhido));

        System.out.println("Nome: " + inimigo.getNomePersonagem());


        //Definindo Nivel
        player.setNivel(1);
        inimigo.setNivel(player.getNivel());
        System.out.println("Nível: " + inimigo.getNivel());

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

        System.out.println(inimigo.getClasse());

        //Definindo habilidades
        //Vamos tentar fazer aleatorio com a lista de habilidades que já existe
        int[] total = Dados.pontosDeHabilidades();

        inimigo.setForca(total[0]);
        inimigo.setDestreza(total[1]);
        inimigo.setConstituicao(total[2]);
        inimigo.setInteligencia(total[3]);
        inimigo.setSabedoria(total[4]);
        inimigo.setCarisma(total[5]);

        System.out.println("Força: " + inimigo.getForca());
        System.out.println("Destreza: " + inimigo.getDestreza());
        System.out.println("Constituição: " + inimigo.getConstituicao());
        System.out.println("Inteligência: " + inimigo.getInteligencia());
        System.out.println("Sabedoria: " + inimigo.getSabedoria());
        System.out.println("Carisma: " + inimigo.getCarisma());
    }

}
