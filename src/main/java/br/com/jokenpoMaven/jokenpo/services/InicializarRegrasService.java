package br.com.jokenpoMaven.jokenpo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jokenpoMaven.jokenpo.model.Jogador;
import br.com.jokenpoMaven.jokenpo.model.Regra;

@Service
public class InicializarRegrasService {

	public Jogador getVencedor(List<Jogador> jogadores) {

		Jogador vencedor = new Jogador();
		System.out.println("nome jogador " + vencedor.getNome());
		for (Jogador jogador : jogadores) {
			if (vencedor.getNome() == null) {
				vencedor = jogador;
			} else {
				vencedor = jogar(vencedor, jogador);
			}
		}

		return vencedor;

	}

	private Jogador jogar(Jogador jogador1, Jogador jogador2) {

		if (jogador1.getJogada().equals(jogador2.getJogada())) {
			return new Jogador("EMPATE", jogador1.getJogada());
		}
				
		Regra regraParaJogo = getRegras().stream().filter((regra) -> regra.getNome().equals(jogador1.getJogada()))
												  .findAny().get();

		Boolean resultadoVencedor = regraParaJogo.getGanhaList().stream()
												 .anyMatch(item -> jogador2.getJogada().equals(item));
		
		Boolean resultadoPerdedor = regraParaJogo.getPerdaList().stream()
												 .anyMatch(item -> jogador2.getJogada().equals(item));


		if (resultadoVencedor && !resultadoPerdedor) {
			return jogador1;
		} else {
			return jogador2;
		}
	}

	public List<Regra> getRegras() {
		return Regra.initRegras();
	}
	

}
