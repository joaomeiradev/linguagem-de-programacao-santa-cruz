package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu batimento cardíaco: ");
		int batimento = scanner.nextInt();
		
		String classificacao;
		
		if (idade > 60 && batimento > 150) {
			classificacao = "URGENTE";
		} else if ((idade > 60 && batimento <= 150) || (idade <= 60 && batimento >150)) {
			classificacao = "Urgência moderada";
		} else {
			classificacao = "Não urgente";
		}
		
		System.out.println("Classificação: " + classificacao);
		
		scanner.close();
	}

}
