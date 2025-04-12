package administracao;

public class ContaCorrente extends Conta{
    private double taxaMovimentacao;

    public ContaCorrente(String cliente, String dataAbertura, double saldo, double taxaMovimentacao){
        super(cliente, dataAbertura, saldo);
        this.taxaMovimentacao = taxaMovimentacao;
    }

    public double getTaxaMovimentacao(){
        return  taxaMovimentacao;
    }

    public void setTaxaMovimentacao(double taxaMovimentacao) {
        this.taxaMovimentacao = taxaMovimentacao;
    }

    @Override
    public void verSaldo(){
        if (saldo >= taxaMovimentacao){
            saldo -= taxaMovimentacao;
            System.out.println("Taxa de movimentação de R$" + taxaMovimentacao + " foi descontada.");
        } else {
            System.out.println("Saldo insuficiente para cobrança de taxa de movimentação");
        }
        super.verSaldo();
    }
}
