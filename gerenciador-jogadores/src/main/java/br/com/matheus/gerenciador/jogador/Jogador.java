package br.com.matheus.gerenciador.jogador;

public class Jogador {

    private Long id;
    private int numero;
    private String nome;
    private Posicao posicao;
    private Time time;
    private Double altura;
    private Dominante dominante;
    private String data;

    public Jogador(int numero, String nome, Posicao posicao, Time time, Double altura, Dominante dominante, String data) {
        this.numero = numero;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
        this.altura = altura;
        this.dominante = dominante;
        this.data =data;
    }
    
    public Jogador(Long id, int numero, String nome, Posicao posicao, Time time, Double altura, Dominante dominante, String data) {
        this(numero, nome, posicao, time, altura, dominante, data);
    	this.id = id;
    }

    public Jogador() {
    }
    
    public void atualizar(Jogador dados) {
    	setAltura(dados.getAltura());
    	setNome(dados.getNome());
    	setNumero(dados.getNumero());
    	setData(dados.getData());
    	if(dados.getDominante()!=null)
    		setDominante(dados.getDominante());
    	if(dados.getTime()!=null)
    		setTime(dados.getTime());
    	if(dados.getPosicao()!=null)
    		setPosicao(dados.getPosicao());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Dominante getDominante() {
        return dominante;
    }

    public void setDominante(Dominante dominante) {
        this.dominante = dominante;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    @Override
	public String toString() {
		return "" + this.id;
	}
    
}
