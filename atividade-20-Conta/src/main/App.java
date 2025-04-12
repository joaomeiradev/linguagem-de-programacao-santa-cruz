package main;

import administracao.ContaCorrente;
import administracao.Poupanca;

public class App {
    public static void main (String[] args){
        System.out.println("--- Conta Poupança ---");
        Poupanca poupanca = new Poupanca("João", "12/12/2012", 1000, 0.02);
        poupanca.verSaldo();
        poupanca.aplicarRendimento();
        poupanca.verSaldo();
        poupanca.sacar(1500);
        poupanca.sacar(200);
        poupanca.verSaldo();
        poupanca.depositar(100);
        poupanca.verSaldo();

        System.out.println("\n--- Conta Corrente ---");
        ContaCorrente corrente = new ContaCorrente("Lucas", "11/11/2011", 500, 5);
        corrente.verSaldo();
        corrente.depositar(100);
        corrente.verSaldo();
        corrente.sacar(700);
        corrente.sacar(300);
        corrente.verSaldo();
    }
}
