package Inimigos;

import FantasyOne.LogicaJogo;
import Frames.FrameMinotauro;

public class ChefaoMinotauro extends Vilao {

	public ChefaoMinotauro(String nome, int vida, String tipo) {
		super(nome, vida, tipo);
		this.setNome(nome);
		this.setVida(vida);
		this.setTipo(tipo);
	}

	@Override
	public int ataqueBasico() {
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+LogicaJogo.VermelhoClaro+"Chifres!"+LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 12"+LogicaJogo.Reseta);
		return 12;
	}

	@Override
	public int ataqueBasico2() {
		System.out.printf("|%-91s|%n", "Minotauro ataca com "+LogicaJogo.VermelhoClaro+"Golpe Rápido!"+LogicaJogo.Reseta );
		System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 15"+LogicaJogo.Reseta);
		return 15;
	}

	@Override
	public int ataqueEspecial() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial"+LogicaJogo.VermelhoClaro+" Relâmpago!"+LogicaJogo.Reseta );
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 18"+LogicaJogo.Reseta);
			return 18;
	}

	@Override
	public int ataqueEspecial2() {
			System.out.printf("|%-91s|%n", "Minotauro usa o ataque especial "+LogicaJogo.VermelhoClaro+"Fúria do Submundo!"+LogicaJogo.Reseta);
			System.out.printf("|%-91s|%n", LogicaJogo.Vermelho+"Dano de 20"+LogicaJogo.Reseta);
			return 20;
	}

	@Override
	public void defesa() {
		System.out.printf("|%-91s|%n", "Minotauro usou "+LogicaJogo.VerdeClaro+"Defesa do Submundo."+LogicaJogo.Reseta);
		System.out.printf("|%-80s|%n", "Aumenta sua própria vida em "+LogicaJogo.Verde+"20."+LogicaJogo.Reseta);
		this.setVida(this.getVida()+20);
		System.out.printf("|%-80s|%n", "Minotauro possui: " +LogicaJogo.Verde+ this.getVida()+ "de vida"+LogicaJogo.Reseta);
	}

	@Override
	public void recebeDano(int dano) {
		this.setVida(this.getVida() - dano);
		System.out.printf("|%-80s|%n", "Minotauro recebeu dano, a vida dele é: " + LogicaJogo.Verde + this.getVida() + LogicaJogo.Reseta);
	}
	
	@Override
	public void historia() {
		FrameMinotauro fMinotauro = new FrameMinotauro();
	}

}
