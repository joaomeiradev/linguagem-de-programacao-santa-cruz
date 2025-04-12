package administracao;

public class Poupanca extends Conta {
    private double rendimentoMensal;

    public Poupanca(String cliente, String dataAbertura, double saldo, double rendimentoMensal){
        super(cliente, dataAbertura, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    public void setRendimentoMensal(double rendimentoMensal) {
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento(){
        double rendimento = saldo * rendimentoMensal;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
}
