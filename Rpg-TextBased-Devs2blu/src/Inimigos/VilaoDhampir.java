package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameDhampir;

public class VilaoDhampir extends Vilao {
	
	public VilaoDhampir(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"GOLPE NO ESTÔMAGO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 23"+LogicaJogo.Reseta);
		return 23;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"CHUTE FRONTAL DUPLO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 25"+LogicaJogo.Reseta);
		return 25;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"ADAGA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+LogicaJogo.Reseta);
		return 30;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"MORDIDA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura: 10"+LogicaJogo.Reseta);
		setVida(this.getVida() + 10);
		return 30;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Dhampir se regenerou, aumentando sua "+LogicaJogo.VerdeClaro+"Vida em 25!"+LogicaJogo.Reseta);
		this.setVida(getVida() + 25);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Dhampir recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		FrameDhampir fDhampir = new FrameDhampir();
	}


}
