package services;

public class ContaCorrente extends ContaBancaria implements Imposto {
    private static final double TAXA_MENSAL = 12.0;

    public ContaCorrente(String numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void calcularImposto() {
        saldo -= TAXA_MENSAL;
        System.out.println("Tarifa mensal de manutenção de R$" + TAXA_MENSAL + " aplicada à conta corrente.");
    }
}
