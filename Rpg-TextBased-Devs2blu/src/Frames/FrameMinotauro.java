package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import Sounds.SoundEffects;

public class FrameMinotauro extends JFrame {

	private JPanel contentPane;
	SoundEffects introSound = new SoundEffects();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMinotauro frame = new FrameMinotauro();
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
	public FrameMinotauro() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel minotauroTitle = new JLabel("Nosso herói avista um Minotauro!");
		minotauroTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		minotauroTitle.setHorizontalAlignment(SwingConstants.CENTER);
		minotauroTitle.setBounds(87, 28, 560, 34);
		contentPane.add(minotauroTitle);
		
		JTextPane minotauroTxt = new JTextPane();
		minotauroTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		minotauroTxt.setText("Seguindo viagem, nosso herói agora toma um caminho rochoso. Ao parar brevemente para encher seu cantil num pequeno lago, nota na água pequenas ondas compassadas com um som forte de passos. Ao olhar para trás, um furioso Minotauro de chifres imensos se aproxima.\nEm um surto raivoso, ele avança em sua direção. Lute!");
		minotauroTxt.setBackground(new Color(255, 255, 255));
		minotauroTxt.setBounds(106, 70, 522, 70);
		contentPane.add(minotauroTxt);
		
		StyledDocument textoDK = minotauroTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameMinotauro.class.getResource("/Images/vilao-minotauro.png")));
		lblNewLabel.setBounds(263, 150, 208, 208);
		contentPane.add(lblNewLabel);
		
		JButton btn = new JButton("ATACAR");
		btn.setForeground(new Color(255, 255, 255));
		btn.setBackground(new Color(255, 0, 128));
		btn.setVerticalAlignment(SwingConstants.TOP);
		btn.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		btn.setBounds(295, 389, 143, 23);
		contentPane.add(btn);
		
		JTextPane txtpnEscolhaSeuAtaque = new JTextPane();
		txtpnEscolhaSeuAtaque.setText("Escolha seu ataque no console");
		txtpnEscolhaSeuAtaque.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		txtpnEscolhaSeuAtaque.setBackground(new Color(255, 255, 255));
		txtpnEscolhaSeuAtaque.setBounds(295, 365, 143, 23);
		contentPane.add(txtpnEscolhaSeuAtaque);
		
		setVisible(true);
		
		introSound.setFile(".//src//Sounds//assets//minotauro.wav");
		introSound.playEffectButton();
		
	}

}
