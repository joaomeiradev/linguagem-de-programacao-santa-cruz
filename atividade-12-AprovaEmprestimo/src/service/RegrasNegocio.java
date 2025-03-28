package service;

public class RegrasNegocio {
	private static final double valorMaximoEmprestimo = 50000.0;
	private static final double fatorRenda = 3.0;
	
	public static boolean verificarAprovacao(double rendaAnual, double valorEmprestimo ) {
		return valorEmprestimo <= valorMaximoEmprestimo && rendaAnual >= valorEmprestimo * fatorRenda;
	}
}
