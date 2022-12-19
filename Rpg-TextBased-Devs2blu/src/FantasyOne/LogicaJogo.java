package FantasyOne;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Frames.FrameAto101;
import Frames.FrameBoasVindas;
import Frames.FrameGameOver;
import Frames.FrameHerois;
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

public class LogicaJogo {
	static Scanner scanner = new Scanner(System.in);
	public static String jogador;
	public static Personagem personagem;
	public static String nomeJogador;

	// Mótodo para gerar um loop no jogo
	public static boolean isRunning;
	
	// Método para usuário escolher opção
	public static int escolhaUsuario(String prompt, int escolhasUsuario) {
		int input;
		
		do {
			System.out.println(prompt);
			
			try {
				input = Integer.parseInt(scanner.next());
			} catch (Exception e) {
				input = -1;
				System.out.printf("|%-80s|%n", "Escolha um numero válido:");
			}
			
		} while (input < 1 || input > escolhasUsuario);
		return input;
	}

	// Mótodo para simular nova tela
	public static void limparConsole() {
		for (int i = 0; i < 30; i++)
			System.out.printf("|%-80s|%n", "");
		
	}

	// Mótodo pressione qualquer tecla
	public static void pressioneUmaTecla() {
		linhaPontilhada();
		System.out.printf("|%-80s|%n", "Pressione qualquer tecla, em seguida pressione enter para continuar...");
		linhaPontilhada();
		scanner.next();
		limparConsole();
	}
	
	// Exibe apenas a tela do jogo
	public static void linhaPontilhada() {
		System.out.printf("|--------------------------------------------------------------------------------|%n");
	}

	public static void imprimirCabecalho(String titulo, int espacamento) {
		linhaPontilhada();
		System.out.printf("|%-"+espacamento+"s|%n",(titulo));
		linhaPontilhada();

	}

