package FantasyOne;

public class Jogador extends Personagens {

	
	public int heroiEspecialGuerreiro, heroiEspecialMago;
	
	// Classes no jogo caminho
	
	public String[] skillsEspecialGuerreiro = {"Bombarda", "Bombarda Maxima"};
	public String[] skillsEspecialMago = {"Lacarnum Inflamarae", "Aguamenti"};
	
	public Jogador(String name, int maxHp, int xp) {
		super(name, 100, 0);
		this.heroiEspecialGuerreiro = 0;
		this.heroiEspecialMago = 0;
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
		System.out.println("(1) " + skillsEspecialGuerreiro[heroiEspecialGuerreiro]);
		System.out.println("(2) " + skillsEspecialMago[heroiEspecialMago]);
		
		int input = GameLogic.escolhaInt("-> ", 2);
		GameLogic.clearConsole();
		
		if(input ==1) {
			GameLogic.printHeading("Voce escolheu: " + skillsEspecialGuerreiro[heroiEspecialGuerreiro] + "!");
			heroiEspecialGuerreiro++;
		}else {
			GameLogic.printHeading("Voce escolheu: " + skillsEspecialMago[heroiEspecialMago] + "!");
			heroiEspecialMago++;
		}
		GameLogic.continueOption();
		
	}
	

}

	









