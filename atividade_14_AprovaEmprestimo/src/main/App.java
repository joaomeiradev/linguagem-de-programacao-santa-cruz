package main;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe seu sal�rio: ");
		double rendaAnual = (scanner.nextDouble()*12);

		System.out.println("Infome o valor do empr�stimo desejado: R$");
		double valorEmprestimo = scanner.nextDouble();

		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();

		System.out.println("Voc� possui empr�stimos pendentes? Digite 'Sim' ou 'N�o': ");
		String resposta = scanner.next().trim().toLowerCase();
		boolean emprestimoPendente = resposta.equals("sim");

		scanner.close();

		boolean rendaSuficiente = rendaAnual >= 3 * valorEmprestimo;
		boolean dentroDoLimite = valorEmprestimo <= 50000;
		boolean maiorDeIdade = idade >= 18;
		boolean semPendencias = !emprestimoPendente;
		boolean dentroDos30PorCento = valorEmprestimo <= (0.3 * rendaAnual);

		if (rendaSuficiente && dentroDoLimite && maiorDeIdade && semPendencias && dentroDos30PorCento) {
			System.out.println("Empr�stimo aprovado!!");
		}
		else {
			System.out.println("Emr�stimo negado!");
		}
	}

}
