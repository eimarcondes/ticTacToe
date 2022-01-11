package eimarcondes.tictactoe.core;

public class Player {

	private String name;
	private Board board;
	private char symbol;

	
	public Player(String name, Board board, char symbol) {
		this.name = name;
		this.board = board;
		this.symbol = symbol;
	}

	public Move inputMove() {
		return null;
	}

	public void play() {

	}

	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public char getSymbol() {
		return symbol;
	}
	
	
}
