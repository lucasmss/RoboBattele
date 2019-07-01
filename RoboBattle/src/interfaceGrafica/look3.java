package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class look3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					look3 frame = new look3();
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
	public look3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRounds = new JLabel("Round");
		lblRounds.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRounds.setBounds(164, 11, 76, 44);
		contentPane.add(lblRounds);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(243, 11, 56, 44);
		contentPane.add(panel);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(120, 134, 183, 25);
		contentPane.add(splitPane);
	}
}
