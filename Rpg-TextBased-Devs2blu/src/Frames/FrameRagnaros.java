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

public class FrameRagnaros extends JFrame {

	private JPanel contentPane;
	SoundEffects introSound = new SoundEffects();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRagnaros frame = new FrameRagnaros();
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
	public FrameRagnaros() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ragnarosTitle = new JLabel("Chegou a hora da batalha final!");
		ragnarosTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		ragnarosTitle.setHorizontalAlignment(SwingConstants.CENTER);
		ragnarosTitle.setBounds(87, 28, 560, 34);
		contentPane.add(ragnarosTitle);
		
		JTextPane ragnarosTxt = new JTextPane();
		ragnarosTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		ragnarosTxt.setText("Ao entrar no covil, nosso herói se depara com uma grande porta de pedra. Ao abrir, ele avista ao fundo do grande salão um gigantesco Elemental de Fogo, com armadura, adornos em obsidiana e portando um enorme martelo incandescente. O calor era absurdo, esse é Ragnaros, o Senhor do Fogo. Como quem já esperava a visita, ele pede que nosso Herói se aproxime e o reverencie. Em um ato premeditado, o herói se aproxima e no momento de reverenciar ele rapidamente o ataca. Lute!");
		ragnarosTxt.setBackground(new Color(255, 255, 255));
		ragnarosTxt.setBounds(34, 70, 666, 70);
		contentPane.add(ragnarosTxt);
		
		StyledDocument textoDK = ragnarosTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameRagnaros.class.getResource("/Images/ragnaros.png")));
		lblNewLabel.setBounds(249, 150, 235, 208);
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
		
		introSound.setFile(".//src//Sounds//assets//boss.wav");
		introSound.playEffectButton();
		
	}

}
