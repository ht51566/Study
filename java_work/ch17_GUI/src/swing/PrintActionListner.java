package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.TableModel;

public class PrintActionListner implements ActionListener {

	JTable table;

	public PrintActionListner(JTable table) {
		this.table = table;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// table을 조작하기 위한 TableModel 객체 생성
		TableModel model = table.getModel();
		// table의 행과 열의 개수 추출
		int rowNum = model.getRowCount();
		// System.out.println(rowNum);
		int colNum = model.getColumnCount();
		// System.out.println(colNum);
		
		for(int col =0; col < colNum; col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName + "\t");
		}
		System.out.println();
		for(int row = 0; row < rowNum; row++) {
			for(int col =0; col < colNum; col++) {
				String value =  (String) model.getValueAt(row, col);
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}

}
