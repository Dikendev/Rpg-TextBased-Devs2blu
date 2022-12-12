package Inimigos;
import FantasyOne.Criatura;

public class VilaoVelhoDoSaco extends Criatura{
	
	public VilaoVelhoDoSaco(String nome, int vida) {
		super(nome, vida);
		setNome("O velho do saco");
		setVida(100);
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Ataque com muita RAIVA");
		System.out.println("Dano de 8");
		return 8;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Ataque FACADA");
		System.out.println("Dano de 15");
		return 15;
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Grande LACO DA MORTE! ");
		return 15;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("ATAQUE COM FACAO !");
		return 12;
	}

	@Override
	public int defesa() {
		System.out.println("USA UM ESCUDO!");
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
