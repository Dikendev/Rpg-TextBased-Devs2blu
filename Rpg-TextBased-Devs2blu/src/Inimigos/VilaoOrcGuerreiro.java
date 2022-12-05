package Inimigos;

import FantasyOne.Atributos;

public class VilaoOrcGuerreiro extends Atributos{
	
	public VilaoOrcGuerreiro(String nome, int vida) {
		super(nome, vida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Orc avança com sua espada e lhe golpeia, causando 8 de dano!");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Com seu escudo, o Orc avança em sua direção tentando lhe derrubar, causando 12 de dano!");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Em um frenesí, o Orc pula em sua direção e deferi um golpe poderoso, causando 20 de dano!");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Tomado por uma furia implacável, o Orc rapidamente puxa seu machado atira em sua direção, acertando sua perna e causando 23 de dano!");
		return 23;
	}

	@Override
	public int defesa() {
		System.out.println("O Orc levanta seu escudo, absorvendo 10 de dano!");
		return 10;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("O Orc recebeu dano, a vida dele agora é: " + this.vida);
		return vida;
	}

}
