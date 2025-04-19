package services;

public class ContaPoupanca extends ContaBancaria implements Imposto {
    private static final double IMPOSTO_SOBRE_SALDO = 0.01; // 1% ao ano (simulado)

    public ContaPoupanca(String numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void calcularImposto() {
        double taxa = saldo * IMPOSTO_SOBRE_SALDO;
        saldo -= taxa;
        System.out.println("Imposto de R$" + taxa + " sobre saldo aplicado à conta poupança.");
    }
}
