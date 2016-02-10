package exo3;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StrGUI extends JPanel {
	JLabel disp;
	JButton ajouteA;
	JButton ajouteB;
	JButton annuler;
	StrModel data;
	JPanel boutons;
	JPanel casesAcocher;
	ButtonGroup cases;
	JRadioButton maj;
	JRadioButton min;

	public StrGUI(StrModel sm, StrCont sc) {
		super(new BorderLayout());

		disp = new JLabel(sm.getValue(), JLabel.CENTER);
		ajouteA = new JButton("ajoute a");
		ajouteB = new JButton("ajoute b");
		annuler = new JButton("annuler");
		// désactiver le bouton "annuler" au départ
		annuler.setEnabled(false);

		boutons = new JPanel();
		boutons.add(ajouteA);
		boutons.add(ajouteB);
		boutons.add(annuler);

		maj = new JRadioButton("Majuscule");
		min = new JRadioButton("minuscule");
		cases = new ButtonGroup();
		cases.add(maj);
		cases.add(min);
		casesAcocher = new JPanel();
		casesAcocher.add(maj);
		casesAcocher.add(min);

		data = sm;

		ajouteA.addActionListener(sc);
		ajouteB.addActionListener(sc);
		annuler.addActionListener(sc);

		maj.addActionListener(sc);
		min.addActionListener(sc);

		disp.setPreferredSize(new Dimension(100, 100));

		this.add(disp, BorderLayout.CENTER);
		this.add(boutons, BorderLayout.SOUTH);
		this.add(casesAcocher, BorderLayout.EAST);
	}

	/**
	 * met à jour le label central en affichant la valeur récupérée dans le
	 * modèle
	 */
	public void majLabel() {
		disp.setText(data.getValue());
	}

	/**
	 * met le label central en majuscule
	 */
	public void enMajuscule() {
		disp.setText(data.getValue().toUpperCase());
	}

	/**
	 * désactive les boutons ajouteA et ajouteB
	 */
	public void disableAjout() {
		ajouteA.setEnabled(false);
		ajouteB.setEnabled(false);
	}

	/**
	 * active les boutons "ajoutAa et "ajoutB"
	 */
	public void enableAjout() {
		// TODO Auto-generated method stub
		ajouteA.setEnabled(true);
		ajouteB.setEnabled(true);
	}

	/**
	 * active le bouton annuler
	 */
	public void enableAnnuler() {
		// TODO Auto-generated method stub
		annuler.setEnabled(true);
	}

	/**
	 * désactive le bouton annuler
	 */
	public void disableAnnuler() {
		annuler.setEnabled(false);
	}

	// public static void main(String [] args) {
	// JFrame wn = new JFrame("Application");
	// StrModel sm = new StrModel();
	// StrCont controleur = new StrCont(sm);
	// StrGUI sg = new StrGUI(sm, controleur);
	//
	// controleur.setStrGUI(sg);
	//
	// wn.add(sg);
	// wn.pack();
	// wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// wn.setVisible(true);
	// }

}