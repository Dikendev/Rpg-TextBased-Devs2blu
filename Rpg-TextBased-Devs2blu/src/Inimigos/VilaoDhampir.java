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
		System.out.printf("|%-80s|%n", "O Dhampir ataca com GOLPE NO ESTÔMAGO");
		System.out.printf("|%-80s|%n", "Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "O Dhampir ataca com CHUTE FRONTAL DUPLO");
		System.out.printf("|%-80s|%n", "Dano: 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "O Dhampir ataca com ADAGA");
		System.out.printf("|%-80s|%n", "Dano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "O Dhampir ataca com MORDIDA");
		System.out.printf("|%-80s|%n", "Dano: 30");
		setVida(getVida() + 5);
		return 30;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-80s|%n", "Dhampir se regenerou, aumentando seu HP em 25!");
		this.setVida(getVida() + 25);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Dhampir recebeu dano, a vida dele é: " + this.getVida());
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
