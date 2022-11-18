import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.ComponentOrientation;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(346, 274, 119, 34);
		lblNewLabel.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(346, 340, 115, 34);
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.PLAIN, 25));
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Username");
		txtUsername.setBounds(491, 271, 222, 40);
		txtUsername.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtUsername.setBackground(new Color(255, 255, 255));
		txtUsername.setFont(new Font("Monospaced", Font.PLAIN, 20));
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setSelectionColor(new Color(102, 204, 255));
		txtPassword.setToolTipText("Password");
		txtPassword.setBounds(491, 337, 222, 40);
		txtPassword.setBorder(new EmptyBorder(0, 0, 0, 0));
		txtPassword.setBackground(new Color(255, 255, 255));
		txtPassword.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 204));
		btnLogin.setBounds(491, 457, 102, 34);
		btnLogin.setFocusable(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = "Login";
				String password = "123456";
				
				if(txtUsername.getText().equals(username)&&txtPassword.getText().equals(password)) {
					new Home().setVisible(true);						
					setVisible(false);
				}else {
					txtUsername.setText("");
					txtPassword.setText("");
		            JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error!!!", JOptionPane.ERROR_MESSAGE );
				}
				
				
			}
		});
		btnLogin.setBackground(new Color(153, 153, 153));
		btnLogin.setBorder(null);
		btnLogin.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\login.png"));
		btnLogin.setFont(new Font("Cambria", Font.PLAIN, 20));
		
		JButton btnClose = new JButton("Close");
		btnClose.setForeground(new Color(255, 255, 204));
		btnClose.setBounds(611, 457, 102, 33);
		btnClose.setMinimumSize(new Dimension(60, 30));
		btnClose.setMaximumSize(new Dimension(60, 30));
		btnClose.setFocusable(false);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do You Want to Exit Application?", "Exit Application", JOptionPane.WARNING_MESSAGE);
				if(a == 0) {
					System.exit(0);	
				}

			}
		});
		btnClose.setBackground(new Color(153, 153, 153));
		btnClose.setBorder(null);
		btnClose.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Exit application.png"));
		btnClose.setFont(new Font("Cambria", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 2, 1000, 82);
		panel.setBackground(new Color(153, 153, 153));
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Blood Management System");
		lblNewLabel_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
		lblNewLabel_2.setBounds(0, 1, 1000, 80);
		panel.add(lblNewLabel_2);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel);
		contentPane.add(btnLogin);
		contentPane.add(btnClose);
		contentPane.add(txtUsername);
		contentPane.add(txtPassword);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(1, 90, 1000, 50);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		separator.setBounds(5, 145, 990, 5);
		contentPane.add(separator);
	}
}
