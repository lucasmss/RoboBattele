package interfaceGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.ifb.tsi.poo.robo.controlador.Principal;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeBatalha;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeLutadorInterativoComHabilidade;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu {

	private JFrame frame;
	private JButton btnScorre;
	private JLabel lblTheRobotFight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStartTheGame = new JButton("Start");
		btnStartTheGame.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStartTheGame.setBackground(Color.LIGHT_GRAY);
		btnStartTheGame.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Bem Vindo");
				
				frame.disable();
				look lo = new look();
				lo.setVisible(true);
				
					
		}
			
		});
		btnStartTheGame.setBounds(175, 128, 89, 23);
		frame.getContentPane().add(btnStartTheGame);
		
		btnScorre = new JButton("Score");
		btnScorre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnScorre.setBackground(Color.LIGHT_GRAY);
		btnScorre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnScorre.setBounds(175, 172, 89, 23);
		frame.getContentPane().add(btnScorre);
		
		lblTheRobotFight = new JLabel("The Robot Fight");
		lblTheRobotFight.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTheRobotFight.setBounds(131, 37, 179, 35);
		frame.getContentPane().add(lblTheRobotFight);
	}
}
