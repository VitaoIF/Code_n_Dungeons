package entities;

public abstract class Personagem {
    // Cabeçalho da criação de personagens
    private String nomePersonagem;
    private String classe;
    private Integer nivel;
    private String raca;

    // Habilidades do personagem
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

    public Personagem() {
    }

    public Personagem(Integer carisma, String classe, Integer constituicao, Integer destreza, Integer forca, Integer inteligencia, Integer nivel, String nomePersonagem, String raca, Integer sabedoria) {
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

    public Integer getModificadorCarisma() {
        return modificadorCarisma;
    }

    public void setModificadorCarisma(Integer modificadorCarisma) {
        this.modificadorCarisma = modificadorCarisma;
    }

    public Integer getModificadorConstituicao() {
        return modificadorConstituicao;
    }

    public void setModificadorConstituicao(Integer modificadorConstituicao) {
        this.modificadorConstituicao = modificadorConstituicao;
    }

    public Integer getModificadorDestreza() {
        return modificadorDestreza;
    }

    public void setModificadorDestreza(Integer modificadorDestreza) {
        this.modificadorDestreza = modificadorDestreza;
    }

    public Integer getModificadorForca() {
        return modificadorForca;
    }

    public void setModificadorForca(Integer modificadorForca) {
        this.modificadorForca = modificadorForca;
    }

    public Integer getModificadorInteligencia() {
        return modificadorInteligencia;
    }

    public void setModificadorInteligencia(Integer modificadorInteligencia) {
        this.modificadorInteligencia = modificadorInteligencia;
    }

    public Integer getModificadorSabedoria() {
        return modificadorSabedoria;
    }

    public void setModificadorSabedoria(Integer modificadorSabedoria) {
        this.modificadorSabedoria = modificadorSabedoria;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
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

    public Integer getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(Integer sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int modificador(int atributo){
        return  (atributo - 10) / 2;
    }

}
