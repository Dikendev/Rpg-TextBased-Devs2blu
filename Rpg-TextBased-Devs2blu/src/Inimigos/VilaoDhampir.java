package Inimigos;
import FantasyOne.Criatura;

public class VilaoDhampir extends Criatura {
	
	public VilaoDhampir(String nome, int vida) {
		super(nome, vida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Dhampir ataca com SOCO");
		System.out.println("Dano de 10");
		return recebeDano(10);
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("O Dhampir ataca com ADAGA");
		System.out.println("Dano de 20");
		return recebeDano(10);
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("O Dhampir ataca com MORDIDA");
		System.out.println("Dano de 30");
		setVida(getVida() + 5);
		return recebeDano(30);
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
