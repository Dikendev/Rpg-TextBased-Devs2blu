package Inimigos;

import FantasyOne.GameLogic;

public class VilaoDragaoDuasCabecas extends Vilao {

	public VilaoDragaoDuasCabecas(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Dragão de Duas Cabeças ataca com Bola de Fogo: " );
		System.out.println("Dano de 15");
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Dragão de Duas Cabeças ataca com Lança Chamas: " );
		System.out.println("Dano de 18");
		return 18;
	}

	public int ataqueEspecial() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.println("Dragão de Duas Cabeças usa o ataque especial Insinerar! " );
			System.out.println("Dano de 25");
			return 25;
		} else {
			System.out.println("O Ataque falhou, o Dragão de Duas Cabeças não possui mana suficiente para utilizar o ataque especial.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.println("Dragão de Duas Cabeças usa o ataque especial Chamas do Sol! " );
			System.out.println("Dano de 23");
			return 23;
		} else {
			System.out.println("O Ataque falhou, o Dragão de Duas Cabeças não possui mana suficiente para utilizar o ataque especial.");
			return 0;
		}
	}
	
	@Override
	public void defesa() {
		System.out.println("Dragão de Duas Cabeças usou Defesa do Fogo.");
		System.out.println("Aumenta sua própria vida em 15.");
		this.setVida(this.getVida()+15);
		System.out.println("Dragão de Duas Cabeças possui: " + this.getVida() + "de vida");
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
				"Após atravessar uma velha ponte de pedras, dois grandes rugidos tomam conta do cenário e chamam a atenção do nosso herói, que instintivamente olha para cima e se depara com um dragão, mas não um comum, um jovem e faminto Dragão de Duas Cabeças. Num rasante ele pousa em frente ao herói pronto para o ataque. Lute por sua vida!");
		GameLogic.telaPontilhada(50);

		GameLogic.pressioneUmaTecla();		
	}

}
