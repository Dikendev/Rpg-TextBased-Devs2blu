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

public class FrameDragaoDuasCabecas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDragaoDuasCabecas frame = new FrameDragaoDuasCabecas();
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
	public FrameDragaoDuasCabecas() {
		SimpleAttributeSet center = new SimpleAttributeSet();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dragaoTitle = new JLabel("Nosso herói avista um Elfo do mal!");
		dragaoTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		dragaoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		dragaoTitle.setBounds(87, 28, 560, 34);
		contentPane.add(dragaoTitle);
		
		JTextPane dragaoTxt = new JTextPane();
		dragaoTxt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		dragaoTxt.setText("Após atravessar uma velha ponte de pedras, dois grandes rugidos tomam conta do cenário e chamam a atenção do nosso herói, que instintivamente olha para cima e se depara com um dragão, mas não um comum, e sim um faminto Dragão de Duas Cabeças!\nNum rasante, ele pousa em frente ao herói pronto para o ataque. Lute por sua vida!");
		dragaoTxt.setBackground(new Color(255, 255, 255));
		dragaoTxt.setBounds(106, 70, 522, 70);
		contentPane.add(dragaoTxt);
		
		StyledDocument textoDK = dragaoTxt.getStyledDocument();	
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		textoDK.setParagraphAttributes(0, textoDK.getLength(), center, false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(FrameDragaoDuasCabecas.class.getResource("/Images/vilao-dragao.png")));
		lblNewLabel.setBounds(249, 140, 235, 232);
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
