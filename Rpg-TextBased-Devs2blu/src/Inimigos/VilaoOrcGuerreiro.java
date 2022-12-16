package Inimigos;

import FantasyOne.GameLogic;

public class VilaoOrcGuerreiro extends Vilao{
	
	public VilaoOrcGuerreiro(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "O Orc avança com sua espada e lhe golpeia, causando" + GameLogic.VermelhoClaro + " 8 de dano!" + GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 8" + GameLogic.Reseta);
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-80s|%n", "Com seu escudo, o Orc avança em sua direção tentando lhe derrubar,");
		System.out.printf("|%-91s|%n", "causando " + GameLogic.VermelhoClaro + "12 de dano!" + GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 12" + GameLogic.Reseta);
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.printf("|%-80s|%n", "Em um frenesí, o Orc pula em sua direção e deferi um golpe poderoso,");
		System.out.printf("|%-91s|%n", "causando " + GameLogic.VermelhoClaro + "20 de dano!" + GameLogic.Reseta);
		System.out.printf("|%-91s|%n",  GameLogic.Vermelho + "Dano: 20" + GameLogic.Reseta);
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.printf("|%-80s|%n", "Tomado por uma furia implacável, o Orc rapidamente puxa seu machado atira em sua");
		System.out.printf("|%-91s|%n", "direção, acertando sua perna e causando" + GameLogic.VermelhoClaro + " 23 de dano!" + GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho + "Dano: 23" + GameLogic.Reseta);
		return 23;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "O Orc levanta seu escudo, absorvendo" + GameLogic.VerdeClaro + " 10 de dano!" + GameLogic.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Orc recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Logo no inicio do seu longo trajeto, nosso herói ouve um barulho estranho vindo");
		System.out.printf("|%-89s|%n", "de um arbusto. Ao se aproximar para verificar, um gigante " + GameLogic.VermelhoFun + "Orc Guerreiro" + GameLogic.Reseta + " salta");
		System.out.printf("|%-80s|%n", "em sua direção empunhando sua espada e escudo, pronto para batalhar!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();
	}

}
