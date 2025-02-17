package Aldeia;

public class Main {
    public static void main(String[] args) {
        Aldeia folha = new Aldeia("Aldeia da folha");
        Aldeia areia = new Aldeia("Aldeia da areia");

        Pessoa ichiraku = new Pessoa("Ichiraku",65.2,1.60,"Cozinheiro");
        Pessoa maeDaIno = new Pessoa("Mãe da Ino",70.20,1.70,"Florista");

        Naruto naruto = new Naruto("Naruto", 60,1.69,"Ninja","Uzumaki","folha", "2");
        Sasuke sasuke = new Sasuke("Sasuko",60,1.70,"Uchiha","folha", "folha", "3");

        folha.adicionarNinjas((naruto));
        folha.adicionarNinjas((sasuke));

        folha.adicionarPessoas(ichiraku);
        folha.adicionarPessoas(maeDaIno);

        Time time7 = new Time("Time sete");
        time7.addMembros(naruto);
        time7.addMembros(sasuke);


    }
}