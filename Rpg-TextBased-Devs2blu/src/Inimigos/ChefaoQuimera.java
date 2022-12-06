package Inimigos;

import FantasyOne.Criatura;

public class ChefaoQuimera extends Criatura{
	
	public ChefaoQuimera(String nome, int vida) {
		super(nome, vida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Quimera aplicou uma mordida, causando 10 de dano!");
		System.out.println("Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Quimera aplicou um corte com suas garras, causando 10 de dano!");
		System.out.println("Dano: 15");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp()>0) {
			System.out.println("Quimera usou presas venenosas, causando 25 de dano!");
			System.out.println("Dano: 25");
			return 25;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp()>0) {
			System.out.println("Quimera usou sopro de fogo, causando 25 de dano!");
			System.out.println("Dano: 35");
			return 35;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public int defesa() {
		System.out.println("Quimera usou proteção de asas! Seu ataque foi anulado.");
		return 0;
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		if(this.getPocao() > 0) {
			this.setPocao(this.getPocao() - 1);			
			this.setVida(this.getVida() + 20);
		} else {
			System.out.println("Você não possui Poções de Cura!");
		}
		System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + getVida());		
	}

}
