package sub3;


import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	public class CalculatorApp extends JFrame {

	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField lbResult;
	    private double firstNumber;
	    private String operator;
	    private boolean startNewNumber;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    CalculatorApp frame = new CalculatorApp();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }

	    public CalculatorApp() {
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

	        JButton but7 = new JButton("7");
	        but7.addActionListener(new ButtonClickListener());
	        but7.setBounds(12, 110, 66, 63);
	        contentPane.add(but7);

	        JButton but8 = new JButton("8");
	        but8.addActionListener(new ButtonClickListener());
	        but8.setBounds(90, 110, 66, 63);
	        contentPane.add(but8);

	        JButton but9 = new JButton("9");
	        but9.addActionListener(new ButtonClickListener());
	        but9.setBounds(168, 110, 66, 63);
	        contentPane.add(but9);

	        JButton butN = new JButton("/");
	        butN.addActionListener(new ButtonClickListener());
	        butN.setBounds(246, 110, 66, 63);
	        contentPane.add(butN);

	        JButton but4 = new JButton("4");
	        but4.addActionListener(new ButtonClickListener());
	        but4.setBounds(12, 183, 66, 63);
	        contentPane.add(but4);

	        JButton but5 = new JButton("5");
	        but5.addActionListener(new ButtonClickListener());
	        but5.setBounds(90, 183, 66, 63);
	        contentPane.add(but5);

	        JButton but6 = new JButton("6");
	        but6.addActionListener(new ButtonClickListener());
	        but6.setBounds(168, 183, 66, 63);
	        contentPane.add(but6);

	        JButton butW = new JButton("*");
	        butW.addActionListener(new ButtonClickListener());
	        butW.setBounds(246, 183, 66, 63);
	        contentPane.add(butW);

	        JButton but1 = new JButton("1");
	        but1.addActionListener(new ButtonClickListener());
	        but1.setBounds(12, 256, 66, 63);
	        contentPane.add(but1);

	        JButton but2 = new JButton("2");
	        but2.addActionListener(new ButtonClickListener());
	        but2.setBounds(90, 256, 66, 63);
	        contentPane.add(but2);

	        JButton but3 = new JButton("3");
	        but3.addActionListener(new ButtonClickListener());
	        but3.setBounds(168, 256, 66, 63);
	        contentPane.add(but3);

	        JButton butM = new JButton("-");
	        butM.addActionListener(new ButtonClickListener());
	        butM.setBounds(246, 256, 66, 63);
	        contentPane.add(butM);

	        JButton butC = new JButton("C");
	        butC.addActionListener(new ButtonClickListener());
	        butC.setBounds(12, 329, 66, 63);
	        contentPane.add(butC);

	        JButton but0 = new JButton("0");
	        but0.addActionListener(new ButtonClickListener());
	        but0.setBounds(90, 329, 66, 63);
	        contentPane.add(but0);

	        JButton butI = new JButton("=");
	        butI.addActionListener(new ButtonClickListener());
	        butI.setBounds(168, 329, 66, 63);
	        contentPane.add(butI);

	        JButton butP = new JButton("+");
	        butP.addActionListener(new ButtonClickListener());
	        butP.setBounds(246, 329, 66, 63);
	        contentPane.add(butP);

	        firstNumber = 0;
	        operator = "=";
	        startNewNumber = true;
	    }

	    private class ButtonClickListener implements ActionListener {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();

	            if ('0' <= command.charAt(0) && command.charAt(0) <= '9') {
	                if (startNewNumber) {
	                    lbResult.setText(command);
	                    startNewNumber = false;
	                } else {
	                    lbResult.setText(lbResult.getText() + command);
	                }
	            } else if (command.equals(".")) {
	                if (startNewNumber) {
	                    lbResult.setText("0" + command);
	                    startNewNumber = false;
	                } else if (!lbResult.getText().contains(".")) {
	                    lbResult.setText(lbResult.getText() + command);
	                }
	            } else if (command.equals("=")) {
	                double secondNumber = Double.parseDouble(lbResult.getText());
	                switch (operator) {
	                    case "+":
	                        firstNumber += secondNumber;
	                        break;
	                    case "-":
	                        firstNumber -= secondNumber;
	                        break;
	                    case "*":
	                        firstNumber *= secondNumber;
	                        break;
	                    case "/":
	                        firstNumber /= secondNumber;
	                        break;
	                    default:
	                        firstNumber = secondNumber;
	                        break;
	                }
	                lbResult.setText(String.valueOf(firstNumber));
	                startNewNumber = true;
	            } else {
	                operator = command;
	                firstNumber = Double.parseDouble(lbResult.getText());
	                startNewNumber = true;
	            }
	        }
	    }
	}


