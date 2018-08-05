package LoginPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount {

	JFrame CAccount;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
					window.CAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the CAccount.
	 */
	private void initialize() {
		CAccount = new JFrame();
		CAccount.setBounds(200, 200, 500, 300);
		CAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CAccount.getContentPane().setLayout(null);
		
		JLabel lblCreateAccount = new JLabel("Create Account");
		lblCreateAccount.setBounds(208, 6, 120, 16);
		CAccount.getContentPane().add(lblCreateAccount);
		
		JLabel txtMakeUsername = new JLabel("Make Username:");
		txtMakeUsername.setBounds(59, 80, 111, 16);
		CAccount.getContentPane().add(txtMakeUsername);
		
		JLabel txtMakePassword = new JLabel("Make Password:");
		txtMakePassword.setBounds(59, 167, 111, 16);
		CAccount.getContentPane().add(txtMakePassword);
		
		textField = new JTextField();
		textField.setBounds(208, 75, 224, 26);
		CAccount.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 162, 224, 26);
		CAccount.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCreateAccount = new JButton("Save Info");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCreateAccount.setBounds(53, 226, 120, 29);
		CAccount.getContentPane().add(btnCreateAccount);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frmloginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmloginSystem, "Confirm if you want exit", "Account Making System",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(362, 226, 120, 29);
		CAccount.getContentPane().add(btnExit);
		
		JButton btnLoginPage = new JButton("Login Page");
		btnLoginPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CAccount.setVisible(false);
				LoginSystem ls = new LoginSystem();
				ls.LSystem.setVisible(true);
			}
		});
		btnLoginPage.setBounds(211, 226, 117, 29);
		CAccount.getContentPane().add(btnLoginPage);
	}

}
