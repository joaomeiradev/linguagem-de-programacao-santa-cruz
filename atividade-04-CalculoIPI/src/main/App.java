package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a porcentagem do IPI: ");
		double ipi = scanner.nextDouble();
		
		System.out.println("Digite o código da peça 1: ");
		int cod1 = scanner.nextInt();
		
		System.out.println("Digite o valor unitário da peça 1: ");
		double valor1 = scanner.nextDouble();
		
		System.out.println("Digite a quantidade da peça 1: ");
		int quant1 = scanner.nextInt();		
		
		System.out.println("Digite o código da peça 2: ");
		int cod2 = scanner.nextInt();
		
		System.out.println("Digite o valor unitário da peça 2: ");
		double valor2 = scanner.nextDouble();
		
		System.out.println("Digite a quantidade da peça 2: ");
		int quant2 = scanner.nextInt();
		
		double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);
		
		System.out.printf("Valor total a ser pago %.2f%n" , total);
		
		scanner.close();
		
		
	}

}
