package main;

import produtos.Medicamento;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Medicamento> medicamentos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n---MENU----");
            System.out.println("1 - Cadastrar medicamento");
            System.out.println("2 - Listar medicamentos");
            System.out.println("3 - Atualizar estoque");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Código de barras: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Laboratório: ");
                    String laboratorio = scanner.nextLine();

                    System.out.print("Preço de custo: ");
                    double precoCusto = scanner.nextDouble();

                    System.out.print("É controlado? (true/false): ");
                    boolean controlado = scanner.nextBoolean();

                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Medicamento m = new Medicamento(codigo, nome, descricao, laboratorio, precoCusto, controlado, quantidade);
                    medicamentos.add(m);
                    System.out.println("Medicamento cadastrado com sucesso!");
                    break;

                case 2:
                    if (medicamentos.isEmpty()){
                        System.out.println("Nenhum medicamento cadastrado.");
                    }
                    else {
                        System.out.println("--- Lista de Medicamentos ---");
                        for (Medicamento med : medicamentos){
                            med.exibirInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o código de barras do medicamento: ");
                    String codigoBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Medicamento med : medicamentos){
                        if (med.codigoBarras.equals(codigoBusca)){
                            System.out.print("Nova quantidade em estoque: ");
                            int novaQtd = scanner.nextInt();
                            scanner.nextLine();
                            med.atualizarEstoque(novaQtd);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Medicamento não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        while (opcao!= 0);

        scanner.close();
    }
}
