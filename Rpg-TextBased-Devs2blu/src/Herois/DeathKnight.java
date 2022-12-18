package Herois;

import FantasyOne.LogicaJogo;

public class DeathKnight extends Personagem{
		public DeathKnight(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
			super(nome, maxVida, xp, vida, pocao, nivel, mp);
			this.setNome(nome);
			this.setMaxVida(maxVida);
			this.setXp(xp);
			this.setVida(vida);
			this.setPocao(pocao);
			this.setNivel(nivel);
			this.setMp(mp);
		}
		
		@Override
		public int ataqueBasico() {
			if(this.getNivel() == 1) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando "+ LogicaJogo.VermelhoClaro +"10 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 10" + LogicaJogo.Reseta);
				return 10;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 15 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 15" + LogicaJogo.Reseta);
				return 15;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 20 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 20" + LogicaJogo.Reseta);
				return 20;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 25 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 25" + LogicaJogo.Reseta);
				return 25;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 30 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 30" + LogicaJogo.Reseta);
				return 30;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 35 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 35" + LogicaJogo.Reseta);
				return 35;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ LogicaJogo.VermelhoClaro +" 40 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 40" + LogicaJogo.Reseta);
				return 40;
			}else return 0;
		}

		@Override
		public int ataqueBasico2() {
			if(this.getNivel() == 1) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"15 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+ LogicaJogo.Reseta);
				return 15;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"20 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 20"+ LogicaJogo.Reseta);
				return 20;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"25 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 25"+ LogicaJogo.Reseta);
				return 25;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"30 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+ LogicaJogo.Reseta);
				return 30;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"35 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+ LogicaJogo.Reseta);
				return 35;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"40 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 40"+ LogicaJogo.Reseta);
				return 40;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro +"45 de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 45"+ LogicaJogo.Reseta);
				return 45;
			}else return 0;
		}

		@Override
		public int ataqueEspecial() {
			if(this.getNivel() == 1) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"30 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"35 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 35;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"40 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 40" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 40;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"45 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 45" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 45;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"50 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 50" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 50;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"55 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 55" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 55;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro+"60 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 60" + LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);
					return 60;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else return 0;
		}

		@Override
		public int ataqueEspecial2() {
			if(this.getNivel() == 1) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"30 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"35 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 35;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"40 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 40"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 40;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"45 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 45"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 45;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"50 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 50"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 50;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"55 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 55"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 55;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+"60 de dano!"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 60"+ LogicaJogo.Reseta);
					this.setMp(this.getMp() - 1);			
					return 60;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else return 0;
		}

		@Override
		public void defesa() {
			if(this.getNivel() == 1) {
				System.out.printf("|%-91s|%n", "Você usa a Troca sanguinea e "+ LogicaJogo.VerdeClaro +"cura 15 pontos de vida!"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 15);	
				System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
			} else if(this.getNivel() >= 2 && this.getNivel() <= 4) {
				System.out.printf("|%-91s|%n", "Você usa a Troca sanguinea e "+ LogicaJogo.VerdeClaro +"cura 20 pontos de vida!"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 20);				
				System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
			}else if(this.getNivel() >= 5 && this.getNivel() <= 7) {
				System.out.printf("|%-91s|%n", "Você usa a Troca sanguinea e "+ LogicaJogo.VerdeClaro +"cura 30 pontos de vida!"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 30);		
				System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
			}
		}

		@Override
		public void recebeDano(int dano) {
			this.setVida(this.getVida() - dano);
			System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		}
		
		@Override
		public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 20);
			} else {
				System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
			}
			System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		}
		
		@Override
		public void historia() {
			LogicaJogo.linhaPontilhada();
			System.out.println("Historia");
			LogicaJogo.linhaPontilhada();
			System.out.printf("|%-80s|%n", "Criem suas historias");

			LogicaJogo.pressioneUmaTecla();
		}

	}