package FantasyOne;

import java.util.ArrayList;
import java.util.Scanner;

import Herois.BruxoCacador;
import Herois.DeathKnight;
import Herois.Eladrin;
import Herois.MagoCinzento;
import Herois.Sacerdote;
import Inimigos.VilaoCapivaraZumbi;
import Inimigos.VilaoDhampir;
import Inimigos.VilaoDragaoDuasCabecas;
import Inimigos.VilaoDuergar;
import Inimigos.VilaoElfo;
import Inimigos.VilaoOrcGuerreiro;
import Inimigos.VilaoVelhoDoSaco;
//import rpggame.main.Player;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	public static String jogador;
	
	//Mótodo para gerar um loop no jogo
		public static boolean isRunning;

	// Método para usuário escolher opção
	public static int escolhaUser(String prompt, int escolhasUsuario) {
		int input;

		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			} catch (Exception e) {
				input = -1;
				System.out.println("Escolha um numero válido:");
			}
		} while (input < 1 || input > escolhasUsuario);
		return input;
	}

	// Mótodo para simular nova tela
	public static void limparConsole() {
		for (int i = 0; i < 30; i++)
			System.out.println();

	}

	// Mótodo pressione qualquer tecla
    public static void pressioneUmaTecla() {
		System.out.println("\nPressione qualquer tecla para continuar...");
		scanner.next();
	}
	
	// Exibe apenas a tela do jogo
	public static void telaPontilhada(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("-");
		System.out.println();
	}

	public static void imprimirCabecalho(String titulo) {
		telaPontilhada(100);
		System.out.println(titulo);
		telaPontilhada(100);

	}
	
	// Método para comecar o jogo
	public static void comecaJogo() {
		
		boolean nomeSet = false;
		String nome;
		
		limparConsole();
		telaPontilhada(100);
		telaPontilhada(100);
		System.out.println("                                     Bem-vindo ao Fantasy One!");
		telaPontilhada(100);
		telaPontilhada(100);
		pressioneUmaTecla();
		
		do {
			limparConsole();
			imprimirCabecalho("Qual o nome do Jogador? ");
			String nomeJogador = scanner.next();
			limparConsole();
				
			// trocar o nome
				
			imprimirCabecalho("Seu nome é: " + nomeJogador + ".\n Está correto?");
			System.out.println("1- Sim! \n2- Não, quero mudar o nome.");
			
			int input = escolhaUser("-> ", 100);
			if (input == 1)
				nomeSet = true;
			} while (!nomeSet);
		limparConsole();
		imprimirCabecalho(
				"Escolha um personagem: \n1- Bruxo Caçador \n2- Eladrin \n3- Mago Cinzento \n4- Sacerdote \n5- DeathKnight");
			
				
			
			int input = escolhaUser("->",50);
			//Escolha do personagem e criação do objeto;
			if (input == 1) {
				limparConsole();
				BruxoCacador personagem = new BruxoCacador(BruxoCacador.getNome(), 100, 0, 100, 2, 1, 3);
				jogador = "Bruxo Caçador";
				imprimirCabecalho("voce escolheu o Bruxo Caçador");
				Historia.cacador();
				
			} else if (input == 2) {
				limparConsole();
				Eladrin personagem = new Eladrin(Eladrin.getNome(), 80, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a Eladrin");
				jogador = "Eladrin";
				Historia.eladrin();
			} else if (input == 3) {
				limparConsole();
				MagoCinzento personagem = new MagoCinzento(MagoCinzento.getNome(), 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu o MagoCinzento");
				jogador = "Mago Cinzento";
			} else if (input == 4) {
				limparConsole();
				Sacerdote personagem = new Sacerdote(Sacerdote.getNome(), 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu o Sacerdote");
				jogador = "Sacerdote";
			} else if (input == 5) {
				limparConsole();
				DeathKnight personagem = new DeathKnight(DeathKnight.getNome(), 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu o DeathKnight");
				jogador = "DeathKnight";
			} else {
				limparConsole();
				imprimirCabecalho("Escolha uma classe válida!");
			}
			
			isRunning = true;
			gameLoop();
			
		telaPontilhada(100);		

	}
	
// MENU DO JOGO
	public static void menuGame() {
        limparConsole();
        imprimirCabecalho("Menu");
        System.out.println("Escolha uma opçao");
        telaPontilhada(20);
        System.out.println("(1) Continuar: ");
        System.out.println("(3) Sair: ");
    }
	
// LOOP DO JOGO
	public static void gameLoop() {
		while(isRunning) {
			menuGame();
			int input = escolhaUser("->", 3);
			if(input == 1)
				isRunning = true;
			else
				isRunning = false;
		}	
	}
	
// Método para mostrar informações do personagem
	public static void infoPersonagem() {
		limparConsole();
		imprimirCabecalho("Informações do personagem:");
		
		switch (jogador) {
		
		case "Bruxo Caçador": 
			System.out.println("Nome: " + BruxoCacador.getNome());
			System.out.println("Vida: " + BruxoCacador.getVida() + "/" + BruxoCacador.getMaxVida());
			System.out.println("XP: " + BruxoCacador.getXp());
			System.out.println("Mana:" + BruxoCacador.getMp());
			System.out.println("Qauntidade de Poções: " + BruxoCacador.getPocao());
			System.out.println("Nível:" + BruxoCacador.getNivel());
	    break;
		case "Eladrin": 
			System.out.println("Nome: " + Eladrin.getNome());
			System.out.println("Vida: " + Eladrin.getVida() + "/" + BruxoCacador.getMaxVida());
			System.out.println("XP: " + Eladrin.getXp());
			System.out.println("Mana:" + Eladrin.getMp());
			System.out.println("Qauntidade de Poções: " + Eladrin.getPocao());
			System.out.println("Nível:" + Eladrin.getNivel());
		break;
		case "Sacerdote": 
			System.out.println("Nome: " + Sacerdote.getNome());
			System.out.println("Vida: " + Sacerdote.getVida() + "/" + BruxoCacador.getMaxVida());
			System.out.println("XP: " + Sacerdote.getXp());
			System.out.println("Mana:" + Sacerdote.getMp());
			System.out.println("Qauntidade de Poções: " + Sacerdote.getPocao());
			System.out.println("Nível:" + Sacerdote.getNivel());
		break;
		case "DeathKnight": 
			System.out.println("Nome: " + DeathKnight.getNome());
			System.out.println("Vida: " + DeathKnight.getVida() + "/" + BruxoCacador.getMaxVida());
			System.out.println("XP: " + DeathKnight.getXp());
			System.out.println("Mana:" + DeathKnight.getMp());
			System.out.println("Qauntidade de Poções: " + DeathKnight.getPocao());
			System.out.println("Nível:" + DeathKnight.getNivel());
		break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
