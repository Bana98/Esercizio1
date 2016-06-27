//CTRL + SPAZIO --> SUGGERIMENTO
//CTRL + 7 --> METTO / TOLGO GLI // DEL COMMENTO

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

public class CEsercizio1 extends JFrame{
	
   public CEsercizio1() {
	   

	   super("Finestra"); //creazione del JFrame
	   //SUPER--> si riferisce alla classe che sto estendendo, in questo caso JFrame
	   //praticamente non devo scrivere ogni volta l'oggetto ma scrivo direttamente il metodo
		
		setSize(500, 300);  //setto le dimensioni della finestra
		setLocation(300, 300);  //la posizione nella quale deve apparire la finestra
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //serve per chiudere la finestra cliccando sulla X
		
//		BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
//		setLayout(layout);
		
		
		
		//pref --> preferred size    min--> minimum size   dlu --> a size unit that scales with the font
		setLayout(new FormLayout("right:pref, 103dlu, pref, 7dlu, right:pref, 3dlu, pref", "p, 3dlu, p, 3dlu, p, 9dlu, p, 3dlu, p, 3dlu, p"));
		CellConstraints cc = new CellConstraints();


		
		
	   JLabel labelSid_db = new JLabel("SID DB");  //creazione della Label
       JLabel labelSid1_db = new JLabel("CIAO");  //creazione della Label
       JLabel labelSid2_db = new JLabel("ID");  //creazione della Label

       
       JTextField textField1 = new JTextField();
       JTextField textField2 = new JTextField();

       JButton bottone1 = new JButton("CIAO");
       
       Pannello prova = new Pannello();

       
       add(labelSid_db, cc.xy(1, 1)); //aggiungo la label nella posizione indicata, colonna 1, riga 1
       add(labelSid1_db, cc.xy(2, 3));  //aggiungo la label al jframe
       add(labelSid2_db, cc.xy(3, 3));  //aggiungo la label al jframe
       
       add(textField1, cc.xyw(2, 1, 3));
       add(textField2, cc.xyw(3, 5, 5));
       
       add(bottone1, cc.xy (5, 6));

       setVisible(true); //rendo visibile la finestra

   } 
	
 
	
	public static void main(String[] args) {
		new CEsercizio1();
	
	}

}

