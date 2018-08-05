package LoginPage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_Create {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log_Create window = new Log_Create();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Log_Create() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCreateNewAccount = new JButton("Create New Account");
		btnCreateNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				CreateAccount ca = new CreateAccount();
				ca.CAccount.setVisible(true);
			}
		});
		btnCreateNewAccount.setBounds(116, 39, 199, 29);
		frame.getContentPane().add(btnCreateNewAccount);
		
		JButton btnGoToLogin = new JButton("Go to Login Page");
		btnGoToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LoginSystem ls = new LoginSystem();
				ls.LSystem.setVisible(true);
			}
		});
		btnGoToLogin.setBounds(116, 148, 199, 29);
		frame.getContentPane().add(btnGoToLogin);
	}

}
