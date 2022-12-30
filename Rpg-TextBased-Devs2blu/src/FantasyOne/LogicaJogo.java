package FantasyOne;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Frames.FrameAto101;
import Frames.FrameBoasVindas;
import Frames.FrameCreditoss;
import Frames.FrameGameOver;
import Herois.*;
import Inimigos.*;
import Sounds.SoundEffects;

public class LogicaJogo {
	static Scanner scanner = new Scanner(System.in);
	public static String jogador;
	public static Personagem personagem;
	public static String nomeJogador;
	public static SoundEffects se = new SoundEffects();
// Efeitos do combate
	private static final String SOM_ATAQUE_BASICO = ".//src//Sounds//assets//ataqueBasico.wav";
	private static final String SOUND_FAST_ATTACK = ".//src//Sounds//assets//ataqueRapido.wav";
	private static final String SOUND_SPECIAL_ATTACK = ".//src//Sounds//assets//ataqueEspecial.wav";
	private static final String SOUND_SPECIAL_ATTACK_2 = ".//src//Sounds//assets//ataqueEspecial2.wav";
	private static final String SOUND_HEAL = ".//src//Sounds//assets//heal.wav";
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
	
// Monta uma linha pontilhada para melhorar a visibilidade no console
	public static void linhaPontilhada() {
		System.out.printf("|--------------------------------------------------------------------------------|%n");
	}

//Monta um cabecalho com um titulo
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
		ascci();
		se.setFile(".//src//Sounds//assets//soundBack.wav");
		se.play();
		System.out.println("");
		linhaPontilhada();
		
