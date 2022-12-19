package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameElfo;

public class VilaoElfo extends Vilao{
	
	public VilaoElfo(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
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
		FrameElfo fElfo = new FrameElfo();
	}
}
