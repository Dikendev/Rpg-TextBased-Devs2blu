package Inimigos;

import FantasyOne.GameLogic;

public class ChefaoRagnaros extends Vilao{

	public ChefaoRagnaros(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}
	
	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ragnaros bate seu Martelo de Fogo no chão, dispersando uma onda de fogo causando "+GameLogic.VermelhoClaro+"15 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 15"+GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ragnaros sopra seu Fogo Infernal na sua direção, causando "+GameLogic.VermelhoClaro+"20 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 20"+GameLogic.Reseta);
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Ragnaros invoca elementais de fogo, que atiram em sua direção causando "+GameLogic.VermelhoClaro+"35 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 35"+GameLogic.Reseta);
		return 35;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "Ragnaros causa um Tsunami de Lava, causando "+GameLogic.VermelhoClaro+"40 de dano!"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 40"+GameLogic.Reseta);
		return 40;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Ragnaros invoca elementais de pedra e os absorve, recuperando "+GameLogic.VerdeClaro+"20 de vida!"+GameLogic.Reseta);
		this.setVida(getVida() + 20);
	}
	

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n","Ragnaros recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao entrar no covil, nosso herói se depara com uma grande porta de pedra, ao ");
		System.out.printf("|%-80s|%n", "abrir ele avista ao fundo do grande salão um gigantesco Elemental de fogo, com");
		System.out.printf("|%-80s|%n", "Armadura e adornos em obsidiana e portando um enorme martelo incandescente. O ");
		System.out.printf("|%-80s|%n", "calor era absurdo, esse é "+ GameLogic.VermelhoFun + "Ragnaros" + GameLogic.Reseta + ", o Senhor do Fogo. Como quem já esperava a");
		System.out.printf("|%-80s|%n", "visita ele pede que nosso Herói se aproxime e o reverencie.  Em um ato");
		System.out.printf("|%-80s|%n", "premeditado, o herói se aproxima e no momento de reverenciar ele rapidamente");
		System.out.printf("|%-80s|%n", "o ataca. Lute!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();		
	}

}
