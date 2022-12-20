package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameAto101 extends JFrame implements ActionListener {

	JPanel contentPane;
	JButton btn = new JButton("CONTINUAR");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAto101 frame = new FrameAto101();
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
	public FrameAto101() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto1 = new JLabel("Vamos te apresentar melhor a história do nosso universo mágico!");
		texto1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		texto1.setHorizontalAlignment(SwingConstants.CENTER);
		texto1.setBounds(94, 30, 560, 34);
		contentPane.add(texto1);
		
		JLabel texto2 = new JLabel("Na pacata vila de Untirade, existe um pequeno povoado numa clareira não muito distante do Boca do Diabo,");
		texto2.setHorizontalAlignment(SwingConstants.CENTER);
		texto2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		texto2.setBounds(65, 85, 628, 23);
		contentPane.add(texto2);
		
		JLabel texto3 = new JLabel("um grande vulcão adormecido e lar do maligno Senhor do Fogo, Ragnaros.");
		texto3.setHorizontalAlignment(SwingConstants.CENTER);
		texto3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		texto3.setBounds(75, 105, 618, 20);
		contentPane.add(texto3);
		
		btn.setForeground(new Color(255, 255, 255));
		btn.setBackground(new Color(255, 0, 128));
		btn.setVerticalAlignment(SwingConstants.TOP);
		btn.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn.addActionListener(this);
		btn.setBounds(299, 138, 136, 23);
		contentPane.add(btn);
		
		JLabel imagem = new JLabel("Vulcao");
		imagem.setIcon(new ImageIcon(FrameAto101.class.getResource("/Images/vulcao.png")));
		imagem.setBounds(197, 211, 350, 200);
		contentPane.add(imagem);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()==btn) {
			setVisible(false);
			FrameAto102 frame102 = new FrameAto102();
		}
	}
}
