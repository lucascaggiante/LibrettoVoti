package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
public class Voto {

	// POJO - Plain Old Java Object
	// Java Bean
	
	//e' una classe senza "logica". e' un semplice contenitore di dati
	
	private String nome;
	private int voto; //30L come lo rappresento?
	private LocalDate data; //data superamento esami
	
	//COSTRUTTORE: source-> create constructor using fields
	
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	//GETTER AND SETTER
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + nome + ", superato con " + voto + ", il " + data;
	}

	
	
}
