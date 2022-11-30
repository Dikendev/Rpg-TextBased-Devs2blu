package FantasyOne;

public abstract class Personagens {
	//variaveis //para todos os personagens
	public String name;
	public int maxHp, hp, xp;

	public Personagens(String name, int maxHp, int xp) {
		this.name = name;	
		this.maxHp = maxHp;
		this.xp = xp;
		this.hp = maxHp;
	}
	
	//metodos
	public abstract int ataqueBasico();
	public abstract int ataqueEspecial();
	public abstract int defesa();
}
