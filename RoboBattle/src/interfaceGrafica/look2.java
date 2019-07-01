package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.ifb.tsi.poo.robo.controlador.Principal;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeBatalha;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeLutadorInterativoComHabilidade;
import br.ifb.tsi.poo.robo.modelo.batalhas.BatalhaEmTurnos; 
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeBatalha;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboAleatorio;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeRoboInterativo;
import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDeLutadorInterativoComHabilidade;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class look2<Robo> extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					look2 frame = new look2();
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
	public look2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Escolha o Bra\u00E7o Direito");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 11, 170, 14);
		contentPane.add(label);
		
		JRadioButton radioButton = new JRadioButton(" Pe\u00E7a [A=3, D=2, Dur=3]  ");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(radioButton);
		radioButton.setBounds(6, 32, 169, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton(" Pe\u00E7a [A=5, D=1, Dur=4] ");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(6, 58, 169, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton(" Pe\u00E7a [A=3, D=2, Dur=3]  ");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(6, 84, 169, 23);
		contentPane.add(radioButton_2);
		
		JLabel label_1 = new JLabel("Escolha o Bra\u00E7o Esquerdo");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 114, 187, 14);
		contentPane.add(label_1);
		
		JRadioButton radioButton_3 = new JRadioButton(" Pe\u00E7a [A=2, D=3, Dur=4] ");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(6, 135, 169, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton(" Pe\u00E7a [A=4, D=4, Dur=3] ");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(6, 157, 169, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton(" Pe\u00E7a [A=2, D=3, Dur=4] ");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(6, 179, 169, 23);
		contentPane.add(radioButton_5);
		
		JButton button = new JButton("Batalhar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}

		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(166, 216, 104, 23);
		contentPane.add(button);
	}

}
