import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FenetreReservation extends JDialog {

	private final JPanel contentPanel = new JPanel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
        	FenetreReservation dialog = new FenetreReservation();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public FenetreReservation() {
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JButton btnReservation = new JButton("Reservation");
            btnReservation.setBounds(65, 55, 133, 25);
            contentPanel.add(btnReservation);
        }
        {
            JButton btnCancellation = new JButton("Cancellation");
            btnCancellation.setBounds(202, 112, 133, 25);
            contentPanel.add(btnCancellation);
        }
        {
            JButton btnExit = new JButton("Exit");
            btnExit.setBounds(77, 164, 117, 25);
            contentPanel.add(btnExit);
        }
    }

}
