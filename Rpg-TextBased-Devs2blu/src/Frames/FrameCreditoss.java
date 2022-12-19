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
		
		JLabel lblNewLabel = new JLabel("Parabéns!");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel.setBounds(0, 11, 750, 36);
		contentPane.add(lblNewLabel);
		
		JLabel texto2 = new JLabel("Você derrotou o poderoso Ragnaros, descanse e comemore com a vila de Untirade.");
		texto2.setHorizontalAlignment(SwingConstants.CENTER);
		texto2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		texto2.setBounds(0, 46, 750, 23);
		contentPane.add(texto2);
		
		JLabel lblNewLabel_1 = new JLabel("Seu dever está cumprido!");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_1.setBounds(0, 66, 750, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_12 = new JLabel("Por enquanto...");
		lblNewLabel_12.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(0, 86, 750, 23);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_5 = new JLabel("Criadores");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(128, 0, 255));
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel_5.setBounds(0, 116, 750, 36);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Caio Neves dos Santos");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_6.setBounds(0, 151, 750, 23);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diego Kennedy Guimaraes Barros");
		lblNewLabel_7.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(0, 171, 750, 23);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Helena Corrêa Ribeiro");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_8.setBounds(0, 191, 750, 23);
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Klaus Eduard Padilha Petrikovski");
		lblNewLabel_9.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(0, 211, 750, 23);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Laila Gebhard da Rosa");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		lblNewLabel_10.setBounds(0, 231, 750, 23);
		contentPane.add(lblNewLabel_10);	
		
		JLabel lblNewLabel_13 = new JLabel("Obrigado por Jogar!");
		lblNewLabel_13.setForeground(new Color(128, 0, 255));
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(0, 251, 750, 36);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setIcon(new ImageIcon(FrameCreditoss.class.getResource("/Images/pessoinhas.png")));
		lblNewLabel_11.setBounds(0, 150, 750, 500);
		contentPane.add(lblNewLabel_11);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
	}
}
