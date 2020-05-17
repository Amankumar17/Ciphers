import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class selectCipher extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectCipher frame = new selectCipher();
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
	public selectCipher() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton next = new JButton("Next");
		next.setBounds(426, 350, 194, 40);
		contentPane.add(next);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Implementation implt = new Implementation();
					implt.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
		
		JButton home = new JButton("Home");
		home.setBounds(12, 350, 194, 40);
		contentPane.add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
		
		JLabel lblNewLabel = new JLabel("Please Select the Cipher");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(149, 81, 325, 45);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(149, 155, 314, 40);
		contentPane.add(comboBox);
	}

}
