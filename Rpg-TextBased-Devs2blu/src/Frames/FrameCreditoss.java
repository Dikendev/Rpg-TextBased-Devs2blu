package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameCreditoss extends JFrame implements ActionListener {

	JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCreditoss frame = new FrameCreditoss();
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
	public FrameCreditoss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto2 = new JLabel("Você derrotou o poderoso Ragnaros, descanse e comemore com a vila de Untirade.");
		texto2.setHorizontalAlignment(SwingConstants.CENTER);
		texto2.setFont(new Font("Dialog", Font.PLAIN, 15));
		texto2.setBounds(63, 58, 628, 23);
		contentPane.add(texto2);
		
		JLabel texto3 = new JLabel("Seu dever finalmente está cumprido!");
		texto3.setHorizontalAlignment(SwingConstants.CENTER);
		texto3.setFont(new Font("Dialog", Font.PLAIN, 15));
		texto3.setBounds(63, 92, 618, 20);
		contentPane.add(texto3);
		
		JLabel lblNewLabel = new JLabel("Parabéns!");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(283, 11, 173, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Por enquanto...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(245, 113, 248, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Créditos");
		lblNewLabel_2.setForeground(new Color(128, 0, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(307, 148, 124, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Jogo criado como um trabalho orientado pelo professor Rannyer;");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(101, 181, 550, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tecnologias usadas: Java, JOptionPane, Swing, Java AWT, ANSI, Java AWT, Java.io, Javax.sounds");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(33, 213, 675, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Criadores:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(128, 0, 255));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_5.setBounds(318, 260, 106, 36);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Caio Neves dos Santos");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(293, 321, 160, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diego Souza");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(318, 379, 101, 19);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Helena Corrêa Ribeiro");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(303, 362, 152, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Klaus Eduard Padilha Petrikovski");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(255, 307, 238, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Laila Gebhard da Rosa");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(301, 342, 152, 14);
		contentPane.add(lblNewLabel_10);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
	}
}
