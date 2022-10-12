package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit;
import java.awt.event.*;
import java.io.*;
import java.util.Calendar;

public class Note extends JFrame {

	// 변수 선언
	JTextArea text;
	Container pane;
	JMenuBar nb = new JMenuBar();
	JMenu file, help;
	JMenuItem newI, openI, saveI, closeI, infoI, helpI;
	JFileChooser open = new JFileChooser();// 파일 및 디렉토리 선택 컴포넌트 선언


	
	public Note() {
		super("수진 노트!!"); // 부모클래스 생성자 호출
		pane = getContentPane(); // JFrame에 컴포넌트(재료들) 넣을 통 생성 (디자인을 위한 컨텐츠 영역)
		pane.setLayout(new BorderLayout(0, 15)); // JFrame 정렬
		setJMenuBar(nb); // 메뉴바 붙임
		
		String[] colNames = {"이름", "나이", "성별"};
		JPanel panel = new JPanel();
		JTextField txt1 = new JTextField(6);
		JTextField txt2 = new JTextField(4);
		JTextField txt3 =  new JTextField(10);
		panel.add(new JLabel("Name"));
		panel.add(txt1);
		panel.add(new JLabel("Age"));
		panel.add(txt2);
		panel.add(new JLabel("Gender"));
		panel.add(txt3);
		
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(480,300));
		panel.add(sp);
		pane.add(panel, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		JButton btn1 = new JButton("출력");
		JButton btn2 = new JButton("입력");
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.setSize(480, 100);
		pane.add(panel2, BorderLayout.CENTER);
		
		
		
		

		// 메뉴 및 메뉴 아이템 생성
		file = new JMenu("파일(F)");
		help = new JMenu("정보(I)");

		// 키보드 연상기호 설정
		file.setMnemonic('F'); //Alt+F 누르면 나옴
		help.setMnemonic('I');

		// 파일 메뉴 내용 생성
		newI = new JMenuItem("새파일");
		openI = new JMenuItem("열기");
		saveI = new JMenuItem("저장");
		closeI = new JMenuItem("닫기");

		// 메뉴 단축키를 위한 셋팅
		newI.setAccelerator(KeyStroke.getKeyStroke('N', Event.CTRL_MASK)); // Ctrl + N
		openI.setAccelerator(KeyStroke.getKeyStroke('O', Event.CTRL_MASK)); // Ctrl + O
		saveI.setAccelerator(KeyStroke.getKeyStroke('S', Event.CTRL_MASK)); // Ctrl + S
		closeI.setAccelerator(KeyStroke.getKeyStroke('Q', Event.CTRL_MASK)); // Ctrl + Q

		// 정보 메뉴 생성
		infoI = new JMenuItem("정보");
		infoI.setAccelerator(KeyStroke.getKeyStroke('I', Event.CTRL_MASK)); // Ctrl + R

		// 메뉴에 내용 붙임
		file.add(newI);
		file.add(openI);
		file.add(saveI);
		file.add(closeI);
		help.add(infoI);

		// 메뉴 완성
		nb.add(file);
		nb.add(help);
		
		
		
		// 메뉴에서 새파일 클릭했을때 이벤트 처리
		newI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(""); // text내용을 모두 지운다
			}
		});

		// 메뉴에서 열기 클릭했을때 이벤트 처리
		openI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int re = open.showOpenDialog(Note.this); // 파일열기 다이얼로그창을 띄운다
				if (re == JFileChooser.APPROVE_OPTION) // 리턴 상태 확인
				{
					String fN;
					String dir;
					String str;

					File file_open = open.getSelectedFile(); // 선택한 파일명을 가져온다

					FileInputStream fis; // 파일 시스템의 파일 입력 바이트 취급 스트림 선언
					ByteArrayOutputStream bo; // 데이터 바이트 배열에 기입해지는 출력 스트림 선언
					try {
						fis = new FileInputStream(file_open); // FileInputStream객체를 생성
						bo = new ByteArrayOutputStream(); // ByteArrayOutputStream객체를 생성
						int i = 0;
						while ((i = fis.read()) != -1) // 파일이 끝날때까지 읽어드림
						{
							bo.write(i); // len 바이트를 바이트 배열 출력 Stream에 기입
						}
						text.setText(bo.toString()); // 화면에 뿌려준다
						fis.close(); // FileInputStream을 닫는다.
						bo.close(); // ByteArrayOutputStreamm을 닫는다.
					} catch (FileNotFoundException fe) {
					} catch (IOException ie) {
					}
				}
			}
		});

		// 메뉴에서 저장 클릭했을때 이벤트 처리
		saveI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int re = open.showSaveDialog(Note.this);
				if (re == JFileChooser.APPROVE_OPTION) // 파일저장 다이얼로그를 띄운다
				{
					File file_open = open.getSelectedFile(); // 저장할 파일명을 가져온다

					try {
						PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file_open))); // PrintWriter객체를
																											// 생성해서
						pw.write(text.getText()); // 화면의 내용을 파일에 쓴다
						pw.close();
					}

					catch (FileNotFoundException ie2) {
					} catch (IOException ie) {
					}
				}
			}
		});

		// 메뉴에서 닫기를 클릭했을때 이벤트 처리
		closeI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // 창을 닫고
				System.exit(0); // 종료한다
			}
		});
		

		// 메뉴에서 정보를 클릭했을때 이벤트 처리
		infoI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 정보를 보여주는 다이얼로그를 띄운다
				JOptionPane.showMessageDialog(pane, "MemoNote 2009/12 Kim & Park");
			}
		});
		
		//입력 눌렀을 때
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] arr = new String[3];
				arr[0] = txt1.getText();
				arr[1] = txt2.getText();
				arr[2] = txt3.getText();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(arr);
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
			}
			
		});
		
		
		
		//출력 눌렀을 때 
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableModel model = table.getModel();
				int rowNum = model.getRowCount(); //테이블 행수
				int colNum = model.getColumnCount(); //테이블 컬럼 수
				String tableText = "";
				//컬럼 제목 출력 : 콘솔 출력만 함
				for(int col=0; col< colNum; col++) {
					String colName = model.getColumnName(col);
					System.out.print(colName+ "\t");
				}
				System.out.println();
				
				for(int row=0; row<rowNum; row++) {
					for(int col=0; col < colNum; col++) {
						Object value = model.getValueAt(row, col);
						//표에 기록된 데이터를 한 행씩 저장: 해당 행의 컬럼 데이터를 하나씩 받아서 tableData에 붙여줌 
						tableText += value+"\t";
						//콘솔 출력
						System.out.print(value+"\t");
					}
					//행 데이터를 JTextArea에 붙여 넣고 줄 바꾸기 
					text.append(tableText+"\n");
					//다음 행의 데이터를 받기 위해서 저장된 데이터를 지워줌
					tableText = "";
					System.out.println();
				}
			}
		});
		
		text = new JTextArea();
		//자동 줄바꿈 설정: 창 크기보다 문자열의 길이가 길 경우 자동으로 줄 바꿈.
		text.setLineWrap(true);
		  // 화면에 보여질 text들의 상태에 따른 색상 지정  
		  text.setCaretColor(Color.black);   
		  text.setSelectedTextColor(Color.white);  
		  text.setSelectionColor(Color.blue);  
		  text.setBackground(Color.yellow);  
		  JScrollPane jsp = new JScrollPane(text);
		  jsp.setPreferredSize(new Dimension(480,300));
		pane.add(jsp, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		Note note = new Note(); // 객체생성
		note.setSize(500, 800); // 사이즈 지정
		note.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		note.setVisible(true); // 화면에 보이게 함
	}
}
