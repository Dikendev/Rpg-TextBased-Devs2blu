package Herois;

import FantasyOne.GameLogic;

public class Sacerdote extends Personagem {

	public Sacerdote(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 15");
			return 15;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 20");
			return 20;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 25");
			return 25;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 30");
			return 30;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 35");
			return 35;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 40");
			return 40;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-80s|%n", "Você lança três arcos de luz, causando 10 de dano!");
			System.out.printf("|%-80s|%n", "Dano: 45");
			return 45;
		}else return 0;	
	}

	@Override
	public int ataqueBasico2() {
		if(this.getNivel() == 1) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 20");
			return 20;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 25");
			return 25;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 30");
			return 30;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 35");
			return 35;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 40");
			return 40;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 45");
			return 45;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-80s|%n", "Você canaliza um raio de luz ofuscante diretamente ao seu inimigo,");
			System.out.printf("|%-80s|%n", "Dano: 50");
			return 50;
		}else return 0;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getNivel() == 1) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 30");
				this.setMp(this.getMp() - 1);
				return 30;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 2) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 35");
				this.setMp(this.getMp() - 1);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 40");
				this.setMp(this.getMp() - 1);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 45");
				this.setMp(this.getMp() - 1);
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 50");
				this.setMp(this.getMp() - 1);
				return 50;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 55");
				this.setMp(this.getMp() - 1);
				return 55;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo,");
				System.out.printf("|%-80s|%n", "Dano: 60");
				this.setMp(this.getMp() - 1);
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
				return 0;
			}
		}else return 0;
	}

	@Override
	public int ataqueEspecial2() {
		if(this.getNivel() == 1) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 35");
				this.setMp(this.getMp() - 1);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 2) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 40");
				this.setMp(this.getMp() - 1);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 45");
				this.setMp(this.getMp() - 1);
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 50");
				this.setMp(this.getMp() - 1);
				return 50;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 55");
				this.setMp(this.getMp() - 1);
				return 55;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 60");
				this.setMp(this.getMp() - 1);
				return 60;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if (this.getMp() > 0) {
				System.out.printf("|%-80s|%n", "Você usa a Penitência Divína para expurgar seu inimigo, causando 35 de dano!");
				System.out.printf("|%-80s|%n", "Dano: 65");
				this.setMp(this.getMp() - 1);
				return 65;
			} else {
				System.out.printf("|%-80s|%n", "Você tenta, mas não possui mana suficiente para Penitência Divína!");
				return 0;
			}
		}else return 0;
	}

	@Override
	public void defesa() {
		if (this.getMp() >= 2) {
			System.out.printf("|%-91s|%n", "Você usa a oração celestial e" + GameLogic.VerdeClaro +" cura 15 pontos de vida!" + GameLogic.Reseta);
			this.setVida(getVida() + 15);
		} else {
			System.out.printf("|%-80s|%n", "Sem mana suficiente para recuperar vida!");
		}
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}

	@Override
	public void usarPocao() {
		if (this.getPocao() > 0) {
			this.setPocao(this.getPocao() - 1);
			this.setVida(this.getVida() + 20);
		} else {
			System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
		}
		System.out.printf("|%-91s|%n", "Você usou uma Poção de Cura, sua vida atual é: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.println("Historia");
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Com sua tunica branca e seu cajado adornado em prata e ouro, o Sacerdote usa sua");
		System.out.printf("|%-80s|%n", "fé e o poder divino para subjulgar seus inimigos. \nUsando orações ele é capaz");
		System.out.printf("|%-80s|%n", "de causar grande dano ou curar a sí mesmo.");

		GameLogic.pressioneUmaTecla();
	}

}
