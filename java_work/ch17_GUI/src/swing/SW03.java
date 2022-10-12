package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class SW03 {
	public static void main(String[] args) {

		JFrame frame = new JFrame("참가자 명단");
		frame.setPreferredSize(new Dimension(500, 600));
		frame.setLocation(700, 350);
		Container ct = frame.getContentPane();

		String[] colNames = { "이름", "나이", "성별" };

		JPanel panel = new JPanel();
		JTextField txt1 = new JTextField(6);
		JTextField txt2 = new JTextField(3);
		JTextField txt3 = new JTextField(2);

		panel.add(new JLabel("이름"));
		panel.add(txt1);
		panel.add(new JLabel("나이"));
		panel.add(txt2);
		panel.add(new JLabel("성별"));
		panel.add(txt3);
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		panel.add(sp, BorderLayout.NORTH);

		ct.add(panel, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		JButton btn1 = new JButton("입력");
		JButton btn2 = new JButton("출력");
		panel2.add(btn1);
		panel2.add(btn2);
		ct.add(panel2, BorderLayout.SOUTH);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] arr = new String[3];
				arr[0] = txt1.getText();
				arr[1] = txt2.getText();
				arr[2] = txt3.getText();
				
				model.addRow(arr);
				
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
			}
		});
		
		btn2.addActionListener(new PrintActionListner(table));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
