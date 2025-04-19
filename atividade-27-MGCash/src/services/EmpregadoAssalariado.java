package services;

public class EmpregadoAssalariado extends Empregado {
    public EmpregadoAssalariado(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Assalariado");
    }
}
