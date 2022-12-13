package Herois;

import FantasyOne.Criatura;

public class Personagem extends Criatura{

	public Personagem(String nome, int vida) {
		super(nome, vida);
		System.out.println("Escolha um personagem: \\n1- Bruxo Caçador \\n2- Eladrin \\n3- Mago Cinzento \\n4- Sacerdote \\n5- DeathKnight");
		}

	@Override
	public int ataqueBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueBasico2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void defesa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recebeDano(int dano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usarPocao() {
		// TODO Auto-generated method stub
		
	}

}
