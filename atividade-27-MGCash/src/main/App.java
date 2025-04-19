package main;

import services.*;

public class App {
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[6];

        empregados[0] = new EmpregadoHorista("João", 0, 160, 25.0);
        empregados[1] = new EmpregadoHorista("Ana", 0, 120, 22.0);

        empregados[2] = new EmpregadoComissionado("Carlos", 1000.0, 5000.0, 0.10);
        empregados[3] = new EmpregadoComissionado("Marina", 1200.0, 7000.0, 0.12);

        empregados[4] = new EmpregadoAssalariado("Fernanda", 3000.0);
        empregados[5] = new EmpregadoAssalariado("Bruno", 2800.0);

        double totalSalarios = 0;

        System.out.println("=== Detalhes dos Empregados ===");
        for (Empregado emp : empregados) {
            emp.exibirDetalhes();
            System.out.println("--------------------------");
        }

        System.out.println("=== Relatório de Pagamentos ===");
        for (Empregado emp : empregados) {
            System.out.println("Nome: " + emp.nome);
            if (emp instanceof EmpregadoHorista) {
                System.out.println("Tipo: Horista");
            } else if (emp instanceof EmpregadoComissionado) {
                System.out.println("Tipo: Comissionado");
            } else {
                System.out.println("Tipo: Assalariado");
            }
            double salario = emp.calcularSalario();
            System.out.println("Salário Calculado: R$ " + salario);
            totalSalarios += salario;
            System.out.println("--------------------------");
        }

        System.out.printf("Total de salários a pagar: R$ %.2f%n", totalSalarios);
    }
}
