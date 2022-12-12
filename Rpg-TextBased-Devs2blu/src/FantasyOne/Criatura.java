	package FantasyOne;

public abstract class Criatura {
	
	private String nome;
	private int maxVida, vida, xp, pocao, nivel, mp;
	
	public Criatura(String nome, int vida) {
		this.nome = nome;	
		this.vida = vida;
	}

	public Criatura(String nome, int maxVida, int xp, int vida, int pocao, int nivel, int mp) {
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
	public abstract void recebeDano(int dano);
	public abstract void usarPocao();


	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxVida() {
		return maxVida;
	}

	public void setMaxVida(int maxVida) {
		this.maxVida = maxVida;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getPocao() {
		return pocao;
	}

	public void setPocao(int pocao) {
		this.pocao = pocao;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
	
}
