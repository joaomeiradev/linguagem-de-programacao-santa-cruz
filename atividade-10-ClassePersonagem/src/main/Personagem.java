package main;
import java.util.Scanner;


public class Personagem {
	
	private String nome;
	private String cor;
	
	public Personagem (String nome, String cor) {
		this.nome = nome;
		this.cor = cor;
	}
	
	public void andar () {
		System.out.println("O " + nome + " está andando!");
	}

	public void correr () {
		System.out.println("O " + nome + " está correndo!");
	}
	
	public void pular () {
		System.out.println("O " + nome + " pulou!");
	}
	
	public void exibirInfo () {
		System.out.println("Personagem escolhido: " + nome + "\nCor do personagem: " + cor);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		Personagem personagemEscolhido = null;
			
		do {
			
			System.out.println("---Digite o personagem que deseja:---");
			System.out.println("1. Mário.");
			System.out.println("2. Luigi.");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				personagemEscolhido = new Personagem ("Mário", "Vermelho");
				personagemEscolhido.exibirInfo();
				break;
			case 2:
				personagemEscolhido = new Personagem ("Luigi", "Verde");
				personagemEscolhido.exibirInfo();
				break;
			default:
	            System.out.println("Opção inválida! Tente novamente.");
	            break;
			}	
		} while (opcao != 1 && opcao != 2);
		
		do {
			
			System.out.println("---Digite o que deseja fazer:---");
			System.out.println("1. Andar.");
			System.out.println("2. Correr.");
			System.out.println("3. Pular.");
			System.out.println("4. Exibir personagem.");
			System.out.println("5. Sair.");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				personagemEscolhido.andar();
				break;
			case 2:
				personagemEscolhido.correr();
				break;
			case 3:
				personagemEscolhido.pular();
				break;
			case 4:
				personagemEscolhido.exibirInfo();
				break;
			case 5:
				System.out.println("Saindo...");
				break;
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
		} while (opcao !=5);
		
		scanner.close();
	}

}
