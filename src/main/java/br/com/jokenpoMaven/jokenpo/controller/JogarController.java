package br.com.jokenpoMaven.jokenpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jokenpoMaven.jokenpo.model.Jogador;
import br.com.jokenpoMaven.jokenpo.model.Regra;
import br.com.jokenpoMaven.jokenpo.model.Rodada;
import br.com.jokenpoMaven.jokenpo.services.InicializarRegrasService;

@RestController
@RequestMapping("/jogar")
public class JogarController {
	
	@Autowired
	private InicializarRegrasService service;
	
	@PostMapping
	public ResponseEntity<Jogador> jogar(@RequestBody List<Jogador> req) {	
		
		Jogador vencedor = service.getVencedor(req);

		return ResponseEntity.ok(vencedor);
	}
	
	@GetMapping
	@RequestMapping(value = "/regras")
	public ResponseEntity<List<Regra>> getRegras() {
		
		List<Regra> regras = service.getRegras();
		return new ResponseEntity<List<Regra>>(regras, HttpStatus.OK);
	}

}
