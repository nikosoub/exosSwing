package exo3;

import java.awt.event.*;

public class StrCont implements ActionListener {
	StrModel data;
	StrGUI interf;

	public StrCont(StrModel sm) {
		data = sm;
	}

	public void setStrGUI(StrGUI sg) {
		interf = sg;
	}

	public void actionPerformed(ActionEvent evt) {

		if (evt.getActionCommand() == "ajoute a") {
			if (data.getValue().length() == 9) {
				interf.disableAjout();
			}
			data.appendA();
			interf.enableAnnuler();
		}
		if (evt.getActionCommand() == "ajoute b") {
			if (data.getValue().length() == 9) {
				interf.disableAjout();
			}
			data.appendB();
			interf.enableAnnuler();
		}
		if (evt.getActionCommand() == "annuler") {
			data.deleteLast();
			if (data.getValue().length() == 9) {
				interf.enableAjout();
			}
			if (data.getValue().length() == 0) {
				interf.disableAnnuler();
			}
		}
		interf.majLabel();

		if (interf.maj.isSelected() == true) {
			interf.enMajuscule();
		}
	}
}