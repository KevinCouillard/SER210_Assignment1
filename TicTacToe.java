import java.util.Scanner;

/**
 * TicTacToe class implements the interface
 * @author kCouillard
 * @date 2/4/21
 */
public class TicTacToe implements ITicTacToe {
		 
	   // The game board and the game status
	   private static final int ROWS = 5, COLS = 5; // number of rows and columns
	   private int[][] board = new int[ROWS][COLS]; // game board in 2D array
	   private int currentPlayer = 1;				//current player to cross
	   private int spaceUsed = 0;					//number of spaces used
	   private int ranNum = 0;						//computer move
	   public static Scanner in = new Scanner(System.in);	//user input if space used
	/**
	 * clear board and set current player   
	 */
	public TicTacToe(){
		clearBoard();
		currentPlayer = CROSS;
	}
	@Override
	public void clearBoard() {
		//Loops through board array and sets each cell to EMPTY
		for (int i=0; i < ROWS; i++) {
			for (int j=0; j < COLS; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	@Override
	public void setMove(int player, int location) {
		//Checks if input is out of range, then checks if cell is not empty, then sets player move
		String userInput;
		if (location > 24 || location < 0) {
			return;
		} if (board[location/5][location%5] != EMPTY) { 											//checks if space is used
			System.out.println("That space has already been used. Please enter another space.");	 
			userInput = in.next();																	//if used gets new user move and recalls function with new input
			location = Integer.parseInt(userInput);
			this.setMove(currentPlayer, location);
			return;
		} else {
			board[location/5][location%5] = player;
			spaceUsed++;
		}
		
	}

	@Override
	public int getComputerMove() {
		//Create random num and check if space is empty, if yes: place O, if no: call function again
		ranNum = (int)(Math.random() * 24);
		if (spaceUsed > 24) {
			return this.checkForWinner();
		} else if (board[ranNum/5][ranNum%5] == EMPTY) {
			spaceUsed++;
			System.out.println("Computer Move: " + ranNum);
       	 	return board[ranNum/5][ranNum%5] = 2;
        } else {
            return this.getComputerMove();
        }
	}

	@Override
	public int checkForWinner() {
		//Lot of code (inefficient) could check for a way that goes by numbers 0-24 rather than array
		//but checks all possible win options for player and computer, then returns winner 	
		int winner = 0;
			if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1 && board[0][3] == 1 //4 across on row 0 (top) = X
				|| board[0][1] == 1 && board[0][2] == 1 && board[0][3] == 1 && board[0][4] == 1 //4 across on row 0 (2nd) = X
				|| board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1 && board[1][3] == 1 //4 across row 1 = X
				|| board[1][1] == 1 && board[1][2] == 1 && board[1][3] == 1 && board[1][4] == 1 //4 across row 1 (2nd) = X
				|| board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1 && board[2][3] == 1 //4 across row 2 = X
				|| board[2][1] == 1 && board[2][2] == 1 && board[2][3] == 1 && board[2][4] == 1 //4 across row 2 (2nd) = X
				|| board[3][0] == 1 && board[3][1] == 1 && board[3][2] == 1 && board[3][3] == 1 //4 across row 3 = X
				|| board[3][1] == 1 && board[3][2] == 1 && board[3][3] == 1 && board[3][4] == 1 //4 across row 3 (2nd) = X
				|| board[4][0] == 1 && board[4][1] == 1 && board[4][2] == 1 && board[4][3] == 1 //4 across row 4 = X
				|| board[4][1] == 1 && board[4][2] == 1 && board[4][3] == 1 && board[4][4] == 1 //4 across row 4 (2nd) = X


				|| board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1 && board[3][0] == 1 //4 down on col 0 (left) = X
				|| board[1][0] == 1 && board[2][0] == 1 && board[3][0] == 1 && board[4][0] == 1 //4 down on col 0 (2nd) = X
				|| board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1 && board[3][1] == 1 //4 down on col 1 = X
				|| board[1][1] == 1 && board[2][1] == 1 && board[3][1] == 1 && board[4][1] == 1 //4 down on col 1 (2nd) = X
				|| board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1 && board[3][2] == 1 //4 down on col 2 = X
				|| board[1][2] == 1 && board[2][2] == 1 && board[3][2] == 1 && board[4][2] == 1 //4 down on col 2 (2nd) = X
				|| board[0][3] == 1 && board[1][3] == 1 && board[2][3] == 1 && board[3][3] == 1 //4 down on col 3 = X
				|| board[1][3] == 1 && board[2][3] == 1 && board[3][3] == 1 && board[4][3] == 1 //4 down on col 3 (2nd) = X
				|| board[0][4] == 1 && board[1][4] == 1 && board[2][4] == 1 && board[3][4] == 1 //4 down on col 4 = X
				|| board[1][4] == 1 && board[2][4] == 1 && board[3][4] == 1 && board[4][4] == 1 //4 down on col 4 (2nd) = X

				
				|| board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1 && board[3][3] == 1 //4 negative diagonal (left to right) = X
				|| board[1][1] == 1 && board[2][2] == 1 && board[3][3] == 1 && board[4][4] == 1 //4 negative diagonal (left to right 2nd) = X
				|| board[4][0] == 1 && board[3][1] == 1 && board[2][2] == 1 && board[1][3] == 1 //4 positive diagonal (right to left) = X
				|| board[3][1] == 1 && board[2][2] == 1 && board[1][3] == 1 && board[0][4] == 1 //4 positive diagonal (right to left 2nd) = X
				|| board[0][1] == 1 && board[1][2] == 1 && board[2][3] == 1 && board[3][4] == 1 //4 negative from col 1 row 0 = X
				|| board[1][0] == 1 && board[2][1] == 1 && board[3][2] == 1 && board[4][3] == 1 //4 negative from col 0 row 1 = X
				|| board[0][3] == 1 && board[1][2] == 1 && board[2][1] == 1 && board[3][0] == 1 //4 positive from col 3 row 0 = X
				|| board[1][4] == 1 && board[2][3] == 1 && board[3][2] == 1 && board[4][1] == 1 //4 positive from col 4 row 1 = X
			) {
				winner = 2;
			} else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2 && board[0][3] == 2 //4 across on row 0 (top) = O
	                || board[0][1] == 2 && board[0][2] == 2 && board[0][3] == 2 && board[0][4] == 2 //4 across on row 0 (2nd) = O
	                || board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2 && board[1][3] == 2 //4 across row 1 = O
	                || board[1][1] == 2 && board[1][2] == 2 && board[1][3] == 2 && board[1][4] == 2 //4 across row 1 (2nd) = O
	                || board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2 && board[2][3] == 2 //4 across row 2 = O
	                || board[2][1] == 2 && board[2][2] == 2 && board[2][3] == 2 && board[2][4] == 2 //4 across row 2 (2nd) = O
	                || board[3][0] == 2 && board[3][1] == 2 && board[3][2] == 2 && board[3][3] == 2 //4 across row 3 = O
	                || board[3][1] == 2 && board[3][2] == 2 && board[3][3] == 2 && board[3][4] == 2 //4 across row 3 (2nd) = O
	                || board[4][0] == 2 && board[4][1] == 2 && board[4][2] == 2 && board[4][3] == 2 //4 across row 4 = O
	                || board[4][1] == 2 && board[4][2] == 2 && board[4][3] == 2 && board[4][4] == 2 //4 across row 4 (2nd) = O


	                || board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2 && board[3][0] == 2 //4 down on col 0 (left) = O
	                || board[1][0] == 2 && board[2][0] == 2 && board[3][0] == 2 && board[4][0] == 2 //4 down on col 0 (2nd) = O
	                || board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2 && board[3][1] == 2 //4 down on col 1 = O
	                || board[1][1] == 2 && board[2][1] == 2 && board[3][1] == 2 && board[4][1] == 2 //4 down on col 1 (2nd) = O
	                || board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2 && board[3][2] == 2 //4 down on col 2 = O
	                || board[1][2] == 2 && board[2][2] == 2 && board[3][2] == 2 && board[4][2] == 2 //4 down on col 2 (2nd) = O
	                || board[0][3] == 2 && board[1][3] == 2 && board[2][3] == 2 && board[3][3] == 2 //4 down on col 3 = O
	                || board[1][3] == 2 && board[2][3] == 2 && board[3][3] == 2 && board[4][3] == 2 //4 down on col 3 (2nd) = O
	                || board[0][4] == 2 && board[1][4] == 2 && board[2][4] == 2 && board[3][4] == 2 //4 down on col 4 = O
	                || board[1][4] == 2 && board[2][4] == 2 && board[3][4] == 2 && board[4][4] == 2 //4 down on col 4 (2nd) = O


	                || board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2 && board[3][3] == 2 //4 negative diagonal (left to right) = O
	                || board[1][1] == 2 && board[2][2] == 2 && board[3][3] == 2 && board[4][4] == 2 //4 negative diagonal (left to right 2nd) = O
	                || board[4][0] == 2 && board[3][1] == 2 && board[2][2] == 2 && board[1][3] == 2 //4 positive diagonal (right to left) = O
	                || board[3][1] == 2 && board[2][2] == 2 && board[1][3] == 2 && board[0][4] == 2 //4 positive diagonal (right to left 2nd) = O
	                || board[0][1] == 2 && board[1][2] == 2 && board[2][3] == 2 && board[3][4] == 2 //4 negative from col 1 row 0 = O
	                || board[1][0] == 2 && board[2][1] == 2 && board[3][2] == 2 && board[4][3] == 2 //4 negative from col 0 row 1 = O
	                || board[0][3] == 2 && board[1][2] == 2 && board[2][1] == 2 && board[3][0] == 2 //4 positive from col 3 row 0 = O
	                || board[1][4] == 2 && board[2][3] == 2 && board[3][2] == 2 && board[4][1] == 2 //4 positive from col 4 row 1 = O
				) {
			winner = 0;
		} else if (spaceUsed > 24) {
			winner = 1;
		}
		return winner;
	}
	
	  /**
	   *  Print the game board 
	   */
	   public  void printBoard() {
	      for (int row = 0; row < ROWS; ++row) {
	         for (int col = 0; col < COLS; ++col) {
	            printCell(board[row][col]); // print each of the cells
	            if (col != COLS - 1) {
	               System.out.print("|");   // print vertical partition
	            }
	         }
	         System.out.println();
	         if (row != ROWS - 1) {
	            System.out.println("-------------------"); // print horizontal partition
	         }
	      }
	      System.out.println();
	   }
	 
	   /**
	    * Print a cell with the specified "content" 
	    * @param content either CROSS, NOUGHT or EMPTY
	    */
	   public  void printCell(int content) {
	      switch (content) {
	         case EMPTY:  System.out.print("   "); break;
	         case NOUGHT: System.out.print(" O "); break;
	         case CROSS:  System.out.print(" X "); break;
	      }
	   }

}
