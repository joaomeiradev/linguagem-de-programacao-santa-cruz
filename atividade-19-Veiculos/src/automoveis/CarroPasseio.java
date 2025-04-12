package automoveis;

public class CarroPasseio extends Veiculo {
    private String marca;
    private String cor;

    public CarroPasseio(double peso,double velocidadeMaxima, double preco, String marca, String cor){
        super(peso, velocidadeMaxima, preco);
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
                "\nMarca: " + marca +
                "\nCor: " + cor;
    }
}
