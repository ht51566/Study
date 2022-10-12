package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class InputActionListner implements ActionListener{
	
	JTextField txt1;
	JTextField txt2;
	
	public InputActionListner(JTextField txt1, JTextField txt2) {
		super();
		this.txt1 = txt1;
		this.txt2 = txt2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		txt2.setText(txt1.getText());
	}
	
}
