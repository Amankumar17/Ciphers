import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.EventQueue;
import java.awt.*;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

	
	public class Homepage extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Homepage frame = new Homepage();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	/**
	 * Initialize the contents of the frame.
	 */
		public Homepage() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 701, 475);
			contentPane = new JPanel();
			contentPane.setBackground(Color.BLACK);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
		JLabel Homepage_header = new JLabel("Welcome to Cipher App");
		Homepage_header.setForeground(Color.RED);
		Homepage_header.setToolTipText("TPC Java Project");
		Homepage_header.setBackground(Color.BLACK);
		Homepage_header.setFont(new Font("Monotype Corsiva", Font.BOLD, 70));
		Homepage_header.setBounds(0, 0, 682, 188);
		contentPane.add(Homepage_header);
		
		JLabel lblNewLabel = new JLabel("Please Select the Input Input type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(146, 201, 396, 40);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(197, 254, 263, 40);
		contentPane.add(comboBox);
		
		JButton nextButton = new JButton("Next");
		nextButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		nextButton.setBounds(244, 354, 168, 49);
		contentPane.add(nextButton);
		
		nextButton.addActionListener(new ActionListener() {
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
	}
}
