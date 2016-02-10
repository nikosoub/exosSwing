
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
	data.append();
	interf.majLabel();
    }
}