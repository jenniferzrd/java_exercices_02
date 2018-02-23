import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Reservation extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fieldPNR;
	private JTextField TrainNo;
	private JTextField TrainName;
	private JTextField to;
	private JTextField fromfield;
	private JTextField boardingat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Reservation dialog = new Reservation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Reservation() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPnrno = new JLabel("PNR_No");
		lblPnrno.setBounds(12, 26, 70, 15);
		contentPanel.add(lblPnrno);
		
		JLabel lblNewLabel = new JLabel("Train Number");
		lblNewLabel.setBounds(12, 40, 165, 38);
		contentPanel.add(lblNewLabel);
		
		JLabel lblTrainName = new JLabel("Train Name");
		lblTrainName.setBounds(12, 74, 133, 15);
		contentPanel.add(lblTrainName);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(12, 101, 70, 15);
		contentPanel.add(lblClass);
		
		JLabel lblDate = new JLabel("Date of Journey");
		lblDate.setBounds(12, 117, 194, 26);
		contentPanel.add(lblDate);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(12, 147, 70, 15);
		contentPanel.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(182, 147, 70, 15);
		contentPanel.add(lblTo);
		
		JLabel lblNewLabel_1 = new JLabel("Boarding at");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(12, 172, 133, 15);
		contentPanel.add(lblNewLabel_1);
		
		fieldPNR = new JTextField();
		fieldPNR.setBounds(138, 24, 114, 19);
		contentPanel.add(fieldPNR);
		fieldPNR.setColumns(10);
		
		TrainNo = new JTextField();
		TrainNo.setBounds(138, 50, 114, 19);
		contentPanel.add(TrainNo);
		TrainNo.setColumns(10);
		
		TrainName = new JTextField();
		TrainName.setBounds(138, 72, 114, 19);
		contentPanel.add(TrainName);
		TrainName.setColumns(10);
		
		to = new JTextField();
		to.setBounds(203, 145, 114, 19);
		contentPanel.add(to);
		to.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(138, 96, 117, 24);
		contentPanel.add(comboBox);
		
		fromfield = new JTextField();
		fromfield.setBounds(63, 145, 114, 19);
		contentPanel.add(fromfield);
		fromfield.setColumns(10);
		
		boardingat = new JTextField();
		boardingat.setBounds(109, 170, 114, 19);
		contentPanel.add(boardingat);
		boardingat.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
