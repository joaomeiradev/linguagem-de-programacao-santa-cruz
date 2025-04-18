package main;

import services.EstacaoMonitoramento;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<EstacaoMonitoramento> estacoes = new ArrayList<>();

        System.out.println("=== Sistema de Monitoramento da Qualidade do Ar ===");

        String continuar;
        do {
            System.out.print("Digite a localização da estação: ");
            String local = scanner.nextLine();

            System.out.print("Digite o índice de qualidade do ar: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            estacoes.add(new EstacaoMonitoramento(local, indice));

            System.out.print("Deseja adicionar outra estação? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        // Calcular média
        if (!estacoes.isEmpty()) {
            int soma = 0;
            for (EstacaoMonitoramento estacao : estacoes) {
                soma += estacao.getIndiceQualidadeAr();
            }
            double media = (double) soma / estacoes.size();
            System.out.printf("Média da qualidade do ar na cidade: %.2f\n", media);
        } else {
            System.out.println("Nenhuma estação registrada.");
        }

        scanner.close();
    }
}

