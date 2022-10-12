package swing;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Sw01 {
	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("JavaKing");
		JFrame frame = new JFrame();
		frame.setTitle("JavaKing");
		frame.setLocation(700, 350);
		frame.setPreferredSize(new Dimension(500, 400));
		
		Container cp = frame.getContentPane();
		JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
		
		cp.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
