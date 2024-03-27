package br.com.matheus.gerenciador.controller;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.matheus.gerenciador.jogador.Jogador;
import br.com.matheus.gerenciador.jogador.Posicao;
import br.com.matheus.gerenciador.jogador.Time;
import br.com.matheus.gerenciador.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    JogadorRepository repository;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("jogadores", repository.findAll());
        return "jogadores";
    }

    @PostMapping("/adicionar")
    public String adiciona(Jogador dados){
        repository.save(dados);
        return "redirect:/jogador";
    }
    
    @GetMapping("/novojogador")
    public String novoJogador(Model model) {
    	model.addAttribute("times", new ArrayList<Time>(Arrays.asList(Time.values())));
    	model.addAttribute("posicoes", new ArrayList<Posicao>(Arrays.asList(Posicao.values())));
    	return "jogador-novo";
    }
    
    @GetMapping("/deletar/{id}")
    public String deleta(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/jogador";
    }

    @GetMapping("/atualizajogador/{id}")
    public String atualizar(@PathVariable Long id, Model model) {
    	model.addAttribute("jogador", repository.findById(id));
    	model.addAttribute("times", new ArrayList<Time>(Arrays.asList(Time.values())));
    	model.addAttribute("posicoes", new ArrayList<Posicao>(Arrays.asList(Posicao.values())));
    	return "jogador-editar";
    }
    
    @GetMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, Jogador dados) {
    	repository.atualizarById(id, dados);
    	return "redirect:/jogador";
    }
    
    @GetMapping("/{id}")
    public String visualiza(@PathVariable Long id, Model model){
        Jogador jogador = repository.findById(id);
        model.addAttribute("jogador", jogador);
        return "jogador-detalhe";
    }
}
