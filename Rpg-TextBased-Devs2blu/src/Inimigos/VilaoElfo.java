package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoElfo extends Vilao{
	
	public VilaoElfo(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Elfo utilizou seu arco e flecha, causando "+LogicaJogo.VermelhoClaro+"10 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 10"+LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Elfo utilizou sua espada, causando "+LogicaJogo.VermelhoClaro+"15 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Elfo usou luminocese, causando "+LogicaJogo.VermelhoClaro+"25 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 25"+LogicaJogo.Reseta);
			return 25;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Elfo usou magia de luz, causando "+LogicaJogo.VermelhoClaro+"35 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+LogicaJogo.Reseta);
			return 35;
	}

	@Override
	public void defesa() {
			System.out.printf("|%-91s|%n", "Elfo utilizou sua Aura de Cura, aumentando sua "+LogicaJogo.VerdeClaro+"Vida em 20!"+LogicaJogo.Reseta);
			this.setVida(this.getVida() + 20);		
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Elfo recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() +LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Conforme nosso herói começava a se aproximar da subida do vulcão, ele percebeu ");
		System.out.printf("|%-89s|%n", "a presença de um capanga " + LogicaJogo.VermelhoFun + "Elfo" + LogicaJogo.Reseta + ", com um longo cabelo negro e orelhas pontudas, ele");
		System.out.printf("|%-80s|%n", "porta uma espada e um cajado, e em suas costas havia um arco. Nosso herói ");
		System.out.printf("|%-80s|%n", "aproxima-se furtivamente e inicia o confronto. Ataque!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}
}
