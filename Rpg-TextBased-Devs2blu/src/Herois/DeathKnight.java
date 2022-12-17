package Herois;

import FantasyOne.GameLogic;

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
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando "+ GameLogic.VermelhoClaro +"10 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 10" + GameLogic.Reseta);
				return 10;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 15 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 15" + GameLogic.Reseta);
				return 15;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 20 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 20" + GameLogic.Reseta);
				return 20;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 25 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 25" + GameLogic.Reseta);
				return 25;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 30 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 30" + GameLogic.Reseta);
				return 30;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 35 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 35" + GameLogic.Reseta);
				return 35;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando"+ GameLogic.VermelhoClaro +" 40 de dano!" + GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 40" + GameLogic.Reseta);
				return 40;
			}else return 0;
		}

		@Override
		public int ataqueBasico2() {
			if(this.getNivel() == 1) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"15 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 15"+ GameLogic.Reseta);
				return 15;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"20 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 20"+ GameLogic.Reseta);
				return 20;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"25 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 25"+ GameLogic.Reseta);
				return 25;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"30 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 30"+ GameLogic.Reseta);
				return 30;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"35 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 35"+ GameLogic.Reseta);
				return 35;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"40 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 40"+ GameLogic.Reseta);
				return 40;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ GameLogic.VermelhoClaro +"45 de dano!"+ GameLogic.Reseta);
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 45"+ GameLogic.Reseta);
				return 45;
			}else return 0;
		}

		@Override
		public int ataqueEspecial() {
			if(this.getNivel() == 1) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"30 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 30" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"35 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 35" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 35;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"40 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 40" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 40;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"45 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 45" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 45;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"50 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 50" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 50;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"55 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 55" + GameLogic.Reseta);
					this.setMp(this.getMp() - 1);
					return 55;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ GameLogic.VermelhoClaro+"60 de dano!" + GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 60" + GameLogic.Reseta);
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
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"30 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 30"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"35 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 35"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 35;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"40 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 40"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 40;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"45 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 45"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 45;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"50 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 50"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 50;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"55 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 55"+ GameLogic.Reseta);
					this.setMp(this.getMp() - 1);			
					return 55;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ GameLogic.VermelhoClaro+"60 de dano!"+ GameLogic.Reseta);
					System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 60"+ GameLogic.Reseta);
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
			System.out.printf("|%-91s|%n", "Você usa a Troca sanguinea e "+ GameLogic.VerdeClaro +"cura 10 pontos de vida!"+ GameLogic.Reseta);
			this.setVida(this.getVida() + 20);
		}

		@Override
		public void recebeDano(int dano) {
			this.setVida(this.getVida() - dano);
			System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
		}
		
		@Override
		public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 20);
			} else {
				System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
			}
			System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
		}
		
		@Override
		public void historia() {
			GameLogic.linhaPontilhada();
			System.out.println("Historia");
			GameLogic.linhaPontilhada();
			System.out.printf("|%-80s|%n", "Criem suas historias");

			GameLogic.pressioneUmaTecla();
		}

	}