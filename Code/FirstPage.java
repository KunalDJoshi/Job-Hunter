

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

public class FirstPage extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage window = new FirstPage();
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
	public FirstPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.setBounds(100, 100, 799, 557);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Predict Now!");
		btnNewButton.setForeground(new Color(139, 69, 19));
		//btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 255, 224));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new HomePage().setVisible(true);
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				dispose();
			}
		});
		btnNewButton.setBounds(230, 368, 382, 66);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome to Job Hunter!");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(230, 54, 331, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Let's discover the jobs that suits your profile!");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(188, 292, 466, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JEditorPane dtrpnHereWePredict = new JEditorPane();
		dtrpnHereWePredict.setEditable(false);
		dtrpnHereWePredict.setForeground(new Color(139, 69, 19));
		dtrpnHereWePredict.setBackground(new Color(255, 255, 224));
		dtrpnHereWePredict.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		dtrpnHereWePredict.setText("Here, we compute a score for each job based on your profile.");
		dtrpnHereWePredict.setBounds(31, 116, 633, 42);
		frame.getContentPane().add(dtrpnHereWePredict);
	}

	//private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	//}

	//protected void dispose() {
		// TODO Auto-generated method stub
		
	//}
}