		System.out.printf("|%-91s|%n", ("                                  " + CianoSub + "Fantasy-One" + Reseta));
		linhaPontilhada();
		System.out.printf("|%-80s|%n", "                        Primeiramente, digite seu nome: ");
		linhaPontilhada();
		Scanner scan = new Scanner(System.in);
		nomeJogador = scan.next();
// Chama o segundo frame		
		FrameAto101 frame02 = new FrameAto101();
		
		
		limparConsole();
		
// Loop para escolha do personagem		
		do {
			linhaPontilhada();
			System.out.printf("|%-113s|%n", BrancoSub + "É chegada a hora, " + Reseta + CianoSub + nomeJogador + Reseta + BrancoSub +", escolha seu herói!" + Reseta);
			System.out.printf("|%-91s|%n", "1 - "+AmareloSub+"Bruxo Caçador"+Reseta);
			System.out.printf("|%-91s|%n", "2 - "+VerdeSub+"Eladrin"+Reseta);
			System.out.printf("|%-91s|%n", "3 - "+RoxoSub+"Mago Cinzento"+Reseta);
			System.out.printf("|%-91s|%n", "4 - "+CianoClaroSub+"Sacerdote"+Reseta);
			System.out.printf("|%-91s|%n", "5 - "+VermelhoSub+"Death Knight"+Reseta);
			linhaPontilhada();
			se.setFile(".//src//Sounds//assets//escolhaHeroi.wav");

			Scanner sc = new Scanner(System.in);
			
			try {
				opcao = sc.nextInt();	
			
			if (opcao == 1) {
				se.playEffectButton();
				limparConsole();
				personagem = new BruxoCacador("Bruxo Caçador", 100, 0, 100, 2, 1, 3);
				jogador = "Bruxo Caçador";
				imprimirCabecalho("Você escolheu o " + AmareloSub + "Bruxo Caçador!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 2) {
				se.playEffectButton();
				limparConsole();
				personagem = new Eladrin("Eladrin", 80, 0, 100, 2, 1, 3);
				jogador = "Eladrin";
				imprimirCabecalho("Você escolheu a" + VerdeSub + "Eladrin!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 3) {
				se.playEffectButton();
				limparConsole();
				personagem = new MagoCinzento("Mago Cinzento", 100, 0, 100, 2, 1, 3);
				jogador = "Mago Cinzento";
				imprimirCabecalho("Você escolheu o " + RoxoSub + "MagoCinzento!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 4) {
				se.playEffectButton();
				limparConsole();
				personagem = new Sacerdote("Sacerdote", 100, 0, 100, 2, 1, 3);
				jogador = "Sacerdote";
				imprimirCabecalho("Você escolheu o " + CianoClaroSub + "Sacerdote!" + Reseta, 91);
				pressioneUmaTecla();
			} else if (opcao == 5) {
				se.playEffectButton();
				limparConsole();
				personagem = new DeathKnight("Death Knight", 100, 0, 100, 2, 1, 3);
				jogador = "Death Knight";
				imprimirCabecalho("Você escolheu o " + VermelhoSub + "DeathKnight!" + Reseta, 91);
				pressioneUmaTecla();
			} else {
				// erro sound
				imprimirCabecalho("Escolha uma classe válida!", 80);
			}
			}catch(InputMismatchException e) {
                System.out.println("Por favor digite um número");
                }
			
		}while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 & opcao != 5);
		
		isRunning = true;
		sistemaCombate();
		
		
		
	}
	
	public static void ascci() {	
		try {
			FileReader reader = new FileReader("./src/images/art.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);
				data = reader.read();	
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Adicionando os inimigos em ordem numa List
	public static List<Vilao> criarInimigos() {
		List<Vilao> inimigos = new ArrayList<>();
		
		inimigos.add(new VilaoOrcGuerreiro("Orc Guerreiro", 100, "Vilao"));
		inimigos.add(new VilaoVelhoDoSaco("Velho do Saco", 175, "Vilao"));
		inimigos.add(new VilaoElfo("Elfo", 170, "Vilao"));
		inimigos.add(new VilaoDuergar("Duergar", 120, "Vilao"));
		inimigos.add(new ChefaoMinotauro("Minotauro", 155, "Chefe"));
		inimigos.add(new VilaoDragaoDuasCabecas("Dragão de duas Cabeças", 155, "Vilao"));
		inimigos.add(new VilaoDhampir("Dhampir", 150, "Vilao"));
		inimigos.add(new VilaoCapivaraZumbi("Capivara Zumbi", 170, "Vilao"));
		inimigos.add(new ChefaoQuimera("Quimera", 150, "Chefe"));
		inimigos.add(new ChefaoRagnaros("Ragnaros", 200, "Chefe"));
		return inimigos;		
	}

	public static void sistemaCombate() {
		List<Vilao> inimigos = criarInimigos();
		
		for (int i = 0; i < inimigos.size(); i++) {
			
			if (personagem.getVida() > 0) {

			inimigos.get(i).historia();
			imprimirCabecalho((Ciano +"Início do combate!"+ Reseta), 91);					

			do {
				linhaPontilhada();
				menuAtaque();
				linhaPontilhada();
				int ataque;
				ataque = scanner.nextInt();
				
				switch (ataque) {
				case 1:
					se.setFile(SOM_ATAQUE_BASICO);
					se.playEffectButton();
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueBasico());
					break;
				case 2:
					se.setFile(SOUND_FAST_ATTACK);
					se.playEffectButton();
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueBasico2());
					break;
				case 3:
					se.setFile(SOUND_SPECIAL_ATTACK);
					se.playEffectButton();
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueEspecial());
					break;
				case 4:
					se.setFile(SOUND_SPECIAL_ATTACK_2);
					se.playEffectButton();
					limparConsole();
					inimigos.get(i).recebeDano(personagem.ataqueEspecial2());
					break;
				case 5:
					limparConsole();
					personagem.defesa();
					break;
				case 6:
					se.setFile(SOUND_HEAL);
					se.playEffectButton();
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

			}while(personagem.getVida() > 0 && inimigos.get(i).getVida() > 0);
			
//Pós morte do inimigo
			if (inimigos.get(i).getVida() <= 0) {
				if (inimigos.get(i).getTipo().equalsIgnoreCase("Chefe")) {
					limparConsole();
					imprimirCabecalho((CianoSub +"Você derrotou o Chefe!" + Reseta), 91);
					personagem.ganhoXpChefoes();
					personagem.subirNivel();
					personagem.setVida(personagem.getMaxVida());
				} else {
					limparConsole();
					imprimirCabecalho((CianoSub +"Você derrotou o Inimigo!" + Reseta), 91);
					personagem.ganhoXpViloes();
					personagem.subirNivel();
					personagem.setVida(personagem.getMaxVida());
				}
				switch ((int) Math.floor(Math.random() * 3) + 1) {
				case 1:imprimirCabecalho(("Após sua batalha, você descansou em baixo de uma árvore, " + VerdeClaro + "vida restaurada!" + Reseta), 91);
				break;
				case 2:imprimirCabecalho(("Após sua batalha, você come algumas frutas que encontrou, " + VerdeClaro + "vida restaurada!" + Reseta), 91);
				break;
				case 3:imprimirCabecalho(("Após sua batalha, você cuida de seus ferimentos, " + VerdeClaro + "vida restaurada!" + Reseta), 91);
				break;
				case 4:imprimirCabecalho(("Após sua batalha, você descansou próximo a um altar, " + VerdeClaro + "vida restaurada!" + Reseta), 91);
				break;
				}
				pressioneUmaTecla();
			} else if(personagem.getVida() <= 0) {	
				FrameGameOver frameOver = new FrameGameOver();
				imprimirCabecalho((CianoSub+"Game Over!"+Reseta), 91);
				se.stop();
				
			} 
			} 
			}
			int i =0;
			if (personagem.getVida() > 0 && inimigos.get(i).getVida() <= 0) {
				//Chama a tela de creditos após os combates terminarem.
				
				FrameCreditoss fc= new FrameCreditoss();
				fc.setVisible(true);
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
	public static void menuJogoContinuar() {
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
			menuJogoContinuar();
			int input = escolhaUsuario("->", 3);
			if (input == 1) {
				comecaJogo();
				isRunning = true;
			}
				
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