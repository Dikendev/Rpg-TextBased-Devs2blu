package FantasyOne;
import java.util.Scanner;

public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	
	public static int escolhaInt(String prompt, int escolhaUsuario) {
		int input;
		
		do {
			System.out.println(prompt);
			try {
				input = Integer.parseInt(scanner.next());
			} catch (Exception e) {
				input = -1;
				System.out.println("Escolha um numero válido!");
			}
		}
		while (input <1 || input > escolhaUsuario);
		return input;
	}
	
	public static void clearConsole() {
		for(int i = 0; i < 100; i++)
			System.out.println();
		
	}
	
	public static void telaDots(int n) {
		for(int i = 0; i < n; i++)
			System.out.println("-");
		System.out.println();
	}
	public static void printHeading(String titulo) {
		telaDots(30);
		System.out.println(titulo);
		telaDots(30);
		
	}
	
	public static void continueOption() {
		System.out.println("\n Pressione qualquer tecla para continuar...");
		scanner.next();
		}
	
	
}
