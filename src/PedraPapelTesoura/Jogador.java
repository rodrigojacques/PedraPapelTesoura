package PedraPapelTesoura;

public class Jogador {
	
	private String nome;
	private int jogada;
	
	public Jogador(String nome, int jogada) {
		this.setNome(nome);
		this.setJogada(jogada);
	}
	
	public String getNome() {
		return this.nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getJogada() {
		return this.jogada;
	}
	private void setJogada(int jogada) {
		this.jogada = jogada;
	}

}
