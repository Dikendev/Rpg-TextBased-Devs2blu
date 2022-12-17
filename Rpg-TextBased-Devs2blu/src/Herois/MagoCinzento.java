package Herois;

import FantasyOne.GameLogic;

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
		if(this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 10"+ GameLogic.Reseta);
			return 10;
		}else if(this.getNivel() == 2) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+ GameLogic.Reseta);
			return 15;
		}else if(this.getNivel() == 3) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 20"+ GameLogic.Reseta);
			return 20;
		}else if(this.getNivel() == 4) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 25"+ GameLogic.Reseta);
			return 25;
		}else if(this.getNivel() == 5) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 30"+ GameLogic.Reseta);
			return 30;
		}else if(this.getNivel() == 6) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 35"+ GameLogic.Reseta);
			return 35;
		}else if(this.getNivel() == 7) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.VermelhoClaro+"Magia da Noite!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 40"+ GameLogic.Reseta);
			return 40;
		}else return 0;
	}

	@Override
	public int ataqueBasico2() {
		if(this.getNivel() == 1) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+ GameLogic.Reseta);
			return 15;
		}else if(this.getVida() == 2) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 20"+ GameLogic.Reseta);
			return 20;
		}else if(this.getVida() == 3) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 25"+ GameLogic.Reseta);
			return 25;
		}else if(this.getVida() == 4) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 30"+ GameLogic.Reseta);
			return 30;
		}else if(this.getVida() == 5) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 35"+ GameLogic.Reseta);
			return 35;
		}else if(this.getVida() == 6) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 40"+ GameLogic.Reseta);
			return 40;
		}else if(this.getVida() == 7) {
			System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho +"Magia dos Druidas!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 45"+ GameLogic.Reseta);
			return 45;
		}else return 0;
	}

	@Override
	public int ataqueEspecial() {
		if(this.getNivel() == 1) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+ GameLogic.Reseta);
				return 15;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 2) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 20"+ GameLogic.Reseta);
				return 20;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 3) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 25"+ GameLogic.Reseta);
				return 25;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 4) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 30"+ GameLogic.Reseta);
				return 30;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 5) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 35"+ GameLogic.Reseta);
				return 35;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 6) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 40"+ GameLogic.Reseta);
				return 40;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else if(this.getNivel() == 7) {
			if(this.getMp() > 0) {
				this.setMp(this.getMp() - 1);
				System.out.printf("|%-91s|%n", "Mago Cinzento ataca com a "+ GameLogic.Vermelho+"Magia Paralizante!" );
				System.out.printf("|%-91s|%n", "Dano de 5"+ GameLogic.Reseta+" seu oponente está paralizado por uma rodada.");
				System.out.printf("|%-80s|%n", "Mago Cinzento ataca com Magia celestial! " );
				System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 45"+ GameLogic.Reseta);
				return 45;
			} else {
				System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para utilizar o ataque especial!");
				return 0;
			}
		}else return 0;
	}
		

	@Override
	public int ataqueEspecial2() {
		if(this.getMp() > 0) {
			this.setMp(this.getMp() - 1);
			System.out.printf("|%-91s|%n", "Mago Cinzento utiliza a "+ GameLogic.VerdeClaro+"Magia da Cura!"+ GameLogic.Reseta );
			System.out.printf("|%-91s|%n", "Aumenta sua própria "+ GameLogic.Verde+"vida em 30."+ GameLogic.Reseta);
			this.setVida(this.getVida()+30);
			return this.getVida();
		} else {
			System.out.printf("|%-80s|%n", "O Ataque falhou, você não possui mana suficiente para o ataque especial.");
			return 0;
		}
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Mago Cinzento usou "+ GameLogic.VerdeClaro+"Defesa da Lua."+ GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Aumenta sua própria "+ GameLogic.Verde+"vida em 15."+ GameLogic.Reseta);
		this.setVida(this.getVida()+15);
		System.out.printf("|%-80s|%n", "Mago Cinzento possui: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta + "de vida");
	}
	

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Seu personagem recebeu dano, sua vida agora é de: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
		
	}

	@Override
	public void usarPocao() {
			if(this.getPocao() > 0) {
				this.setPocao(this.getPocao() - 1);			
				this.setVida(this.getVida() + 50);
			} else {
				System.out.printf("|%-80s|%n", "Você não possui Poções de Cura!");
			}
			System.out.printf("|%-80s|%n", "Você usou uma Poção de Cura, a vida atual do seu personagem passou para: " + GameLogic.Verde + this.getVida() + GameLogic.Reseta);
	}
	
	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.println("Historia");
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "É um personagem místico, ele veio da Lua com o intuito de proteger o");
		System.out.printf("|%-80s|%n", "Vilarejo Untirade.");
		System.out.printf("|%-80s|%n", "Seus ataques são fortes e os ataques especiais irão acabar com seus oponentes.");
		
		GameLogic.pressioneUmaTecla();
	}
	

}


	


