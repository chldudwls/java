package sub3;



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField lbResult;

    // 변수 추가
    private double firstNumber;
    private String operator;
    private boolean startNewNumber;

    /**
     * Launch the application.
     */
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

    /**
     * Create the frame.
     */
    public Calc() {
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
        
        // 숫자 버튼들
        addButton("7", 12, 110, 66, 63);
        addButton("8", 90, 110, 66, 63);
        addButton("9", 168, 110, 66, 63);
        addButton("/", 246, 110, 66, 63);
        
        addButton("4", 12, 183, 66, 63);
        addButton("5", 90, 183, 66, 63);
        addButton("6", 168, 183, 66, 63);
        addButton("*", 246, 183, 66, 63);
        
        addButton("1", 12, 256, 66, 63);
        addButton("2", 90, 256, 66, 63);
        addButton("3", 168, 256, 66, 63);
        addButton("-", 246, 256, 66, 63);
        
        addButton("C", 12, 329, 66, 63);
        addButton("0", 90, 329, 66, 63);
        addButton("=", 168, 329, 66, 63);
        addButton("+", 246, 329, 66, 63);
        
        // 초기화
        firstNumber = 0;
        operator = "";
        startNewNumber = true;
    }
    
    // 버튼 추가 메서드
    private void addButton(String label, int x, int y, int width, int height) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClicked(label);
            }
        });
        button.setBounds(x, y, width, height);
        contentPane.add(button);
        
        JButton button_1 = new JButton("8");
        button_1.setBounds(90, 110, 66, 63);
        contentPane.add(button_1);
        
        JButton button_2 = new JButton("9");
        button_2.setBounds(168, 110, 66, 63);
        contentPane.add(button_2);
        
        JButton button_3 = new JButton("-");
        button_3.setBounds(246, 110, 66, 63);
        contentPane.add(button_3);
        
        JButton button_4 = new JButton("4");
        button_4.setBounds(12, 183, 66, 63);
        contentPane.add(button_4);
        
        JButton button_5 = new JButton("5");
        button_5.setBounds(90, 183, 66, 63);
        contentPane.add(button_5);
        
        JButton button_6 = new JButton("6");
        button_6.setBounds(168, 183, 66, 63);
        contentPane.add(button_6);
        
        JButton button_7 = new JButton("+");
        button_7.setBounds(246, 183, 66, 63);
        contentPane.add(button_7);
        
        JButton button_8 = new JButton("1");
        button_8.setBounds(12, 256, 66, 63);
        contentPane.add(button_8);
        
        JButton button_9 = new JButton("2");
        button_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button_9.setBounds(90, 256, 66, 63);
        contentPane.add(button_9);
        
        JButton button_10 = new JButton("3");
        button_10.setBounds(168, 256, 66, 63);
        contentPane.add(button_10);
        
        JButton button_11 = new JButton("*");
        button_11.setBounds(246, 256, 66, 63);
        contentPane.add(button_11);
        
        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnC.setBounds(12, 328, 66, 63);
        contentPane.add(btnC);
        
        JButton button_13 = new JButton("0");
        button_13.setBounds(90, 328, 66, 63);
        contentPane.add(button_13);
        
        JButton button_14 = new JButton("7");
        button_14.setBounds(168, 329, 66, 63);
        contentPane.add(button_14);
        
        JButton button_15 = new JButton("/");
        button_15.setBounds(246, 329, 66, 63);
        contentPane.add(button_15);
    }
    
    // 버튼 클릭 처리 메서드
    private void buttonClicked(String label) {
        switch (label) {
            case "C":
                lbResult.setText("0");
                firstNumber = 0;
                operator = "";
                startNewNumber = true;
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                operator = label;
                firstNumber = Double.parseDouble(lbResult.getText());
                startNewNumber = true;
                break;
            case "=":
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
                break;
            default:
                if (startNewNumber) {
                    lbResult.setText(label);
                    startNewNumber = false;
                } else {
                    lbResult.setText(lbResult.getText() + label);
                }
                break;
        }
    }
}