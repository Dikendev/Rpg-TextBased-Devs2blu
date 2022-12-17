package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoDuergar extends Vilao{
	
	public VilaoDuergar(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"CHUTE"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 10"+LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"SOCO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 8"+LogicaJogo.Reseta);
		return 8;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"ATAQUE FURTIVO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 12"+LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Duergar ataca com "+LogicaJogo.VermelhoClaro+"MACHADADA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Duergar se regenerou, aumentando sua "+LogicaJogo.Verde+"Vida em 15!"+ LogicaJogo.Reseta);
		this.setVida(getVida() + 15);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Duergar recebeu dano, a vida dele é: " + LogicaJogo.Verde+ this.getVida()+ LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Devido a um deslizamento, nosso herói é obrigado a usar uma velha trilha, mal ");
		System.out.printf("|%-80s|%n", "cuidada e pouco sinalizada. Guiado apenas pela luz do luar nosso herói avista um");
		System.out.printf("|%-89s|%n", "vulto junto a um barulho metálico, e surge de trás de uma árvore um " + LogicaJogo.VermelhoFun + "Duergar," + LogicaJogo.Reseta);
		System.out.printf("|%-80s|%n", "vestindo uma pesada armadura de metal e empunhando seu grande Martelo, com muita");
		System.out.printf("|%-80s|%n", "raiva em seu olhar, não resta outra opção a não ser lutar!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}

}
