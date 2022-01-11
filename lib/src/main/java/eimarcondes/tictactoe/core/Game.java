package eimarcondes.tictactoe.core;

import eimarcondes.tictactoe.Constants;
import eimarcondes.tictactoe.ui.UI;

public class Game {

	Board board = new Board();
	Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		
		UI.printGameTitle();
		
		board.print();
		
//		UI.readInput("Nome do Jogador:");
		
	}
}
