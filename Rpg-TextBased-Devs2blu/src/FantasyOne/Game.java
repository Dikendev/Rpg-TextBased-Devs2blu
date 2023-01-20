package FantasyOne;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import Frames.FrameHerois;

public class Game {
	
	JFrame	window;
	JPanel text, mainTextPanel,choiceButton,choiceButtonH;
	Container con;
	TitleScreenHandle tsHandle = new TitleScreenHandle();

	
	// escolhas action listener historia.
	
	ChoiceHandler choiceHandle = new ChoiceHandler();
	EscolhaHeroiHandle escolhaHeroi = new EscolhaHeroiHandle();
	JLabel msgBemVindo, msgInstrucoes, msgVamosLa,lblNewLabel,imagem,eladrin,bruxoCacador,magoCinzento,sacerdote,deathKnight;
	JLabel eladrinTitle,deathKnightTitle,bruxoCacadorTitle,magoCinzentoTitle,sacerdoteTitle;
	JButton btn,avancar,choice1,choice2,choice3,choice4,choice5;
	JTextArea mainTextArea, mainTextArea2,mainTextArea3;
	
	String position;
	
	public static void main(String[] args) {
		 //LogicaJogo.comecaJogo();
		new Game();
	}  
	
	
	public Game() {
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(300,100,800,600);
		window.setLayout(null);
		
		con = window.getContentPane();	
		con.setBackground(new Color(255, 255, 255));
		
		msgBemVindo = new JLabel("Bem vindo ao Fantasy-One!");
		msgBemVindo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 24));
		msgBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		msgBemVindo.setBounds(209, 30, 315, 34);
		
		
		msgInstrucoes = new JLabel("Siga as intruções do console para jogar.");
		msgInstrucoes.setHorizontalAlignment(SwingConstants.CENTER);
		msgInstrucoes.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		msgInstrucoes.setBounds(203, 85, 328, 23);	
		
		msgVamosLa = new JLabel("Está preparado? Então vamos lá!");
		msgVamosLa.setHorizontalAlignment(SwingConstants.CENTER);
		msgVamosLa.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		msgVamosLa.setBounds(203, 105, 328, 20);
		
	
		
		btn = new JButton("COMEÇAR");
		btn.setForeground(new Color(255, 255, 255));
		btn.setBackground(new Color(255, 0, 128));
		btn.setVerticalAlignment(SwingConstants.TOP);
		btn.setFont(new Font("Yu Gothic Medium", Font.BOLD, 12));
		btn.setBounds(299, 138, 136, 23);
		//action listener para a proxima tela
		btn.addActionListener(tsHandle);
		
		lblNewLabel = new JLabel("Imagem");	
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/Images/rpg-players.png")));
		lblNewLabel.setBounds(187, 150, 360, 300);

		con.add(msgBemVindo);
		con.add(msgInstrucoes);
		con.add(msgVamosLa);
		con.add(btn);
		con.add(lblNewLabel);
		
		window.setVisible(true);	
	}	
	
	public void HistoriaScreen() {
	//variavel para usar o actionEvent das ações
		position = "historiaInicio";
	
	// primeiro precisa apagar todo o primeiro frame para fazer aparecer o segundo frame.
		msgBemVindo.setVisible(false);
		msgInstrucoes.setVisible(false);
		msgVamosLa.setVisible(false);
		btn.setVisible(false);
		lblNewLabel.setVisible(false);
	
	// frame atual dos botões			
		choiceButton = new JPanel();
		choiceButton.setBackground(Color.red);
		choiceButton.setLayout(new GridLayout(4,1));
		choiceButton.setBounds(250, 350, 300, 150);
		
		choice1 = new JButton(">");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.WHITE);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandle);
		choice1.setActionCommand("c1");
		
		choice2 = new JButton("");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.WHITE);
		choice2.setFocusPainted(false);
		choice2.setActionCommand("c2");
		choice2.addActionListener(choiceHandle);
		
		choice3 = new JButton("");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.WHITE);
		choice3.setFocusPainted(false);
		choice3.setActionCommand("c3");
		choice3.addActionListener(choiceHandle);
		
		choice4 = new JButton("");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.WHITE);
		choice4.setFocusPainted(false);
		choice4.setActionCommand("c4");
		choice4.addActionListener(choiceHandle);

		choice5 = new JButton("");
		choice5.setBackground(Color.black);
		choice5.setForeground(Color.WHITE);
		choice5.setFocusPainted(false);
		choice5.setActionCommand("c5");
		choice5.addActionListener(choiceHandle);
		
		con.add(choiceButton);
		choiceButton.add(choice1);
		choiceButton.add(choice2);
		choiceButton.add(choice3);
		choiceButton.add(choice4);
		choiceButton.add(choice5);
		
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(50, 0, 700, 350);
		mainTextPanel.setBackground(Color.BLUE);
		con.add(mainTextPanel);
	
		mainTextArea = new JTextArea("Vamos te apresentar melhor a história do nosso universo mágico!");
		mainTextArea.setBounds(0, 0, 600 , 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(new Font("Yu Gothic Medium", Font.BOLD, 16));
		mainTextArea.setLineWrap(true);
		
		mainTextArea2 = new JTextArea("Na pacata vila de Untirade, existe um pequeno povoado numa \n clareira não muito distante do Boca do Diabo,");
		mainTextArea2.setBounds(0, 0, 600 , 250);
		mainTextArea2.setBackground(Color.black);
		mainTextArea2.setForeground(Color.blue);
		mainTextArea2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		mainTextArea2.setLineWrap(true);
		
		mainTextArea3 = new JTextArea("um grande vulcão adormecido e lar do maligno Senhor do Fogo, Ragnaros.");
		mainTextArea3.setBounds(0, 0, 600 , 250);
		mainTextArea3.setBackground(Color.black);
		mainTextArea3.setForeground(Color.white);
		mainTextArea3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		mainTextArea3.setLineWrap(true);
		
		imagem = new JLabel();
		imagem.setIcon(new ImageIcon(getClass().getResource("/Images/vulcao.png")));
		imagem.setBounds(197, 211, 350, 200);
		mainTextPanel.add(imagem);
		
		mainTextPanel.add(mainTextArea);
		mainTextPanel.add(mainTextArea2);
		mainTextPanel.add(mainTextArea3);
		
		// metodo para maniputar
		PlayerSetup();
	}
	

	public void HistoriaScreenDois() {
		position = "historia2";
		
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice5.setText("<");
		
		mainTextArea.setText("teste historia 2"); 
		mainTextArea2.setText("istoira 2");
		mainTextArea3.setText("histoira 2");
			
		imagem.setIcon(new ImageIcon(getClass().getResource("/Images/ragnaros.png")));	
	}
	
	public void HistoriaScreen3() {
		position = "historia3";
		
		// fazer voltar e depois eu continuo
		choice1.setText(">");	
		choice2.setText("lol");
		choice3.setText("lol");
		choice4.setText("lol");
		choice5.setText("Voltar");
		
		
		mainTextArea.setText("teste historia 3"); 
		mainTextArea2.setText("istoira 3");
		mainTextArea3.setText("histoira 3");
			
		imagem.setIcon(new ImageIcon(getClass().getResource("/Images/vilao-dragao.png")));	
	}
	
	

	
	public void EscolhaHeroi() {
		position = "escolhaHeroi";
		
		mainTextPanel.setLayout(null);
		
		
		
		mainTextArea.setVisible(false);
		mainTextArea2.setVisible(false);
		mainTextArea3.setVisible(false);

		
		imagem.setVisible(false);
		
		bruxoCacador = new JLabel();
		bruxoCacador.setIcon(new ImageIcon(getClass().getResource("/Images/herois-bruxo-cacador.png")));
		bruxoCacador.setBounds(39, 79, 100, 130);
		mainTextPanel.add(bruxoCacador);
						
		eladrin = new JLabel();
		eladrin.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-eladrin.png")));
		eladrin.setBounds(178, 79, 100, 130);
		mainTextPanel.add(eladrin);
	
		magoCinzento = new JLabel();
		magoCinzento.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-mago-cinzento.png")));
		magoCinzento.setBounds(317, 79, 100, 130);
		mainTextPanel.add(magoCinzento);
		
		sacerdote = new JLabel();
		sacerdote.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-sacerdote.png")));
		sacerdote.setBounds(460, 45, 100, 164);
		mainTextPanel.add(sacerdote);
		
		deathKnight = new JLabel();
		deathKnight.setIcon(new ImageIcon(FrameHerois.class.getResource("/Images/herois-deathknight.png")));
		deathKnight.setBounds(597, 79, 100, 130);
		mainTextPanel.add(deathKnight);
		
		bruxoCacadorTitle = new JLabel("Bruxo Caçador");
		bruxoCacadorTitle.setHorizontalAlignment(SwingConstants.CENTER);
		bruxoCacadorTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		bruxoCacadorTitle.setBounds(35, 220, 109, 21);
		mainTextPanel.add(bruxoCacadorTitle);
		
		eladrinTitle = new JLabel("Eladrin");
		eladrinTitle.setHorizontalAlignment(SwingConstants.CENTER);
		eladrinTitle.setBounds(174, 220, 109, 21);
		eladrinTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		mainTextPanel.add(eladrinTitle);
		
		magoCinzentoTitle = new JLabel("Mago Cinzento");
		magoCinzentoTitle.setHorizontalAlignment(SwingConstants.CENTER);
		magoCinzentoTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		magoCinzentoTitle.setBounds(313, 220, 109, 21);
		mainTextPanel.add(magoCinzentoTitle);
		
		sacerdoteTitle = new JLabel("Sacerdote");
		sacerdoteTitle.setHorizontalAlignment(SwingConstants.CENTER);
		sacerdoteTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		sacerdoteTitle.setBounds(456, 220, 109, 21);
		mainTextPanel.add(sacerdoteTitle);
		
		deathKnightTitle = new JLabel("DeathKnight");
		deathKnightTitle.setHorizontalAlignment(SwingConstants.CENTER);
		deathKnightTitle.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		deathKnightTitle.setBounds(593, 220, 109, 21);
		mainTextPanel.add(deathKnightTitle);
		
		choice1.setText("Bruxo Caçador");
		choice2.setText("Eladrin");
		choice3.setText("Mago Cinzento");
		choice4.setText("Sacerdote");
		choice5.setText("New Game");

	}
	

	
	public void PlayerSetup() {
	
	}
		
	// Começa o jogo
	public class TitleScreenHandle implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			HistoriaScreen();
		}
	}
	
	
	public class ChoiceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			
			switch(position) {
				case "historiaInicio" :
					switch(yourChoice) {
					case "c1" : HistoriaScreenDois(); break;
					case "c2" : break;
					case "c3" : break;
					case "c4" : break;
					case "c5" : break;
				} break;
				case "historia2" :
					switch(yourChoice) {
					case "c1" : HistoriaScreen3(); break;
					case "c2" : break;
					case "c3" : break;
					case "c4" : break;
					case "c5" : break;
					} break;
				case "historia3" : 
					switch(yourChoice) {
					case "c1" : EscolhaHeroi(); break;
					case "c2" : break;
					case "c3" : break;
					case "c4" : break;
					case "c5" : HistoriaScreenDois(); break;
					} break;
				case "escolhaHeroi" :
					switch(yourChoice) {
					case "c1" : break;
					case "c2" : break;
					case "c3" : break;
					case "c4" : break;
					case "c5" : break;
					} break;
			}
		}
	}
	
	public class EscolhaHeroiHandle implements ActionListener {
		public void actionPerformed(ActionEvent event) {		
	//		EscolhaHeroi();
		}
	}

}
	


