package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o saldo atual: ");
		double saldo = scanner.nextDouble();
		
		double novoSaldo = saldo * 1.01;
		
		System.out.printf("Saldo reajustado: %.2f%n" , novoSaldo);
		
		scanner.close();
	}

}
