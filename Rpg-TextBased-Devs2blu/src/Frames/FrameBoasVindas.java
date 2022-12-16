package Frames;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;


public class FrameBoasVindas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBoasVindas frame = new FrameBoasVindas();
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
	public FrameBoasVindas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msgBemVindo = new JLabel("Bem vindo ao Fantasy-One!");
		msgBemVindo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		msgBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		msgBemVindo.setBounds(209, 30, 315, 34);
		contentPane.add(msgBemVindo);
		
		JLabel msgInstrucoes = new JLabel("Siga as intruções do console para jogar.");
		msgInstrucoes.setHorizontalAlignment(SwingConstants.CENTER);
		msgInstrucoes.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		msgInstrucoes.setBounds(203, 85, 328, 23);
		contentPane.add(msgInstrucoes);
		
		JButton btnNewButton = new JButton("COMEÇAR");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		btnNewButton.setBounds(299, 138, 136, 23);
		contentPane.add(btnNewButton);
		
		JLabel msgVamosLa = new JLabel("Está preparado? Então vamos lá!");
		msgVamosLa.setHorizontalAlignment(SwingConstants.CENTER);
		msgVamosLa.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		msgVamosLa.setBounds(203, 105, 328, 20);
		contentPane.add(msgVamosLa);
		
		JLabel lblNewLabel = new JLabel("Imagem");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/Images/rpg-players.png")));
		lblNewLabel.setBounds(187, 150, 360, 300);
		contentPane.add(lblNewLabel);
		
	}
}
