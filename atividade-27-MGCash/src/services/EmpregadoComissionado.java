package services;

public class EmpregadoComissionado extends Empregado {
    private double vendas;
    private double percentualComissao;

    public EmpregadoComissionado(String nome, double salarioBase, double vendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * percentualComissao);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: Comissionado");
    }
}
