package Herois;

import FantasyOne.Criatura;
import FantasyOne.LogicaJogo;
import Sounds.SoundEffects;



public class Personagem extends Criatura{
	public Personagem(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
	}
	
	static SoundEffects introSound = new SoundEffects();
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
	
	public static void playXpSound() {
		
		try {
			introSound.setFile(".//src//Sounds//assets//levelUp.wav");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			introSound.playEffectButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}


	
	public void subirNivel() {
		if (this.getXp() == 100) {
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 10);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 1);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else if (this.getXp() == 200) {
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 12);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 1);
			this.setMp(getMp() + 1);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else if (this.getXp() == 300) {
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 15);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 1);
			this.setMp(getMp() + 2);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível "  + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else if (this.getXp() == 400) {
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 18);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 2);
			this.setMp(getMp() + 2);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível "  + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else if (this.getXp() == 500) {
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 20);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 2);
			this.setMp(getMp() + 2);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível "  + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else if(this.getXp() >=600){
			playXpSound();
			this.setNivel(this.getNivel() + 1);
			this.setMaxVida(getMaxVida() + 25);
			this.setVida(getMaxVida());
			this.setPocao(getPocao() + 2);
			this.setMp(getMp() + 3);
			LogicaJogo.imprimirCabecalho("Parabéns você chegou no nível " + LogicaJogo.CianoSub + this.getNivel() +LogicaJogo.Reseta, 91);
			LogicaJogo.infoPersonagem();
		} else {
			LogicaJogo.infoPersonagem();
		}
	}
}

