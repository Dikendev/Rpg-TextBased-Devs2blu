package Herois;

import FantasyOne.LogicaJogo;

public class Eladrin extends Personagem {
	public Eladrin(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
		
		System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano + LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueBasico2() {
		int dano = 10 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano + LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueEspecial() {
		int dano = 30 + (5*this.getNivel());
		int vidaRec = 5 + (5*this.getNivel());
		if (getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de " + vidaRec + LogicaJogo.Reseta);
			this.setVida(this.getVida() + vidaRec);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		int dano = 30 + (5*this.getNivel());
		if(this.getMp() > 0) {
			System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano + LogicaJogo.Reseta);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		int vidaRec = 15 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Você usa a RAIZES DE CURA e" + LogicaJogo.VerdeClaro +" recuperando "+ vidaRec + " pontos de vida!" + LogicaJogo.Reseta);
		this.setVida(getVida() + 15);
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
