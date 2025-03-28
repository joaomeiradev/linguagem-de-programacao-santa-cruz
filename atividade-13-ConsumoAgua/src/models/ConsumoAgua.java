package models;

public class ConsumoAgua {
	private String nomeUsuario;
	private double consumoDiario;
	private double limiteDiario;
	
	public ConsumoAgua () {
		this.nomeUsuario = nomeUsuario;
		this.consumoDiario = consumoDiario;
		this.limiteDiario = limiteDiario;
	}
	
	//getter
	public String getNomeUsuario () {
		return nomeUsuario;
	}

	public double getConsumoDiario () {
		return consumoDiario;
	}
	
	public double getLimiteDiario () {
		return limiteDiario;
	}
	
	//set
	
	public void setNomeUsuario (String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void setConsumoDiario (double consumoDiario) {
		if(consumoDiario < 0) {
			System.out.println("Digite apenas números positivos");
		}
		else {
			this.consumoDiario = consumoDiario;
		}
	}
	
	public void setLimiteDiario (double limiteDiario) {
		if(limiteDiario < 10) {
			System.out.println("O limite precisa ser no mínimo 10 litros");
		}
		else {
			this.limiteDiario = limiteDiario;
		}
	}
}
