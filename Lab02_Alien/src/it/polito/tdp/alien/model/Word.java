package it.polito.tdp.alien.model;

public class Word {
	
	private String alienWord;
	private String translation;
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String parolaAliena) {
		this.alienWord = parolaAliena;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String traduzione) {
		this.translation = traduzione;
	}
	public Word(String parolaAliena, String traduzione) {
		super();
		this.alienWord = parolaAliena;
		this.translation = traduzione;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
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
		return true;
	}
	
	

}
