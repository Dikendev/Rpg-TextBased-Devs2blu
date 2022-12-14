package Inimigos;

import FantasyOne.GameLogic;

public class VilaoVelhoDoSaco extends Vilao{
	
	public VilaoVelhoDoSaco(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Ataque com muita RAIVA");
		System.out.println("Dano de 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ataque FACADA");
		System.out.println("Dano de 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Grande LACO DA MORTE! ");
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("ATAQUE COM FACAO !");
		return 12;
	}

	@Override
	public void defesa() {
		System.out.println("USA UM ESCUDO!");
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
				"Na entrada do vulcão, nosso herói avista um senhor de idade avançada e corcunda, que carregava nas costas um grande saco preto que parecia muito pesado. Ele balbuciava algumas palavras, parecia uma cantiga de criança. Ao se aproximar, nosso herói notou que o Velho do Saco possuía em seu olhar uma magia vil e poderosa, tomado pela fúria da magia ele parte pra cima do herói. Defenda-se e lute!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();
	}

}
