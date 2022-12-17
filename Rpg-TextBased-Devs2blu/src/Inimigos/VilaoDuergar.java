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
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+GameLogic.VermelhoClaro+"CHUTE"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 10"+GameLogic.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+GameLogic.VermelhoClaro+"SOCO"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 8"+GameLogic.Reseta);
		return 8;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+GameLogic.VermelhoClaro+"ATAQUE FURTIVO"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 12"+GameLogic.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+GameLogic.VermelhoClaro+"MACHADADA"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 15"+GameLogic.Reseta);
		return 15;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Duergar se regenerou, aumentando sua "+GameLogic.Verde+"Vida em 15!"+ GameLogic.Reseta);
		this.setVida(getVida() + 15);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Duergar recebeu dano, a vida dele é: " + GameLogic.Verde+ this.getVida()+ GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Devido a um deslizamento, nosso herói é obrigado a usar uma velha trilha, mal ");
		System.out.printf("|%-80s|%n", "cuidada e pouco sinalizada. Guiado apenas pela luz do luar nosso herói avista um");
		System.out.printf("|%-89s|%n", "vulto junto a um barulho metálico, e surge de trás de uma árvore um " + GameLogic.VermelhoFun + "Duergar," + GameLogic.Reseta);
		System.out.printf("|%-80s|%n", "vestindo uma pesada armadura de metal e empunhando seu grande Martelo, com muita");
		System.out.printf("|%-80s|%n", "raiva em seu olhar, não resta outra opção a não ser lutar!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
