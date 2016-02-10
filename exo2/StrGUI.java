package exo2;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StrGUI extends JPanel {
    JLabel label;
    JButton bouton_moins;
    JButton bouton_plus;
    StrModel data;

    public StrGUI(StrModel sm, StrCont sc) {
	super(new BorderLayout());
	label = new JLabel(sm.getValue(), JLabel.CENTER);
	bouton_moins = new JButton("--");
	bouton_plus = new JButton("++");
	data = sm;
	
	bouton_moins.addActionListener(sc);
	bouton_plus.addActionListener(sc);

	label.setPreferredSize(new Dimension(150, 400));

	this.add(label, BorderLayout.CENTER);
	this.add(bouton_moins, BorderLayout.WEST);
	this.add(bouton_plus, BorderLayout.EAST);
	
    }

    public void majLabel() {
	label.setText(data.getValue());
    }

//    public static void main(String [] args) {
//    	JFrame wn = new JFrame("Application");
//    	StrModel sm = new StrModel();
//    	StrCont controleur = new StrCont(sm);
//    	StrGUI sg = new StrGUI(sm, controleur);
//
//    	controleur.setStrGUI(sg);
//    	
//    	wn.add(sg);
//    	wn.pack();
//    	wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	wn.setVisible(true);
//        }
}