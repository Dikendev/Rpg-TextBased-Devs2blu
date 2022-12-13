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
import rpggame.main.Player;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	
	//metodo para gerar um loop no game.
		public static boolean isRunning;

	// escolha do usuario
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

	// Simular outra tela
	public static void limparConsole() {
		for (int i = 0; i < 30; i++)
			System.out.println();

	}

	public static void precioneUmaTecla() {
		System.out.println("\nPrecione qualquer tecla para continuar...");
		scanner.next();
	}
	
	// apenas a tela do jogo grafica
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
	
	// comecar o jogo
	public static void comecaJogo() {
		
		boolean nomeSet = false;
		String nome;
		
		limparConsole();
		telaPontilhada(100);
		telaPontilhada(100);
		System.out.println("                                     Bem-vindo ao Fantasy One!");
		telaPontilhada(100);
		telaPontilhada(100);
		precioneUmaTecla();
		
		do {
			limparConsole();
			imprimirCabecalho("Qual o nome do Jogador? ");
			nome = scanner.next();
			limparConsole();
				
			// trocar o nome
				
			imprimirCabecalho("Seu nome é: " + nome + ".\n Está correto?");
			System.out.println("1- Sim! \n2- Não, quero mudar o nome.");
			
			int input = escolhaUser("-> ", 100);
			if (input == 1)
				nomeSet = true;
			} while (!nomeSet);
		limparConsole();
		imprimirCabecalho(
				"Escolha um personagem: \n1- Bruxo Caçador \n2- Eladrin \n3- Mago Cinzento \n4- Sacerdote \n5- Death Knight");
			
				
			
			int input = escolhaUser("->",50);
			//Escolha do personagem e criação do objeto;
			if (input == 1) {
				limparConsole();
				BruxoCacador personagem = new BruxoCacador(nome, 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a classe Bruxo Cacador");
				
				Historia.cacador();
				
			} else if (input == 2) {
				limparConsole();
				Eladrin personagem = new Eladrin(nome, 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a classe Eladrin");
				Historia.eladrin();
			} else if (input == 3) {
				limparConsole();
				MagoCinzento personagem = new MagoCinzento(nome, 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a classe MagoCinzento");
			} else if (input == 4) {
				limparConsole();
				Sacerdote personagem = new Sacerdote(nome, 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a classe Sacerdote");
			} else if (input == 5) {
				limparConsole();
				DeathKnight personagem = new DeathKnight(nome, 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("voce escolheu a classe DeathKnight");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
