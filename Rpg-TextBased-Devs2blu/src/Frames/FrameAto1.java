package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameAto1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAto1 frame2 = new FrameAto1();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameAto1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msgBemVindo = new JLabel("Vamos te apresentar melhor a história do nosso universo mágico!");
		msgBemVindo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		msgBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		msgBemVindo.setBounds(94, 30, 560, 34);
		contentPane.add(msgBemVindo);
		
		JLabel lblNewLabel_1 = new JLabel("Na pacata vila de Untirade, existe um pequeno povoado numa clareira não muito distante do Boca do Diabo,");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(65, 85, 628, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(192, 211, 350, 200);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CONTINUAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(299, 138, 136, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("um grande vulcão adormecido e lar do maligno Senhor do Fogo, Ragnaros.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(75, 105, 618, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("vulcano");
		lblNewLabel.setIcon(new ImageIcon(FrameAto1.class.getResource("/Images/vulcao.jpg")));
		lblNewLabel.setBounds(197, 211, 350, 200);
		contentPane.add(lblNewLabel);
	}
}
