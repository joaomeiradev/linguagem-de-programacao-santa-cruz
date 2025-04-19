package services;

public class Cobra extends Reptil {
    public Cobra(String nome, int idade, float peso, float temperaturaCorporal) {
        super(nome, idade, peso, temperaturaCorporal);
    }

    public void rastejar() {
        System.out.println("A cobra está rastejando!");
    }
}
