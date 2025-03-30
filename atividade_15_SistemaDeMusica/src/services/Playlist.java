package services;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nome;
	private List<Musica> musicas;

	public Playlist(String nome) {
		this.nome = nome;
		this.musicas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public void adicionarMusica (String titulo, String artista, int minutos, int segundos) {
		musicas.add(new Musica(titulo, artista, minutos, segundos));
	}

	public int getQuantidadeDeMusicas() {
		return musicas.size()
;	}

	public String exibirPlaylist() {
		if (musicas.isEmpty()) {
            return "A playlist está vazia! Adicione músicas para visualizar.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Playlist: ").append(nome).append("\n");
        int totalMinutos = 0, totalSegundos = 0;

        for (Musica musica : musicas) {
            sb.append(musica).append("\n");
            totalMinutos += musica.getMinutos();
            totalSegundos += musica.getSegundos();
            }

        totalMinutos += totalSegundos / 60;
        totalSegundos %= 60;

        sb.append("Duração Total: ").append(totalMinutos).append(" min ").append(totalSegundos).append(" seg\n");
        return sb.toString();
	}

}
