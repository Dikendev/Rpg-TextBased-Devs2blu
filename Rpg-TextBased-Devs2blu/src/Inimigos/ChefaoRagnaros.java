package Inimigos;

import FantasyOne.LogicaJogo;

public class ChefaoRagnaros extends Vilao{

	public ChefaoRagnaros(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}
	
	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ragnaros bate seu Martelo de Fogo no chão, dispersando uma onda de fogo causando "+LogicaJogo.VermelhoClaro+"25 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 25;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ragnaros sopra seu Fogo Infernal na sua direção, causando "+LogicaJogo.VermelhoClaro+"30 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 20"+LogicaJogo.Reseta);
		return 30;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Ragnaros invoca elementais de fogo, que atiram em sua direção causando "+LogicaJogo.VermelhoClaro+"35 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 35"+LogicaJogo.Reseta);
		return 35;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "Ragnaros causa um Tsunami de Lava, causando "+LogicaJogo.VermelhoClaro+"40 de dano!"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 40"+LogicaJogo.Reseta);
		return 40;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Ragnaros invoca elementais de pedra e os absorve, recuperando "+LogicaJogo.VerdeClaro+"20 de vida!"+LogicaJogo.Reseta);
		this.setVida(getVida() + 20);
	}
	

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n","Ragnaros recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao entrar no covil, nosso herói se depara com uma grande porta de pedra, ao ");
		System.out.printf("|%-80s|%n", "abrir ele avista ao fundo do grande salão um gigantesco Elemental de fogo, com");
		System.out.printf("|%-80s|%n", "Armadura e adornos em obsidiana e portando um enorme martelo incandescente. O ");
		System.out.printf("|%-80s|%n", "calor era absurdo, esse é "+ LogicaJogo.VermelhoFun + "Ragnaros" + LogicaJogo.Reseta + ", o Senhor do Fogo. Como quem já esperava a");
		System.out.printf("|%-80s|%n", "visita ele pede que nosso Herói se aproxime e o reverencie.  Em um ato");
		System.out.printf("|%-80s|%n", "premeditado, o herói se aproxima e no momento de reverenciar ele rapidamente");
		System.out.printf("|%-80s|%n", "o ataca. Lute!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();		
	}

}
