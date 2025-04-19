package main;

import services.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("=== MENU BANCO ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Criar Conta");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Realizar Saque");
            System.out.println("5. Transferir entre Contas");
            System.out.println("6. Exibir Contas do Cliente");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = scanner.nextLine();
                    clientes.add(new Cliente(nome, cpf));
                    break;
                case 2:
                    System.out.print("CPF do cliente: ");
                    cpf = scanner.nextLine();
                    Cliente cli = buscarCliente(clientes, cpf);
                    if (cli != null) {
                        System.out.print("Número da conta: ");
                        String numero = scanner.nextLine();
                        System.out.print("Tipo (1-Corrente, 2-Poupança): ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();
                        if (tipo == 1) {
                            cli.adicionarConta(new ContaCorrente(numero, cli.getNome()));
                        } else {
                            cli.adicionarConta(new ContaPoupanca(numero, cli.getNome()));
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 3:
                    operacaoFinanceira(scanner, clientes, "deposito");
                    break;
                case 4:
                    operacaoFinanceira(scanner, clientes, "saque");
                    break;
                case 5:
                    System.out.print("CPF do cliente: ");
                    cpf = scanner.nextLine();
                    cli = buscarCliente(clientes, cpf);
                    if (cli != null) {
                        System.out.print("Conta origem: ");
                        String origem = scanner.nextLine();
                        System.out.print("Conta destino: ");
                        String destino = scanner.nextLine();
                        System.out.print("Valor: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        ContaBancaria c1 = cli.buscarConta(origem);
                        ContaBancaria c2 = cli.buscarConta(destino);
                        if (c1 != null && c2 != null) {
                            c1.transferir(c2, valor);
                        } else {
                            System.out.println("Conta(s) inválida(s).");
                        }
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 6:
                    System.out.print("CPF do cliente: ");
                    cpf = scanner.nextLine();
                    cli = buscarCliente(clientes, cpf);
                    if (cli != null) {
                        cli.exibirContas();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static Cliente buscarCliente(ArrayList<Cliente> clientes, String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    public static void operacaoFinanceira(Scanner scanner, ArrayList<Cliente> clientes, String tipo) {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cli = buscarCliente(clientes, cpf);
        if (cli != null) {
            System.out.print("Número da conta: ");
            String numero = scanner.nextLine();
            ContaBancaria conta = cli.buscarConta(numero);
            if (conta != null) {
                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                if (tipo.equals("deposito")) {
                    conta.depositar(valor);
                } else {
                    conta.sacar(valor);
                }
            } else {
                System.out.println("Conta não encontrada.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
