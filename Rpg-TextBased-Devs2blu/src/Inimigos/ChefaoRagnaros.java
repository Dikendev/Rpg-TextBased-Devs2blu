package Inimigos;

import FantasyOne.Criatura;

public class ChefaoRagnaros extends Criatura{

	public ChefaoRagnaros(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}
	
	@Override
	public int ataqueBasico() {
		System.out.println("Ragnaros bate seu Martelo de Fogo no chão, dispersando uma onda de fogo que causa 15 de dano!");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ragnaros sopra seu Fogo Infernal na sua direção, causando 20 de dano!");
		return 20;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Ragnaros invoca elementais de fogo, que atiram-se em sua direção causando 35 de dano!");
		return 35;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Ragnaros causa um Tsunami de Lava, causando 40 de dano!");
		return 40;
	}

	@Override
	public void defesa() {
		System.out.println("Ragnaros invoca elementais de pedra e os absorve, recuperando 20 de vida!");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

}
