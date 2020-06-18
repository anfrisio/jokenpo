package br.com.jokenpoMaven.jokenpo.model;

import java.util.ArrayList;
import java.util.List;

public class Rodada {
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Rodada(List<Jogador> jogadores) {
		super();
		this.jogadores = jogadores;
	}

	private List<Jogador> jogadores = new ArrayList<Jogador>();

}
