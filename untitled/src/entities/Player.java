package entities;

public class Player {

    // Cabeçalho da criação de personagens
    private String nomePersonagem;
    private String classe;
    private Integer nivel;
    private String raca;
    private String nomeJogador;

    // Atributos do personagem
    private Integer forca;
    private Integer destreza;
    private Integer constituicao;
    private Integer inteligencia;
    private Integer sabedoria;
    private Integer carisma;

    // Modificador de habilidades
    private Integer modificadorForca;
    private Integer modificadorDestreza;
    private Integer modificadorConstituicao;
    private Integer modificadorInteligencia;
    private Integer modificadorSabedoria;
    private Integer modificadorCarisma;


    public Player() {
    }

    public Player(String nomePersonagem, String classe, Integer nivel, String raca, String nomeJogador, Integer forca, Integer destreza, Integer constituicao, Integer inteligencia, Integer sabedoria, Integer carisma) {
        this.nomePersonagem = nomePersonagem;
        this.classe = classe;
        this.nivel = nivel;
        this.raca = raca;
        this.nomeJogador = nomeJogador;
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
    }

    public void modificadorForca(int forca){
        if (forca == 1){
            modificadorForca -= 5;
        } else if(forca >= 2 && forca <=3){
            modificadorForca -= 4;
        } else if(forca >= 4 && forca <= 5){
            modificadorForca -= 3;
        } else if(forca >= 6 && forca <= 7){
            modificadorForca -= 2;
        } else if(forca >= 8 && forca <= 9){
            modificadorForca -= 1;
        } else if(forca >= 10 && forca <= 11){
            modificadorForca = 0;
        } else if(forca >= 12 && forca <= 13){
            modificadorForca = 1;
        } else if(forca >= 14 && forca <= 15){
            modificadorForca = 2;
        } else if(forca >= 16 && forca <= 17){
            modificadorForca = 3;
        } else if(forca >= 18 && forca <= 19){
            modificadorForca = 4;
        } else if(forca >= 20 && forca <= 21){
            modificadorForca = 5;
        } else if(forca >= 22 && forca <= 23){
            modificadorForca = 6;
        } else if(forca >= 24 && forca <= 25){
            modificadorForca = 7;
        } else if(forca >= 26 && forca <= 27){
            modificadorForca = 8;
        } else if(forca >= 28 && forca <= 29){
            modificadorForca = 9;
        } else if(forca == 30){
            modificadorForca = 10;
        }
    }

    public void modificadorDestreza(int destreza){
        if (destreza == 1){
            modificadorDestreza -= 5;
        } else if(destreza >= 2 && destreza <=3){
            modificadorDestreza -= 4;
        } else if(destreza >= 4 && destreza <= 5){
            modificadorDestreza -= 3;
        } else if(destreza >= 6 && destreza <= 7){
            modificadorDestreza -= 2;
        } else if(destreza >= 8 && destreza <= 9){
            modificadorDestreza -= 1;
        } else if(destreza >= 10 && destreza <= 11){
            modificadorDestreza = 0;
        } else if(destreza >= 12 && destreza <= 13){
            modificadorDestreza = 1;
        } else if(destreza >= 14 && destreza <= 15){
            modificadorDestreza = 2;
        } else if(destreza >= 16 && destreza <= 17){
            modificadorDestreza = 3;
        } else if(destreza >= 18 && destreza <= 19){
            modificadorDestreza = 4;
        } else if(destreza >= 20 && destreza <= 21){
            modificadorDestreza = 5;
        } else if(destreza >= 22 && destreza <= 23){
            modificadorDestreza = 6;
        } else if(destreza >= 24 && destreza <= 25){
            modificadorDestreza = 7;
        } else if(destreza >= 26 && destreza <= 27){
            modificadorDestreza = 8;
        } else if(destreza >= 28 && destreza <= 29){
            modificadorDestreza = 9;
        } else if(destreza == 30){
            modificadorDestreza = 10;
        }
    }

    public void modificadorConstituicao(int constituicao){
        if (constituicao == 1){
            modificadorConstituicao -= 5;
        } else if(constituicao >= 2 && constituicao <=3){
            modificadorConstituicao -= 4;
        } else if(constituicao >= 4 && constituicao <= 5){
            modificadorConstituicao -= 3;
        } else if(constituicao >= 6 && constituicao <= 7){
            modificadorConstituicao -= 2;
        } else if(constituicao >= 8 && constituicao <= 9){
            modificadorConstituicao -= 1;
        } else if(constituicao >= 10 && constituicao <= 11){
            modificadorConstituicao = 0;
        } else if(constituicao >= 12 && constituicao <= 13){
            modificadorConstituicao = 1;
        } else if(constituicao >= 14 && constituicao <= 15){
            modificadorConstituicao = 2;
        } else if(constituicao >= 16 && constituicao <= 17){
            modificadorConstituicao = 3;
        } else if(constituicao >= 18 && constituicao <= 19){
            modificadorConstituicao = 4;
        } else if(constituicao >= 20 && constituicao <= 21){
            modificadorConstituicao = 5;
        } else if(constituicao >= 22 && constituicao <= 23){
            modificadorConstituicao = 6;
        } else if(constituicao >= 24 && constituicao <= 25){
            modificadorConstituicao = 7;
        } else if(constituicao >= 26 && constituicao <= 27){
            modificadorConstituicao = 8;
        } else if(constituicao >= 28 && constituicao <= 29){
            modificadorConstituicao = 9;
        } else if(constituicao == 30){
            modificadorConstituicao = 10;
        }
    }

