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

public class FrameQuimera extends JFrame {

	private JPanel contentPane;
	SoundEffects introSound = new SoundEffects();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameQuimera frame = new FrameQuimera();
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
	public FrameQuimera() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel quimeraTitle = new JLabel("Nosso herói está prestes a ser devorado por uma Quimera!");
		quimeraTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		quimeraTitle.setHorizontalAlignment(SwingConstants.CENTER);
		quimeraTitle.setBounds(87, 28, 560, 34);
		contentPane.add(quimeraTitle);
		
		JTextPane quimeraTxt = new JTextPane();
		quimeraTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		quimeraTxt.setText("Pela manhã, enquanto caçava, nosso herói percebe a movimentação desesperada dos animais da floresta, como se um predador gigante estivesse se aproximando. Ao ouvir um rugido de leão, ele se prepara para o confronto, mas o que ele não esperava era que o predador viria de cima. Com asas de dragão, cabeça de leão e calda de serpente, uma Quimera paira em sua direção, pronto para ter sua refeição. Ataque!");
		quimeraTxt.setBackground(new Color(255, 255, 255));
		quimeraTxt.setBounds(61, 70, 611, 70);
		contentPane.add(quimeraTxt);
		
		StyledDocument textoDK = quimeraTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameQuimera.class.getResource("/Images/vilao-quimera.png")));
		lblNewLabel.setBounds(224, 150, 285, 208);
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
		
		introSound.setFile(".//src//Sounds//assets//quimera.wav");
		introSound.playEffectButton();
	}

}
