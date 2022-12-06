package FantasyOne;
import java.util.Scanner;

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
		}
		while (input <1 || input > escolhasUsuario);
		return input;
	}
	
	//Simular outra tela
	public static void clearConsole() {
		for(int i = 0; i < 40; i++)
			System.out.println();
		
	}
	
	//apenas a tela do jogo grafica 
	public static void telaDots(int n) {
		for(int i = 0; i < n; i++)
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
		String name;
		clearConsole();
		
		telaDots(100);
		telaDots(100);
		System.out.println("Lorem Lorem");
		System.out.println("Lorem Lorem lorem");
		telaDots(100);
		telaDots(100);
		continueOption();
		
		//nome do heroi do jogador input
		do {
			clearConsole();
			printHeading("Qual o nome do seu Heroi? ");
			name = scanner.next();
			
			// trocar o nome
			clearConsole();
			
			printHeading("Nome será: " + name + ".\n correto?");
			System.out.println("(1) SIM!");
			System.out.println("(2) Nao, quero trocar o nome do meu heroi.");
			int input = escolhaInt("-> ", 2); 
			if(input == 1)
				nameSet = true;
			
		} while(!nameSet);
		
	}
	
	
	
}
