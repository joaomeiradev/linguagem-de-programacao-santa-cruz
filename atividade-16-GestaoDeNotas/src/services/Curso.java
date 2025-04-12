package services;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
