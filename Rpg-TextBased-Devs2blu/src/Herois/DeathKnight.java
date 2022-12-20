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
			int dano = 5 + (5*this.getNivel());
			
			System.out.printf("|%-91s|%n", "Dk aplicou o soco da morte, causando "+ LogicaJogo.VermelhoClaro + dano +" de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: " + dano + LogicaJogo.Reseta);
			return dano;
		}

		@Override
		public int ataqueBasico2() {
			int dano = 10 + (5*this.getNivel());
			
			System.out.printf("|%-91s|%n", "Dk usou a espada do rei , causando "+ LogicaJogo.VermelhoClaro + dano +" de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
			return dano;
		}

		@Override
		public int ataqueEspecial() {
			int dano = 25 + (5*this.getNivel());
			
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Invocou os servos das trevas, causando "+ LogicaJogo.VermelhoClaro + dano +" de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				return dano;			
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para os servos das trevas");
				return 0;
			}
		}

		@Override
		public int ataqueEspecial2() {
			int dano = 25 + (5*this.getNivel());
			
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Você usou Exorcizar para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+ dano + " de dano!"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);			
				return dano;			
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Exorcizar!");
				return 0;
			}
		}

		@Override
		public void defesa() {
			int vidaRec = 10 + (5*this.getNivel());
			
			System.out.printf("|%-91s|%n", "Você usa a Troca sanguinea e "+ LogicaJogo.VerdeClaro +"cura " + vidaRec + " pontos de vida!"+ LogicaJogo.Reseta);
			this.setVida(this.getVida() + vidaRec);	
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		}

		@Override
		public void recebeDano(int dano) {
			this.setVida(this.getVida() - dano);
			if(this.getVida() <= 0) {
				System.out.printf("|%-91s|%n", "Seu personagem recebeu dano fatal,"+LogicaJogo.VermelhoFun+" você morreu!"+LogicaJogo.Reseta);
			}else {
				System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);			
			}
		}
		
		@Override
		public void usarPocao() {
			if (this.getNivel() == 1) {
				if (this.getPocao() > 0) {
					this.setPocao(this.getPocao() - 1);
					this.setVida(this.getVida() + 20);
				} else {
					System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
				}
			} else if (this.getNivel() >= 2 && this.getNivel() <= 5) {
				if (this.getPocao() > 0) {
					this.setPocao(this.getPocao() - 1);
					this.setVida(this.getVida() + 50);
				} else {
					System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
				}
			} else if (this.getNivel() >= 6 && this.getNivel() <= 7) {
				if (this.getPocao() > 0) {
					this.setPocao(this.getPocao() - 1);
					this.setVida(this.getVida() + 100);
				} else {
					System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
				}
			}
			System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde
					+ this.getVida() + LogicaJogo.Reseta);
		}

}