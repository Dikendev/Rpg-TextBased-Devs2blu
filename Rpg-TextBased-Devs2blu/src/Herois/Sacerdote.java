package Herois;

import FantasyOne.Criatura;

public class Sacerdote extends Criatura {

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
		System.out.println("Você lança três arcos de luz, causando 10 de dano!");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Você canaliza um raio de luz ofuscante diretamente ao seu inimigo, causando 12 de dano!");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if (getMp() > 0) {
			System.out.println("Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo, causando 20 de dano!");
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
			System.out.println("Você usa a Penitência Divína para expurgar seu inimigo, causando 25 de dano!");
			setMp(getMp() - 1);
			return 25;
		} else {
			System.out.println("Você tenta, mas não possui mana suficiente para Penitência Divína!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.println("Você usa a oração celestial e cura 10 pontos de vida!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + getVida());
	}

	@Override
	public void usarPocao() {
		if (getPocao() > 0) {
			setPocao(getPocao() - 1);
			setVida(getVida() + 20);
		} else {
			System.out.println("Você não possui Poções de Cura!");
		}
		System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + getVida());
	}

}
