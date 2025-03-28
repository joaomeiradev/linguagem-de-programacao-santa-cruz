package main;
import service.RegrasNegocio;
import java.util.Scanner;

public class EmprestimoBanco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua renda mensal: ");
		double rendaAnual = (scanner.nextDouble()*12);
		
		System.out.println("Digite o valor do empréstimo desejado: ");
		double valorEmprestimo = scanner.nextDouble();
		
		boolean aprovado = RegrasNegocio.verificarAprovacao(rendaAnual, valorEmprestimo);
		
		if (aprovado) {
			System.out.println("Empréstimo aprovado");
		} else {
			System.out.println("Empréstimo negado! Não atende os critérios.");
		}
	
		scanner.close();
		
	}
}
