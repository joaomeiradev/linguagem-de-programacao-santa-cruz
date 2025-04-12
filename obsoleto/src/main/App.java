package main;

import java.util.Scanner;

import services.*;

public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GerenciadorTarefas gerenciador = new GerenciadorTarefas();
		
		while (true) {
			System.out.println("\n1. Inserir Tarefa");
			System.out.println("2. Listar Todas as Tarefas");
			System.out.println("3. Listar Tarefas Conluídas");
			System.out.println("4. Listar Tarefas Pendentes");
			System.out.println("5. Concluir uma tarefa");
			System.out.println("6. Excluir uma tarefa");
			System.out.println("7. Excluir Todas as Tarefas");
			System.out.println("8. Sair");
			System.out.println("Escolha uma opção:");
			int opcao = scanner.nextInt();
			scanner.nextLine();
				
				switch (opcao) {
				case 1:
					System.out.print("Título: ");
					String titulo = scanner.nextLine();
					System.out.print("Descrição: ");
					String descricao = scanner.nextLine();
					gerenciador.adicionarTarefa(new Tarefa(titulo, descricao));
					break;
					case 2:
						for (Tarefa t : gerenciador.listarTodas()) {
							System.out.println(t.getTitulo() + " - " + (t.isConcluida() ? "Concluída" : "Pendente"));
						}
						break;
					case 3:
						for (Tarefa t : gerenciador.listarConcluidas()) {
							System.out.println(t.getTitulo());
						}
						break;
					case 4:
						for (Tarefa t : gerenciador.listarPendentes()) {
							System.out.println(t.getTitulo());
						}
						break;
					case 5:
						System.out.println("Titulo da tarefa a concluir: ");
						String tituloConcluir = scanner.nextLine();
						gerenciador.marcarTarefaComoConcluida(tituloConcluir);
						break;
					case 6:
						System.out.println("Titulo da tarefa a excluir: ");
						String tituloExcluir = scanner.nextLine();
						gerenciador.excluirTarefa(tituloExcluir);
						break;
					case 7:
						gerenciador.excluirTodas();
						System.out.println("Todas as tarefas foram excluidas!");
						break;
					case 8:
						System.out.println("Saindo...");
						scanner.close();
						return;
					default:
						System.out.println("Opção inválida!");
			}
		}
	}

}
