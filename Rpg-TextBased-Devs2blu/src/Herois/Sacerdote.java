package Herois;

import FantasyOne.LogicaJogo;

public class Sacerdote extends Personagem {

	public Sacerdote(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
		int dano = 10 + (5*this.getVida());
		if(this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Você lança três arcos de luz, causando "+ LogicaJogo.VermelhoClaro+ dano +" de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
			return dano;
		}else return 0;
	}

	@Override
	public int ataqueBasico2() {
		int dano = 20 + (5*this.getVida());
		System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
		System.out.printf("|%-91s|%n", "causando "+ LogicaJogo.VermelhoClaro+ dano +" de dano!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueEspecial() {
		int dano = 25 + (5*this.getVida());
		if (this.getMp() > 0) {
			System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
			System.out.printf("|%-91s|%n", "causando "+ LogicaJogo.VermelhoClaro+ dano +" de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano + LogicaJogo.Reseta);
			this.setMp(this.getMp() - 1);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		int dano = 30 + (5*this.getVida());
		if (this.getMp() > 0) {
			System.out.printf("|%-91s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando "+ LogicaJogo.VermelhoClaro+ dano +" de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: " + dano +LogicaJogo.Reseta);
			this.setMp(this.getMp() - 1);
			return 35;
		} else {
			System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		int vidaRec = 10 + (5*this.getVida());
		if (this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Você usa a oração celestial e" + LogicaJogo.VerdeClaro +" cura " + vidaRec +" pontos de vida!" + LogicaJogo.Reseta);
			this.setVida(getVida() + vidaRec);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		}
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
