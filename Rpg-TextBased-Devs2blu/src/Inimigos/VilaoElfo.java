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
		System.out.printf("|%-91s|%n", "Elfo utilizou seu arco e flecha, causando "+LogicaJogo.VermelhoClaro+"45 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 45"+LogicaJogo.Reseta);
		return 45;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Elfo utilizou sua espada, causando "+LogicaJogo.VermelhoClaro+"50 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 50"+LogicaJogo.Reseta);
		return 50;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Elfo usou luminocese, causando "+LogicaJogo.VermelhoClaro+"60 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 65"+LogicaJogo.Reseta);
			return 65;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Elfo usou magia de luz, causando "+LogicaJogo.VermelhoClaro+"75 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 75"+LogicaJogo.Reseta);
			return 75;
	}

	@Override
	public void defesa() {
			System.out.printf("|%-91s|%n", "Elfo utilizou sua Aura de Cura, aumentando sua "+LogicaJogo.VerdeClaro+"Vida em 20!"+LogicaJogo.Reseta);
			this.setVida(this.getVida() + 20);		
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		if(this.getVida() <= 0) {
			System.out.printf("|%-91s|%n", "Você deferiu um golpe fatal,"+LogicaJogo.VermelhoFun+" Elfo Maligno morreu!"+LogicaJogo.Reseta);
		}else {
			System.out.printf("|%-91s|%n", "Elfo Maligno recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);			
		}
	}

	@Override
	public void historia() {
		FrameElfo fElfo = new FrameElfo();
	}
}
