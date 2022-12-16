package Inimigos;

import FantasyOne.GameLogic;

public class ChefaoQuimera extends Vilao{
	
	public ChefaoQuimera(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);	
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "Quimera aplicou uma mordida, causando 10 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Quimera aplicou um corte com suas garras, causando 10 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 15");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp()>0) {
			System.out.printf("|%-80s|%n", "Quimera usou presas venenosas, causando 25 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 25");
			return 25;
		}else {
			System.out.printf("|%-80s|%n", "Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp()>0) {
			System.out.printf("|%-80s|%n", "Quimera usou sopro de fogo, causando 25 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 35");
			return 35;
		}else {
			System.out.printf("|%-80s|%n", "Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Quimera usou proteção de asas! Seu ataque foi anulado.");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Quimera recebeu dano, a vida dela é: " + this.getVida());
	}
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Pela manhã, enquanto caçava, nosso herói percebe a movimentação desesperada dos");
		System.out.printf("|%-80s|%n", "animais da floresta, como se um predador gigante estivesse se aproximando. Então");
		System.out.printf("|%-80s|%n", "ouve-se um grande rugido de leão e logo nosso herói se prepara para o confronto.");
		System.out.printf("|%-80s|%n", "Mas o que ele não esperava era que o predador viria de cima. Com asas de dragão,");
		System.out.printf("|%-89s|%n", "cabeça de leão e calda de serpente, uma " + GameLogic.VermelhoFun + "Quimera" + GameLogic.Reseta + " pairava em sua direção, pronto");
		System.out.printf("|%-80s|%n", "para ter sua refeição. Defenda-se herói e lute por sua vida!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
