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
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
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
		
		JLabel txtpnYourComprehensiveResource = new JLabel();
		txtpnYourComprehensiveResource.setHorizontalAlignment(SwingConstants.CENTER);
		txtpnYourComprehensiveResource.setBackground(new Color(128, 128, 128));
		txtpnYourComprehensiveResource.setText("Select An Activity:");
		txtpnYourComprehensiveResource.setBounds(218, 210, 259, 25);
		contentPane.add(txtpnYourComprehensiveResource);
		
		JToggleButton tglbtn_Encrypt = new JToggleButton("<html>Encrypt a Message</html>");
		tglbtn_Encrypt.setVerticalAlignment(SwingConstants.TOP);
		buttonGroup.add(tglbtn_Encrypt);
		tglbtn_Encrypt.setBounds(152, 246, 85, 35);
		contentPane.add(tglbtn_Encrypt);
		
		JToggleButton tglbtn_Encrypt_1 = new JToggleButton("<html>Encrypt a Message</html>");
		tglbtn_Encrypt_1.setVerticalAlignment(SwingConstants.TOP);
		tglbtn_Encrypt_1.setBounds(243, 246, 85, 35);
		contentPane.add(tglbtn_Encrypt_1);
		
		JButton btnNewButton = new JButton("<html>Add New Practice Message</html>");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBounds(380, 246, 85, 54);
		contentPane.add(btnNewButton);
		
		JButton btngenerateOnetimePad = new JButton("<html>Generate One-Time Pad<html>");
		btngenerateOnetimePad.setVerticalAlignment(SwingConstants.TOP);
		btngenerateOnetimePad.setHorizontalAlignment(SwingConstants.LEFT);
		btngenerateOnetimePad.setBounds(380, 313, 85, 54);
		contentPane.add(btngenerateOnetimePad);
		
		JLabel lblUsing = new JLabel();
		lblUsing.setText("Using:");
		lblUsing.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsing.setBackground(Color.GRAY);
		lblUsing.setBounds(155, 292, 173, 25);
		contentPane.add(lblUsing);
		
		JToggleButton tglbtn_Encrypt_2 = new JToggleButton("<html>The Wheel</html>");
		tglbtn_Encrypt_2.setBounds(152, 332, 85, 35);
		contentPane.add(tglbtn_Encrypt_2);
		
		JToggleButton tglbtn_Encrypt_1_1 = new JToggleButton("<html>The Trigraph</html>");
		tglbtn_Encrypt_1_1.setVerticalAlignment(SwingConstants.TOP);
		tglbtn_Encrypt_1_1.setBounds(243, 332, 85, 35);
		contentPane.add(tglbtn_Encrypt_1_1);
		
		JButton btnNewButton_1 = new JButton("Go!");
		btnNewButton_1.setBounds(301, 408, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
