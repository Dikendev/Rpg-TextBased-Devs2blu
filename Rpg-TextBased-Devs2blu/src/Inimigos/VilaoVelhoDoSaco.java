package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameVelhoSaco;

public class VilaoVelhoDoSaco extends Vilao{
	
	public VilaoVelhoDoSaco(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ataque com muita "+ LogicaJogo.VermelhoClaro+"RAIVA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 22"+ LogicaJogo.Reseta);
		return 22;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque "+ LogicaJogo.VermelhoClaro+"FACADA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 26"+ LogicaJogo.Reseta);
		return 26;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Grande "+ LogicaJogo.VermelhoClaro+"SACO DA MORTE!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 34"+ LogicaJogo.Reseta);
		return 34;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"ATAQUE COM FACAO!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 38"+ LogicaJogo.Reseta);
		return 38;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"USA UM ESCUDO, ganhando 20 de vida!"+LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Velho do Saco recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		FrameVelhoSaco fVelhoSaco = new FrameVelhoSaco();
	}

}
