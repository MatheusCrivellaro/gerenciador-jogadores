package br.com.matheus.gerenciador.jogador;

public enum Posicao {

    GOLEIRO("Goleiro"),
    ZAGUEIRO("Zagueiro"),
    MEIA("Meia"),
    ATACANTE("Atacante");
	
	private String nome;
	
	private Posicao(String nome) {
		this.nome = nome;
	} 
	
	public String getNome() {
		return nome;
	}
}
