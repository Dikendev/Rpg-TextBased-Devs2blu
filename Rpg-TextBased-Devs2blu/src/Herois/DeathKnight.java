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
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 10 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 10");
				return 10;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 15 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 15");
				return 15;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 20 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 20");
				return 20;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 25 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 25");
				return 25;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 30 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 30");
				return 30;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 35");
				return 35;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-80s|%n", "Dk aplicou o soco da morte, causando 40 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 40");
				return 40;
			}else return 0;
		}

		@Override
		public int ataqueBasico2() {
			if(this.getNivel() == 1) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 15 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 15");
				return 15;
			}else if(this.getNivel() == 2) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 20 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 20");
				return 20;
			}else if(this.getNivel() == 3) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 25 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 25");
				return 25;
			}else if(this.getNivel() == 4) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 30 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 30");
				return 30;
			}else if(this.getNivel() == 5) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 35");
				return 35;
			}else if(this.getNivel() == 6) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 40 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 40");
				return 40;
			}else if(this.getNivel() == 7) {
				System.out.printf("|%-80s|%n", "Dk usou a espada do rei , causando 45 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 45");
				return 45;
			}else return 0;
		}

		@Override
		public int ataqueEspecial() {
			if(this.getNivel() == 1) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 30 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 30");
					this.setMp(this.getMp() - 1);
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 35 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 35");
					this.setMp(this.getMp() - 1);
					return 35;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 40 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 40");
					this.setMp(this.getMp() - 1);
					return 40;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 45 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 45");
					this.setMp(this.getMp() - 1);
					return 45;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 50 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 50");
					this.setMp(this.getMp() - 1);
					return 50;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 55 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 55");
					this.setMp(this.getMp() - 1);
					return 55;			
				} else {
					System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Invocou os servos das trevas, causando 60 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 60");
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
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 30 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 30");
					this.setMp(this.getMp() - 1);			
					return 30;			
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 35 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 35");
					this.setMp(this.getMp() - 1);			
					return 35;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 3) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 40 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 40");
					this.setMp(this.getMp() - 1);			
					return 40;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 4) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 45 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 45");
					this.setMp(this.getMp() - 1);			
					return 45;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 5) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 50 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 50");
					this.setMp(this.getMp() - 1);			
					return 50;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 6) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 55 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 55");
					this.setMp(this.getMp() - 1);			
					return 55;		
				} else {
					System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
					return 0;
				}
			}else if(this.getNivel() == 7) {
				if(this.getMp() > 0) {
					System.out.printf("|%-80s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando 60 de dano!");
					System.out.printf("|%-80s|%n", "Dano: 60");
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
			System.out.printf("|%-80s|%n", "Você usa a Troca sanguinea e cura 10 pontos de vida!");
			this.setVida(this.getVida() + 20);
		}

		@Override
		public void recebeDano(int dano) {
			this.setVida(this.getVida() - dano);
			System.out.printf("|%-80s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
		}
		
		@Override
		public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 20);
			} else {
				System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
			}
			System.out.printf("|%-80s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + this.getVida());
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