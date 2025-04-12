package pessoas;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String obterInformacoesBasicas(){
        return "Nome: " + nome +
                "\nIdade: " + idade +
                "\nSexo: " + sexo;
    }
}
