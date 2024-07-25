package sub1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class test {



	public class CounterApp {
	    private int count = 0;


	    public CounterApp() {
	        // JFrame 설정
	        JFrame frame = new JFrame("Counter");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);
	        frame.setLayout(null);

	        // JLabel 설정
	        JLabel label = new JLabel("Count: 0");
	        label.setBounds(100, 50, 100, 30);
	        frame.add(label);

	        // JButton 설정
	        JButton button = new JButton("Increase");
	        button.setBounds(100, 100, 100, 30);
	        frame.add(button);

	        // 버튼에 ActionListener 추가
	        button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			};() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                count++;
	                label.setText("Count: " + count);
	            }
	        });

	        // JFrame을 보이도록 설정
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        // 이벤트 스레드에서 GUI 생성
	        SwingConstants.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new CounterApp();
	            }
	        });
	    }
	}
