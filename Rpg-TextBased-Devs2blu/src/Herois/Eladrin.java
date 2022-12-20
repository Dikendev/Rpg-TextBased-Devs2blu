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
		if (this.getNivel() == 1) {
			if (getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 35"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 10"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 10);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
				return 0;
			}
		} else if (this.getNivel() == 2) {
			if (getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 40"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 13"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 13);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
				return 0;
			}
		} else if (this.getNivel() == 3) {
				if (getMp() > 0) {
					this.setMp(this.getMp() - 1);
					System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 45"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 17"+ LogicaJogo.Reseta);
					this.setVida(this.getVida() + 17);
					return 45;
				} else {
					System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
					return 0;
			}
		} else if (this.getNivel() == 4) {
				if (getMp() > 0) {
					this.setMp(this.getMp() - 1);
					System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 50"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 22"+ LogicaJogo.Reseta);
					this.setVida(this.getVida() + 22);	
					return 50;
				} else {
					System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
					return 0;
			}
		} else if (this.getNivel() == 5) {
				if (getMp() > 0) {
					this.setMp(this.getMp() - 1);
					System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 55"+ LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 25"+ LogicaJogo.Reseta);
					this.setVida(this.getVida() + 25);
					return 55;
				} else {
					System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
					return 0;
			}
		} else if (this.getNivel() == 6) {
			if (getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 60"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 28"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 28);
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
				return 0;
			}
		} else if (this.getNivel() == 7) {
			if (getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n","Eladrin usa " + LogicaJogo.VermelhoClaro + "SEIVA DE VIDA E DA MORTE" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 65"+ LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.VerdeClaro+"Cura de 30"+ LogicaJogo.Reseta);
				this.setVida(this.getVida() + 30);
				return 65;
			} else {
				System.out.printf("|%-80s|%n", "Você não possui mana suficiente para usar SEIVA DE VIDA E DA MORTE.");
				return 0;
			}
		} else {
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
		if (this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Você usa a RAIZES DE CURA e" + LogicaJogo.VerdeClaro +" recuperando 15 pontos de vida!" + LogicaJogo.Reseta);
			this.setVida(getVida() + 15);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		} else if(this.getNivel() >= 2 && this.getNivel() <= 4){
			System.out.printf("|%-91s|%n", "Você usa a RAIZES DE CURA e" + LogicaJogo.VerdeClaro +" recuperando 20 pontos de vida!" + LogicaJogo.Reseta);
			this.setVida(getVida() + 20);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		} else if(this.getNivel() >= 5 && this.getNivel() <= 7) {
			System.out.printf("|%-91s|%n", "Você usa a RAIZES DE CURA e" + LogicaJogo.VerdeClaro +" recuperando 30 pontos de vida!" + LogicaJogo.Reseta);
			this.setVida(getVida() + 30);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		if(this.getVida() <= 0) {
			System.out.printf("|%-91s|%n", "Seu personagem recebeu dano fatal,"+LogicaJogo.VermelhoFun+" você morreu!"+LogicaJogo.Reseta);
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
				System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 2 && this.getNivel() <= 5) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 50);
			} else {
				System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		} else if (this.getNivel() >= 6 && this.getNivel() <= 7) {
			if (this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);
				this.setVida(this.getVida() + 100);
			} else {
				System.out.printf("|%-80s|%n","Você não possui " + LogicaJogo.VerdeClaro + "Poções de Cura!" + LogicaJogo.Reseta);
			}
		}
		System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + LogicaJogo.Verde
				+ this.getVida() + LogicaJogo.Reseta);
	}
	
	@Override
	public void historia() {

	}
	
}
