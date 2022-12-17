package Inimigos;

import FantasyOne.LogicaJogo;

public class ChefaoQuimera extends Vilao{
	
	public ChefaoQuimera(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);	
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Quimera aplicou uma mordida, causando "+LogicaJogo.VermelhoClaro+"10 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 10"+LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Quimera aplicou um corte com suas garras, causando "+LogicaJogo.VermelhoClaro+"10 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Quimera usou presas venenosas, causando "+LogicaJogo.VermelhoClaro+"25 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 25"+LogicaJogo.Reseta);
			return 25;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Quimera usou sopro de fogo, causando "+LogicaJogo.VermelhoClaro+"25 de dano!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+LogicaJogo.Reseta);
			return 35;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Quimera usou proteção de asas! Gerando um escudo de "+LogicaJogo.VerdeClaro+"20 de vida!"+LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Quimera recebeu dano, a vida dela é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}
	
	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Pela manhã, enquanto caçava, nosso herói percebe a movimentação desesperada dos");
		System.out.printf("|%-80s|%n", "animais da floresta, como se um predador gigante estivesse se aproximando. Então");
		System.out.printf("|%-80s|%n", "ouve-se um grande rugido de leão e logo nosso herói se prepara para o confronto.");
		System.out.printf("|%-80s|%n", "Mas o que ele não esperava era que o predador viria de cima. Com asas de dragão,");
		System.out.printf("|%-89s|%n", "cabeça de leão e calda de serpente, uma " + LogicaJogo.VermelhoFun + "Quimera" + LogicaJogo.Reseta + " pairava em sua direção, pronto");
		System.out.printf("|%-80s|%n", "para ter sua refeição. Defenda-se herói e lute por sua vida!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}

}
