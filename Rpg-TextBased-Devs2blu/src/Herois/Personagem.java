package Herois;

import FantasyOne.Criatura;
import FantasyOne.LogicaJogo;

public class Personagem extends Criatura{
	public Personagem(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
	}
	@Override
	public int ataqueBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 0;
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
	public void defesa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recebeDano(int dano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

	public int ganhoXpViloes() {
	    this.setXp((this.getXp()+50));
        return this.getXp();
	}

	public int ganhoXpChefoes() {
		this.setXp((this.getXp()+100));
        return this.getXp();
	}
	
	public void subirNivel() {

		if (this.getXp() >= 100 && this.getXp() < 200) {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 10);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		} else if (this.getXp() >= 200 && this.getXp() < 300) {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 12);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		} else if (this.getXp() >= 300 && this.getXp() < 400) {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 15);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		} else if (this.getXp() >= 400 && this.getXp() < 500) {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 18);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		} else if (this.getXp() >= 500 && this.getXp() < 600) {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 20);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		} else {
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 25);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + this.getNivel());
		}
	}
	
		
	@Override
	public void historia() {
		// TODO Auto-generated method stub
		
	}
}

