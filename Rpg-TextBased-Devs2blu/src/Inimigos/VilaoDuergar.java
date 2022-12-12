package Inimigos;
import FantasyOne.Criatura;

public class VilaoDuergar extends Criatura{
	
	public VilaoDuergar(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Duergar ataca com CHUTE");
		System.out.println("Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("O Duergar ataca com SOCO");
		System.out.println("Dano: 8");
		return 8;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("O Duergar ataca com ATAQUE FURTIVO");
		System.out.println("Dano: 12");
		return 12;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("O Duergar ataca com MACHADADA");
		System.out.println("Dano: 15");
		return 15;
	}

	@Override
	public void defesa() {
		System.out.println("Duergar se regenerou, aumentando seu HP em 15!");
		this.setVida(getVida() + 15);
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
