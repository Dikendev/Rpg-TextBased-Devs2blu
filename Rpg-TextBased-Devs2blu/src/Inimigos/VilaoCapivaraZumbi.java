package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoCapivaraZumbi extends Vilao{
	
	public VilaoCapivaraZumbi(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ataque "+LogicaJogo.VermelhoClaro+"CHUTE"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 8"+ LogicaJogo.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque com "+LogicaJogo.VermelhoClaro+"MORDIDA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 12"+ LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"Grande mordida!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 15"+ LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"MORDIDA COM O VIRUS DA RAIVA!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Dano de 12"+ LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "SE esconde e recebe apenas!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Capivara recebeu dano, a vida dela é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao passar pela última ponte antes da entrada do vulcão, nosso herói avista ");
		System.out.printf("|%-80s|%n", "próximo a um arbusto um animal comendo, parecia muito com uma capivara. Ao se ");
		System.out.printf("|%-80s|%n", "aproximar do supostamente inofensivo animal, ele percebe que na verdade ela ");
		System.out.printf("|%-80s|%n", "estava comenda outra capivara. Em um salto para trás, nosso herói percebe que na");
		System.out.printf("|%-89s|%n", "verdade se tratava de uma grande " + LogicaJogo.VermelhoFun + "Capivara Zumbi" + LogicaJogo.Reseta + "que corre em sua direção. ");
		System.out.printf("|%-80s|%n", "Lute por sua vida!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();		
	}

}
