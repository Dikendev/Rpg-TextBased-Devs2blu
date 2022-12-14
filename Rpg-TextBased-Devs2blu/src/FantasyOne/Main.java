package FantasyOne;

import java.util.ArrayList;
import java.util.Scanner;

import Herois.BruxoCacador;
import Inimigos.ChefaoMinotauro;
import Inimigos.ChefaoQuimera;
import Inimigos.ChefaoRagnaros;
import Inimigos.VilaoCapivaraZumbi;
import Inimigos.VilaoDhampir;
import Inimigos.VilaoDragaoDuasCabecas;
import Inimigos.VilaoDuergar;
import Inimigos.VilaoElfo;
import Inimigos.VilaoOrcGuerreiro;
import Inimigos.VilaoVelhoDoSaco;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		VilaoOrcGuerreiro orcGuerreiro = new VilaoOrcGuerreiro("Orc Guerreiro", 100);
		VilaoElfo vilaoElfo = new VilaoElfo("Elfo", 100);
		VilaoVelhoDoSaco velhoDoSaco = new VilaoVelhoDoSaco("Velho do Saco", 100);
		VilaoDuergar vilaoDuergar = new VilaoDuergar("Duergar", 100);
		VilaoDragaoDuasCabecas dragaoCabeca = new VilaoDragaoDuasCabecas("Dragão de duas Cabeças", 100);
		VilaoDhampir dhampir = new VilaoDhampir("Dhampir", 100);
		VilaoCapivaraZumbi capivaraZumbi = new VilaoCapivaraZumbi("Capivara Zumbi", 100);
		ChefaoMinotauro minotauro = new ChefaoMinotauro("Minotauro", 100);
		ChefaoQuimera quimera = new ChefaoQuimera("Quimera", 100);
		ChefaoRagnaros ragnaros = new ChefaoRagnaros("Ragnaros", 100);
				
		
		ArrayList<Object> inimigos = new ArrayList<Object>();
		inimigos.add(orcGuerreiro);
		inimigos.add(vilaoDuergar);
		inimigos.add(minotauro);
		inimigos.add(dragaoCabeca);
		inimigos.add(dhampir);
		inimigos.add(quimera);
		inimigos.add(vilaoElfo);
		inimigos.add(capivaraZumbi);
		inimigos.add(velhoDoSaco);
		inimigos.add(ragnaros);
		//começar história inicial e logo em seguida primeira luta
		GameLogic.comecaJogo();
	}
	    
	    
}
