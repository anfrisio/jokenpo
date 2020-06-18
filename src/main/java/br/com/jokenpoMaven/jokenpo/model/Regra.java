package br.com.jokenpoMaven.jokenpo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Regra {
	
	public Regra() {}
	public Regra(String nome, List<String> perdaList, List<String> ganhaList) {
		this.nome = nome;
		this.perdaList = perdaList;
		this.ganhaList = ganhaList;
	}
	private String nome;
	private List<String> perdaList = new ArrayList<>();
	private List<String> ganhaList = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getPerdaList() {
		return perdaList;
	}
	public void setPerdaList(List<String> perdaList) {
		this.perdaList = perdaList;
	}
	public List<String> getGanhaList() {
		return ganhaList;
	}
	public void setGanhaList(List<String> ganhaList) {
		this.ganhaList = ganhaList;
	}
	
	
	public static List<Regra> initRegras(){
		Regra tesoura = new Regra("TESOURA", Arrays.asList("PEDRA", "SPOCK") , Arrays.asList("PAPEL", "LAGARTO") );
		Regra pedra = new Regra("PEDRA", Arrays.asList("PAPEL", "SPOCK") , Arrays.asList("TESOURA", "LAGARTO") );
		Regra papel = new Regra("PAPEL", Arrays.asList("TESOURA", "LAGARTO") , Arrays.asList("PEDRA", "SPOCK") );
		Regra lagarto = new Regra("LAGARTO", Arrays.asList("PEDRA", "TESOURA") , Arrays.asList("PAPEL", "SPOCK") );
		Regra spock = new Regra("SPOCK", Arrays.asList("LAGARTO", "PAPEL") , Arrays.asList("TESOURA", "PEDRA") );
		List<Regra> regras = Arrays.asList(tesoura, pedra, papel, lagarto, spock); 
		
		return regras;
	}

}
