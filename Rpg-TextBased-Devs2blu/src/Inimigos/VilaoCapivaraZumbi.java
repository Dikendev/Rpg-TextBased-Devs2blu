package Inimigos;
import FantasyOne.Criatura;

public class VilaoCapivaraZumbi extends Criatura{
	
	public VilaoCapivaraZumbi(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Ataque CHUTE");
		System.out.println("Dano de 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ataque com MORDIDA");
		System.out.println("Dano de 12");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Grande mordida!");
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("MORDIDA COM O VIRUS DA RAIVA!");
		return 12;
	}

	@Override
	public int defesa() {
		System.out.println("SE esconde e recebe apenas!");
		return 10;
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
