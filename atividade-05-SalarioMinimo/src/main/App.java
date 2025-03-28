package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário do usuário: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Digite o valor do salário mínimo: ");
		double salarioMinimo = scanner.nextDouble();
		
		double quantidade = salario / salarioMinimo;
		
		System.out.printf("O usuário recebe %.2f salários mínimos%n" , quantidade);
		
		scanner.close();
	}

}
