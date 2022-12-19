package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameDuergar;

public class VilaoDuergar extends Vilao{
	
	public VilaoDuergar(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"CHUTE"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 8"+LogicaJogo.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"SOCO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 10"+LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"ATAQUE FURTIVO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 12"+LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"MACHADADA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Duergar se regenerou, aumentando sua "+LogicaJogo.Verde+"Vida em 15!"+ LogicaJogo.Reseta);
		this.setVida(getVida() + 15);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Duergar recebeu dano, a vida dele é: " + LogicaJogo.Verde+ this.getVida()+ LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		FrameDuergar fDuergar = new FrameDuergar();
	}

}
