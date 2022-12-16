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
		System.out.printf("|%-80s|%n", "Elfo utilizou seu arco e flecha, causando 10 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Elfo utilizou sua espada, causando 15 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp()>0) {
			System.out.printf("|%-80s|%n", "Elfo usou luminocese, causando 25 de dano!");
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
			System.out.printf("|%-80s|%n", "Elfo usou magia de luz, causando 35 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 35");
			return 35;
		}else {
			System.out.printf("|%-80s|%n", "Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		if(this.getMp() >= 2) {
			System.out.printf("|%-80s|%n", "Elfo utilizou sua Aura de Cura, aumentando seu HP em 20!");
			this.setVida(this.getVida() + 20);
		}else {
			System.out.printf("|%-80s|%n", "Sem mana suficiente para recuperar vida!");
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Elfo recebeu dano, a vida dele é: " + this.getVida());
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Conforme nosso herói começava a se aproximar da subida do vulcão, ele percebeu ");
		System.out.printf("|%-80s|%n", "a presença de um capanga Elfo, com um longo cabelo negro e orelhas pontudas, ele");
		System.out.printf("|%-80s|%n", "porta uma espada e um cajado, e em suas costas havia um arco. Nosso herói ");
		System.out.printf("|%-80s|%n", "aproxima-se furtivamente e inicia o confronto. Ataque!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}
}
