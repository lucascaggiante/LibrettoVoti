package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		
		this.voti.add(v);
		
		
	}
	
	public String toString() {
		
		String s ="";
			for (Voto v : this.voti) { //iterazione su una collection
				
				s = s+v.toString()+"\n";
				
			}
		return s;
		
	}
/*
	public void stampaVotiUguali (int punteggio) {
		//il libretto stampa da solo i voti
		
		//E' il metodo da pigri
	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli
		
		//tutti i corsi in che senso? solo il nome del corso o anche voto o anche data?
	}
	
	public List<Voto> votiUguali2(int punteggio) {
		//restituisce solo i voti uguali al criterio
	}
	
	public Libretto votiUguali ( int punteggio) {
		//restituisce un libretto che ha i voti tutti uguali (che ho scelto)
		//rimane lo stesso un libretto, infatti posso effetturare tutte le operazioni
	}
	*/
	
	public List<Voto> listaVotiUguali(int punteggio) {
		//restituisce solo i voti uguali al criterio
		
		List<Voto> risultato = new ArrayList<>();
		for (Voto v : this.voti ) {
			if (v.getVoto() == punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for (Voto v : this.voti) {
			if (v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
}
