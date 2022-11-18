import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class AddNewDonors extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewDonors frame = new AddNewDonors();
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
	public AddNewDonors() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(0, 0, 1000, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blood Management System");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 60));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1000, 80);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ADD NEW DONOR");
		lblNewLabel_1.setFont(new Font("Cambria Math", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 90, 1000, 50);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(5, 145, 990, 5);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("New Donor ID");
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(39, 190, 140, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Full Name");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(39, 230, 140, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Father Name");
		lblNewLabel_4.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(39, 270, 140, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mother Name");
		lblNewLabel_5.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(39, 310, 140, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(39, 350, 140, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Mobile Number");
		lblNewLabel_2_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(39, 390, 140, 24);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gender");
		lblNewLabel_2_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(39, 430, 140, 24);
		contentPane.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField.setBounds(201, 230, 218, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_1.setColumns(10);
		textField_1.setBounds(201, 272, 218, 24);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_2.setColumns(10);
		textField_2.setBounds(201, 312, 218, 24);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_3.setColumns(10);
		textField_3.setBounds(201, 390, 218, 24);
		contentPane.add(textField_3);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(201, 430, 218, 24);
		contentPane.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new EmptyBorder(0, 0, 0, 0));
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(201, 350, 218, 24);
		contentPane.add(dateChooser);
		
		textField_4 = new JTextField();
		textField_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_4.setBounds(670, 230, 240, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_6.setColumns(10);
		textField_6.setBounds(670, 310, 240, 24);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(470, 230, 140, 24);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Blood Group");
		lblNewLabel_8_1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_8_1.setBounds(470, 275, 140, 24);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("City");
		lblNewLabel_8_2.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_8_2.setBounds(470, 315, 140, 24);
		contentPane.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Complete Address");
		lblNewLabel_8_3.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		lblNewLabel_8_3.setBounds(470, 355, 166, 24);
		contentPane.add(lblNewLabel_8_3);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(670, 355, 240, 59);
		contentPane.add(textArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"}));
		comboBox_1.setBounds(670, 270, 240, 23);
		contentPane.add(comboBox_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(5, 475, 990, 5);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFocusable(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\save.png"));
		btnNewButton.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 204));
		btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.setBounds(250, 513, 105, 35);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFocusable(false);
		btnReset.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Update details.png"));
		btnReset.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnReset.setForeground(new Color(255, 255, 204));
		btnReset.setBackground(new Color(153, 153, 153));
		btnReset.setBounds(438, 513, 125, 35);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFocusable(false);
		btnClose.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Exit application.png"));
		btnClose.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		btnClose.setForeground(new Color(255, 255, 204));
		btnClose.setBackground(new Color(153, 153, 153));
		btnClose.setBounds(646, 513, 105, 35);
		contentPane.add(btnClose);
	}
}
