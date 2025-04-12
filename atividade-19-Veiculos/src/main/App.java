package main;

import automoveis.*;

public class App {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio(1200,180,70000,"Toyota", "Prata");
        System.out.println("--- Informações do Carro de Passeio ---");
        System.out.println(carro.obterInformacoesBasicas());

        System.out.println("\n----------------------\n");

        Caminhao caminhao = new Caminhao(8000, 120, 250000, 15, 4.2, 12);
        System.out.println("--- Informações do Caminhão ---");
        System.out.println(caminhao.obterInformacoesBasicas());
    }
}
