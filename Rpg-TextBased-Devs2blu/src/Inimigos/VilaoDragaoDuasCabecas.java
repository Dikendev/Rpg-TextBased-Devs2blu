package Inimigos;

import FantasyOne.GameLogic;

public class VilaoDragaoDuasCabecas extends Vilao {

	public VilaoDragaoDuasCabecas(String nome, int vida) {
		super(nome, vida);
		this.setNome(nome);
		this.setVida(vida);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+GameLogic.VermelhoClaro+"Bola de Fogo:"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 15"+GameLogic.Reseta);
		return 15;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+GameLogic.VermelhoClaro+"Lança Chamas:"+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 18"+GameLogic.Reseta);
		return 18;
	}

	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+GameLogic.VermelhoClaro+"Insinerar!"+GameLogic.Reseta);
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 25"+GameLogic.Reseta);
			return 25;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+GameLogic.VermelhoClaro+"Chamas do Sol!"+GameLogic.Reseta );
			System.out.printf("|%-91s|%n", GameLogic.Vermelho+"Dano de 23"+GameLogic.Reseta);
			return 23;
	}
	
	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usou "+GameLogic.VerdeClaro+"Defesa do Fogo."+GameLogic.Reseta);
		System.out.printf("|%-91s|%n", "Aumenta sua própria vida em "+GameLogic.Verde+"15."+GameLogic.Reseta);
		this.setVida(this.getVida()+15);
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças possui: " + GameLogic.Verde + this.getVida()+ GameLogic.Reseta + "de vida");
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças recebeu dano, a vida dele é: " + GameLogic.Verde + this.getVida()+ GameLogic.Reseta);
	}

	@Override
	public void historia() {
		GameLogic.linhaPontilhada();
		System.out.printf("|%-80s|%n", "Após atravessar uma velha ponte de pedras, dois grandes rugidos tomam conta do");
		System.out.printf("|%-80s|%n", "cenário e chamam a atenção do nosso herói, que instintivamente olha para cima e");
		System.out.printf("|%-89s|%n", "se depara com um dragão, mas não um comum, um jovem e faminto " + GameLogic.VermelhoFun + "Dragão de Duas Cabeças" + GameLogic.Reseta);
		System.out.printf("|%-80s|%n", "Cabeças. Num rasante ele pousa em frente ao herói pronto para o ataque. ");
		System.out.printf("|%-80s|%n", "Lute por sua vida!");
		GameLogic.linhaPontilhada();

		GameLogic.pressioneUmaTecla();		
	}
	

}
