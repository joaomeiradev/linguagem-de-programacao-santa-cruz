package main;

import pessoas.*;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João Vitor", 22, 'M', 8500.00f, "G001", "Tecnologia");
        Cliente cliente = new Cliente("Ayron", 21, 'M', 1200.50f, 2004);
        Vendedor vendedor = new Vendedor("Lucas", 30, 'M', 3000.00f, "V007", 45, 100.10f);

        System.out.println("--- Gerente ---");
        System.out.println(gerente.obterInformacoesBasicas());

        System.out.println("--- Cliente ---");
        System.out.println(cliente.obterInformacoesBasicas());

        System.out.println("--- Vendedor ---");
        System.out.println(vendedor.obterInformacoesBasicas());

    }
}
