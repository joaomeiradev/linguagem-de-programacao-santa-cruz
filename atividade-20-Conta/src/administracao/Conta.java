package administracao;

public class Conta {
    private String cliente;
    private String dataAbertura;
    protected double saldo;

    public Conta(String cliente, String dataAbertura, double saldo){
        if (saldo < 0){
            System.out.println("Erro: saldo inicial não pode ser negativo.");
            System.exit(1);
        }
        this.cliente = cliente;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente. Você só pode sacar até R$" + saldo);
        } else if (valor > 0) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public void verSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
