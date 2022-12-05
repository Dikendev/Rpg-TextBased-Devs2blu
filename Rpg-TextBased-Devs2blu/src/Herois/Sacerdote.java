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
		System.out.println("Você invoca com uma oração o Fogo Penitencial para subjulgar seu inimigo, causando 20 de dano!");
		return 20;
	}

	@Override
	public int ataqueEspecial2() {
		System.out.println("Você usa a Penitência Divína para expurgar seu inimigo, causando 25 de dano!");
		return 25;
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
	public int recebeDano(int dano) {
		this.vida = this.vida - dano;
		System.out.println("Seu personagem recebeu dano, sua vida agora é de: " + this.vida);
		return vida;
	}

}
