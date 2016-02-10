import javax.swing.JFrame;

public class StrModelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StrModel sm =new StrModel();
		StrCont sc =new StrCont(sm);
		StrGUI s= new StrGUI(sm, sc);
		
		sc.setStrGUI(s);
		
		JFrame jf = new JFrame();
		jf.add(s);
		jf.pack();
		jf.setVisible(true);
	}

}
