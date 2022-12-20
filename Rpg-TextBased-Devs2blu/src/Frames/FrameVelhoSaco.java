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

public class FrameVelhoSaco extends JFrame {

	private JPanel contentPane;
	SoundEffects introSound = new SoundEffects();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameVelhoSaco frame = new FrameVelhoSaco();
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
	public FrameVelhoSaco() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel velhoSacoTitle = new JLabel("Nosso herói encontra o Velho do Saco!");
		velhoSacoTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		velhoSacoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		velhoSacoTitle.setBounds(87, 28, 560, 34);
		contentPane.add(velhoSacoTitle);
		
		JTextPane velhoSacoTxt = new JTextPane();
		velhoSacoTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		velhoSacoTxt.setText("Na entrada do vulcão, nosso herói avista um senhor de idade avançada e corcunda, que carrega nas costas um grande saco preto que parece muito pesado. Ele balbucia algumas palavras que parecem uma cantiga de criança. Ao se aproximar, nosso herói nota que o Velho do Saco possui em seu olhar uma magia vil e poderosa. Tomado pela fúria da magia, ele parte pra cima do herói. Defenda-se!");
		velhoSacoTxt.setBackground(new Color(255, 255, 255));
		velhoSacoTxt.setBounds(66, 70, 602, 70);
		contentPane.add(velhoSacoTxt);
		
		StyledDocument textoDK = velhoSacoTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameVelhoSaco.class.getResource("/Images/vilao-velho-saco.png")));
		lblNewLabel.setBounds(212, 150, 310, 208);
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
		introSound.setFile(".//src//Sounds//assets/velhoDoSaco.wav");
		introSound.playEffectButton();
	}

}
