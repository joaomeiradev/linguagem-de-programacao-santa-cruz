package automoveis;

public class Veiculo {
    private double peso;
    private double velocidadeMaxima;
    private double preco;

    public Veiculo(){ }

    public Veiculo(double peso, double velocidadeMaxima, double preco){
        this.peso = peso;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String obterInformacoesBasicas(){
        return "Peso: " + peso + "kg\n" +
                "Velocidade máxima: " + velocidadeMaxima + "km/h\n" +
                "Preço: R$" + preco;
    }
}
