package Inimigos;

import FantasyOne.Criatura;

public class VilaoDragaoDuasCabecas extends Criatura {

	public VilaoDragaoDuasCabecas(String name, int maxHp, int xp, int hp, int pocao, int nivel, int mp) {
		super(name, maxHp, xp, hp, pocao, nivel, mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Dragão de Duas Cabeça ataca com o Bola de Fogo: " );
		System.out.println("Dano de 15");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 30;
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
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}	

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

}
