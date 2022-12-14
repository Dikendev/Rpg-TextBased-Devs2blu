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
		System.out.println("Ataque CHUTE");
		System.out.println("Dano de 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ataque com MORDIDA");
		System.out.println("Dano de 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Grande mordida!");
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("MORDIDA COM O VIRUS DA RAIVA!");
		return 12;
	}

	@Override
	public void defesa() {
		System.out.println("SE esconde e recebe apenas!");
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
				"Ao passar pela última ponte antes da entrada do vulcão, nosso herói avista próximo a um arbusto um animal comendo, parecia muito com uma capivara. Ao se aproximar do supostamente inofensivo animal, ele percebe que na verdade ela estava comenda outra capivara. Em um salto para trás, nosso herói percebe que na verdade se tratava de uma grande capivara zumbi que corre em sua direção. Lute por sua vida!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();		
	}

}
