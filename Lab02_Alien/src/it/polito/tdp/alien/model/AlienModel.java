package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlienModel {
	
	private List<Parola> parole;
	private HashMap<String, String> mappaParole;
	
	public AlienModel() {
		this.parole=new ArrayList<>();
		this.mappaParole=new HashMap<>();
	}
	
	public void aggiungiParola(Parola p) {
		this.parole.add(p);
		this.mappaParole.put(p.getParolaAliena(), p.getTraduzione());
	}
	
	public String traduciParola(String aliena) {
		return this.mappaParole.get(aliena);
	}

	public void cancellaDatabase() {
		this.mappaParole.clear();
		this.parole.clear();	
	}

}
