package Jujutsu;

public class Main {
    public static void main(String[] args) {
        YudiItadori yuji = new YudiItadori("Yuji Itadori",100,70);
        Megumi megumi = new Megumi("Megumi Fushiguro",70,50);
        Satoru satoru = new Satoru("Satoru Gojo",100,100);

        System.out.println(yuji.getNome());
        System.out.println(megumi.getNome());
        System.out.println(satoru.getNome());

        satoru.tecnica(2);
        yuji.dominio();

    }

}