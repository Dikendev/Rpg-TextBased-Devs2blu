package FantasyOne;
import java.util.ArrayList;
import java.util.Scanner;
import Herois.BruxoCacador;
import Herois.DeathKnight;
import Herois.Eladrin;
import Herois.MagoCinzento;
import Herois.Personagem;
import Herois.Sacerdote;
import Inimigos.ChefaoMinotauro;
import Inimigos.ChefaoQuimera;
import Inimigos.ChefaoRagnaros;
import Inimigos.Vilao;
import Inimigos.VilaoCapivaraZumbi;
import Inimigos.VilaoDhampir;
import Inimigos.VilaoDragaoDuasCabecas;
import Inimigos.VilaoDuergar;
import Inimigos.VilaoElfo;
import Inimigos.VilaoOrcGuerreiro;
import Inimigos.VilaoVelhoDoSaco;
public class GameLogic {
	static Scanner scanner = new Scanner(System.in);
	public static String jogador;
	public static Personagem personagem;
	
	Personagem bruxoCacador = new BruxoCacador("Bruxo Caçador", 100, 20, 100, 0, 1, 100);

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
		System.out.println(
				"Nosso Herói começa sua jornada na pacata vila de Untirade, um pequeno povoado numa clareira não muito próxima ao Boca do Diabo, um grande vulcão adormecido, lar do maligno Senhor do Fogo Ragnaros que recentemente despertou de seu aprisionamento e agora jura vingança a todos os povos e raças.\r\n"
						+ "Com a ameaça iminente a vida de todos, e guiado por sua honrosa índole, nosso Herói agora caminha em direção a Boca do Diabo para dar fim ao impiedoso legado de Ragnaros.");
		GameLogic.pressioneUmaTecla();

		limparConsole();

		System.out.println(
				"Agora vamos escolher seu herói! Temos diversos heróis disponíveis, confira a seguir cada um deles e escolha o que você achar mais interessante!");
		
		do {
			System.out.println("Escolha seu herói! \n1 - Bruxo Caçador \n2-Eladrin \n3-Mago Cinzento \n4- Sacerdote \n5- Death Knight");
			opcao = scanner.nextInt();
			
			if (opcao == 1) {
				limparConsole();
				personagem = new BruxoCacador("Bruxo Caçador", 100, 0, 100, 2, 1, 3);
				jogador = "Bruxo Caçador";
				imprimirCabecalho("Você escolheu o Bruxo Caçador!");
				pressioneUmaTecla();
			} else if (opcao == 2) {
				limparConsole();
				personagem = new Eladrin("Eladrin", 80, 0, 100, 2, 1, 3);
				imprimirCabecalho("Você escolheu a Eladrin!");
				jogador = "Eladrin";
				pressioneUmaTecla();
			} else if (opcao == 3) {
				limparConsole();
				personagem = new MagoCinzento("Mago Cinzento", 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("Você escolheu o MagoCinzento!");
				jogador = "Mago Cinzento";
				pressioneUmaTecla();
			} else if (opcao == 4) {
				limparConsole();
				personagem = new Sacerdote("Sacerdote", 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("Você escolheu o Sacerdote!");
				jogador = "Sacerdote";
				pressioneUmaTecla();
			} else if (opcao == 5) {
				limparConsole();
				personagem = new DeathKnight("Death Knight", 100, 0, 100, 2, 1, 3);
				imprimirCabecalho("Você escolheu o DeathKnight!");
				jogador = "Death Knight";
				pressioneUmaTecla();
			} else {
				imprimirCabecalho("Escolha uma classe válida!");
			}
		}while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 & opcao != 5);
		
		VilaoOrcGuerreiro orcGuerreiro = new VilaoOrcGuerreiro("Orc Guerreiro", 100);
		VilaoElfo vilaoElfo = new VilaoElfo("Elfo", 100);
		VilaoVelhoDoSaco velhoDoSaco = new VilaoVelhoDoSaco("Velho do Saco", 100);
		VilaoDuergar vilaoDuergar = new VilaoDuergar("Duergar", 100);
		VilaoDragaoDuasCabecas dragaoCabeca = new VilaoDragaoDuasCabecas("Dragão de duas Cabeças", 100);
		VilaoDhampir dhampir = new VilaoDhampir("Dhampir", 100);
		VilaoCapivaraZumbi capivaraZumbi = new VilaoCapivaraZumbi("Capivara Zumbi", 100);
		ChefaoMinotauro minotauro = new ChefaoMinotauro("Minotauro", 100);
		ChefaoQuimera quimera = new ChefaoQuimera("Quimera", 100);
		ChefaoRagnaros ragnaros = new ChefaoRagnaros("Ragnaros", 100);
				
		
		ArrayList<Vilao> inimigos = new ArrayList<Vilao>();
		inimigos.add(orcGuerreiro);
		inimigos.add(vilaoDuergar);
		inimigos.add(minotauro);
		inimigos.add(dragaoCabeca);
		inimigos.add(dhampir);
		inimigos.add(quimera);
		inimigos.add(vilaoElfo);
		inimigos.add(velhoDoSaco);
		inimigos.add(capivaraZumbi);
		inimigos.add(ragnaros);
				
		for(int i = 0; i<inimigos.size(); i++) {
			
			inimigos.get(i).historia();
			
			System.out.println("Início do combate!");
			
			do {
				System.out.println("O turno é seu, selecione um ataque!");
				System.out.println("1- Ataque básico \n2- Ataque rápido \n3- Ataque Especial \n4- Ataque Poderoso");
				int ataque;
				ataque = scanner.nextInt();
				
				switch(ataque) {
				case 1: inimigos.get(i).recebeDano(personagem.ataqueBasico());
				break;
				case 2: inimigos.get(i).recebeDano(personagem.ataqueBasico2());
				break;
				case 3: inimigos.get(i).recebeDano(personagem.ataqueEspecial());
				break;
				case 4: inimigos.get(i).recebeDano(personagem.ataqueEspecial());
				break;
				}
				
				System.out.println("Agora é o turno do oponente!");
				switch((int)Math.floor(Math.random() * 6)) {
				case 1: personagem.recebeDano(inimigos.get(i).ataqueBasico());
				break;
				case 2: personagem.recebeDano(inimigos.get(i).ataqueBasico2());
				break;
				case 3: personagem.recebeDano(inimigos.get(i).ataqueEspecial());
				break;
				case 4: personagem.recebeDano(inimigos.get(i).ataqueEspecial2());
				break;
				}
				
				System.out.println(personagem.getVida());
				System.out.println(inimigos.get(i).getVida());
				
			}while(personagem.getVida() != 0 && inimigos.get(i).getVida() != 0);	
			
		}
		
	}
	
// Método para mostrar informações do personagem
	public static void infoPersonagem() {
			limparConsole();
			imprimirCabecalho("Informações gerais:");
			
				System.out.println("Nome: " + personagem.getNome());
				System.out.println("Vida: " + personagem.getVida() + "/" + personagem.getMaxVida());
				System.out.println("XP: " + personagem.getXp());
				System.out.println("Mana:" + personagem.getMp());
				System.out.println("Quantidade de Poções: " + personagem.getPocao());
				System.out.println("Nível:" + personagem.getNivel());
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

	
	}	