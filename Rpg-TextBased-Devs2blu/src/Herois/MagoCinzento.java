package Herois;

import FantasyOne.GameLogic;

public class MagoCinzento extends Personagem{

	public MagoCinzento(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		this.setNome(nome);
		this.setMaxVida(maxVida);
		this.setXp(xp);
		this.setVida(vida);
		this.setPocao(pocao);
		this.setNivel(nivel);
		this.setMp(mp);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "Mago Cinzento ataca com a Magia da Noite! " );
		System.out.printf("|%-80s|%n", "Dano de 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Mago Cinzento ataca com a Magia dos Druidas! " );
		System.out.printf("|%-80s|%n", "Dano de 10");
		return 10;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Mago Cinzento ataca com a Magia Paralizante! " );
			System.out.printf("|%-80s|%n", "Dano de 5 seu oponente está paralizado por uma rodada. ");
			System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
			System.out.printf("|%-80s|%n", "Dano de 15");
			return 20;
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar");
			System.out.printf("|%-80s|%n", "o ataque especial.");
			return 0;
		}
	}
		

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Mago Cinzento utiliza a Magia da Cura! " );
			System.out.printf("|%-80s|%n", "Aumenta sua própria vida em 30.");
			this.setVida(this.getVida()+30);
			return this.getVida();
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para o ataque especial.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Mago Cinzento usou defesa da Lua.");
		System.out.printf("|%-80s|%n", "Aumenta sua própria vida em 15.");
		this.setVida(this.getVida()+15);
		System.out.printf("|%-80s|%n", "Mago Cinzento possui: " + this.getVida() + "de vida");
	}
	

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
		
	}

	@Override
	public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 50);
			} else {
				System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
			}
			System.out.printf("|%-80s|%n", "Você usou uma Poção de Cura, a vida atual do seu personagem passou para: " + this.getVida());
	}
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.println("Historia");
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "É um personagem místico, ele veio da Lua com o intuito de proteger o");
		System.out.printf("|%-80s|%n", "Vilarejo Untirade.");
		System.out.printf("|%-80s|%n", "Seus ataques são fortes e os ataques especiais irão acabar com seus oponentes.");
		
		GameLogic.pressioneUmaTecla();
	}
	

}


	


