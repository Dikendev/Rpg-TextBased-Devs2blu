package Inimigos;

import FantasyOne.GameLogic;

public class VilaoDuergar extends Vilao{
	
	public VilaoDuergar(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "O Duergar ataca com CHUTE");
		System.out.printf("|%-80s|%n", "Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "O Duergar ataca com SOCO");
		System.out.printf("|%-80s|%n", "Dano: 8");
		return 8;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "O Duergar ataca com ATAQUE FURTIVO");
		System.out.printf("|%-80s|%n", "Dano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "O Duergar ataca com MACHADADA");
		System.out.printf("|%-80s|%n", "Dano: 15");
		return 15;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Duergar se regenerou, aumentando seu HP em 15!");
		this.setVida(getVida() + 15);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Duergar recebeu dano, a vida dele é: " + this.getVida());
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Devido a um deslizamento, nosso herói é obrigado a usar uma velha trilha, mal ");
		System.out.printf("|%-80s|%n", "cuidada e pouco sinalizada. Guiado apenas pela luz do luar nosso herói avista um");
		System.out.printf("|%-80s|%n", "vulto junto a um barulho metálico, e surge de trás de uma árvore um Duergar,");
		System.out.printf("|%-80s|%n", "vestindo uma pesada armadura de metal e empunhando seu grande Martelo, com muita");
		System.out.printf("|%-80s|%n", "raiva em seu olhar, não resta outra opção a não ser lutar!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
