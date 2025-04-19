package services;

public class Mamifero extends Animal {
    private float velocidade;

    public Mamifero(String nome, int idade, float peso, float velocidade) {
        super(nome, idade, peso);
        this.velocidade = velocidade;
    }

    @Override
    public void fazerSom() {
        System.out.println("som de um mamífero");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Velocidade: " + velocidade);
    }
}