    public void modificadorInteligencia(int inteligencia){
        if (inteligencia == 1){
            modificadorInteligencia -= 5;
        } else if(inteligencia >= 2 && inteligencia <=3){
            modificadorInteligencia -= 4;
        } else if(inteligencia >= 4 && inteligencia <= 5){
            modificadorInteligencia -= 3;
        } else if(inteligencia >= 6 && inteligencia <= 7){
            modificadorInteligencia -= 2;
        } else if(inteligencia >= 8 && inteligencia <= 9){
            modificadorInteligencia -= 1;
        } else if(inteligencia >= 10 && inteligencia <= 11){
            modificadorInteligencia = 0;
        } else if(inteligencia >= 12 && inteligencia <= 13){
            modificadorInteligencia = 1;
        } else if(inteligencia >= 14 && inteligencia <= 15){
            modificadorInteligencia = 2;
        } else if(inteligencia >= 16 && inteligencia <= 17){
            modificadorInteligencia = 3;
        } else if(inteligencia >= 18 && inteligencia <= 19){
            modificadorInteligencia = 4;
        } else if(inteligencia >= 20 && inteligencia <= 21){
            modificadorInteligencia = 5;
        } else if(inteligencia >= 22 && inteligencia <= 23){
            modificadorInteligencia = 6;
        } else if(inteligencia >= 24 && inteligencia <= 25){
            modificadorInteligencia = 7;
        } else if(inteligencia >= 26 && inteligencia <= 27){
            modificadorInteligencia = 8;
        } else if(inteligencia >= 28 && inteligencia <= 29){
            modificadorInteligencia = 9;
        } else if(inteligencia == 30){
            modificadorInteligencia = 10;
        }
    }

    public void modificadorSabedoria(int sabedoria){
        if (sabedoria == 1){
            modificadorSabedoria -= 5;
        } else if(sabedoria >= 2 && sabedoria <=3){
            modificadorSabedoria -= 4;
        } else if(sabedoria >= 4 && sabedoria <= 5){
            modificadorSabedoria -= 3;
        } else if(sabedoria >= 6 && sabedoria <= 7){
            modificadorSabedoria -= 2;
        } else if(sabedoria >= 8 && sabedoria <= 9){
            modificadorSabedoria -= 1;
        } else if(sabedoria >= 10 && sabedoria <= 11){
            modificadorSabedoria = 0;
        } else if(sabedoria >= 12 && sabedoria <= 13){
            modificadorSabedoria = 1;
        } else if(sabedoria >= 14 && sabedoria <= 15){
            modificadorSabedoria = 2;
        } else if(sabedoria >= 16 && sabedoria <= 17){
            modificadorSabedoria = 3;
        } else if(sabedoria >= 18 && sabedoria <= 19){
            modificadorSabedoria = 4;
        } else if(sabedoria >= 20 && sabedoria <= 21){
            modificadorSabedoria = 5;
        } else if(sabedoria >= 22 && sabedoria <= 23){
            modificadorSabedoria = 6;
        } else if(sabedoria >= 24 && sabedoria <= 25){
            modificadorSabedoria = 7;
        } else if(sabedoria >= 26 && sabedoria <= 27){
            modificadorSabedoria = 8;
        } else if(sabedoria >= 28 && sabedoria <= 29){
            modificadorSabedoria = 9;
        } else if(sabedoria == 30){
            modificadorSabedoria = 10;
        }
    }

    public void modificadorCarisma(int carisma){
        if (carisma == 1){
            modificadorCarisma -= 5;
        } else if(carisma >= 2 && carisma <=3){
            modificadorCarisma -= 4;
        } else if(carisma >= 4 && carisma <= 5){
            modificadorCarisma -= 3;
        } else if(carisma >= 6 && carisma <= 7){
            modificadorCarisma -= 2;
        } else if(carisma >= 8 && carisma <= 9){
            modificadorCarisma -= 1;
        } else if(carisma >= 10 && carisma <= 11){
            modificadorCarisma = 0;
        } else if(carisma >= 12 && carisma <= 13){
            modificadorCarisma = 1;
        } else if(carisma >= 14 && carisma <= 15){
            modificadorCarisma = 2;
        } else if(carisma >= 16 && carisma <= 17){
            modificadorCarisma = 3;
        } else if(carisma >= 18 && carisma <= 19){
            modificadorCarisma = 4;
        } else if(carisma >= 20 && carisma <= 21){
            modificadorCarisma = 5;
        } else if(carisma >= 22 && carisma <= 23){
            modificadorCarisma = 6;
        } else if(carisma >= 24 && carisma <= 25){
            modificadorCarisma = 7;
        } else if(carisma >= 26 && carisma <= 27){
            modificadorCarisma = 8;
        } else if(carisma >= 28 && carisma <= 29){
            modificadorCarisma = 9;
        } else if(carisma == 30){
            modificadorCarisma = 10;
        }
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

    public Integer getCarisma() {
        return carisma;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(Integer constituicao) {
        this.constituicao = constituicao;
    }

    public Integer getDestreza() {
        return destreza;
    }

    public void setDestreza(Integer destreza) {
        this.destreza = destreza;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Integer sabedoria) {
        this.sabedoria = sabedoria;
    }
}
