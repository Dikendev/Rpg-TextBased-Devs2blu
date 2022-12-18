package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoOrcGuerreiro extends Vilao{
	
	public VilaoOrcGuerreiro(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Orc avança com sua espada e lhe golpeia, causando" + LogicaJogo.VermelhoClaro + " 8 de dano!" + LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 8" + LogicaJogo.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Com seu escudo, o Orc avança em sua direção tentando lhe derrubar,");
		System.out.printf("|%-91s|%n", "causando " + LogicaJogo.VermelhoClaro + "10 de dano!" + LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 10" + LogicaJogo.Reseta);
		return 10;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "Em um frenesí, o Orc pula em sua direção e deferi um golpe poderoso,");
		System.out.printf("|%-91s|%n", "causando " + LogicaJogo.VermelhoClaro + "13 de dano!" + LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n",  LogicaJogo.Vermelho + "Dano: 13" + LogicaJogo.Reseta);
		return 13;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "Tomado por uma furia implacável, o Orc rapidamente puxa seu machado atira em sua");
		System.out.printf("|%-91s|%n", "direção, acertando sua perna e causando" + LogicaJogo.VermelhoClaro + " 23 de dano!" + LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 14" + LogicaJogo.Reseta);
		return 14;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "O Orc levanta seu escudo, absorvendo" + LogicaJogo.VerdeClaro + " 20 de dano!" + LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Orc recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Logo no inicio do seu longo trajeto, nosso herói ouve um barulho estranho vindo");
		System.out.printf("|%-89s|%n", "de um arbusto. Ao se aproximar para verificar, um gigante " + LogicaJogo.VermelhoFun + "Orc Guerreiro" + LogicaJogo.Reseta + " salta");
		System.out.printf("|%-80s|%n", "em sua direção empunhando sua espada e escudo, pronto para batalhar!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();
	}

}
