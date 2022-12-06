package Herois;
import FantasyOne.Criatura;

public class Eladrin extends Criatura {
	
	public Eladrin(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		setNome(nome);
		setMaxVida(maxVida);
		setXp(xp);
		setVida(vida);
		setPocao(pocao);
		setNivel(0);
		setMp(mp);
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
		if(getMp() > 0) {
			System.out.println("Eladrin usa SEIVA DE VIDA");
			setMp(getMp() - 1);
			setVida(getVida() + 20);
			System.out.println("Seu personagem usou poder de cura, sua vida agora é de: " + getVida());
			return getVida();
		} else {
			System.out.println("Você não possui mana suficiente para usar SEIVA DE VIDA.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			System.out.println("Eladrin usa DRENO DE VIDA");
			this.setMp(this.getMp() - 1);
			System.out.println("Dano de 35");
			return recebeDano(35);
		} else {
			System.out.println("Você não possui mana suficiente para usar DRENO DE VIDA.");
			return 0;
		}
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}
	
	@Override
    public int usarPocao() {
        setPocao(getPocao() - 1);
        setVida(getVida() + 20);
        System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + getVida());
        return getVida();
    }
	
	
}
