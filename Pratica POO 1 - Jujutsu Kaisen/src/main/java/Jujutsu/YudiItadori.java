package Jujutsu;

public class YudiItadori extends Feiticeiro implements Energia{

    public YudiItadori(String nome, int forca, int velocidade) {
        super(nome,forca,velocidade);
    }

    @Override
    public void tecnica() {
        System.out.println("");
    }

    @Override
    public void energia() {
        System.out.println("Kokosen");

    }

    @Override
    public void dominio() {
        System.out.println("Sukuna");

    }
}
