package Inimigos;

import FantasyOne.GameLogic;

public class ChefaoMinotauro extends Vilao {

	public ChefaoMinotauro(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "Minotauro ataca com Chifres! " );
		System.out.printf("|%-80s|%n", "Dano de 20");
		return 20;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Minotauro ataca com Golpe Rápido! " );
		System.out.printf("|%-80s|%n", "Dano de 23");
		return 23;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Minotauro usa o ataque especial Relâmpago! " );
			System.out.printf("|%-80s|%n", "Dano de 30");
			return 30;
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, o Minotauro não possui mana suficiente para utilizar o");
			System.out.printf("|%-80s|%n", "ataque especial.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Minotauro usa o ataque especial Fúria do Submundo!");
			System.out.printf("|%-80s|%n", "Dano de 40");
			return 40;
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, o Minotauro não possui mana suficiente para utilizar o ");
			System.out.printf("|%-80s|%n", "ataque especial.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Minotauro usou Defesa do Submundo.");
		System.out.printf("|%-80s|%n", "Aumenta sua própria vida em 20.");
		this.setVida(this.getVida()+20);
		System.out.printf("|%-80s|%n", "Minotauro possui: " + this.getVida() + "de vida");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Minotauro recebeu dano, a vida dele é: " + this.getVida());
	}
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Seguindo seu caminho, nosso herói agora toma um caminho rochoso, ao parar ");
		System.out.printf("|%-80s|%n", "brevemente para encher seu cantil num pequeno lago, nosso herói nota na água ");
		System.out.printf("|%-80s|%n", "pequenas ondas, compassadas com um som forte de passos. Ao olhar para trás, um");
		System.out.printf("|%-89s|%n", "furioso "+ GameLogic.VermelhoFun + "Minotauro" + GameLogic.Reseta + " se aproxima, com chifres imensos e grandes correntes em seus");
		System.out.printf("|%-80s|%n", "braços ele parece mais forte que o normal, em um surto raivoso ele avança em");
		System.out.printf("|%-80s|%n", "sua direção. Lute!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
