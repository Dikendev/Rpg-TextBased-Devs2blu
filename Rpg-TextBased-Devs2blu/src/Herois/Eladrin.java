package Herois;

import FantasyOne.LogicaJogo;

public class Eladrin extends Personagem {
	public Eladrin(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
		if(this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 10"+ LogicaJogo.Reseta);
			return 10;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+ LogicaJogo.Reseta);
			return 15;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 20"+ LogicaJogo.Reseta);
			return 20;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 25"+ LogicaJogo.Reseta);
			return 25;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 30"+ LogicaJogo.Reseta);
			return 30;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com"+ LogicaJogo.VermelhoClaro+" SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 35"+ LogicaJogo.Reseta);
			return 35;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"SOPRO DE GELO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 40"+ LogicaJogo.Reseta);
			return 40;
		}else return 0;
	}

	@Override
	public int ataqueBasico2() {
		if(this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+ LogicaJogo.Reseta);
			return 15;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 20"+ LogicaJogo.Reseta);
			return 20;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 25"+ LogicaJogo.Reseta);
			return 25;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 30"+ LogicaJogo.Reseta);
			return 30;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 35"+ LogicaJogo.Reseta);
			return 35;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 40"+ LogicaJogo.Reseta);
			return 40;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-91s|%n", "Eladrin ataca com "+ LogicaJogo.VermelhoClaro+"BOLA DE FOGO"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 45"+ LogicaJogo.Reseta);
			return 45;
		}else return 0;
	}

	@Override
	public int ataqueEspecial() {
		if(getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VerdeClaro +"SEIVA DE VIDA"+ LogicaJogo.Reseta);
			this.setVida(this.getVida() + 20);
			System.out.printf("|%-91s|%n", "Seu personagem usou poder de cura, sua vida agora é de: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
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
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 35"+ LogicaJogo.Reseta);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 2) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 40"+ LogicaJogo.Reseta);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 45"+ LogicaJogo.Reseta);
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 50"+ LogicaJogo.Reseta);
				return 50;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 55"+ LogicaJogo.Reseta);
				return 55;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 60"+ LogicaJogo.Reseta);
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar DRENO DE VIDA.");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Eladrin usa "+ LogicaJogo.VermelhoClaro+"DRENO DE VIDA"+ LogicaJogo.Reseta);
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 65"+ LogicaJogo.Reseta);
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
		System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + LogicaJogo.Verde+ this.getVida()+ LogicaJogo.Reseta);
	}
	
	@Override
    public void usarPocao() {
		if(this.getPocao() > 0) {
			this.setPocao(this.getPocao() - 1);
	        this.setVida(this.getVida() + 20);
	        System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde+ this.getVida()+ LogicaJogo.Reseta);
		} else {
			System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
		}
    }
	
	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.println("História");
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "A Eladrin é uma espécie de elfo que adquire seus poderes da natureza e os");
		System.out.printf("|%-80s|%n", "modifca de acordo com as estações do ano. Todos os seus ataques buscam o poder");
		System.out.printf("|%-80s|%n", "nas estações");
		
		LogicaJogo.pressioneUmaTecla();
	}
	
}
