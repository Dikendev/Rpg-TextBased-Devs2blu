package FantasyOne;

public abstract class Atributos {
	//variaveis //para todos os personagens
	
	public String name;
	public int maxHp, hp, xp, pocao, nivel, mp;
	
	public Atributos(String name, int hp) {
		this.name = name;	
		this.hp = hp;
	}

	public Atributos(String name, int maxHp, int xp, int hp, int pocao, int nivel, int mp) {
		this.name = name;	
		this.maxHp = maxHp;
		this.xp = xp;
		this.hp = hp;
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
	public abstract int recebeDano();
}
