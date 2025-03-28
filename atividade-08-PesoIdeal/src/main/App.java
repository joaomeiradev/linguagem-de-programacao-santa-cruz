package main;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura em metros: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite seu sexo ('M' para masculino e'F' para feminino): " );
		char sexo = scanner.next().charAt(0);
		
		double pesoIdeal;
		
		if (sexo == 'M' || sexo == 'm') {
			pesoIdeal = (72.7 * altura) - 58;
		} else if (sexo == 'F' || sexo == 'F') {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else {
			System.out.println("Sexo não reconhecido.");
			pesoIdeal = 0;
		}
		
		System.out.printf("Peso ideal: %.2f kg%n" , pesoIdeal);
		
		scanner.close();
	}

}
