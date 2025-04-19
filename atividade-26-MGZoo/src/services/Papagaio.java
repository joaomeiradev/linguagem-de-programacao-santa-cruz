package services;

public class Papagaio extends Ave {
    public Papagaio(String nome, int idade, float peso, float envergaduraAsas) {
        super(nome, idade, peso, envergaduraAsas);
    }

    public void voar() {
        System.out.println("O papagaio está voando!");
    }
}
