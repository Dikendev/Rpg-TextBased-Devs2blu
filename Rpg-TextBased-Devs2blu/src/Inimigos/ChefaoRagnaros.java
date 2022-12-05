package Inimigos;

import FantasyOne.Atributos;

public class ChefaoRagnaros extends Atributos{

	public ChefaoRagnaros(String nome, int vida) {
		super(nome, vida);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int ataqueBasico() {
		System.out.println("Ragnaros bate seu Martelo de Fogo no chão, dispersando uma onda de fogo que causa 15 de dano!");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ragnaros sopra seu Fogo Infernal na sua direção, causando 20 de dano!");
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Ragnaros invoca elementais de fogo, que atiram-se em sua direção causando 35 de dano!");
		return 35;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Ragnaros causa um Tsunami de Lava, causando 40 de dano!");
		return 40;
	}

	@Override
	public int defesa() {
		System.out.println("Ragnaros invoca elementais de pedra e os absorve, recuperando 20 de vida!");
		return 20;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Ragnaros recebeu dano, a vida dele agora é: " + this.vida);
		return vida;
	}

}
