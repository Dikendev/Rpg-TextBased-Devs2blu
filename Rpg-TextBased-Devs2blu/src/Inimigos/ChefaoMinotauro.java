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
		System.out.println("Minotauro ataca com Chifres! " );
		System.out.println("Dano de 20");
		return 20;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Minotauro ataca com Golpe Rápido! " );
		System.out.println("Dano de 23");
		return 23;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.println("Minotauro usa o ataque especial Relâmpago! " );
			System.out.println("Dano de 30");
			return 30;
		} else {
			System.out.println("O Ataque falhou, o Minotauro não possui mana suficiente para utilizar o ataque especial.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.println("Minotauro usa o ataque especial Fúria do Submundo! " );
			System.out.println("Dano de 40");
			return 40;
		} else {
			System.out.println("O Ataque falhou, o Minotauro não possui mana suficiente para utilizar o ataque especial.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.println("Minotauro usou Defesa do Submundo.");
		System.out.println("Aumenta sua própria vida em 20.");
		this.setVida(this.getVida()+20);
		System.out.println("Minotauro possui: " + this.getVida() + "de vida");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}
	
	@Override
	public void historia() {
		GameLogic.telaPontilhada(50);
		System.out.println(
				"Seguindo seu caminho, nosso herói agora toma um caminho rochoso, ao parar brevemente para encher seu cantil num pequeno lago, nosso herói nota na água pequenas ondas, compassadas com um som forte de passos. Ao olhar para trás, um Furioso Minotauro se aproxima, com chifres imensos e grandes correntes em seus braços ele parece mais forte que o normal, em um surto raivoso ele avança em sua direção. Lute!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();
	}

}
