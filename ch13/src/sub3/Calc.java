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