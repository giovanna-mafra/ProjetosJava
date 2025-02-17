package Aldeia;

public abstract class Ninja extends Pessoa {
    private String nomeCla;
    private String nomeVila;
    private int nivel;

    public Ninja(String nome, double peso, double altura, String funcao, String nomeCla, String nomeVila, int nivel){
        super(nome,peso,altura,funcao);
        this.nomeCla = nomeCla;
        this.nomeVila = nomeVila;
        this.nivel = nivel;
    }

    public void setNomeCla(String nomeCla) {
        this.nomeCla = nomeCla;
    }

    public void setNomeVila(String nomeVila) {
        this.nomeVila = nomeVila;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNomeCla() {
        return nomeCla;
    }

    public String getNomeVila() {
        return nomeVila;
    }

    public int getNivel() {
        return nivel;
    }
}
