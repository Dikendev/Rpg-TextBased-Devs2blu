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
		System.out.println("Pressione: \n1-Começar Jogo \n2-Sair");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1:
			limparConsole();
			imprimirCabecalho(
					"Escolha um personagem: \n1- Bruxo Caçador \n2- Eladrin \n3- Mago Cinzento \n4- Sacerdote \n5- Death Knight");
			escolha = scanner.nextInt();
			
			do {
				limparConsole();
				imprimirCabecalho("Qual o nome do Jogador? ");
				nome = scanner.next();
				
				// trocar o nome
				

				limparConsole();
				imprimirCabecalho("Seu nome é: " + nome + ".\n Está correto?");
				System.out.println("1- Sim! \n2- Não, quero mudar o nome.");

				int input = escolhaInt("-> ", 2);
				if (input == 1)
					nomeSet = true;

			} while (!nomeSet);

			//Escolha do personagem e criação do objeto;
			if (escolha == 1) {
				BruxoCacador personagem = new BruxoCacador(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 2) {
				Eladrin personagem = new Eladrin(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 3) {
				MagoCinzento personagem = new MagoCinzento(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 4) {
				Sacerdote personagem = new Sacerdote(nome, 100, 0, 100, 2, 1, 3);
			} else if (escolha == 5) {
				DeathKnight personagem = new DeathKnight(nome, 100, 0, 100, 2, 1, 3);
			} else {
				System.out.println("Escolha inválida!");
			}
			
		case 2:
			System.out.println("Obrigado por jogar Fantasy One!");
			break;
			
		default:
			System.out.println("Valor inválido!");
		}
		telaPontilhada(100);		


	}
	
	public static void MenuGame() {
        limparConsole();
        imprimirCabecalho("Menu");
        System.out.println("Escolha uma opçao");
        telaPontilhada(20);
        System.out.println("(1) Continuar: ");
        System.out.println("(2) Infor Jogador: ");
        System.out.println("(3) Sair: ");
    }

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