	// Método para comecar o jogo
	public static void comecaJogo() {

		int opcao = 0;
	// Chama o primeiro frame
		FrameBoasVindas frame00 = new FrameBoasVindas();
	// Inicia o jogo	
		linhaPontilhada();
		System.out.printf("|%-91s|%n", ("                                  " + CianoSub + "Fantasy-One" + Reseta));
		linhaPontilhada();
		System.out.printf("|%-80s|%n", "                        Primeiramente, digite seu nome: ");
		linhaPontilhada();
		Scanner scan = new Scanner(System.in);
		nomeJogador = scan.next();
		FrameAto101 frame02 = new FrameAto101();

		
		limparConsole();
		
		
		do {
			System.out.printf("|%-91s|%n", BrancoSub + nomeJogador + "Escolha seu herói!\n" + Reseta);
			System.out.printf("|%-91s|%n", "1 -"+AmareloSub+" Bruxo Caçador"+Reseta);
			System.out.printf("|%-91s|%n", "2 -"+VerdeSub+" Eladrin"+Reseta);
			System.out.printf("|%-91s|%n", "3 -"+RoxoSub+" Mago Cinzento"+Reseta);
			System.out.printf("|%-91s|%n", "4 -"+CianoClaroSub+" Sacerdote"+Reseta);
			System.out.printf("|%-91s|%n", "5 -"+VermelhoSub+" Death Knight"+Reseta);



			Scanner sc = new Scanner(System.in);
			
			try {
				opcao = sc.nextInt();	
			
			if (opcao == 1) {
				limparConsole();
				personagem = new BruxoCacador("Bruxo Caçador", 100, 0, 100, 2, 1, 3);
				jogador = "Bruxo Caçador";
				imprimirCabecalho("Você escolheu o " + AmareloSub + "Bruxo Caçador!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 2) {
				limparConsole();
				personagem = new Eladrin("Eladrin", 80, 0, 100, 2, 1, 3);
				jogador = "Eladrin";
				imprimirCabecalho("Você escolheu a" + VerdeSub + "Eladrin!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 3) {
				limparConsole();
				personagem = new MagoCinzento("Mago Cinzento", 100, 0, 100, 2, 1, 3);
				jogador = "Mago Cinzento";
				imprimirCabecalho("Você escolheu o " + RoxoSub + "MagoCinzento!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 4) {
				limparConsole();
				personagem = new Sacerdote("Sacerdote", 100, 0, 100, 2, 1, 3);
				jogador = "Sacerdote";
				imprimirCabecalho("Você escolheu o " + CianoClaroSub + "Sacerdote!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 5) {
				limparConsole();
				personagem = new DeathKnight("Death Knight", 100, 0, 100, 2, 1, 3);
				jogador = "Death Knight";
				imprimirCabecalho("Você escolheu o " + VermelhoSub + "DeathKnight!" + Reseta, 91);
				pressioneUmaTecla();
			} else {
				imprimirCabecalho("Escolha uma classe válida!", 80);
			}
			}catch(InputMismatchException e) {
                System.out.println("Por favor digite um número");
                }
			
		}while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 & opcao != 5);
		
		VilaoOrcGuerreiro orcGuerreiro = new VilaoOrcGuerreiro("Orc Guerreiro", 100, "Vilao");
		VilaoElfo vilaoElfo = new VilaoElfo("Elfo", 100, "Vilao");
		VilaoVelhoDoSaco velhoDoSaco = new VilaoVelhoDoSaco("Velho do Saco", 100, "Vilao");
		VilaoDuergar vilaoDuergar = new VilaoDuergar("Duergar", 100, "Vilao");
		VilaoDragaoDuasCabecas dragaoCabeca = new VilaoDragaoDuasCabecas("Dragão de duas Cabeças", 100, "Vilao");
		VilaoDhampir dhampir = new VilaoDhampir("Dhampir", 100, "Vilao");
		VilaoCapivaraZumbi capivaraZumbi = new VilaoCapivaraZumbi("Capivara Zumbi", 100, "Vilao");
		ChefaoMinotauro minotauro = new ChefaoMinotauro("Minotauro", 100, "Chefe");
		ChefaoQuimera quimera = new ChefaoQuimera("Quimera", 100, "Chefe");
		ChefaoRagnaros ragnaros = new ChefaoRagnaros("Ragnaros", 100, "Chefe");
				
		
		ArrayList<Vilao> inimigos = new ArrayList<Vilao>();
		inimigos.add(orcGuerreiro);
		inimigos.add(vilaoDuergar);
		inimigos.add(minotauro);
		inimigos.add(dragaoCabeca);
		inimigos.add(dhampir);
		inimigos.add(quimera);
		inimigos.add(vilaoElfo);
		inimigos.add(capivaraZumbi);
		inimigos.add(velhoDoSaco);
		inimigos.add(ragnaros);

		for (int i = 0; i < inimigos.size(); i++) {

			inimigos.get(i).historia();
			linhaPontilhada();
			System.out.printf("|%-80s|%n", "Início do combate!");
			linhaPontilhada();

			do {
				linhaPontilhada();
				menuAtaque();
				linhaPontilhada();
				int ataque;
				ataque = scanner.nextInt();

				switch (ataque) {
				case 1:
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueBasico());
					break;
				case 2:
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueBasico2());
					break;
				case 3:
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueEspecial());
					break;
				case 4:
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueEspecial2());
					break;
				case 5:
					limparConsole();
					personagem.defesa();
					break;
				case 6:
					limparConsole();
					personagem.usarPocao();
					break;
				case 7:
					limparConsole();
					infoPersonagem();
					menuAtaque();
					ataque = scanner.nextInt();
					if (ataque == 1) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueBasico());
					} else if (ataque == 2) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueBasico2());
					} else if (ataque == 3) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueEspecial());
					} else if (ataque == 4) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueEspecial2());
					} else if (ataque == 5) {
						limparConsole();
						personagem.defesa();
					} else if (ataque == 6) {
						limparConsole();
						personagem.usarPocao();
					} else {
						break;
					}
					break;
				default:
					menuAtaque();
					ataque = scanner.nextInt();
					if (ataque == 1) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueBasico());
					} else if (ataque == 2) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueBasico2());
					} else if (ataque == 3) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueEspecial());
					} else if (ataque == 4) {
						limparConsole();
						inimigos.get(i).recebeDano(personagem.ataqueEspecial2());
					} else if (ataque == 5) {
						limparConsole();
						personagem.defesa();
					} else if (ataque == 6) {
						limparConsole();
						personagem.usarPocao();
					} else {
						break;
					}
					break;
				}

				linhaPontilhada();
				System.out.printf("|%-80s|%n", "Agora é o turno do oponente!");
				switch ((int) Math.floor(Math.random() * 4) + 1) {
				case 1:
					personagem.recebeDano(inimigos.get(i).ataqueBasico());
					break;
				case 2:
					personagem.recebeDano(inimigos.get(i).ataqueBasico2());
					break;
				case 3:
					personagem.recebeDano(inimigos.get(i).ataqueEspecial());
					break;
				case 4:
					personagem.recebeDano(inimigos.get(i).ataqueEspecial2());
					break;
				case 5:
					inimigos.get(i).defesa();
					break;
				}

			} while (personagem.getVida() > 0 && inimigos.get(i).getVida() > 0);
			if (inimigos.get(i).getVida() <= 0) {
				if (inimigos.get(i).getTipo().equalsIgnoreCase("Chefe")) {
					personagem.ganhoXpChefoes();
					personagem.subirNivel();
					personagem.setVida(personagem.getMaxVida());
				} else {
					personagem.ganhoXpViloes();
					personagem.subirNivel();
					personagem.setVida(personagem.getMaxVida());
				}
			} else if (personagem.getVida() <= 0) {
				FrameGameOver frameOver = new FrameGameOver();
//			System.out.println("Game Over, pressione uma tecla para recomeçar!");
//			comecaJogo();
			}

		}

	}
	
