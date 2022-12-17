package Inimigos;

import FantasyOne.GameLogic;

public class VilaoCapivaraZumbi extends Vilao{
	
	public VilaoCapivaraZumbi(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ataque "+GameLogic.VermelhoClaro+"CHUTE"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 8"+ GameLogic.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque com "+GameLogic.VermelhoClaro+"MORDIDA"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 12"+ GameLogic.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", GameLogic.VermelhoClaro+"Grande mordida!"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 15"+ GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", GameLogic.VermelhoClaro+"MORDIDA COM O VIRUS DA RAIVA!"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 12"+ GameLogic.Reseta);
		return 12;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "SE esconde e recebe apenas!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Capivara recebeu dano, a vida dela é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao passar pela última ponte antes da entrada do vulcão, nosso herói avista ");
		System.out.printf("|%-80s|%n", "próximo a um arbusto um animal comendo, parecia muito com uma capivara. Ao se ");
		System.out.printf("|%-80s|%n", "aproximar do supostamente inofensivo animal, ele percebe que na verdade ela ");
		System.out.printf("|%-80s|%n", "estava comenda outra capivara. Em um salto para trás, nosso herói percebe que na");
		System.out.printf("|%-89s|%n", "verdade se tratava de uma grande " + GameLogic.VermelhoFun + "Capivara Zumbi" + GameLogic.Reseta + "que corre em sua direção. ");
		System.out.printf("|%-80s|%n", "Lute por sua vida!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();		
	}

}
