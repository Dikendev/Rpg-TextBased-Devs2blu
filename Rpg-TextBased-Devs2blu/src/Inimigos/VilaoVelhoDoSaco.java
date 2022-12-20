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
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 50"+ LogicaJogo.Reseta);
		return 50;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque "+ LogicaJogo.VermelhoClaro+"FACADA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 52"+ LogicaJogo.Reseta);
		return 52;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Grande "+ LogicaJogo.VermelhoClaro+"SACO DA MORTE!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 60"+ LogicaJogo.Reseta);
		return 60;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"ATAQUE COM FACAO!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 65"+ LogicaJogo.Reseta);
		return 65;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"USA UM ESCUDO, ganhando 30 de vida!"+LogicaJogo.Reseta);
		this.setVida(this.getVida()+30);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		if(this.getVida() <= 0) {
			System.out.printf("|%-91s|%n", "Você deferiu um golpe fatal,"+LogicaJogo.VermelhoFun+" Velho do Saco morreu!"+LogicaJogo.Reseta);
		}else {
			System.out.printf("|%-91s|%n", "Velho do Saco recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);			
		}
	}

	@Override
	public void historia() {
		FrameVelhoSaco fVelhoSaco = new FrameVelhoSaco();
	}

}
