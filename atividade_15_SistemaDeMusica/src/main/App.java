package main;
import java.util.Scanner;

import services.Playlist;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da sua Playlist: ");
		String nomePlaylist = scanner.nextLine();
		Playlist minhaPlaylist = new Playlist(nomePlaylist);

		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Música");
            System.out.println("2 - Exibir Playlist");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da música: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Digite o artista: ");
                    String artista = scanner.nextLine();

                    System.out.print("Digite a duração (minutos): ");
                    int minutos = scanner.nextInt();

                    System.out.print("Digite a duração (segundos): ");
                    int segundos = scanner.nextInt();

                    scanner.nextLine();

                    minhaPlaylist.adicionarMusica(titulo, artista, minutos, segundos);
                    System.out.println("Música adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println(minhaPlaylist.exibirPlaylist());
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
		}
	}

}
