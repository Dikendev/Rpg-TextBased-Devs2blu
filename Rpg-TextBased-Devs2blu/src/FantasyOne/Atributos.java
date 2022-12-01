package FantasyOne;

public abstract class Atributos {
	//variaveis //para todos os personagens
	
	public String nome;
	public int maxVida, vida, xp, pocao, nivel, mp;
	
	public Atributos(String nome, int vida) {
		this.nome = nome;	
		this.vida = vida;
	}

	public Atributos(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
		this.nome = nome;	
		this.maxVida = maxVida;
		this.xp = xp;
		this.vida = vida;
		this.pocao = pocao;
		this.nivel = nivel;
		this.mp = mp;
	}
	
	//metodos
	public abstract int ataqueBasico();
	public abstract int ataqueBasico2();
	public abstract int ataqueEspecial();
	public abstract int ataqueEspecial2();
	public abstract int defesa();
}
