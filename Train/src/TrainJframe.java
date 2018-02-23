import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TrainJframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private boolean succeeded;
	static TrainJframe frame1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrainJframe frame = new TrainJframe(null);
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
	public TrainJframe(Frame parent) {
		super ();		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(55, 33, 130, 40);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(55, 75, 130, 40);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(155, 44, 197, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 86, 197, 19);
		contentPane.add(passwordField);
		{
			JButton btnOk = new JButton("LOGIN");
			btnOk.setBounds(39, 156, 175, 25);
			contentPane.add(btnOk);
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (TrainLogin.authenticate(getUsername(), getPassword())) {
						JOptionPane.showMessageDialog(TrainJframe.this,
								"Hi" + getUsername() + "You have succesfully logged in.",
								"Login",
								JOptionPane.INFORMATION_MESSAGE);
						succeeded = true;
						dispose();
						FenetreReservation dialog = new FenetreReservation();
						dialog.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(TrainJframe.this,
								"Invalid username or password",
								"Login",
								JOptionPane.ERROR_MESSAGE);
						textField.setText("");
						passwordField.setText("");
						succeeded = false;
					}
				}
			});
			btnOk.setActionCommand("OK");
			getRootPane().setDefaultButton(btnOk);
		}
		{
			JButton btnCancel = new JButton("Cancel");
			btnCancel.setBounds(236, 157, 169, 25);
			contentPane.add(btnCancel);
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					passwordField.setText("");
					textField.setText("");
				}
			});
			btnCancel.setActionCommand("Cancel");
		}
	}
	
	public boolean isSucceeded() {
		return succeeded;
	}
	
	public String getUsername() {
		// TODO Auto-generated method stub
		return textField.getText().trim();
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return new String (passwordField.getPassword());
	}
}

