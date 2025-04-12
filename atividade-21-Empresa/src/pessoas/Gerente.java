package pessoas;

public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, char sexo, float salario, String matricula, String nomeGerencia){
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
                "\nNome da Gerência: " + nomeGerencia;
    }
}
