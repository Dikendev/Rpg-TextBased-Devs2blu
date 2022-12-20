package Herois;

import FantasyOne.LogicaJogo;

public class BruxoCacador extends Personagem {
	public BruxoCacador(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
		if (this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 15 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 15" + LogicaJogo.Reseta);
			return 15;
		} else if (this.getNivel() == 2) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 20 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 20" + LogicaJogo.Reseta);
			return 20;
		} else if (this.getNivel() == 3) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 25 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 25" + LogicaJogo.Reseta);
			return 25;
		} else if (this.getNivel() == 4) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 30 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 30" + LogicaJogo.Reseta);
			return 30;
		} else if (this.getNivel() == 5) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 35 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 35" + LogicaJogo.Reseta);
			return 35;
		} else if (this.getNivel() == 6) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 40 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 40" + LogicaJogo.Reseta);
			return 40;
		} else if (this.getNivel() == 7) {
			System.out.printf("|%-91s|%n", "Bruxo caçador aplicou um golpe com sua espada, causando"+ LogicaJogo.VermelhoClaro +" 45 de dano!"+ LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 45" + LogicaJogo.Reseta);
			return 45;
		} else return 0;
	}

	@Override
	public int ataqueBasico2() {
		if (this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "20 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 20" + LogicaJogo.Reseta);
			return 20;
		} else if (this.getNivel() == 2) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "25 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 25" + LogicaJogo.Reseta);
			return 25;
		} else if (this.getNivel() == 3) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "30 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 30" + LogicaJogo.Reseta);
			return 30;
		} else if (this.getNivel() == 4) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "35 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 35" + LogicaJogo.Reseta);
			return 35;
		} else if (this.getNivel() == 5) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "40 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 40" + LogicaJogo.Reseta);
			return 40;
		} else if (this.getNivel() == 6) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "45 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 45" + LogicaJogo.Reseta);
			return 45;
		} else if (this.getNivel() == 7) {
			System.out.printf("|%-91s|%n", "Bruxo caçador utilizou seu arco e flecha com veneno, causando " + LogicaJogo.VermelhoClaro + "50 de dano!" + LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 50" + LogicaJogo.Reseta);
			return 50;
		} else
			return 0;
	}

	@Override
	public int ataqueEspecial() {
		if (this.getNivel() == 1) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"30 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 30"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 30;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 2) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"35 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 35"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 3) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"40 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 40"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 4) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"45 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 45"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 5) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"50 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 50"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 50;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 6) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"55 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 55"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 55;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else if (this.getNivel() == 7) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou bola de fogo, causando "+ LogicaJogo.VermelhoClaro +"60 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho +"Dano: 60"+ LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para bola de fogo!");
				return 0;
			}
		} else return 0;
	}

	@Override
	public int ataqueEspecial2() {
		if (this.getNivel() == 1) {
			if (this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"35 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 35" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 2) {
				if(this.getMp() > 0) {
					System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"40 de dano!" + LogicaJogo.Reseta);
					System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 40" + LogicaJogo.Reseta);
					this.setMp(getMp() - 1);
					return 40;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"45 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 45" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 45;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"50 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 50" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 50;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"55 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 55" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 55;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"60 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 60" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 60;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if(this.getMp() > 0) {
				System.out.printf("|%-91s|%n", "Bruxo caçador utilizou relâmpago, causando "+ LogicaJogo.VermelhoClaro +"65 de dano!" + LogicaJogo.Reseta);
				System.out.printf("|%-91s|%n", LogicaJogo.Vermelho + "Dano: 65" + LogicaJogo.Reseta);
				this.setMp(getMp() - 1);
				return 65;
			}else {
				System.out.printf("|%-80s|%n", "Sem mana suficiente para relâmpago!");
				return 0;
			}
		}else return 0;
	}

	@Override
	public void defesa() {
		if (this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Bruxo caçador se regenerou, aumentando sua "+ LogicaJogo.VerdeClaro +"Vida em 15!" + LogicaJogo.Reseta);
			this.setVida(this.getVida() + 15);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		} else if(this.getNivel()>=2 && this.getNivel()<=4){
			System.out.printf("|%-91s|%n", "Bruxo caçador se regenerou, aumentando sua "+ LogicaJogo.VerdeClaro +"Vida em 20!" + LogicaJogo.Reseta);
			this.setVida(this.getVida() + 20);
			System.out.printf("|%-91s|%n", "Sua vida atual é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
		} else if(this.getNivel()>=5 && this.getNivel()<=7){
			System.out.printf("|%-91s|%n", "Bruxo caçador se regenerou, aumentando sua "+ LogicaJogo.VerdeClaro +"Vida em 30!" + LogicaJogo.Reseta);
			this.setVida(this.getVida() + 30);
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
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Historia");
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Nosso Herói começa sua jornada na pacata vila de Untirade, um pequeno povoado");
		System.out.printf("|%-80s|%n", "numa clareira não muito próxima ao Boca do Diabo, um grande vulcão adormecido,");
		System.out.printf("|%-80s|%n", "lar do maligno Senhor do Fogo Ragnaros que recentemente despertou de seu");
		System.out.printf("|%-80s|%n", "aprisionamento e agora jura vingança a todos os povos e raças.");
		System.out.printf("|%-80s|%n", "Com a ameaça iminente a vida de todos, e guiado por sua honrosa índole, nosso");
		System.out.printf("|%-80s|%n", "Herói agora caminha em direção a Boca do Diabo para dar fim ao impiedoso legado");
		System.out.printf("|%-80s|%n", "de Ragnaros.");

		LogicaJogo.pressioneUmaTecla();
	}

}
