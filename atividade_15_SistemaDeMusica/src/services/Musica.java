package services;

public class Musica {
	private String titulo;
	private String artista;
	private int minutos;
	private int segundos;

	public Musica(String titulo, String artista, int minutos, int segundos) {
		this.titulo = titulo;
		this.artista = artista;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	@Override
	public String toString() {
		return titulo + " - " + artista + " (" + minutos + " min " + segundos + " seg)";
	}
}
