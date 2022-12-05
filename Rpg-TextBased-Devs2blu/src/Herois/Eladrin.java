package Herois;
import FantasyOne.Atributos;

public class Eladrin extends Atributos {
	
	public Eladrin(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
	}	
	
	@Override
	public int ataqueBasico() {
		System.out.println("Eladrin ataca com SOPRO DE GELO");
		System.out.println("Dano de 10");
		return recebeDano(10);
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Eladrin ataca com BOLA DE FOGO");
		System.out.println("Dano de 15");
		return recebeDano(15);
	}

	@Override
	public int ataqueEspecial() {
		System.out.println("Eladrin usa SEIVA DE VIDA");
		this.mp = this.mp -1;
		this.vida = this.vida + 20;
		System.out.println("Seu personagem usou poder de cura, sua vida agora é de: " + this.vida);
		return vida;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Eladrin usa DRENO DE VIDA");
		System.out.println("Dano de 35");
		return recebeDano(35);
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.vida);
		return vida;
	}
	
	@Override
    public int usarPocao() {
        this.pocao = (this.pocao - 1);
        this.vida = (this.vida + 20);
        System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + this.vida);
        return vida;
    }
	
	
}
