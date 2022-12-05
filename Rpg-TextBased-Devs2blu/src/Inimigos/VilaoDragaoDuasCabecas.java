package Inimigos;

import FantasyOne.Atributos;

public class VilaoDragaoDuasCabecas extends Atributos {

	public VilaoDragaoDuasCabecas(String name, int maxHp, int xp, int hp, int pocao, int nivel, int mp) {
		super(name, maxHp, xp, hp, pocao, nivel, mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Ataque Bola de Fogo: " );
		return vida - 5;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int recebeDano() {
		// TODO Auto-generated method stub
		return 0;
	}

}
