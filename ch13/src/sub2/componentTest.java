package sub2;

import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class componentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtP1;
	private JTextField txtP2;
	private JTextField lbP;
	private JTextField txtM1;
	private JTextField txtM2;
	private JTextField lbM;
	private JTextField txtC1;
	private JTextField txtC2;
	private JTextField lbC;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField lbN;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					componentTest frame = new componentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public componentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 909);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 45, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("확인1 버튼 클릭...");
				
			}
		});
		btn1.setBounds(-9, 70, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, 1);
						
				
			}
		});
		btn2.setBounds(100, 70, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES클릭");
					
				}else {
					System.out.println("NO클릭");
				}
			}
		});
		btn3.setBounds(209, 70, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 103, 92, 15);
		contentPane.add(lblNewLabel_1_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(51, 125, 129, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel label = new JLabel("New label");
		label.setBounds(-23, 178, 14, 23);
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 128, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(261, 128, 106, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(183, 124, 74, 23);
		contentPane.add(btnUid);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 157, 57, 15);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(261, 157, 106, 15);
		contentPane.add(lbResultName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(51, 154, 129, 21);
		contentPane.add(txtName);
		
		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 186, 57, 15);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = txtName.getText();
				lbResultName.setText("결과 : " + Name);
				
			}
		});
		btnName.setBounds(183, 153, 74, 23);
		contentPane.add(btnName);
		
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(261, 186, 106, 15);
		contentPane.add(lbResultHp);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(51, 183, 129, 21);
		contentPane.add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Hp = txtHp.getText();
				lbResultHp.setText("결과 : " + Hp);
			}
		});
		btnHp.setBounds(183, 182, 74, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_3 = new JLabel("덧샘");
		lblNewLabel_3.setBounds(12, 218, 57, 15);
		contentPane.add(lblNewLabel_3);
		
		txtP1 = new JTextField();
		txtP1.setBounds(46, 215, 58, 21);
		contentPane.add(txtP1);
		txtP1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(89, 218, 57, 15);
		contentPane.add(lblNewLabel_4);
		
		txtP2 = new JTextField();
		txtP2.setBounds(134, 215, 63, 21);
		contentPane.add(txtP2);
		txtP2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("=");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(183, 215, 57, 15);
		contentPane.add(lblNewLabel_5);
		
		lbP = new JTextField();
		lbP.setBounds(224, 215, 63, 21);
		contentPane.add(lbP);
		lbP.setColumns(10);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Name = txtName.getText();
				//lbResultName.setText("결과 : " + Name);
				String strP1 = txtP1.getText();
				String strP2 = txtP2.getText();
				
				int P1 = Integer.parseInt(strP1);
				int P2 = Integer.parseInt(strP2);
				int num = P1 + P2;
				
				
				
				
				lbP.setText(""+num);
				
				
				
			
			}
		});
		btnNewButton.setBounds(299, 213, 97, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("뺄샘");
		
		lblNewLabel_3_1.setBounds(12, 247, 57, 15);
		contentPane.add(lblNewLabel_3_1);
		
		txtM1 = new JTextField();
		txtM1.setColumns(10);
		txtM1.setBounds(46, 244, 58, 21);
		contentPane.add(txtM1);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(89, 247, 57, 15);
		contentPane.add(lblNewLabel_4_1);
		
		txtM2 = new JTextField();
		txtM2.setColumns(10);
		txtM2.setBounds(134, 244, 63, 21);
		contentPane.add(txtM2);
		
		JLabel lblNewLabel_5_1 = new JLabel("=");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(183, 244, 57, 15);
		contentPane.add(lblNewLabel_5_1);
		
		lbM = new JTextField();
		lbM.setColumns(10);
		lbM.setBounds(224, 244, 63, 21);
		contentPane.add(lbM);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strM1 = txtM1.getText();
				String strM2 = txtM2.getText();
				
				int M1 = Integer.parseInt(strM1);
				int M2 = Integer.parseInt(strM2);
				int num = M1 - M2;
				
				lbM.setText(""+num);
						
			}
		});
		
		btnNewButton_1.setBounds(299, 242, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("곱샘");
		lblNewLabel_3_2.setBounds(12, 281, 57, 15);
		contentPane.add(lblNewLabel_3_2);
		
		txtC1 = new JTextField();
		txtC1.setColumns(10);
		txtC1.setBounds(46, 278, 58, 21);
		contentPane.add(txtC1);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(89, 281, 57, 15);
		contentPane.add(lblNewLabel_4_2);
		
		txtC2 = new JTextField();
		txtC2.setColumns(10);
		txtC2.setBounds(134, 278, 63, 21);
		contentPane.add(txtC2);
		
		JLabel lblNewLabel_5_2 = new JLabel("=");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setBounds(183, 278, 57, 15);
		contentPane.add(lblNewLabel_5_2);
		
		lbC = new JTextField();
		lbC.setColumns(10);
		lbC.setBounds(224, 278, 63, 21);
		contentPane.add(lbC);
		
		JButton btnNewButton_2 = new JButton("확인");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strC1 = txtC1.getText();
				String strC2 = txtC2.getText();
				
				int C1 = Integer.parseInt(strC1);
				int C2 = Integer.parseInt(strC2);
				int num = C1 * C2;
				
				lbC.setText(""+num);
			}
		});
		btnNewButton_2.setBounds(299, 276, 97, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("나눗샘");
		lblNewLabel_3_3.setBounds(12, 313, 57, 15);
		contentPane.add(lblNewLabel_3_3);
		
		txtN1 = new JTextField();
		txtN1.setColumns(10);
		txtN1.setBounds(46, 310, 58, 21);
		contentPane.add(txtN1);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(89, 313, 57, 15);
		contentPane.add(lblNewLabel_4_3);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(134, 310, 63, 21);
		contentPane.add(txtN2);
		
		JLabel lblNewLabel_5_3 = new JLabel("=");
		lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_3.setBounds(183, 310, 57, 15);
		contentPane.add(lblNewLabel_5_3);
		
		lbN = new JTextField();
		lbN.setColumns(10);
		lbN.setBounds(224, 310, 63, 21);
		contentPane.add(lbN);
		
		JButton btnNewButton_3 = new JButton("확인");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strN1 = txtN1.getText();
				String strN2 = txtN2.getText();
				
				int C1 = Integer.parseInt(strN1);
				int C2 = Integer.parseInt(strN2);
				int num = C1 / C2;
				
				lbN.setText(""+num);
			}
		});
		btnNewButton_3.setBounds(299, 308, 97, 23);
		contentPane.add(btnNewButton_3);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(8, 375, 57, 23);
		contentPane.add(chk1);
		
		JLabel lblNewLabel_6 = new JLabel("체크박스 실습");
		lblNewLabel_6.setBounds(12, 354, 76, 15);
		contentPane.add(lblNewLabel_6);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(65, 375, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(126, 375, 58, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(183, 375, 58, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(245, 375, 58, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 :");
		lbResultCheck.setBounds(12, 404, 384, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<>();
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbResultCheck.setText("결과 : " + cities);
			}
		});
		btnCheck.setBounds(299, 375, 97, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_7 = new JLabel("테이블 실습");
		lblNewLabel_7.setBounds(12, 451, 92, 15);
		contentPane.add(lblNewLabel_7);
		
		table = new JTable();
		table.setBounds(12, 496, 294, 179);
		contentPane.add(table);
		
		
	//테이블 설정
		
		String[] columnName = {"아이디", "이름", "나이", "휴대폰"};
		
		DefaultTableModel model = new DefaultTableModel(columnName,0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신",23,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",24,"010-1234-1002"));
				persons.add(new Person("a103","장보고",25,"010-1234-1003"));
				persons.add(new Person("a104","강감찬",26,"010-1234-1004"));
				persons.add(new Person("a105","이순신",27,"010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(12, 685, 97, 23);
		contentPane.add(btnTable);
		
		
		
		
		
		
	}
}
