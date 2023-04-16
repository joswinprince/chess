package com.game.chess;


public class ChessBoard {
	private static String board[][];

	public ChessBoard() {
		 board = new String [8][8];
		 // Assign Names to all the values
	}
	
	
	public String getPieceAt(int row, int col) {
        return board[row][col];
    }
	
	public void setPieceAt(int row, int col, String piece) {
        board[row][col] = piece;
    }
	
	
	public void prepareBoard() {
		
	}
	
	public static void printBoard() 
	{
		
		for(int i=0; i<8; i++) {
		    for(int j=0; j<8; j++) {
		        System.out.print(board[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	public static void addBlackBoard() 
	{
		String intformat = "";
		for(int row=0; row<8; row++) {
		    for(int col=0; col<8; col++) {
		    	switch(col)
		    	{
		                case 7 -> intformat = "A";
		                case 6 -> intformat = "B";
		                case 5 -> intformat = "C";
		                case 4 -> intformat = "D";
		                case 3 -> intformat = "E";
		                case 2 -> intformat = "F";
		                case 1 -> intformat = "G";
		                case 0 -> intformat = "H";
		                	//Rook H8
		                	
		    	}
		    	
		    	
		    	board[row][col] = intformat+(row+1);
		    	
            	// Rook H8
            	if(row ==7 && col == 7 && intformat == "A")
            	{
            		board[row][col] = "RB";
            	}
            	
		        System.out.print(board[row][col] + " ");
		    }
		    System.out.println();
		}
	}
	public static void main(String[] args) {
		ChessBoard c = new ChessBoard();	
		//c.printBoard();
		c.addBlackBoard();
		System.out.println("________________________");
		c.printBoard();
		
	}

}
