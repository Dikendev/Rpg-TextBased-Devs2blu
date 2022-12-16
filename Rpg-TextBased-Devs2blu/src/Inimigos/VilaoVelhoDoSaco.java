package Inimigos;

import FantasyOne.GameLogic;

public class VilaoVelhoDoSaco extends Vilao{
	
	public VilaoVelhoDoSaco(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "Ataque com muita RAIVA");
		System.out.printf("|%-80s|%n", "Dano de 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Ataque FACADA");
		System.out.printf("|%-80s|%n", "Dano de 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "Grande SACO DA MORTE! ");
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "ATAQUE COM FACAO !");
		return 12;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "USA UM ESCUDO!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Velho do Saco recebeu dano, a vida dele é: " + this.getVida());
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Na entrada do vulcão, nosso herói avista um senhor de idade avançada e corcunda,");
		System.out.printf("|%-80s|%n", "que carregava nas costas um grande saco preto que parecia muito pesado. Ele");
		System.out.printf("|%-80s|%n", "balbuciava algumas palavras, parecia uma cantiga de criança. Ao se aproximar,");
		System.out.printf("|%-80s|%n", "nosso herói notou que o Velho do Saco possuía em seu olhar uma magia vil e");
		System.out.printf("|%-80s|%n", "poderosa, tomado pela fúria da magia ele parte pra cima do herói. Defenda-se!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
