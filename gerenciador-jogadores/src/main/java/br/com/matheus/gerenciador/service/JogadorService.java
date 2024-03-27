package br.com.matheus.gerenciador.service;

import java.time.LocalDate;

import br.com.matheus.gerenciador.jogador.Dominante;
import br.com.matheus.gerenciador.jogador.Jogador;
import br.com.matheus.gerenciador.jogador.Posicao;
import br.com.matheus.gerenciador.jogador.Time;
import br.com.matheus.gerenciador.repository.JogadorRepository;

public class JogadorService {
	
	public static void mock(JogadorRepository repository) {
		repository.save(new Jogador(1, "Matheus", Posicao.ATACANTE, Time.ATHLETICOPR, 177.0, Dominante.DIREITO, LocalDate.now().toString()));
		repository.save(new Jogador(2, "Gabriel", Posicao.GOLEIRO, Time.BAHIA, 180.0, Dominante.DIREITO, LocalDate.now().toString()));
		repository.save(new Jogador(3, "Carol", Posicao.MEIA, Time.BRAGANTINO, 165.0, Dominante.ESQUERDO, LocalDate.now().toString()));
		repository.save(new Jogador(4, "Lucas", Posicao.ZAGUEIRO, Time.CRUZEIRO, 175.0, Dominante.DIREITO, LocalDate.now().toString()));
		repository.save(new Jogador(5, "Ana Luisa", Posicao.ATACANTE, Time.FLUMINENSE, 170.0, Dominante.ESQUERDO, LocalDate.now().toString()));
	}
	
}
