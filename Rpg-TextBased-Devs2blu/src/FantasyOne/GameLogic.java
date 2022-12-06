package FantasyOne;

import java.util.Scanner;

import Herois.BruxoCacador;
import Herois.Eladrin;
import Herois.MagoCinzento;
import Herois.Sacerdote;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);

	public static int escolhaInt(String prompt, int escolhasUsuario) {
		int input;

		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			} catch (Exception e) {
				input = -1;
				System.out.println("Escolha um numero valido jogador!");
			}
		} while (input < 1 || input > escolhasUsuario);
		return input;
	}

	// Simular outra tela
	public static void clearConsole() {
		for (int i = 0; i < 40; i++)
			System.out.println();

	}

	// apenas a tela do jogo grafica
	public static void telaDots(int n) {
		for (int i = 0; i < n; i++)
			System.out.print("-");
		System.out.println();
	}

	public static void printHeading(String titulo) {
		telaDots(100);
		System.out.println(titulo);
		telaDots(100);

	}

	public static void continueOption() {
		System.out.print("\n Pressione qualquer tecla para continuar...");
		scanner.next();
	}

	// comecar o jogo

	public static void startGame() {
		boolean nameSet = false;
		String nome;
		clearConsole();

		telaDots(100);
		telaDots(100);
		System.out.println("----------Bem vindo ao Fantasy One!----------\n");
		System.out.println("---------------------------------------------\n");
		telaDots(100);
		telaDots(100);
		System.out.println("Precione: \n1-Começar Jogo \n2-Sair");
		int escolha = scanner.nextInt();

		switch (escolha) {
		case 1:
			System.out.println(
					"Escolha um personagem: \n1- Bruxo Caçador \n2- Eladrin \n3- Mago Cinzento \n4- Sacerdote \n5- ...");
			escolha = scanner.nextInt();

			do {
				clearConsole();
				printHeading("Qual o nome do seu Heroi? ");
				nome = scanner.next();

				// trocar o nome
				clearConsole();

				printHeading("Nome será: " + nome + ".\n Correto?");
				System.out.println("1- Sim! \n2- Não, quero trocar o nome do meu heroi.");
				int input = escolhaInt("-> ", 2);
				if (input == 1)
					nameSet = true;

			} while (!nameSet);

			if (escolha == 1) {
				BruxoCacador personagem = new BruxoCacador(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 2) {
				Eladrin personagem = new Eladrin(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 3) {
				MagoCinzento personagem = new MagoCinzento(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 4) {
				Sacerdote personagem = new Sacerdote(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 5) {

			} else {
				System.out.println("Escolha inválida!");
			}
			
		case 2:
			System.out.println("Obrigado por jogar Fantasy One!");
			break;
			
		default:
			System.out.println("Valor Inválido!");
		}

	}

}
