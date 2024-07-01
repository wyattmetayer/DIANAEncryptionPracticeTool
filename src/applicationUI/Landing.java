package applicationUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Landing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtIn_UserName;
	private JTextField txtIn_;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Landing frame = new Landing();
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
	public Landing() {
		setBackground(new Color(128, 128, 64));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 594);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnWelcomeToThe = new JTextPane();
		txtpnWelcomeToThe.setEditable(false);
		txtpnWelcomeToThe.setBackground(new Color(128, 128, 128));
		txtpnWelcomeToThe.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		txtpnWelcomeToThe.setText("Welcome to the DIANA Cryptographic Trainer");
		txtpnWelcomeToThe.setBounds(218, 153, 259, 54);
		contentPane.add(txtpnWelcomeToThe);
		
		JTextPane txtpnYourComprehensiveResource = new JTextPane();
		txtpnYourComprehensiveResource.setBackground(new Color(128, 128, 128));
		txtpnYourComprehensiveResource.setText("Your comprehensive resource for trigraphic encryption training, practice, and creation of secure encryption resources. Please sign in or create an account:");
		txtpnYourComprehensiveResource.setBounds(218, 210, 259, 68);
		contentPane.add(txtpnYourComprehensiveResource);
		
		JRadioButton rdbtn_LogIn = new JRadioButton("Log In");
		buttonGroup.add(rdbtn_LogIn);
		rdbtn_LogIn.setBackground(new Color(128, 128, 128));
		rdbtn_LogIn.setBounds(218, 285, 109, 23);
		contentPane.add(rdbtn_LogIn);
		
		JRadioButton rdbtn_CreateAccount = new JRadioButton("Create Account");
		buttonGroup.add(rdbtn_CreateAccount);
		rdbtn_CreateAccount.setBackground(new Color(128, 128, 128));
		rdbtn_CreateAccount.setBounds(346, 285, 109, 23);
		contentPane.add(rdbtn_CreateAccount);
		
		txtIn_UserName = new JTextField();
		txtIn_UserName.setBounds(330, 315, 125, 20);
		contentPane.add(txtIn_UserName);
		txtIn_UserName.setColumns(10);
		
		txtIn_ = new JTextField();
		txtIn_.setColumns(10);
		txtIn_.setBounds(330, 346, 125, 20);
		contentPane.add(txtIn_);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(330, 377, 125, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Enter Username");
		lblNewLabel.setBounds(219, 321, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(218, 352, 77, 14);
		contentPane.add(lblEnterPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-Enter Password");
		lblReenterPassword.setBounds(219, 383, 108, 14);
		contentPane.add(lblReenterPassword);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(290, 408, 89, 23);
		contentPane.add(btnNewButton);
	}
}
