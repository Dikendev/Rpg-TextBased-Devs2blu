package Inimigos;
import FantasyOne.Criatura;

public class VilaoDhampir extends Criatura {
	
	public VilaoDhampir(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("O Dhampir ataca com GOLPE NO ESTÔMAGO");
		System.out.println("Dano: 10");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("O Dhampir ataca com CHUTE FRONTAL DUPLO");
		System.out.println("Dano: 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("O Dhampir ataca com ADAGA");
		System.out.println("Dano: 20");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("O Dhampir ataca com MORDIDA");
		System.out.println("Dano: 30");
		setVida(getVida() + 5);
		return 30;
	}

	@Override
	public void defesa() {
		System.out.println("Dhampir se regenerou, aumentando seu HP em 25!");
		this.setVida(getVida() + 25);
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