// Método para mostrar informações do personagem
	public static void infoPersonagem() {
			imprimirCabecalho("Informações gerais:", 80);
			
			    System.out.printf("|%-80s|%n", "Nome: " + personagem.getNome());
			    System.out.printf("|%-80s|%n", "Vida: " + personagem.getVida() + "/" + personagem.getMaxVida());
			    System.out.printf("|%-80s|%n", "XP: " + personagem.getXp());
			    System.out.printf("|%-80s|%n", "Mana:" + personagem.getMp());
			    System.out.printf("|%-80s|%n", "Quantidade de Poções: " + personagem.getPocao());
			    if(personagem.getNivel() == 7) {
			    	System.out.printf("|%-89s|%n", CianoSub + "Nível Máximo" + Reseta);
			    } else {
			    	System.out.printf("|%-80s|%n", "Nível:" + personagem.getNivel());			    	
			    }
			}
	
// Método para impressao do menu de ataque
	public static void menuAtaque() {
		System.out.printf("|%-80s|%n", "O turno é seu, selecione um ataque!");
		System.out.printf("|%-91s|%n", VermelhoClaro + "1" + Reseta + " - Ataque básico");
		System.out.printf("|%-91s|%n", VermelhoClaro + "2" + Reseta + " - Ataque rápido");
		System.out.printf("|%-91s|%n", VermelhoClaro + "3" + Reseta + " - Ataque Especial");
		System.out.printf("|%-91s|%n", VermelhoClaro + "4" + Reseta + " - Ataque Poderoso");
		System.out.printf("|%-91s|%n", VerdeClaro + "5" + Reseta + " - Defender");
		System.out.printf("|%-91s|%n", VerdeClaro + "6" + Reseta + " - Usar Poção");
		System.out.printf("|%-91s|%n", BrancoSub + "7" + Reseta + " - Status do Personagem");
	}

// MENU DO JOGO
	public static void menuJogo() {
		limparConsole();
		imprimirCabecalho("Menu", 80);
		System.out.printf("|%-80s|%n", "Escolha uma opçao");
		linhaPontilhada();
		System.out.printf("|%-80s|%n", "(1) Continuar: ");
		System.out.printf("|%-80s|%n", "(3) Sair: ");
	}

// LOOP DO JOGO
	public static void cicloJogo() {
		while (isRunning) {
			menuJogo();
			int input = escolhaUsuario("->", 3);
			if (input == 1)
				isRunning = true;
			else
				isRunning = false;
		}
	}
	
	
	//Cores para o Console
	public static final String Reseta = "\033[0m";
	public static final String Ciano = "\033[0;36m";
	public static final String CianoSub = "\033[4;36m";
	public static final String BrancoSub = "\033[4;37m";
	public static final String Roxo = "\033[0;35m";
	public static final String RoxoSub = "\033[4;35m";
	public static final String Verde = "\033[0;32m";
	public static final String VerdeSub = "\033[4;32m";
	public static final String VerdeClaro = "\033[0;92m";
	public static final String Amarelo = "\033[0;33m";
	public static final String AmareloSub = "\033[4;33m";
	public static final String CianoClaro = "\033[0;96m";
	public static final String CianoClaroSub = "\033[4;96m";
	public static final String Vermelho = "\033[0;31m";
	public static final String VermelhoSub = "\033[4;31m";
	public static final String VermelhoFun= "\033[41m";
	public static final String VermelhoClaro = "\033[0;91m";
	
	}	