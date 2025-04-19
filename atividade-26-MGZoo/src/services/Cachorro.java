package services;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, float peso, float velocidade) {
        super(nome, idade, peso, velocidade);
    }

    public void correr() {
        System.out.println("O cachorro está correndo!");
    }
}

