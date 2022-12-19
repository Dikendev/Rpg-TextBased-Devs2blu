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

public class FrameCapivaraZumbi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCapivaraZumbi frame = new FrameCapivaraZumbi();
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
	public FrameCapivaraZumbi() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel capivaraTitle = new JLabel("O que é isso?! Uma capivara zumbi?");
		capivaraTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		capivaraTitle.setHorizontalAlignment(SwingConstants.CENTER);
		capivaraTitle.setBounds(87, 28, 560, 34);
		contentPane.add(capivaraTitle);
		
		JTextPane capivaraTxt = new JTextPane();
		capivaraTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		capivaraTxt.setText("Ao passar pela última ponte antes da entrada do vulcão, nosso herói avista um animal comendo algo que parece uma capivara. Ao se aproximar do supostamente inofensivo animal, ele percebe que na verdade era uma capivara comenda outra. Em um salto para trás, nosso herói reconhece uma grande Capivara Zumbi que corre em sua direção. Lute por sua vida! ");
		capivaraTxt.setBackground(new Color(255, 255, 255));
		capivaraTxt.setBounds(74, 70, 585, 70);
		contentPane.add(capivaraTxt);
		
		StyledDocument textoDK = capivaraTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameCapivaraZumbi.class.getResource("/Images/vilao-capivara.png")));
		lblNewLabel.setBounds(267, 150, 200, 208);
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
	}

}
