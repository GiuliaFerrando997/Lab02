package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class AlienModel {
	
	private List<Word> parole;
	
	public AlienModel() {
		this.parole=new ArrayList<>();
	}
	
	public void aggiungiParola(Word p) {
		boolean presente = false;
		Word parolaTrovata = new Word(null, null);
		for (Word w : this.parole) {
			if(w.getAlienWord().equals(p.getAlienWord())) {
				presente = true;
				parolaTrovata = w;
			}
		}
		
		if(presente==true) {
			this.parole.remove(parolaTrovata);
		}

			this.parole.add(p);	
	}
	
	public String traduciParola(String aliena) {
		for(Word w : this.parole) {
			if(w.getAlienWord().equals(aliena))
				return w.getTranslation();
		}
		
		return "Non trovata";
	}

	public void cancellaDatabase() {
		this.parole.clear();	
	}

}
