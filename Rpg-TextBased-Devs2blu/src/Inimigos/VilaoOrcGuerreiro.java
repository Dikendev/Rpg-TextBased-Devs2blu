package Inimigos;

import FantasyOne.GameLogic;

public class VilaoOrcGuerreiro extends Vilao{
	
	public VilaoOrcGuerreiro(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-80s|%n", "O Orc avança com sua espada e lhe golpeia, causando 8 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Com seu escudo, o Orc avança em sua direção tentando lhe derrubar,");
		System.out.printf("|%-80s|%n", "causando 12 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "Em um frenesí, o Orc pula em sua direção e deferi um golpe poderoso,");
		System.out.printf("|%-80s|%n", "causando 20 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "Tomado por uma furia implacável, o Orc rapidamente puxa seu machado atira em sua");
		System.out.printf("|%-80s|%n", "direção, acertando sua perna e causando 23 de dano!");
		System.out.printf("|%-80s|%n", "Dano: 23");
		return 23;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "O Orc levanta seu escudo, absorvendo 10 de dano!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Orc recebeu dano, a vida dele é: " + this.getVida());
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Logo no inicio do seu longo trajeto, nosso herói ouve um barulho estranho vindo");
		System.out.printf("|%-80s|%n", "de um arbusto. Ao se aproximar para verificar, um gigante Orc Guerreiro salta");
		System.out.printf("|%-80s|%n", "em sua direção empunhando sua espada e escudo, pronto para batalhar!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
