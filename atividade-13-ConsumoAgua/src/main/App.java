package main;
import models.ConsumoAgua;
import services.RelatorioAgua;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ConsumoAgua usuario1 = new ConsumoAgua ();
		
		RelatorioAgua relatorio = new RelatorioAgua ();
		
		System.out.println("Digite seu nome: ");
		usuario1.setNomeUsuario(scanner.nextLine());
		
		System.out.println("Digite seu consumo em litros: ");
		usuario1.setConsumoDiario(scanner.nextDouble());
		
		System.out.println("Digite o limite diário em litros: ");
		usuario1.setLimiteDiario(scanner.nextDouble());
		
		relatorio.relatorioAgua(usuario1, usuario1, usuario1);
		
	}
}
