package Herois;

import FantasyOne.GameLogic;

public class Eladrin extends Personagem {
	public Eladrin(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		this.setNome(nome);
		this.setMaxVida(maxVida);
		this.setXp(xp);
		this.setVida(vida);
		this.setPocao(pocao);
		this.setNivel(0);
		this.setMp(mp);
	}	
	
	@Override
	public int ataqueBasico() {
		if(this.getNivel() == 1) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 10");
			return 10;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 15");
			return 15;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 20");
			return 20;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 25");
			return 25;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 30");
			return 30;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 35");
			return 35;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com SOPRO DE GELO");
			System.out.printf("|%-80s|%n", "Dano de 40");
			return 40;
		}else return 0;
	}

	@Override
	public int ataqueBasico2() {
		if(this.getNivel() == 1) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 15");
			return 15;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 20");
			return 20;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 25");
			return 25;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 30");
			return 30;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 35");
			return 35;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 40");
			return 40;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-80s|%n", "Eladrin ataca com BOLA DE FOGO");
			System.out.printf("|%-80s|%n", "Dano de 45");
			return 45;
		}else return 0;
	}

	@Override
	public int ataqueEspecial() {
		if(getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-80s|%n", "Eladrin usa SEIVA DE VIDA");
			this.setVida(this.getVida() + 20);
			System.out.printf("|%-80s|%n", "Seu personagem usou poder de cura, sua vida agora é de: " + this.getVida());
			return this.getVida();
		} else {
			System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA.");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getNivel() == 1) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 35");
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 2) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 40");
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 45");
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 50");
				return 50;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 55");
				return 55;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 60");
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if(this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Eladrin usa DRENO DE VIDA");
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-80s|%n", "Dano de 65");
				return 65;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else return 0;
	}

	@Override
	public void defesa() {
		// TODO Auto-generated method stub
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + this.getVida());
	}
	
	@Override
    public void usarPocao() {
		if(this.getPocao() > 0) {
			this.setPocao(this.getPocao() - 1);
	        this.setVida(this.getVida() + 20);
	        System.out.printf("|%-80s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + this.getVida());
		} else {
			System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
		}
    }
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.println("História");
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "A Eladrin é uma espécie de elfo que adquire seus poderes da natureza e os");
		System.out.printf("|%-80s|%n", "modifca de acordo com as estações do ano. Todos os seus ataques buscam o poder");
		System.out.printf("|%-80s|%n", "nas estações");
		
		GameLogic.pressioneUmaTecla();
	}
	
}
