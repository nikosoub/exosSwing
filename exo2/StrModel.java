package exo2;


import java.lang.*;

public class StrModel {
    private int compteur;

    public StrModel() {
    	compteur=0;
    }
    
    public void append() {
	//sb.append('a');
    }
    
    public void ajoute(){
    	compteur++;
    }
    public void retire(){
    	compteur--;
    }

    public String getValue() {
	return Integer.toString(compteur);
    }
}