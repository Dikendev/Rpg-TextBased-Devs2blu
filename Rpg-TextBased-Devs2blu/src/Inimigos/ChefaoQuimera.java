package Inimigos;

import FantasyOne.GameLogic;

public class ChefaoQuimera extends Vilao{
	
	public ChefaoQuimera(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);	
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Quimera aplicou uma mordida, causando 10 de dano!");
		System.out.println("Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Quimera aplicou um corte com suas garras, causando 10 de dano!");
		System.out.println("Dano: 15");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getMp()>0) {
			System.out.println("Quimera usou presas venenosas, causando 25 de dano!");
			System.out.println("Dano: 25");
			return 25;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp()>0) {
			System.out.println("Quimera usou sopro de fogo, causando 25 de dano!");
			System.out.println("Dano: 35");
			return 35;
		}else {
			System.out.println("Mana insuficiente!");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.println("Quimera usou proteção de asas! Seu ataque foi anulado.");
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
				"Pela manhã, enquanto caçava, nosso herói percebe a movimentação desesperada dos animais da floresta, como se um predador gigante estivesse se aproximando. Então ouve-se um grande rugido de leão e logo nosso herói se prepara para o confronto. Mas o que ele não esperava era que o predador viria de cima. Com asas de dragão, cabeça de leão e calda de serpente, uma Quimera pairava em sua direção, pronto para ter sua refeição. Defenda-se herói e lute por sua vida!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();
	}

}
