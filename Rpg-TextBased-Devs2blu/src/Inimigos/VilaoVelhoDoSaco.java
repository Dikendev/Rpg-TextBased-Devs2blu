package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoVelhoDoSaco extends Vilao{
	
	public VilaoVelhoDoSaco(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Ataque com muita "+ LogicaJogo.VermelhoClaro+"RAIVA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 8"+ LogicaJogo.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Ataque "+ LogicaJogo.VermelhoClaro+"FACADA"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+ LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "Grande "+ LogicaJogo.VermelhoClaro+"SACO DA MORTE!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+ LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", LogicaJogo.VermelhoClaro+"ATAQUE COM FACAO!"+ LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 12"+ LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", LogicaJogo.VerdeClaro+"USA UM ESCUDO!"+LogicaJogo.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Velho do Saco recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Na entrada do vulcão, nosso herói avista um senhor de idade avançada e corcunda,");
		System.out.printf("|%-80s|%n", "que carregava nas costas um grande saco preto que parecia muito pesado. Ele");
		System.out.printf("|%-80s|%n", "balbuciava algumas palavras, parecia uma cantiga de criança. Ao se aproximar,");
		System.out.printf("|%-89s|%n", "nosso herói notou que o "+ LogicaJogo.VermelhoFun + "Velho do Saco" + LogicaJogo.Reseta + " possuía em seu olhar uma magia vil e");
		System.out.printf("|%-80s|%n", "poderosa, tomado pela fúria da magia ele parte pra cima do herói. Defenda-se!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}

}
