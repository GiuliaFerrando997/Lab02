package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class Word {
	
	private String alienWord;
	private ArrayList<String> translation;
	
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String parolaAliena) {
		this.alienWord = parolaAliena;
	}
	public List<String> getTranslation() {
		return this.translation;
	}
	public void setTranslation(String traduzione) {
		boolean trovato = false;
		for(String s : this.translation) {
			if(s.equals(traduzione))
				trovato =true;
		}
			if(trovato==false)
				this.translation.add(traduzione);
	}
	
	public Word(String parolaAliena, String traduzione) {
		super();
		this.translation=new ArrayList<>();
		this.alienWord = parolaAliena;
		this.translation.add(traduzione);
	}
	
	/**
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		result = prime * result + ((translation == null) ? 0 : translation.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		if (translation == null) {
			if (other.translation != null)
				return false;
		} else if (!translation.equals(other.translation))
			return false;
		return true;
	}
	
	
	**/
	
	
	

}
