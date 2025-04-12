package services;

public class Tarefa {
	private String titulo;
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isConcluida() {
		return concluida;
	}
	
	public void marcarComoPendente () {
		this.concluida = false;
	}
	
	public void marcarComoConcluida () {
		this.concluida = true;
	}

}
