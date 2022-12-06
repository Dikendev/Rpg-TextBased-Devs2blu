package Herois;
import FantasyOne.Atributos;

public class DeathKnight extends Atributos {
		public DeathKnight(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
			super(nome, maxVida, xp, vida, pocao, nivel, mp);
			setNome(nome);
			setMaxVida(maxVida);
			setXp(xp);
			setVida(vida);
			setPocao(pocao);
			setNivel(nivel);
			setMp(mp);
		}
		
		@Override
		public int ataqueBasico() {
			System.out.println("Dk aplicou o soco da morte, causando 10 de dano!");
			return 10;
		}

		@Override
		public int ataqueBasico2() {
			System.out.println("Dk usou a espada do rei , causando 12 de dano!");
			return 12;
		}

		@Override
		public int ataqueEspecial() {
			if(getMp() > 0) {
				System.out.println("Invocou os servos das trevas, causando 20 de dano!");
				setMp(getMp() - 1);
				return 20;			
			} else {
				System.out.println("Sem mana suficiente para os servos das trevas");
				return 0;
			}
		}

		@Override
		public int ataqueEspecial2() {
			if(getMp() > 0) {
				System.out.println("Você usou Exorcizar para expurgar seu inimigo, causando 25 de dano!");
				setMp(getMp() - 1);			
				return 25;
			} else {
				System.out.println("Você tenta, mas não possui mana suficiente para Exorcizar!");
				return 0;
			}
		}

		@Override
		public int defesa() {
			System.out.println("Você usa a Troca sanguinea e cura 10 pontos de vida!");
			return 10;
		}

		@Override
		public void recebeDano(int dano) {
			setVida(getVida() - dano);
			System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + getVida());
		}
		
		@Override
		public void usarPocao() {
			if(getPocao() > 0) {
				setPocao(getPocao() - 1);			
				setVida(getVida() + 20);
			} else {
				System.out.println("Você não possui Poções de Cura!");
			}
			System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + getVida());
		}

	}