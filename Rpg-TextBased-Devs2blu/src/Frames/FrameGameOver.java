package Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import FantasyOne.LogicaJogo;
import Sounds.SoundEffects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class FrameGameOver extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btn = new JButton("REINICIAR");
	boolean isRunning;
	SoundEffects gameSound = new SoundEffects();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGameOver frame = new FrameGameOver();
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
	public FrameGameOver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(200, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel msgBemVindo = new JLabel("GAME OVER!");
		msgBemVindo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 42));
		msgBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		msgBemVindo.setBounds(209, 30, 315, 53);
		contentPane.add(msgBemVindo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FrameGameOver.class.getResource("/Images/game-over.png")));
		lblNewLabel.setBounds(284, 124, 166, 220);
		contentPane.add(lblNewLabel);
		
		btn.setForeground(new Color(255, 255, 255));
		btn.setBackground(new Color(0, 128, 0));
		btn.setVerticalAlignment(SwingConstants.TOP);
		btn.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				gameSound.setFile(".//src//Sounds//assets//soundBack.wav");
				gameSound.stop();
				LogicaJogo.comecaJogo();
			}
		});
		btn.setBounds(226, 389, 136, 23);
		contentPane.add(btn);
		
		JButton btn_1 = new JButton("SAIR");
		btn_1.setForeground(new Color(255, 255, 255));
		btn_1.setBackground(new Color(255, 0, 0));
		btn_1.setVerticalAlignment(SwingConstants.TOP);
		btn_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dispose();
			}
		});
		btn_1.setBounds(372, 389, 136, 23);
		contentPane.add(btn_1);
		
		setVisible(true);
		gameSound.setFile(".//src//Sounds//assets//gameOver.wav");
		gameSound.playEffectButton();
	}

@Override
public void actionPerformed(ActionEvent evt) {
	if(evt.getSource()==btn) {
		LogicaJogo.limparConsole();
		isRunning = true;
		dispose();
	}
 }
}
