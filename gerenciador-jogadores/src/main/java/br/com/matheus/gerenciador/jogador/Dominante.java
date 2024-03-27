package br.com.matheus.gerenciador.jogador;

public enum Dominante {
    DIREITO("Direito"),
    ESQUERDO("Esquerdo");
	
	private String nome;
	
	private Dominante(String nome) {
		this.nome = nome;
	} 
	
	public String getNome() {
		return nome;
	}
}
