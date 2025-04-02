package services;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
	private List<Tarefa> tarefas;
	
	public GerenciadorTarefas() {
		this.tarefas = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}
	
	public List<Tarefa> listarTodas(){
		return tarefas;
	}
	
	public List<Tarefa> listarConcluidas(){
		List<Tarefa> concluidas = new ArrayList<>();
			for (Tarefa tarefa : tarefas) {
				if ( tarefa.isConcluida()) {
					concluidas.add(tarefa);
				}
			}
			return concluidas;
		}
	
	public List<Tarefa> listarPendentes(){
		List<Tarefa> pendentes = new ArrayList<>();
		for (Tarefa tarefa : tarefas) {
			if (!tarefa.isConcluida()) {
				pendentes.add(tarefa);
			}
		}
		return pendentes;
	}
	
	public void excluirTarefa (String titulo) {
		tarefas.removeIf(tarefa -> tarefa.getTitulo().equalsIgnoreCase(titulo));
	}
	
	public void excluirTodas() {
		tarefas.clear();
	}
	public void marcarTarefaComoConcluida(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.marcarComoConcluida();
                break;
            }
        }
    }
}