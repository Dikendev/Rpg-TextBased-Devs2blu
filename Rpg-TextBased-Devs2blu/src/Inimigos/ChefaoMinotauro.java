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
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+GameLogic.VermelhoClaro+"Chifres!"+GameLogic.Reseta );
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 20"+GameLogic.Reseta);
		return 20;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+GameLogic.VermelhoClaro+"Golpe Rápido!"+GameLogic.Reseta );
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 23"+GameLogic.Reseta);
		return 23;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial"+GameLogic.VermelhoClaro+" Relâmpago!"+GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 30"+GameLogic.Reseta);
			return 30;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial "+GameLogic.VermelhoClaro+"Fúria do Submundo!"+GameLogic.Reseta);
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 40"+GameLogic.Reseta);
			return 40;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Minotauro usou "+GameLogic.VerdeClaro+"Defesa do Submundo."+GameLogic.Reseta);
		System.out.printf("|%-80s|%n", "Aumenta sua própria vida em "+GameLogic.Verde+"20."+GameLogic.Reseta);
		this.setVida(this.getVida()+20);
		System.out.printf("|%-80s|%n", "Minotauro possui: " +GameLogic.Verde+ this.getVida()+ "de vida"+GameLogic.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Minotauro recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
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
