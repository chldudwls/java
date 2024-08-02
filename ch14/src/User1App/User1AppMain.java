package User1App;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import User1.User1DAO;
import User1.User1VO;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class User1AppMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtAge;
	private JTextField txtName;
	private JTextField txtbirth;
	private JTextField textHp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User1AppMain frame = new User1AppMain();
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
	public User1AppMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 549);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelList = new JPanel();
		contentPane.add(panelList, "panel");
		panelList.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("user1목록");
		panelList.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		panelList.add(scrollPane, BorderLayout.EAST);
		
		//컬럼 설정
		String[] columNames= {"아이디", "이름", "생년월일", "휴대폰", "나이"};
		DefaultTableModel model = new DefaultTableModel(columNames, 0);
		model.setRowCount(0);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panelList.add(panel, BorderLayout.SOUTH);
		
		JButton btnRegister = new JButton("등록");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnRegister);
		
		JPanel registerPanel = new JPanel();
		contentPane.add(registerPanel, "p");
		registerPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("user1등록");
		lblNewLabel_1.setBounds(10, 10, 57, 15);
		registerPanel.add(lblNewLabel_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(49, 61, 116, 21);
		registerPanel.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(0, 61, 67, 21);
		registerPanel.add(lblNewLabel_2);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(49, 159, 116, 21);
		registerPanel.add(txtAge);
		
		JLabel lblNewLabel_2_1 = new JLabel("나이");
		lblNewLabel_2_1.setBounds(0, 159, 67, 21);
		registerPanel.add(lblNewLabel_2_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(49, 86, 116, 21);
		registerPanel.add(txtName);
		
		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setBounds(0, 86, 67, 21);
		registerPanel.add(lblNewLabel_2_2);
		
		txtbirth = new JTextField();
		txtbirth.setColumns(10);
		txtbirth.setBounds(49, 111, 116, 21);
		registerPanel.add(txtbirth);
		
		JLabel lblNewLabel_2_3 = new JLabel("생년월일");
		lblNewLabel_2_3.setBounds(0, 111, 67, 21);
		registerPanel.add(lblNewLabel_2_3);
		
		textHp = new JTextField();
		textHp.setColumns(10);
		textHp.setBounds(49, 135, 116, 21);
		registerPanel.add(textHp);
		
		JLabel lblNewLabel_2_4 = new JLabel("휴대폰");
		lblNewLabel_2_4.setBounds(0, 135, 67, 21);
		registerPanel.add(lblNewLabel_2_4);
		
		JButton btninsert = new JButton("등록하기");
		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btninsert.setBounds(89, 190, 93, 23);
		registerPanel.add(btninsert);
		
		JButton btnList = new JButton("목록");
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout)contentPane.getLayout();
				cardLayout.show(getContentPane(), "panel_1");
				
				
			}
		});
		btnList.setBounds(12, 190, 71, 23);
		registerPanel.add(btnList);
		
		
		//데이터 풀력
		User1DAO dao = User1DAO.getInstance();
		List<User1VO> users = dao.selectUsers();
		
		for(User1VO user : users) {
			Object[] rowData = {user.getUid(),user.getName(),user.getBirth(),user.getHp(),user.getAge()};
			model.addRow(rowData);
		}
	}
}
