package exo2;

import java.awt.event.*;

public class StrCont implements ActionListener {
    StrModel data;
    StrGUI vue;

    public StrCont(StrModel sm) {
	data = sm;
    }

    public void setStrGUI(StrGUI sg) {
	vue = sg;
    }

    public void actionPerformed(ActionEvent evt) {
//    	if (evt.getActionCommand()=="--"){
//    		data.retire();
//    	}
//    	if (evt.getActionCommand()=="++"){
//    		data.ajoute();
//    	}
//    	
	
	
		if (evt.getSource().equals(vue.bouton_moins)){
			data.retire();
		}
		if (evt.getSource().equals(vue.bouton_plus)){
			data.ajoute();
		}
		vue.majLabel();
    }
}