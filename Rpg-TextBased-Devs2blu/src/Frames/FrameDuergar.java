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

public class FrameDuergar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDuergar frame = new FrameDuergar();
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
	public FrameDuergar() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel duergarTitle = new JLabel("Nosso herói se depara com um Duergar!");
		duergarTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		duergarTitle.setHorizontalAlignment(SwingConstants.CENTER);
		duergarTitle.setBounds(87, 28, 560, 34);
		contentPane.add(duergarTitle);
		
		JTextPane duergarTxt = new JTextPane();
		duergarTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		duergarTxt.setText("Devido à um deslizamento, nosso herói é obrigado a usar uma velha trilha mal cuidada e pouco sinalizada. Guiado apenas pela luz do luar, ele avista um vulto junto a um barulho metálico, e surge de trás de uma árvore um Duergar com muita raiva em seu olhar. Não resta outra opção a não ser lutar!");
		duergarTxt.setBackground(new Color(255, 255, 255));
		duergarTxt.setBounds(81, 70, 571, 70);
		contentPane.add(duergarTxt);
		
		StyledDocument textoDK = duergarTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameDuergar.class.getResource("/Images/vilao-duergar.png")));
		lblNewLabel.setBounds(267, 140, 200, 215);
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
