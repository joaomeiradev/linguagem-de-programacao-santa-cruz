package main;

import services.AlimentoOrganico;

public class App {
    public static void main(String[] args) {
        AlimentoOrganico[] produtos = new AlimentoOrganico[5];

        produtos[0] = new AlimentoOrganico("Maçã", 3.50, true);
        produtos[1] = new AlimentoOrganico("Tomate", 4.20, false);
        produtos[2] = new AlimentoOrganico("Alface", 2.00, true);
        produtos[3] = new AlimentoOrganico("Banana", 3.00, true);
        produtos[4] = new AlimentoOrganico("Cenoura", 2.50, false);

        System.out.println("Produtos orgânicos certificados:");

        for (AlimentoOrganico produto : produtos) {
            if (produto.isCertificado()) {
                System.out.printf("- %s | Preço: R$ %.2f\n", produto.getNome(), produto.getPreco());
            }
        }
    }
}
