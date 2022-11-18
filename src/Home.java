import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 204));
		menuBar.setBackground(new Color(153, 153, 153));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Donor");
		mnNewMenu.setForeground(new Color(255, 255, 204));
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Donor.png"));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Add new Donors");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AddNewDonors().setVisible(true);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Add new.png"));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Update New Details");
		mntmNewMenuItem_1.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Update details.png"));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_2.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Details.png"));
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenu mnSearchNewDonor = new JMenu("Search New Donor");
		mnSearchNewDonor.setForeground(new Color(255, 255, 204));
		mnSearchNewDonor.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\search user.png"));
		menuBar.add(mnSearchNewDonor);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Location");
		mntmNewMenuItem_3.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Location.png"));
		mnSearchNewDonor.add(mntmNewMenuItem_3);
		
		JSeparator separator_3 = new JSeparator();
		mnSearchNewDonor.add(separator_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Blood Group");
		mntmNewMenuItem_4.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Blood group.png"));
		mnSearchNewDonor.add(mntmNewMenuItem_4);
		
		JSeparator separator_4 = new JSeparator();
		mnSearchNewDonor.add(separator_4);
		
		JMenu mnNewMenu_1_1 = new JMenu("Stock");
		mnNewMenu_1_1.setForeground(new Color(255, 255, 204));
		mnNewMenu_1_1.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\stock.png"));
		menuBar.add(mnNewMenu_1_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Increase");
		mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Inc.png"));
		mnNewMenu_1_1.add(mntmNewMenuItem_5);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1_1.add(separator_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Decrease");
		mntmNewMenuItem_6.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Dec.png"));
		mnNewMenu_1_1.add(mntmNewMenuItem_6);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_1_1.add(separator_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Details");
		mntmNewMenuItem_7.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Details.png"));
		mnNewMenu_1_1.add(mntmNewMenuItem_7);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_1_1.add(separator_7);
		
		JMenu mnDeleteDonor = new JMenu("Delete Donor");
		mnDeleteDonor.setForeground(new Color(255, 255, 204));
		mnDeleteDonor.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\delete donor.png"));
		menuBar.add(mnDeleteDonor);
		
		JMenuItem mntmDeleteDonor = new JMenuItem("Delete Donor");
		mntmDeleteDonor.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\delete.png"));
		mnDeleteDonor.add(mntmDeleteDonor);
		
		JSeparator separator_8 = new JSeparator();
		mnDeleteDonor.add(separator_8);
		
		JMenu mnNewMenu_2_1 = new JMenu("Exit");
		mnNewMenu_2_1.setForeground(new Color(255, 255, 204));
		mnNewMenu_2_1.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\exit.png"));
		menuBar.add(mnNewMenu_2_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Logout");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        // TODO add your handling code here:
		        int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Logout?","Select",JOptionPane.YES_NO_OPTION);
		        if(a == 0)
		        {
		            setVisible(false);
		            new Login().setVisible(true);		            
		        }
		        
			}
		});
		mntmNewMenuItem_8.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Logout.png"));
		mnNewMenu_2_1.add(mntmNewMenuItem_8);
		
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Exit Application");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			 int b = JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit Application?","Select",JOptionPane.YES_NO_OPTION);
		        if(b == 0)
		        {
		            System.exit(0);
		        }
			
			}
		});


		mntmNewMenuItem_9.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Exit application.png"));
		mnNewMenu_2_1.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
