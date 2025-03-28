package main;
import java.util.Scanner;

public class Carro {
	
	 String marca;
	 String modelo;
	 int ano;
	 double preco;
	 boolean ignicao;
	 
	 public Carro(String marca, String modelo, int ano, double preco) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.ano = ano;
		 this.preco = preco;
		 this.ignicao = false;
	 }
	 
	 void exibirCarro() {
		 System.out.println("Marca: " + marca);
	     System.out.println("Modelo: " + modelo);
	     System.out.println("Ano: " + ano);
	     System.out.println("Preço: R$ " + preco);
	 }
	 void desligar() {
		 if (ignicao) {
			 ignicao = false;
			 System.out.println("Carro desligado.");			 
		} else {
		System.out.println("O carro já está desligado.");
		}
	}	 
	 void ligar() {
		 if (!ignicao) {
			 ignicao = true;
			 System.out.println("Carro ligado.");			 
		} else {
		System.out.println("O carro já está ligado.");
		}
	 }
	 void verificar() {
		 if (ignicao) {
			 System.out.println("Carro ligado.");			 
		} else {
		System.out.println("O carro desligado.");
		}
	 }
	 
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		Carro carro1 = new Carro ("Toyota", "Corolla" , 2025 , 100.000);
		
		do {
			System.out.println("Digite o número correspondente ao que deseja realizar: ");
			System.out.println("0. Sair.");
			System.out.println("1. Ligar carro.");
			System.out.println("2. Desligar carro.");
			System.out.println("3. Verificar se está ligado ou desligado");
				
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
	        case 1:
	            carro1.ligar();
	            break;
	        case 2:
	            carro1.desligar();
	            break;
	        case 3:
	            carro1.verificar();
	            break;
	        case 4:
	            carro1.exibirCarro();
	            break;
	        case 0:
	            System.out.println("Saindo.");
	            break;
	        default:
	            System.out.println("Opção inválida! Tente novamente.");
	    }
		}
			while (opcao != 0);

scanner.close();
}
}
