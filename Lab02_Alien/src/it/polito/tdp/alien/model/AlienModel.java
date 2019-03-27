package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class AlienModel {
	
	private List<Word> parole;
	
	public AlienModel() {
		this.parole=new ArrayList<>();
	}
	
	public void aggiungiParola(String a, String t) {
		boolean presente = false;
		Word parolaa = new Word(null, null);
		//Word parolaTrovata = new Word(null, null);
		for (Word w : this.parole) {
			if(w.getAlienWord().equals(a)) {
				presente = true;
				parolaa = w;
			}
		}
		
		if(presente==true) {
			//this.parole.get(indice).setTranslation(t);
			parolaa.setTranslation(t);
		}
		else {
			Word ultima = new Word(a, t);
			this.parole.add(ultima);
		}
	}
	
	public List<String> traduciParola(String aliena) {
		List<String> nonTrovata = new ArrayList<String>();
		nonTrovata.add("Non trovata");
		for(Word w : this.parole) {
			if(w.getAlienWord().equals(aliena))
				return w.getTranslation();
		}
		return nonTrovata;
	}

	public void cancellaDatabase() {
		this.parole.clear();	
	}

}
