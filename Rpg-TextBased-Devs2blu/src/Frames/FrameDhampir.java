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

import FantasyOne.LogicaJogo;
import Sounds.SoundEffects;

public class FrameDhampir extends JFrame {

	private JPanel contentPane;
	SoundEffects introSound = new SoundEffects();
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDhampir frame = new FrameDhampir();
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
	public FrameDhampir() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dhampirTitle = new JLabel("A noite é a hora do Dhampir!");
		dhampirTitle.setEnabled(false);
		dhampirTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		dhampirTitle.setHorizontalAlignment(SwingConstants.CENTER);
		dhampirTitle.setBounds(87, 28, 560, 34);
		contentPane.add(dhampirTitle);
		
		JTextPane dhampirTxt = new JTextPane();
		dhampirTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		dhampirTxt.setText("Ao anoitecer, nosso herói busca abrigo em uma caverna. Ao entrar mais fundo, ele percebe que não está sozinho ao ouvir alguns passos leves e um vulto em direção a escuridão. Ao se aproximar, surge das sombras um Dhampir, que avança em direção ao nosso herói pronto para provar de seu sangue. Batalhe por sua vida!");
		dhampirTxt.setBackground(new Color(255, 255, 255));
		dhampirTxt.setBounds(114, 70, 506, 70);
		dhampirTxt.setEditable(false);
		contentPane.add(dhampirTxt);
		
		StyledDocument textoDK = dhampirTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameDhampir.class.getResource("/Images/vilao-dhampir.png")));
		lblNewLabel.setBounds(255, 150, 224, 208);
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
		txtpnEscolhaSeuAtaque.setEditable(false);
		contentPane.add(txtpnEscolhaSeuAtaque);
		
		setVisible(true);
		
		introSound.setFile(".//src//Sounds//assets//vampiro.wav");
		introSound.playEffectButton();
	}

}
