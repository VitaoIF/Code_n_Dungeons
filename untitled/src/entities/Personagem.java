package entities;


import java.util.Random;

public abstract class Personagem {
    // Cabeçalho da criação de personagens
    private String nomePersonagem;
    private Classe classe;
    private int nivel;
    private String raca;

    // Habilidades do personagem
    private int forca, destreza,constituicao, inteligencia, sabedoria, carisma;

    protected Random random = new Random();

    public int calcularModificador(int atributo){
        return  (atributo - 10) / 2;
    }

    public Personagem() {
    }

    public Personagem(int carisma, Classe classe, int constituicao, int destreza, int forca, int inteligencia, int nivel, String nomePersonagem, String raca, int sabedoria) {
        this.carisma = carisma;
        this.classe = classe;
        this.constituicao = constituicao;
        this.destreza = destreza;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.nivel = nivel;
        this.nomePersonagem = nomePersonagem;
        this.raca = raca;
        this.sabedoria = sabedoria;
    }

    public int rolarD20(){
        return random.nextInt(20) + 1;
    }

    public abstract int atacar();

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

}
