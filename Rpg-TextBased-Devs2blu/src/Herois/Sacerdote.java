package Herois;

import FantasyOne.GameLogic;

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
		System.out.println("Você lança três arcos de luz, causando 10 de dano! \nDano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println(
				"Você canaliza um raio de luz ofuscante diretamente ao seu inimigo, causando 12 de dano! \nDano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if (getMp() > 0) {
			System.out.println(
					"Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo, causando 20 de dano! \nDano: 20");
			setMp(getMp() - 1);
			return 20;
		} else {
			System.out.println("Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if (getMp() > 0) {
			System.out
					.println("Você usa a Penitência Divína para expurgar seu inimigo, causando 25 de dano! \nDano: 25");
			setMp(getMp() - 1);
			return 25;
		} else {
			System.out.println("Você tenta, mas não possui mana suficiente para Penitência Divína!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		if (this.getMp() >= 2) {
			System.out.println("Você usa a oração celestial e cura 15 pontos de vida!");
			this.setVida(getVida() + 15);
		} else {
			System.out.println("Sem mana suficiente para recuperar vida!");
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		if (this.getPocao() > 0) {
			this.setPocao(this.getPocao() - 1);
			this.setVida(this.getVida() + 20);
		} else {
			System.out.println("Você não possui Poções de Cura!");
		}
		System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + this.getVida());
	}
	
	@Override
	public void historia() {
		GameLogic.telaPontilhada(50);
		System.out.println("Historia");
		GameLogic.telaPontilhada(50);
		System.out.println("Ai sim");
		System.out.println("Criem suas historias");

		GameLogic.pressioneUmaTecla();
	}

}
