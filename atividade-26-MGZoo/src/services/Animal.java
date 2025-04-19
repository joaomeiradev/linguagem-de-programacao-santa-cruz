package services;

public class Animal {
    protected String nome;
    protected int idade;
    protected float peso;

    public Animal(String nome, int idade, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerSom() {
        System.out.println("som de um animal");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Peso: " + peso);
    }
}