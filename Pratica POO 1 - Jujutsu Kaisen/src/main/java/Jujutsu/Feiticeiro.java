package Jujutsu;

public  class Feiticeiro  {
    private String nome;
    private int forca;
    private int velocidade;

    public Feiticeiro(String nome, int forca, int velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void tecnica() {

    }

}
