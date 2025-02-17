package Jujutsu;

public class Megumi extends Feiticeiro implements Energia{

    public Megumi(String nome, int forca, int velocidade) {
        super(nome,forca,velocidade);
    }

    @Override
    public void tecnica() {
        System.out.println("");
    }

    @Override
    public void energia() {
        System.out.println("Invocação das maldições");
    }

    @Override
    public void dominio() {
        System.out.println("Energia escura");

    }
}
