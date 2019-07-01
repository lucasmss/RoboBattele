package interfaceGrafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.ifb.tsi.poo.robo.modelo.construtores.ConstrutorDePeca;
import br.ifb.tsi.poo.robo.modelo.robos.Lutador;
import br.ifb.tsi.poo.robo.modelo.robos.Peca;
import br.ifb.tsi.poo.robo.modelo.robos.Robo;

public class look extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					look frame = new look();
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
	public look() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Monte seu Robo");
		label.setFont(new Font("Arial Black", Font.BOLD, 19));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(125, 11, 204, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Digite o nome do robo");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(10, 42, 155, 14);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				Scanner sc = new Scanner(System.in);
				
				String nome = sc.nextLine();
				
				
			
		}	
	
			
		});
		textField.setColumns(10);
		textField.setBounds(10, 66, 143, 20);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Escolha a Cabe\u00E7a");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(10, 97, 122, 14);
		contentPane.add(label_2);
		
		JRadioButton radioButton = new JRadioButton(" Pe\u00E7a [A=4, D=2, Dur=3] ");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Acendeu");
				
			}
		});
		buttonGroup.add(radioButton);
		radioButton.setBounds(10, 118, 169, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton(" Pe\u00E7a [A=4, D=4, Dur=3]  ");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(10, 144, 169, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton(" Pe\u00E7a [A=4, D=2, Dur=3] ");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(10, 170, 169, 23);
		contentPane.add(radioButton_2);
		
		JLabel label_3 = new JLabel("Escolha o Tronco");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(207, 43, 122, 14);
		contentPane.add(label_3);
		
		JRadioButton radioButton_3 = new JRadioButton(" Pe\u00E7a [A=3, D=2, Dur=3]  ");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(187, 65, 169, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton(" Pe\u00E7a [A=2, D=2, Dur=4]  ");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(187, 88, 169, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton(" Pe\u00E7a [A=3, D=2, Dur=3]  ");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(187, 107, 169, 23);
		contentPane.add(radioButton_5);
		
		JLabel label_4 = new JLabel("Escolha as pernas");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(185, 127, 122, 14);
		contentPane.add(label_4);
		
		JRadioButton radioButton_6 = new JRadioButton(" Pe\u00E7a [A=1, D=5, Dur=3]  ");
		buttonGroup_2.add(radioButton_6);
		radioButton_6.setBounds(187, 144, 169, 23);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_8 = new JRadioButton(" Pe\u00E7a [A=1, D=5, Dur=3] ");
		buttonGroup_2.add(radioButton_8);
		radioButton_8.setBounds(187, 193, 169, 23);
		contentPane.add(radioButton_8);
		
		JRadioButton radioButton_7 = new JRadioButton(" Pe\u00E7a [A=4, D=3, Dur=4] ");
		buttonGroup_2.add(radioButton_7);
		radioButton_7.setBounds(187, 170, 169, 23);
		contentPane.add(radioButton_7);
		
		JButton button = new JButton("Proximo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    //look2 montar2 = new look2();
				//montar2.setVisible(true);
				
				
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(181, 227, 89, 23);
		contentPane.add(button);
	}

}

