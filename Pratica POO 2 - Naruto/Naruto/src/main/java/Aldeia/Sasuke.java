package Aldeia;

public class Sasuke extends Ninja implements Tecnica{
    public Sasuke(String nome, double peso, double altura, String funcao, String nomeCla, String nomeVila, String nivel) {
        super(nome, peso, altura, funcao, nomeCla, nomeVila, Integer.parseInt(nivel));
    }

    @Override
    public void tecnica() {
        System.out.println("Shidori");
    }

    public void tecnica(String nome){
        System.out.println(nome);
    }
}
