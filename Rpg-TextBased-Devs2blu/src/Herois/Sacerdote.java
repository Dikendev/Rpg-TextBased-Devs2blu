package Herois;

import FantasyOne.Atributos;

public class Sacerdote extends Atributos {

	public Sacerdote(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.vida);
		return vida;
	}

}
