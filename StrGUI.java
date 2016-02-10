
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StrGUI extends JPanel {
    JLabel disp;
    JButton app;
    StrModel data;

    public StrGUI(StrModel sm, StrCont sc) {
	super(new BorderLayout());
	disp = new JLabel(sm.getValue(), JLabel.CENTER);
	app = new JButton("Ajoute 'a'");
	data = sm;
	
	app.addActionListener(sc);

	disp.setPreferredSize(new Dimension(150, 400));

	this.add(disp, BorderLayout.CENTER);
	this.add(app, BorderLayout.SOUTH);
    }

    public void majLabel() {
	disp.setText(data.getValue());
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