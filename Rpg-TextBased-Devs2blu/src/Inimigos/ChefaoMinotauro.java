package Inimigos;

import FantasyOne.LogicaJogo;

public class ChefaoMinotauro extends Vilao {

	public ChefaoMinotauro(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+LogicaJogo.VermelhoClaro+"Chifres!"+LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+LogicaJogo.Reseta);
		return 20;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+LogicaJogo.VermelhoClaro+"Golpe Rápido!"+LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 16"+LogicaJogo.Reseta);
		return 23;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial"+LogicaJogo.VermelhoClaro+" Relâmpago!"+LogicaJogo.Reseta );
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 20"+LogicaJogo.Reseta);
			return 30;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial "+LogicaJogo.VermelhoClaro+"Fúria do Submundo!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 22"+LogicaJogo.Reseta);
			return 40;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Minotauro usou "+LogicaJogo.VerdeClaro+"Defesa do Submundo."+LogicaJogo.Reseta);
		System.out.printf("|%-80s|%n", "Aumenta sua própria vida em "+LogicaJogo.Verde+"20."+LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
		System.out.printf("|%-80s|%n", "Minotauro possui: " +LogicaJogo.Verde+ this.getVida()+ "de vida"+LogicaJogo.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Minotauro recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}
	
	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Seguindo seu caminho, nosso herói agora toma um caminho rochoso, ao parar ");
		System.out.printf("|%-80s|%n", "brevemente para encher seu cantil num pequeno lago, nosso herói nota na água ");
		System.out.printf("|%-80s|%n", "pequenas ondas, compassadas com um som forte de passos. Ao olhar para trás, um");
		System.out.printf("|%-89s|%n", "furioso "+ LogicaJogo.VermelhoFun + "Minotauro" + LogicaJogo.Reseta + " se aproxima, com chifres imensos e grandes correntes em seus");
		System.out.printf("|%-80s|%n", "braços ele parece mais forte que o normal, em um surto raivoso ele avança em");
		System.out.printf("|%-80s|%n", "sua direção. Lute!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}

}
