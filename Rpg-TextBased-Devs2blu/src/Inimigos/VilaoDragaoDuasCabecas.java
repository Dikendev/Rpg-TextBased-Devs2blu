package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameDragaoDuasCabecas;

public class VilaoDragaoDuasCabecas extends Vilao {

	public VilaoDragaoDuasCabecas(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+LogicaJogo.VermelhoClaro+"Bola de Fogo:"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 25"+LogicaJogo.Reseta);
		return 25;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças ataca com "+LogicaJogo.VermelhoClaro+"Lança Chamas:"+LogicaJogo.Reseta);
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 27"+LogicaJogo.Reseta);
		return 27;
	}

	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+LogicaJogo.VermelhoClaro+"Insinerar!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 32"+LogicaJogo.Reseta);
			return 32;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças usa o ataque especial "+LogicaJogo.VermelhoClaro+"Chamas do Sol!"+LogicaJogo.Reseta );
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 40"+LogicaJogo.Reseta);
			return 40;
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
		if(this.getVida() <= 0) {
			System.out.printf("|%-91s|%n", "Você deferiu um golpe fatal,"+LogicaJogo.VermelhoFun+" Dragão de Duas Cabeças morreu!"+LogicaJogo.Reseta);
		}else {
			System.out.printf("|%-91s|%n", "Dragão de Duas Cabeças recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);			
		}
	}

	@Override
	public void historia() {
		FrameDragaoDuasCabecas fDragao = new FrameDragaoDuasCabecas();
	}
	

}
