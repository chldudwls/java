package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SecondaryLoop;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;



public class calcapp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lbResult;
	private JButton but8;
	private JButton but9;
	private JButton butN;
	private JButton but4;
	private JButton but5;
	private JButton but6;
	private JButton butW;
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton butM;
	private JButton butC;
	private JButton but0;
	private JButton butI;
	private JButton butP;
	private String operator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcapp frame = new calcapp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	List<Integer> ms = new ArrayList<>();
	
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	
	public calcapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbResult = new JTextField();
		lbResult.setEditable(false);
		lbResult.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lbResult.setHorizontalAlignment(SwingConstants.RIGHT);
		lbResult.setText("0");
		lbResult.setBounds(12, 10, 300, 78);
		contentPane.add(lbResult);
		lbResult.setColumns(10);
		
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b7 =but7.getText();
				lbResult.setText(b7);
				
				int B7 = Integer.parseInt(b7);
				ms.set(B7, ms.get(B7+EXIT_ON_CLOSE));
			}
		});
		but7.setBounds(12, 110, 66, 63);
		contentPane.add(but7);
		
		but8 = new JButton("8");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b8 =but8.getText();
				lbResult.setText(b8);
				
				int B8 = Integer.parseInt(b8);
				
			}
		});
		but8.setBounds(90, 110, 66, 63);
		contentPane.add(but8);
		
		but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b9 =but9.getText();
				lbResult.setText(b9);
				
				int B9 = Integer.parseInt(b9);
			}
		});
		but9.setBounds(168, 110, 66, 63);
		contentPane.add(but9);
		
		butN = new JButton("/");
		butN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bN =butN.getText();
				lbResult.setText(bN);
				
				int BN = Integer.parseInt(bN);
			}
		});
		butN.setBounds(246, 110, 66, 63);
		contentPane.add(butN);
		
		but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b4 =but4.getText();
				lbResult.setText(b4);
				
				int B4 = Integer.parseInt(b4);
			}
		});
		but4.setBounds(12, 183, 66, 63);
		contentPane.add(but4);
		
		but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b5 =but5.getText();
				lbResult.setText(b5);
				
				int B5 = Integer.parseInt(b5);
			}
		});
		but5.setBounds(90, 183, 66, 63);
		contentPane.add(but5);
		
		but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b6 =but6.getText();
				lbResult.setText(b6);
				
				int B6 = Integer.parseInt(b6);
			}
		});
		but6.setBounds(168, 183, 66, 63);
		contentPane.add(but6);
		
		butW = new JButton("*");
		butW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bW =butW.getText();
				lbResult.setText(bW);
				
				int BW = Integer.parseInt(bW);
			}
		});
		butW.setBounds(246, 183, 66, 63);
		contentPane.add(butW);
		
		but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Name = txtName.getText();
				//lbResultName.setText("결과 : " + Name);
				String b1 =but1.getText();
				lbResult.setText(b1);
				
				int B1 = Integer.parseInt(b1);
				int num = B1 + B1;
				lbResult.setText(""+num);
			}
		});
		but1.setBounds(12, 256, 66, 63);
		contentPane.add(but1);
		
		but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b2 =but2.getText();
				lbResult.setText(b2);
				
				int B2 = Integer.parseInt(b2);
			}
		});
		but2.setBounds(90, 256, 66, 63);
		contentPane.add(but2);
		
		but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b3 =but3.getText();
				lbResult.setText(b3);
				
				int B3 = Integer.parseInt(b3);
			}
		});
		but3.setBounds(168, 256, 66, 63);
		contentPane.add(but3);
		
		butM = new JButton("-");
		butM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bM =butM.getText();
				lbResult.setText(bM);
				
				int BM = Integer.parseInt(bM);
			}
		});
		butM.setBounds(246, 256, 66, 63);
		contentPane.add(butM);
		
		butC = new JButton("C");
		butC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bC =butC.getText();
				lbResult.setText(bC);
				
				
			}
		});
		butC.setBounds(12, 329, 66, 63);
		contentPane.add(butC);
		
		but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b0 =but0.getText();
				lbResult.setText(b0);
				
				int B0 = Integer.parseInt(b0);
			}
		});
		but0.setBounds(90, 329, 66, 63);
		contentPane.add(but0);
		
		butI = new JButton("=");
		butI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bI =butI.getText();
				lbResult.setText(bI);
				
			
				
				
				
			}
		});
		butI.setBounds(168, 329, 66, 63);
		contentPane.add(butI);
		
		butP = new JButton("+");
		butP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bP =butP.getText();
				lbResult.setText(bP);
				
					
			}
		});
		butP.setBounds(246, 329, 66, 63);
		contentPane.add(butP);
		
		
		
	
		
	
	}

}

