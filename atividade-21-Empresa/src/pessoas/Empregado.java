package pessoas;

public class Empregado extends Pessoa{
    protected float salario;
    protected String matricula;
    protected float valorINSS;

    public Empregado(String nome,int idade, char sexo, float salario, String matricula){
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
        this.valorINSS = calcularINSS();
    }

    private float calcularINSS(){
        return salario * 0.11f;
    }

    @Override
    public String obterInformacoesBasicas(){
        return super.obterInformacoesBasicas() +
                "\nMatrícula: " + matricula +
                "\nSalário: " + salario +
                "\nValor INSS: " + valorINSS;
    }
}
