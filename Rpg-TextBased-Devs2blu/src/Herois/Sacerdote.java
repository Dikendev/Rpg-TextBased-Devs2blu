package Herois;

import FantasyOne.Atributos;

public class Sacerdote extends Atributos {

	public Sacerdote(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		super(nome, maxVida, xp, vida, pocao, nivel, mp);
		this.nome = nome;
		this.maxVida = maxVida;
		this.xp = xp;
		this.vida = vida;
		this.pocao = pocao;
		this.nivel = nivel;
		this.mp = mp;
	}

	@Override
	public int ataqueBasico() {
		System.out.println("Você lança três arcos de luz, causando 10 de dano!");
		return 10;
	}

	@Override
	public int ataqueBasico2() {
		System.out.println("Você canaliza um raio de luz ofuscante diretamente ao seu inimigo, causando 12 de dano!");
		return 12;
	}

	@Override
	public int ataqueEspecial() {
		if(this.mp > 0) {
			System.out.println("Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo, causando 20 de dano!");
			this.mp = (this.mp - 1);
			return 20;			
		} else {
			System.out.println("Você tenta, mas não possui mana suficiente para o Fogo Penitencial!");
			return 0;
		}
	}

	@Override
	public int ataqueEspecial2() {
		if(this.mp > 0) {
			System.out.println("Você usa a Penitência Divína para expurgar seu inimigo, causando 25 de dano!");
			this.mp = (this.mp - 1);			
			return 25;
		} else {
			System.out.println("Você tenta, mas não possui mana suficiente para Penitência Divína!");
			return 0;
		}
	}

	@Override
	public int defesa() {
		System.out.println("Você usa a oração celestial e cura 10 pontos de vida!");
		return 10;
	}

	@Override
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.vida);
		return vida;
	}
	
	@Override
	public int usarPocao() {
		if(this.pocao > 0) {
			this.pocao = (this.pocao - 1);			
			this.vida = (this.vida + 20);
		} else {
			System.out.println("Você não possui Poções de Cura!");
		}
		System.out.println("Você usou uma Poção de Cura, sua vida atual é: " + this.vida);
		return vida;
	}

}
