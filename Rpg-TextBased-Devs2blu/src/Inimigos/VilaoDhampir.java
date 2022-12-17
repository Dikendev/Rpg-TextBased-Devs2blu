package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoDhampir extends Vilao {
	
	public VilaoDhampir(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"GOLPE NO ESTÔMAGO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 10"+LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"CHUTE FRONTAL DUPLO"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"ADAGA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 20"+LogicaJogo.Reseta);
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-91s|%n", "O Dhampir ataca com "+LogicaJogo.VermelhoClaro+"MORDIDA"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano: 30"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura: 10"+LogicaJogo.Reseta);
		setVida(this.getVida() + 10);
		return 30;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Dhampir se regenerou, aumentando sua "+LogicaJogo.VerdeClaro+"Vida em 25!"+LogicaJogo.Reseta);
		this.setVida(getVida() + 25);
	}


	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Dhampir recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Ao anoitecer, nosso herói busca abrigo em uma caverna, ao entrar mais fundo ele ");
		System.out.printf("|%-80s|%n", "percebe que não está sozinho, ouve alguns passos leves e um vulto em direção a");
		System.out.printf("|%-89s|%n", "escuridão. Ao se aproximar, surge das sombras um " + LogicaJogo.VermelhoFun + "Dhampir" + LogicaJogo.Reseta + ", com sua pele pálida e");
		System.out.printf("|%-80s|%n", "capa preta ele avança em direção ao nosso herói pronto para provar de seu sangue.");
		System.out.printf("|%-80s|%n", "Batalhe por sua vida!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();		
	}


}
