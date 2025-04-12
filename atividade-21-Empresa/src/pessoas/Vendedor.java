package pessoas;

public class Vendedor extends Empregado{
    private int qtdVendas;
    private float valorVendas;
    private float totalVenda;

    public Vendedor(String nome, int idade, char sexo, float salario, String matricula, int qtdVendas, float valorVendas){
        super(nome, idade, sexo, salario, matricula);
        this.qtdVendas = qtdVendas;
        this.valorVendas = valorVendas;
        this.totalVenda = calcularTotalVendas();
    }

    private float calcularTotalVendas(){
        return qtdVendas * valorVendas;
    }

    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
                "\nQuantidade de vendas: " + qtdVendas +
                "\nValor por venda: " + valorVendas +
                "\nTotal de vendas: " + totalVenda;
    }
}
