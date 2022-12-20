package Herois;

import FantasyOne.LogicaJogo;

public class MagoCinzento extends Personagem{

	public MagoCinzento(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		this.setNome(nome);
		this.setMaxVida(maxVida);
		this.setXp(xp);
		this.setVida(vida);
		this.setPocao(pocao);
		this.setNivel(nivel);
		this.setMp(mp);
	}

	@Override
	public int ataqueBasico() {
		int dano = 10 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ LogicaJogo.VermelhoClaro+"Magia da Noite!"+ LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano+ LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueBasico2() {
		int dano = 13 + (5*this.getNivel());
		System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ LogicaJogo.Vermelho +"Magia dos Druidas!"+ LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de "+dano+ LogicaJogo.Reseta);
		return dano;
	}

	@Override
	public int ataqueEspecial() {
		int dano = 15 + (5*this.getNivel());
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de " + dano+ LogicaJogo.Reseta);
			return dano;
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
			return 0;
		}
	}
		

	@Override
	public int ataqueEspecial2() {
		int vidaRec = 15 + (5*this.getNivel());
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-91s|%n", "Mago Cinzento utiliza a "+ LogicaJogo.VerdeClaro+"Magia da Cura!"+ LogicaJogo.Reseta );
			System.out.printf("|%-91s|%n", "Aumenta sua própria "+ LogicaJogo.Verde+"vida em " + vidaRec + LogicaJogo.Reseta);
			this.setVida(this.getVida()+vidaRec);
			return 0;
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para o ataque especial.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		int vidaRec = 10 + (5*this.getNivel());
			System.out.printf("|%-91s|%n", "Mago Cinzento usou "+ LogicaJogo.VerdeClaro+"Defesa da Lua."+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", "Aumenta sua própria "+ LogicaJogo.Verde+"vida em " + vidaRec + LogicaJogo.Reseta);
			this.setVida(this.getVida()+vidaRec);
			System.out.printf("|%-80s|%n", "Mago Cinzento possui: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta + "de vida");
	}
	

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		if(this.getVida() <= 0) {
			System.out.printf("|%-89s|%n", "Seu personagem recebeu dano fatal,"+LogicaJogo.VermelhoFun+" você morreu!"+LogicaJogo.Reseta);
		}else {
			System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);			
		}
	}

	@Override
	public void usarPocao() {
		if (this.getNivel() == 1) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 20);
			} else {
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 2 && this.getNivel() <= 5) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 50);
			} else {
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 6 && this.getNivel() <= 7) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 100);
			} else {
				System.out.printf("|%-91s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		}
		System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde
				+ this.getVida() + LogicaJogo.Reseta);
	}
	
}


	


