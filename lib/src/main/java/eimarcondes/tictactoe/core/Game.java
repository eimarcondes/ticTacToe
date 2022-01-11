package eimarcondes.tictactoe.core;

import eimarcondes.tictactoe.Constants;
import eimarcondes.tictactoe.ui.UI;

public class Game {

	private Board board = new Board();
	private Player[] players = new Player[Constants.SYMBOL_PLAYERS.length];
	
	public void play() {
		
		UI.printGameTitle();
		
		board.print();
		
//		UI.readInput("Nome do Jogador:");
		
	}
}
