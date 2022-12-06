package Inimigos;

import FantasyOne.Atributos;

public class VilaoElfo extends Atributos{
	
	public VilaoElfo(String nome, int vida) {
		super(nome, vida);
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
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}
	

}
