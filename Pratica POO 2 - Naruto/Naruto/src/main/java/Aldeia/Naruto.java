package Aldeia;

public class Naruto extends Ninja implements Tecnica {
    public Naruto(String nome, double peso, double altura, String funcao, String nomeCla, String nomeVila, String nivel) {
        super(nome,peso,altura,funcao,nomeCla, nomeVila, Integer.parseInt(nivel));
    }

    @Override
    public void tecnica() {
        System.out.println("Rasengan");
    }

    public void tecnica(String nome) {
        System.out.println(nome);
    }

}
