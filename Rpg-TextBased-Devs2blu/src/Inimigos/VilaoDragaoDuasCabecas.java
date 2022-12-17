package Inimigos;

import FantasyOne.LogicaJogo;

public class VilaoDragaoDuasCabecas extends Vilao {

	public VilaoDragaoDuasCabecas(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+LogicaJogo.VermelhoClaro+"Bola de Fogo:"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+LogicaJogo.VermelhoClaro+"Lança Chamas:"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 18"+LogicaJogo.Reseta);
		return 18;
	}

	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+LogicaJogo.VermelhoClaro+"Insinerar!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 25"+LogicaJogo.Reseta);
			return 25;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+LogicaJogo.VermelhoClaro+"Chamas do Sol!"+LogicaJogo.Reseta );
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 23"+LogicaJogo.Reseta);
			return 23;
	}
	
	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usou "+LogicaJogo.VerdeClaro+"Defesa do Fogo."+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", "Aumenta sua própria vida em "+LogicaJogo.Verde+"15."+LogicaJogo.Reseta);
		this.setVida(this.getVida()+15);
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças possui: " + LogicaJogo.Verde + this.getVida()+ LogicaJogo.Reseta + "de vida");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida()+ LogicaJogo.Reseta);
	}

	@Override
	public void historia() {
		LogicaJogo.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Após atravessar uma velha ponte de pedras, dois grandes rugidos tomam conta do");
		System.out.printf("|%-80s|%n", "cenário e chamam a atenção do nosso herói, que instintivamente olha para cima e");
		System.out.printf("|%-89s|%n", "se depara com um dragão, mas não um comum, um jovem e faminto " + LogicaJogo.VermelhoFun + "Dragão de Duas Cabeças" + LogicaJogo.Reseta);
		System.out.printf("|%-80s|%n", "Cabeças. Num rasante ele pousa em frente ao herói pronto para o ataque. ");
		System.out.printf("|%-80s|%n", "Lute por sua vida!");
		LogicaJogo.linhaPontilhada();

		LogicaJogo.pressioneUmaTecla();		
	}
	

}
