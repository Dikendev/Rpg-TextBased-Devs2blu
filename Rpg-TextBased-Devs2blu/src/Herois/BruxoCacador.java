package Herois;

import FantasyOne.Criatura;

public class BruxoCacador extends Criatura{
	
	public BruxoCacador(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Bruxo caçador aplicou um golpe com sua espada, causando 15 de dano!");
		System.out.println("Dano: 15");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Bruxo caçador utilizou seu arco e flecha com veneno, causando 20 de dano!");
		System.out.println("Dano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Bruxo caçador utilizou bola de fogo, causando 30 de dano!");
		System.out.println("Dano: 30");
		return 30;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Bruxo caçador utilizou relâmpago, causando 35 de dano!");
		System.out.println("Dano: 35");
		return 35;
	}

	@Override
	public int defesa() {
		System.out.println("Bruxo caçador se regenerou, aumentando seu HP em 20!");
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
