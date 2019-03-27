package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import it.polito.tdp.alien.model.AlienModel;
import it.polito.tdp.alien.model.Word;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienModel elenco;
	private AlienModel model;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	txtResult.clear();
    	String testo = txtWord.getText().trim().toLowerCase();
    		
    		if(testo.contains("<") && testo.contains(">")) {
    			if(!testo.substring(0,1).equals("<") || 
    				!testo.substring(testo.length()-1, testo.length()).equals(">") ||
    				!testo.contains("><")) {
    				txtResult.setText("Errore nel formato di inserimento delle 2 parole");	
    				}
    			else {
    			String[] testo1 = testo.split("><");
    			String aliena = testo1[0].substring(1);
    			String traduzione = testo1[1].substring(0, testo1[1].length()-1);
    			if(aliena.matches("[a-zA-Z_]+") && traduzione.matches("[a-zA-Z_]+")) {
    			Word parola = new Word(aliena, traduzione);
    			model.aggiungiParola(parola);
    			txtResult.setText("Parola aggiunta correttamente!");
    			txtWord.clear();
    				}
    				else {
    					txtResult.setText("Inserisci caratteri validi");
    				}
    			}
    		}
    		else if (testo.matches("[a-zA-Z_]+")) {
    			String risultato = model.traduciParola(testo);
    			txtResult.setText(risultato+"\n");
    		}
    		
    		else {
    			txtResult.setText("Inserisci caratteri validi");
    		}
    	    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	model.cancellaDatabase();

    }
    
    public void setModel (AlienModel model) {
    	this.model=model;
    	txtResult.clear();
    	txtWord.clear();
    }
    
}
