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

    public Player() {
    }

    public Player(String nomePersonagem, String classe, Integer nivel, String raca, String nomeJogador) {
        this.nomePersonagem = nomePersonagem;
        this.classe = classe;
        this.nivel = nivel;
        this.raca = raca;
        this.nomeJogador = nomeJogador;
    }

    public Player(Integer forca, Integer destreza, Integer constituicao, Integer inteligencia, Integer sabedoria, Integer carisma) {
        this.forca = forca;
        this.destreza = destreza;
        this.constituicao = constituicao;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;
        this.carisma = carisma;
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
