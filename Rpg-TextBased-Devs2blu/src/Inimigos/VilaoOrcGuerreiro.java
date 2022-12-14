package Inimigos;

import FantasyOne.Criatura;

public class VilaoOrcGuerreiro extends Criatura{
	
	public VilaoOrcGuerreiro(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Orc avança com sua espada e lhe golpeia, causando 8 de dano! \nDano: 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Com seu escudo, o Orc avança em sua direção tentando lhe derrubar, causando 12 de dano! \nDano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Em um frenesí, o Orc pula em sua direção e deferi um golpe poderoso, causando 20 de dano! \nDano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Tomado por uma furia implacável, o Orc rapidamente puxa seu machado atira em sua direção, acertando sua perna e causando 23 de dano! \nDano: 23");
		return 23;
	}

	@Override
	public void defesa() {
		System.out.println("O Orc levanta seu escudo, absorvendo 10 de dano!");
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
