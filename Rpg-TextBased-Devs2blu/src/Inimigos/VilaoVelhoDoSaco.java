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
		System.out.printf("|%-91s|%n", "Ataque com muita "+ GameLogic.VermelhoClaro+"RAIVA"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 8"+ GameLogic.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque "+ GameLogic.VermelhoClaro+"FACADA"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+ GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Grande "+ GameLogic.VermelhoClaro+"SACO DA MORTE!"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+ GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", GameLogic.VermelhoClaro+"ATAQUE COM FACAO!"+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 12"+ GameLogic.Reseta);
		return 12;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", GameLogic.VerdeClaro+"USA UM ESCUDO!"+GameLogic.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Velho do Saco recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Na entrada do vulcão, nosso herói avista um senhor de idade avançada e corcunda,");
		System.out.printf("|%-80s|%n", "que carregava nas costas um grande saco preto que parecia muito pesado. Ele");
		System.out.printf("|%-80s|%n", "balbuciava algumas palavras, parecia uma cantiga de criança. Ao se aproximar,");
		System.out.printf("|%-89s|%n", "nosso herói notou que o "+ GameLogic.VermelhoFun + "Velho do Saco" + GameLogic.Reseta + " possuía em seu olhar uma magia vil e");
		System.out.printf("|%-80s|%n", "poderosa, tomado pela fúria da magia ele parte pra cima do herói. Defenda-se!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
