package FantasyOne;

public class Jogador extends Personagens {

	
	public int heroiGuerreiro, heroiMago;
	
	// Classes no jogo caminho
	// Harry potter skills haha
	public String[] skillsEspecialGuerreiro = {"Guerreiro"};
	public String[] skillsEspecialMago = {"Mago"};
	
	public Jogador(String name, int maxHp, int xp) {
		super(name, 100, 0);
		this.heroiGuerreiro = 0;
		this.heroiMago = 0;
		escolhaHeroi();
	}

	@Override
	public int ataqueBasico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ataqueEspecial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defesa() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	// escolher um heroi
	
	public void escolhaHeroi() {
		GameLogic.clearConsole();
		GameLogic.printHeading("Escolha seu Heroi: ");
		System.out.println("(1) " + skillsEspecialGuerreiro[heroiGuerreiro]);
		System.out.println("(2) " + skillsEspecialMago[heroiMago]);
		
		int input = GameLogic.escolhaInt("-> ", 2);
		GameLogic.clearConsole();
		
		if(input == 1) {
			GameLogic.printHeading("Voce escolheu: " + skillsEspecialGuerreiro[heroiGuerreiro] + "!");
			heroiGuerreiro++;
		}else {
			GameLogic.printHeading("Voce escolheu: " + skillsEspecialMago[heroiMago] + "!");
			heroiMago++;
		}
		GameLogic.continueOption();
		
	}
	

}

	









