import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Implementation extends JFrame {

	private JPanel contentPane;
	private JTextField key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Implementation frame = new Implementation();
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
	public Implementation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 575);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cipher Name");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(45, 13, 543, 50);
		contentPane.add(lblNewLabel);
		
		key = new JTextField();
		key.setBounds(128, 62, 110, 30);
		contentPane.add(key);
		key.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" Key  :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(45, 61, 75, 30);
		contentPane.add(lblNewLabel_1);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(45, 107, 553, 150);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Decode");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(478, 263, 120, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Encode");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(45, 263, 120, 35);
		contentPane.add(btnNewButton_1);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(45, 307, 553, 150);
		contentPane.add(textArea_1);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tahoma", Font.BOLD, 16));
		back.setBounds(45, 480, 120, 35);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					selectCipher selectCp  = new selectCipher();
					selectCp.setVisible(true);
					dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
		
		JButton home = new JButton("HOME");
		home.setFont(new Font("Tahoma", Font.BOLD, 16));
		home.setBounds(478, 480, 120, 35);
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
		
		JButton btnNewButton_4 = new JButton("Switch Text");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(257, 263, 135, 35);
		contentPane.add(btnNewButton_4);
	}
}
