package services;

public class EmpregadoHorista extends Empregado {
    private int horasTrabalhadas;
    private double valorHora;

    public EmpregadoHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Horista");
    }
}
