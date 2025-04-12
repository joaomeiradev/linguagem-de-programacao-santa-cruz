package main;

import services.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        Curso curso = new Curso(nomeCurso);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Adicionar Nota a um Aluno");
            System.out.println("3 - Exibir Média dos Alunos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    String matricula = scanner.nextLine();
                    curso.adicionarAluno(new Aluno(nomeAluno, matricula));
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite a matrícula do aluno: ");
                    String matriculaBusca = scanner.nextLine();
                    Aluno alunoEncontrado = null;
                    for (Aluno aluno : curso.getAlunos()) {
                        if (aluno.getMatricula().equals(matriculaBusca)) {
                            alunoEncontrado = aluno;
                            break;
                        }
                    }
                    if (alunoEncontrado != null) {
                        System.out.print("Digite a nota: ");
                        double valorNota = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a descrição da nota: ");
                        String descricao = scanner.nextLine();
                        alunoEncontrado.adicionarNota(new Nota(valorNota, descricao));
                        System.out.println("Nota adicionada com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 3:
                    for (Aluno aluno : curso.getAlunos()) {
                        System.out.println("Aluno: " + aluno.getNome());
                        System.out.println("Média das notas: " + aluno.calcularMedia());
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
