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
		System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
		System.out.printf("|%-80s|%n", "causando 12 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if (getMp() > 0) {
			System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
			System.out.printf("|%-80s|%n", "causando 20 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 20");
			setMp(getMp() - 1);
			return 20;
		} else {
			System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if (getMp() > 0) {
			System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 25 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 25");
			setMp(getMp() - 1);
			return 25;
		} else {
			System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		if (this.getMp() >= 2) {
			System.out.printf("|%-80s|%n", "Você usa a oração celestial e cura 15 pontos de vida!");
			this.setVida(getVida() + 15);
		} else {
			System.out.printf("|%-80s|%n", "Sem mana suficiente para recuperar vida!");
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		if (this.getPocao() > 0) {
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
		System.out.printf("|%-80s|%n", "Com sua tunica branca e seu cajado adornado em prata e ouro, o Sacerdote usa sua");
		System.out.printf("|%-80s|%n", "fé e o poder divino para subjulgar seus inimigos. \nUsando orações ele é capaz");
		System.out.printf("|%-80s|%n", "de causar grande dano ou curar a sí mesmo.");

		GameLogic.pressioneUmaTecla();
	}

}
