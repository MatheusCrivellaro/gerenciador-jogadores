package br.com.matheus.gerenciador.jogador;

public enum Time {

    SAOPAULO("Sao Paulo"),
    PALMEIRAS("Palmeiras"),
    CORINTHIANS("Corinthians"),
    FLUMINENSE("Fluminense"),
    FLAMENGO("Flamengo"),
    BOTAFOGO("Botafogo"),
    JUVENTUDE("Juventude"),
    ATHLETICOPR("Athletico-PR"),
    ATLETICOMG("Atletico-MG"),
    ATLETICOGO("Atletico-GO"),
    BAHIA("Bahia"),
    CRICIUMA("Criciuma"),
    CRUZEIRO("Cruzeiro"),
    FORTALEZA("Fortaleza"),
    CUIABA("Cuiaba"),
    GREMIO("Gremio"),
    INTERNACIONAL("Internacional"),
    BRAGANTINO("Bragantino"),
    VASCO("Vasco"),
    VITORIA("Vitoria");
	
	private String nome;
	
	private Time(String nome) {
		this.nome = nome;
	} 
	
	public String getNome() {
		return nome;
	}

}
