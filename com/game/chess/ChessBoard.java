package com.game.chess;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ChessBoard {
	private static String board[][];
	private static Map<List<Integer>, List<String>> boardReference = new HashMap<>();
	//private static Map<String,Map> boardReference;
	private static Map<Integer,Integer> boardReferencePointer;
	

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
	
	
	public static void prepareBoard(String boardRef,String rowcol[][]) {
		
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
		// Initializing the Board references
		boardReference = new HashMap<>();
		boardReferencePointer = new HashMap<>();
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
		        boardReferencePointer.put(row, col);
		        //boardReference.put(intformat+(row+1), boardReference);
		        List<Integer> key = Arrays.asList(row, col);
		        List<String> value = Arrays.asList(intformat+(row+1));
		        boardReference.put(key, value);
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
		System.out.println(c.getPieceAt(5,0));
		
		int[][] arr = {{1, 2}, {3, 4}};
		Map<List<Integer>, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        List<Integer> key = Arrays.asList(i, j);
		        List<Integer> value = Arrays.asList(arr[i][j]);
		        map.put(key, value);
		    }
		}

		for (Entry<List<Integer>, List<String>> entry : boardReference.entrySet()) {
		    List<Integer> key = entry.getKey();
		    List<String> value = entry.getValue();
		    System.out.println(key + " = " + value);
		}
	}

}
