package services;
import models.ConsumoAgua;

public class RelatorioAgua {
	
	public void relatorioAgua (ConsumoAgua nomeUsuario, ConsumoAgua consumoDiario, ConsumoAgua limiteDiario ) {
		if(consumoDiario.getConsumoDiario() > limiteDiario.getLimiteDiario()) {
			System.out.println("O consumidor " + nomeUsuario.getNomeUsuario() + " gastou " + consumoDiario.getConsumoDiario() + " litros e está acima do limite de " + limiteDiario.getLimiteDiario() + " Litros");
		}
		else {
			System.out.println("O consumidor " + nomeUsuario.getNomeUsuario() + " gastou " + consumoDiario.getConsumoDiario() + " litros e está abaixo do limite de " + limiteDiario.getLimiteDiario() + " Litros");
		}
	}
}