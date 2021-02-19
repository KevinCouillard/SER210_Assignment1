 import java.util.Scanner;
/**
 * Tic-Tac-Toe: Two-player console, non-graphics
 * @author kCouillard
 * @date 2/4/21
 */
public class TTTConsole  {
                                                     
      public static Scanner in = new Scanner(System.in); // the input Scanner
 
   public static TicTacToe TTTboard = new TicTacToe();
   /** The entry main method (the program starts here) */
   public static void main(String[] args) {
      
	   int currentState = TicTacToe.PLAYING;
	   String userInput;
	   //game loop
	   do {
         TTTboard.printBoard();
         // Print message if game-over
         currentState = TTTboard.checkForWinner();
         /**
          * get player input here and call setMove(). user should input a number between 0-25
          */
         userInput = in.next();
         
         //Checks that the input is between 0-24
         if (Integer.parseInt(userInput) > 24 || Integer.parseInt(userInput) < 0) {
        	 System.out.println("The input " + Integer.parseInt(userInput) + " was out of range. Please enter a number between 0 and 8");
        	 userInput = in.next();
         }
         TTTboard.setMove(1, Integer.parseInt(userInput));
         TTTboard.getComputerMove();
         
         currentState = TTTboard.checkForWinner();
         
         if (currentState == ITicTacToe.CROSS_WON) {
        	TTTboard.printBoard();
            System.out.println("'X' won! Bye!");
         } else if (currentState == ITicTacToe.NOUGHT_WON) {
         	TTTboard.printBoard();
            System.out.println("'O' won! Bye!");
         } else if (currentState == ITicTacToe.TIE) {
         	TTTboard.printBoard();
            System.out.println("It's a TIE! Bye!");
         }
         
      } while ((currentState == ITicTacToe.PLAYING) && (!userInput.equals("q"))); // repeat if not game-over
   }
 
     
}