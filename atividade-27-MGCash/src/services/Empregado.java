package services;

public abstract class Empregado {
    public String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + calcularSalario());
    }
}
