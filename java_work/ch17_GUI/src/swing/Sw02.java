package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sw02 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("입력창");
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setLocation(700, 350);
		Container ct = frame.getContentPane();
		
		JPanel panel = new JPanel();
		
		JTextField txt1 = new JTextField("happy day", 10);
		JTextField txt2 = new JTextField(10);
		
		JButton btn1 = new JButton("입력");
		JButton btn2 = new JButton("출력");
		
		panel.add(txt1);
		panel.add(txt2);
		panel.add(btn1);
		panel.add(btn2);
		
//		InputActionListner ia = new InputActionListner(txt1, txt2);
//		btn1.addActionListener(ia);
		
//		btn1.addActionListener(new InputActionListner(txt1, txt2));
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txt2.setText(txt1.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txt1.getText() + " : " + txt2.getText());
			}
		});
		
		ct.add(panel, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
}
