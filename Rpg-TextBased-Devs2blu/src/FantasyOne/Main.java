package FantasyOne;

import java.util.Scanner;

import Herois.BruxoCacador;
import Herois.Eladrin;
import Herois.MagoCinzento;
import Herois.Sacerdote;
import Inimigos.VilaoDragaoDuasCabecas;


public class Main {

	public static void main(String[] args) {
		GameLogic.startGame();

		Scanner scan = new Scanner(System.in);

		System.out.println("----------Bem vindo ao Fantasy One!----------\n");
		System.out.println("Precione: \n1-Começar Jogo \n2-Sair");
		int escolha = scan.nextInt();

		switch (escolha) {
		case 1:
			System.out.println("Escolha um personagem: \n1- Bruxo Caçador \n2- Eladrin \n3- Mago Cinzento \n4- Sacerdote \n5- ...");
			escolha = scan.nextInt();

			System.out.println("Digite o nome do seu personagem: ");
			String nome = scan.next();

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
		
	
		

		//começar história inicial e logo em seguida primeira luta
	}
}
