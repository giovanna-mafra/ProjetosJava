package Jujutsu;

public class Satoru extends Feiticeiro implements Energia{

    public Satoru(String nome, int forca, int velocidade) {
        super(nome,forca,velocidade);
    }

    @Override
    public void tecnica() {
        System.out.println("");
    }

    public void tecnica(int tipo) {
        if(tipo == 1) {
            System.out.println("Energia Vermelha");
        }else if (tipo == 2) {
            System.out.println("Energia azul");
        }
        else{
            System.out.println("Outra");
        }
    }

    @Override
    public void energia() {
        System.out.println("Cobertura corporal");
    }

    @Override
    public void dominio() {
        System.out.println("Kokosen");

    }
}
