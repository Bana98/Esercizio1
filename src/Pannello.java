import java.awt.Label;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pannello extends JPanel{
	private JLabel label;
	private JTextField testo;
	
	public Pannello() {
		super();
		BoxLayout layout = new BoxLayout(this, BoxLayout.X_AXIS);
		label = new JLabel("Ciao");
		testo = new JTextField();
		add(label);
		add(testo);
		setSize(10,10);
	}
	
}
