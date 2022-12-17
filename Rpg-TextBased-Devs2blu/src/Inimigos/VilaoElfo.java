package Inimigos;

import FantasyOne.GameLogic;

public class VilaoElfo extends Vilao{
	
	public VilaoElfo(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Elfo utilizou seu arco e flecha, causando "+GameLogic.VermelhoClaro+"10 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 10"+GameLogic.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Elfo utilizou sua espada, causando "+GameLogic.VermelhoClaro+"15 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 15"+GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Elfo usou luminocese, causando "+GameLogic.VermelhoClaro+"25 de dano!"+GameLogic.Reseta);
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 25"+GameLogic.Reseta);
			return 25;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Elfo usou magia de luz, causando "+GameLogic.VermelhoClaro+"35 de dano!"+GameLogic.Reseta);
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 35"+GameLogic.Reseta);
			return 35;
	}

	@Override
	public void defesa() {
			System.out.printf("|%-91s|%n", "Elfo utilizou sua Aura de Cura, aumentando sua "+GameLogic.VerdeClaro+"Vida em 20!"+GameLogic.Reseta);
			this.setVida(this.getVida() + 20);		
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Elfo recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() +GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Conforme nosso herói começava a se aproximar da subida do vulcão, ele percebeu ");
		System.out.printf("|%-89s|%n", "a presença de um capanga " + GameLogic.VermelhoFun + "Elfo" + GameLogic.Reseta + ", com um longo cabelo negro e orelhas pontudas, ele");
		System.out.printf("|%-80s|%n", "porta uma espada e um cajado, e em suas costas havia um arco. Nosso herói ");
		System.out.printf("|%-80s|%n", "aproxima-se furtivamente e inicia o confronto. Ataque!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}
}
