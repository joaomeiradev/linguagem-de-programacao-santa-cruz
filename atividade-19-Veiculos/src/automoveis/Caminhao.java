package automoveis;

public class Caminhao extends Veiculo{
    private double tonelada;
    private double alturaMaxima;
    private double comprimento;

    public Caminhao(double peso, double velocidadeMaxima, double preco, double tonelada, double alturaMaxima, double comprimento){
        super(peso, velocidadeMaxima, preco);
        this.tonelada = tonelada;
        this.alturaMaxima = alturaMaxima;
        this.comprimento = comprimento;
    }

    public double getTonelada() {
        return tonelada;
    }

    public void setTonelada(double tonelada) {
        this.tonelada = tonelada;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
            "\nTonelagem: " + tonelada + " t" + "\nAltura máxima: " + alturaMaxima + " m" + "\nComprimento: " + comprimento + " m";
    }
}
