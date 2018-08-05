package LoginPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSystem {

	JFrame LSystem;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.LSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the LSystem.
	 */
	private void initialize(){
		LSystem = new JFrame();
		LSystem.setBounds(200, 200, 500, 300);
		LSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LSystem.getContentPane().setLayout(null);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(44, 163, 77, 16);
		LSystem.getContentPane().add(lblPassword);

		JLabel lblUserName = new JLabel("UserName:");
		lblUserName.setBounds(44, 85, 77, 16);
		LSystem.getContentPane().add(lblUserName);

		JLabel lblLogIn = new JLabel("   Login Page");
		lblLogIn.setBounds(200, 20, 138, 16);
		LSystem.getContentPane().add(lblLogIn);

		txtUsername = new JTextField();
		txtUsername.setBounds(158, 80, 317, 26);
		LSystem.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(158, 158, 317, 26);
		LSystem.getContentPane().add(txtPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("king") && username.contains("one")){				
					txtUsername.setText(null);
					txtPassword.setText(null);	
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Wrong username or password, please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);	
				}
			}
		});
		btnLogin.setBounds(44, 231, 117, 29);
		LSystem.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Create New Account");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LSystem.setVisible(false);
				CreateAccount ca = new CreateAccount();
				ca.CAccount.setVisible(true);	
			}
		});
		btnReset.setBounds(184, 231, 154, 29);
		LSystem.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frmloginSystem = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmloginSystem, "Confirm if you want exit", "Login Page",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);{
					System.exit(0);
				}
				
			}
		});
		btnExit.setBounds(346, 231, 136, 29);
		LSystem.getContentPane().add(btnExit);
	}
}
