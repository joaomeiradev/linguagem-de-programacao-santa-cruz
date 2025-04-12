package pessoas;

public class Cliente extends Pessoa{
    private float valorDivida;
    private int anoNascimento;

    public Cliente(String nome, int idade, char sexo, float valorDivida, int anoNascimento){
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
                "\nValor da dívida: " + valorDivida +
                "\nAno de nascimento: " + anoNascimento;
    }
}
