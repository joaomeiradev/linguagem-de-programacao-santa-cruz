package services;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Nota> notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.getValorNota();
        }
        return soma / notas.size();
    }
}