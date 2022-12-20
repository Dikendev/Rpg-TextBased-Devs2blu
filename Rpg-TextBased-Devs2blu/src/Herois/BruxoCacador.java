package Herois;

import FantasyOne.LogicaJogo;

public class BruxoCacador extends Personagem {
	public BruxoCacador(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
		int dano = 15 + (5*this.getNivel());	
		System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando "+ LogicaJogo.VermelhoClaro + dano + " de dano!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: " + dano + LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueBasico2() {
		int dano = 20 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + dano + " de dano!" + LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: " + dano + LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueEspecial() {
		int dano = 30 + (5*this.getNivel());
		if (this.getMp() > 0) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro + dano + " de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: " + dano + LogicaJogo.Reseta);
			this.setMp(getMp() - 1);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		int dano = 35 + (5*this.getNivel());
		if (this.getMp() > 0) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro + dano +" de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: "+ dano + LogicaJogo.Reseta);
			this.setMp(getMp() - 1);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		int vidaRec = 15 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Bruxo caçador se regenerou, aumentando sua "+ LogicaJogo.VerdeClaro +"Vida em " + vidaRec + LogicaJogo.Reseta);
		this.setVida(this.getVida() + vidaRec);
		System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		if(this.getVida() <= 0) {
			System.out.printf("|%-89s|%n", "Seu personagem recebeu dano fatal,"+LogicaJogo.VermelhoFun+" você morreu!"+LogicaJogo.Reseta);
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
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 2 && this.getNivel() <= 5) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 50);
			} else {
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 6 && this.getNivel() <= 7) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 100);
			} else {
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		}
		System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde
				+ this.getVida() + LogicaJogo.Reseta);
	}

}
