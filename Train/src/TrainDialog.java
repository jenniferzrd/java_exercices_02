import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TrainDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JPasswordField passwordField;
	private JTextField textField;
	private boolean succeeded;
	static TrainDialog frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frame1 = new TrainDialog(null);
			frame1.setModal(true);
			frame1.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TrainDialog(Frame parent) {
		super (parent, "Login", true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		{
			JLabel lblUsername = new JLabel("Username :");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblUsername.setBounds(79, 42, 86, 18);
			contentPanel.add(lblUsername);
		}
		
		{
			JLabel lblPassword = new JLabel("Password :");
			lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPassword.setBounds(79, 93, 81, 18);
			contentPanel.add(lblPassword);
		}
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 105, 131, 19);
		contentPanel.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(178, 42, 131, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("LOGIN");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (TrainLogin.authenticate(getUsername(), getPassword())) {
							JOptionPane.showMessageDialog(TrainDialog.this,
									"Hi" + getUsername() + "You have succesfully logged in.",
									"Login",
									JOptionPane.INFORMATION_MESSAGE);
							succeeded = true;
							dispose();
						} else {
							JOptionPane.showMessageDialog(TrainDialog.this,
									"Invalid username or password",
									"Login",
									JOptionPane.ERROR_MESSAGE);
							textField.setText("");
							passwordField.setText("");
							succeeded = false;
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						passwordField.setText("");
						textField.setText("");
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
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
