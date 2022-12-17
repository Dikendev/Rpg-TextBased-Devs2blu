package Inimigos;

import FantasyOne.GameLogic;

public class VilaoDhampir extends Vilao {
	
	public VilaoDhampir(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+GameLogic.VermelhoClaro+"GOLPE NO ESTÔMAGO"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 10"+GameLogic.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+GameLogic.VermelhoClaro+"CHUTE FRONTAL DUPLO"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 15"+GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+GameLogic.VermelhoClaro+"ADAGA"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 20"+GameLogic.Reseta);
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+GameLogic.VermelhoClaro+"MORDIDA"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano: 30"+GameLogic.Reseta);
		setVida(this.getVida() + 5);
		return 30;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Dhampir se regenerou, aumentando sua "+GameLogic.VerdeClaro+"Vida em 25!"+GameLogic.Reseta);
		this.setVida(getVida() + 25);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Dhampir recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao anoitecer, nosso herói busca abrigo em uma caverna, ao entrar mais fundo ele ");
		System.out.printf("|%-80s|%n", "percebe que não está sozinho, ouve alguns passos leves e um vulto em direção a");
		System.out.printf("|%-89s|%n", "escuridão. Ao se aproximar, surge das sombras um " + GameLogic.VermelhoFun + "Dhampir" + GameLogic.Reseta + ", com sua pele pálida e");
		System.out.printf("|%-80s|%n", "capa preta ele avança em direção ao nosso herói pronto para provar de seu sangue.");
		System.out.printf("|%-80s|%n", "Batalhe por sua vida!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();		
	}


}
