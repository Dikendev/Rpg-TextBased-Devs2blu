package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameQuimera;

public class ChefaoQuimera extends Vilao{
	
	public ChefaoQuimera(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);	
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Quimera aplicou uma mordida, causando "+LogicaJogo.VermelhoClaro+"30 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+LogicaJogo.Reseta);
		return 30;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Quimera aplicou um corte com suas garras, causando "+LogicaJogo.VermelhoClaro+"35 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+LogicaJogo.Reseta);
		return 35;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Quimera usou presas venenosas, causando "+LogicaJogo.VermelhoClaro+"40 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 40"+LogicaJogo.Reseta);
			return 40;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Quimera usou sopro de fogo, causando "+LogicaJogo.VermelhoClaro+"45 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 45"+LogicaJogo.Reseta);
			return 45;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Quimera usou proteção de asas! Gerando um escudo de "+LogicaJogo.VerdeClaro+"20 de vida!"+LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Quimera recebeu dano, a vida dela é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}
	
	@Override
	public void historia() {
		FrameQuimera fQuimera = new FrameQuimera();
	}

}
