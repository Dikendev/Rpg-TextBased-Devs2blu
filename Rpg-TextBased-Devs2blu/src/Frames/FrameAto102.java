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

public class FrameAto102 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAto102 frame = new FrameAto102();
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
	public FrameAto102() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msgBemVindo = new JLabel("Recentemente Ragnaros despertou de seu aprisionamento...");
		msgBemVindo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		msgBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		msgBemVindo.setBounds(94, 30, 560, 34);
		contentPane.add(msgBemVindo);
		
		JLabel lblNewLabel_1 = new JLabel("...e agora jura vingança a todos os povos e raças.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(53, 85, 628, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Com a ameaça iminente à vida de todos, e guiado por suas honrosas índoles, um grupo de");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(58, 105, 618, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("CONTINUAR PARA O JOGO");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		btnNewButton.setBounds(269, 169, 196, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("heróis agora caminha em direção a Boca do Diabo para dar fim ao impiedoso legado do Senhor de Fogo.");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(58, 124, 618, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(FrameAto102.class.getResource("/Images/ragnaros.png")));
		lblNewLabel.setBounds(257, 212, 220, 220);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
