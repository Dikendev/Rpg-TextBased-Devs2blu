package FantasyOne;

import java.util.Scanner;
import Herois.BruxoCacador;
import Herois.DeathKnight;
import Herois.Eladrin;
import Herois.MagoCinzento;
import Herois.Personagem;
import Herois.Sacerdote;

//import rpggame.main.Player;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	public static String jogador;
	public static Personagem personagem;

	// Mótodo para gerar um loop no jogo
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
		limparConsole();
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

		int opcao;
		System.out.println("Bem vindo ao Fantasy-One!");
		System.out.println("Antes de começarmos, digite seu nome: ");
		String nome = scanner.next();
		pressioneUmaTecla();

		System.out.println("Ótimo " + nome + ", vamos agora escolher seu herói!");
		System.out.println("Antes, vamos te apresentar melhor a história do nosso universo mágico!");
		Historia.historiaDoRpg();
		limparConsole();

		System.out.println(
				"Agora vamos escolher seu herói! Temos diversos heróis disponíveis, confira a seguir cada um deles e escolha o que você achar mais interessante!");

		System.out.println("Bruxo caçador");
		Historia.bruxoCacador();
		System.out.println("Eladrin");
		Historia.eladrin();
		System.out.println("Death Knight");
		Historia.deathKnight();
		System.out.println("Mago Cinzento");
		Historia.magoCinzento();
		System.out.println("Sacerdote");
		Historia.sacerdote();
		
		System.out.println("Escolha seu herói! \n1 - Bruxo Caçador \n2-Eladrin \n3-Mago Cinzento \n4- Sacerdote \n5- Death Knight");
		opcao = scanner.nextInt();
				
		if (opcao == 1) {
			limparConsole();
			personagem = new BruxoCacador("Bruxo Caçador", 100, 0, 100, 2, 1, 3);
			jogador = "Bruxo Caçador";
			imprimirCabecalho("Você escolheu o Bruxo Caçador!");
		} else if (opcao == 2) {
			limparConsole();
			personagem = new Eladrin("Eladrin", 80, 0, 100, 2, 1, 3);
			imprimirCabecalho("Você escolheu a Eladrin!");
			jogador = "Eladrin";
		} else if (opcao == 3) {
			limparConsole();
			personagem = new MagoCinzento("Mago Cinzento", 100, 0, 100, 2, 1, 3);
			imprimirCabecalho("Você escolheu o MagoCinzento!");
			jogador = "Mago Cinzento";
		} else if (opcao == 4) {
			limparConsole();
			personagem = new Sacerdote("Sacerdote", 100, 0, 100, 2, 1, 3);
			imprimirCabecalho("Você escolheu o Sacerdote!");
			jogador = "Sacerdote";
		} else if (opcao == 5) {
			limparConsole();
			personagem = new DeathKnight("Death Knight", 100, 0, 100, 2, 1, 3);
			imprimirCabecalho("Você escolheu o DeathKnight!");
			jogador = "Death Knight";
		} else {
			imprimirCabecalho("Escolha uma classe válida!");
		}

		
		
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
		while (isRunning) {
			menuGame();
			int input = escolhaUser("->", 3);
			if (input == 1)
				isRunning = true;
			else
				isRunning = false;
		}
	}

// Método para mostrar informações do personagem
//	public static void infoPersonagem(Object jogador) {
//		limparConsole();
//		imprimirCabecalho("Informações do personagem:");
//		
//		switch (jogador) {
//		
//		case "Bruxo Caçador": 
//			System.out.println("Nome: " + );
//			System.out.println("Vida: " + BruxoCacador.getVida() + "/" + BruxoCacador.getMaxVida());
//			System.out.println("XP: " + BruxoCacador.getXp());
//			System.out.println("Mana:" + BruxoCacador.getMp());
//			System.out.println("Qauntidade de Poções: " + BruxoCacador.getPocao());
//			System.out.println("Nível:" + BruxoCacador.getNivel());
//	    break;
//		case "Eladrin": 
//			System.out.println("Nome: " + Eladrin.getNome());
//			System.out.println("Vida: " + Eladrin.getVida() + "/" + BruxoCacador.getMaxVida());
//			System.out.println("XP: " + Eladrin.getXp());
//			System.out.println("Mana:" + Eladrin.getMp());
//			System.out.println("Qauntidade de Poções: " + Eladrin.getPocao());
//			System.out.println("Nível:" + Eladrin.getNivel());
//		break;
//		case "Sacerdote": 
//			System.out.println("Nome: " + Sacerdote.getNome());
//			System.out.println("Vida: " + Sacerdote.getVida() + "/" + BruxoCacador.getMaxVida());
//			System.out.println("XP: " + Sacerdote.getXp());
//			System.out.println("Mana:" + Sacerdote.getMp());
//			System.out.println("Qauntidade de Poções: " + Sacerdote.getPocao());
//			System.out.println("Nível:" + Sacerdote.getNivel());
//		break;
//		case "DeathKnight": 
//			System.out.println("Nome: " + DeathKnight.getNome());
//			System.out.println("Vida: " + DeathKnight.getVida() + "/" + BruxoCacador.getMaxVida());
//			System.out.println("XP: " + DeathKnight.getXp());
//			System.out.println("Mana:" + DeathKnight.getMp());
//			System.out.println("Qauntidade de Poções: " + DeathKnight.getPocao());
//			System.out.println("Nível:" + DeathKnight.getNivel());
//		break;
//		pressioneUmaTecla();
//		}
//		
//		
//	}
//	

}
