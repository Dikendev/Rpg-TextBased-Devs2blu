package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameCapivaraZumbi;

public class VilaoCapivaraZumbi extends Vilao{
	
	public VilaoCapivaraZumbi(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ataque "+LogicaJogo.VermelhoClaro+"CHUTE"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 45"+ LogicaJogo.Reseta);
		return 45;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque com "+LogicaJogo.VermelhoClaro+"MORDIDA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 50"+ LogicaJogo.Reseta);
		return 50;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"Grande mordida!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 60"+ LogicaJogo.Reseta);
		return 60;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"MORDIDA COM O VIRUS DA RAIVA!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 65"+ LogicaJogo.Reseta);
		return 65;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Capivara Zumbi come um cadáver e recupera "+LogicaJogo.VerdeClaro+"30 de vida!"+LogicaJogo.Reseta);
		this.setVida(this.getVida()+30);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Capivara recebeu dano, a vida dela é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		FrameCapivaraZumbi fCapivara = new FrameCapivaraZumbi();
	}

}
