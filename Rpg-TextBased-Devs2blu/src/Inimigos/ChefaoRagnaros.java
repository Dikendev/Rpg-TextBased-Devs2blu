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
		System.out.println("Ragnaros bate seu Martelo de Fogo no chão, dispersando uma onda de fogo que causa 15 de dano! \nDano: 15");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ragnaros sopra seu Fogo Infernal na sua direção, causando 20 de dano! \nDano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Ragnaros invoca elementais de fogo, que atiram-se em sua direção causando 35 de dano! \nDano: 35");
		return 35;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Ragnaros causa um Tsunami de Lava, causando 40 de dano! \nDano: 40");
		return 40;
	}

	@Override
	public void defesa() {
		System.out.println("Ragnaros invoca elementais de pedra e os absorve, recuperando 20 de vida! \nDano: 20");
		this.setVida(getVida() + 20);
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
				"Ao entrar no covil, nosso herói se depara com uma grande porta de pedra, ao abrir ele avista ao fundo do grande salão um gigantesco Elemental de fogo, com Armadura e adornos em obsidiana e portando um enorme martelo incandescente. O calor era absurdo, esse é Ragnaros, o Senhor do Fogo. Como quem já esperava a visita ele pede que nosso Herói se aproxime e o reverencie.  Em um ato premeditado, o herói se aproxima e no momento de reverenciar ele rapidamente o ataca. Lute!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();		
	}

}
