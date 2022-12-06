package Inimigos;
import FantasyOne.Criatura;

public class VilaoDuergar extends Criatura{
	
	public VilaoDuergar(String nome, int vida) {
		super(nome, vida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Duergar ataca com CHUTE");
		System.out.println("Dano de 10");
		return recebeDano(10);
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("O Duergar ataca com MACHADADA");
		System.out.println("Dano de 15");
		return recebeDano(15);
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recebeDano(int dano) {
		setVida(getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + getVida());
		return getVida();
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

}
