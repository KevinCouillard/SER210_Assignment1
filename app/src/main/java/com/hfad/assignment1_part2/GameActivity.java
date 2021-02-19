/**
 * GameActivity handles gameboard and gameplay
 * @author kCouillard
 * @date 2/4/21
 */
package com.hfad.assignment1_part2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Scanner;

public class GameActivity extends Activity implements ITicTacToe {
    // The game board and the game status
    private static final int ROWS = 5, COLS = 5; // number of rows and columns
    private int[][] board = new int[ROWS][COLS]; // game board in 2D array
    private int currentPlayer = 1;				//current player to cross
    private int spaceUsed = 0;					//number of spaces used
    private int ranNum = 0;						//computer move
    public static Scanner in = new Scanner(System.in);	//user input if space used

    //Real Messy but this makes buttons from view
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;

    //Real Messy but sets each image view to variable
    private ImageView square0X;
    private ImageView square1X;
    private ImageView square2X;
    private ImageView square3X;
    private ImageView square4X;
    private ImageView square5X;
    private ImageView square6X;
    private ImageView square7X;
    private ImageView square8X;
    private ImageView square9X;
    private ImageView square10X;
    private ImageView square11X;
    private ImageView square12X;
    private ImageView square13X;
    private ImageView square14X;
    private ImageView square15X;
    private ImageView square16X;
    private ImageView square17X;
    private ImageView square18X;
    private ImageView square19X;
    private ImageView square20X;
    private ImageView square21X;
    private ImageView square22X;
    private ImageView square23X;
    private ImageView square24X;

    private ImageView square0O;
    private ImageView square1O;
    private ImageView square2O;
    private ImageView square3O;
    private ImageView square4O;
    private ImageView square5O;
    private ImageView square6O;
    private ImageView square7O;
    private ImageView square8O;
    private ImageView square9O;
    private ImageView square10O;
    private ImageView square11O;
    private ImageView square12O;
    private ImageView square13O;
    private ImageView square14O;
    private ImageView square15O;
    private ImageView square16O;
    private ImageView square17O;
    private ImageView square18O;
    private ImageView square19O;
    private ImageView square20O;
    private ImageView square21O;
    private ImageView square22O;
    private ImageView square23O;
    private ImageView square24O;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView PlayerName2 = (TextView) findViewById(R.id.PlayerName2);
        PlayerName2.setText("Player: " + StartActivity.name);
        TextView CurrentPlayer = (TextView) findViewById(R.id.CurrentPlayer);
        CurrentPlayer.setText("Current Player: " + StartActivity.name);
        spaceUsed = 0;
        this.clearBoard();
    }

    public void getMove(View view) {
        //sets all the buttons (real messy ik)
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);
        button3 = (Button) findViewById(R.id.button4);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button6);
        button6 = (Button) findViewById(R.id.button7);
        button7 = (Button) findViewById(R.id.button8);
        button8 = (Button) findViewById(R.id.button9);
        button9 = (Button) findViewById(R.id.button10);
        button10 = (Button) findViewById(R.id.button11);
        button11 = (Button) findViewById(R.id.button12);
        button12 = (Button) findViewById(R.id.button13);
        button13 = (Button) findViewById(R.id.button14);
        button14 = (Button) findViewById(R.id.button15);
        button15 = (Button) findViewById(R.id.button16);
        button16 = (Button) findViewById(R.id.button17);
        button17 = (Button) findViewById(R.id.button18);
        button18 = (Button) findViewById(R.id.button19);
        button19 = (Button) findViewById(R.id.button20);
        button20 = (Button) findViewById(R.id.button21);
        button21 = (Button) findViewById(R.id.button22);
        button22 = (Button) findViewById(R.id.button23);
        button23 = (Button) findViewById(R.id.button24);
        button24 = (Button) findViewById(R.id.button25);

        //sets all the spaces
        square0X = (ImageView) findViewById(R.id.imageViewX);
        square1X = (ImageView) findViewById(R.id.imageViewX2);
        square2X = (ImageView) findViewById(R.id.imageViewX3);
        square3X = (ImageView) findViewById(R.id.imageViewX4);
        square4X = (ImageView) findViewById(R.id.imageViewX5);
        square5X = (ImageView) findViewById(R.id.imageViewX6);
        square6X = (ImageView) findViewById(R.id.imageViewX7);
        square7X = (ImageView) findViewById(R.id.imageViewX8);
        square8X = (ImageView) findViewById(R.id.imageViewX9);
        square9X = (ImageView) findViewById(R.id.imageViewX10);
        square10X = (ImageView) findViewById(R.id.imageViewX11);
        square11X = (ImageView) findViewById(R.id.imageViewX12);
        square12X = (ImageView) findViewById(R.id.imageViewX13);
        square13X = (ImageView) findViewById(R.id.imageViewX14);
        square14X = (ImageView) findViewById(R.id.imageViewX15);
        square15X = (ImageView) findViewById(R.id.imageViewX16);
        square16X = (ImageView) findViewById(R.id.imageViewX17);
        square17X = (ImageView) findViewById(R.id.imageViewX18);
        square18X = (ImageView) findViewById(R.id.imageViewX19);
        square19X = (ImageView) findViewById(R.id.imageViewX20);
        square20X = (ImageView) findViewById(R.id.imageViewX21);
        square21X = (ImageView) findViewById(R.id.imageViewX22);
        square22X = (ImageView) findViewById(R.id.imageViewX23);
        square23X = (ImageView) findViewById(R.id.imageViewX24);
        square24X = (ImageView) findViewById(R.id.imageViewX25);

           //Checks which button is pressed and sets move also checks for winner and gets the computers move
        TextView winner = (TextView) findViewById(R.id.winner);
           if (button.isPressed()) {
               square0X.setVisibility(View.VISIBLE);
               button.setVisibility(View.INVISIBLE);
               board[0][0] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button1.isPressed()) {
               square1X.setVisibility(View.VISIBLE);
               button1.setVisibility(View.INVISIBLE);
               board[0][1] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button2.isPressed()) {
               square2X.setVisibility(View.VISIBLE);
               button2.setVisibility(View.INVISIBLE);
               board[0][2] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button3.isPressed()) {
               square3X.setVisibility(View.VISIBLE);
               button3.setVisibility(View.INVISIBLE);
               board[0][3] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button4.isPressed()) {
               square4X.setVisibility(View.VISIBLE);
               button4.setVisibility(View.INVISIBLE);
               board[0][4] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button5.isPressed()) {
               square5X.setVisibility(View.VISIBLE);
               button5.setVisibility(View.INVISIBLE);
               board[1][0] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button6.isPressed()) {
               square6X.setVisibility(View.VISIBLE);
               button6.setVisibility(View.INVISIBLE);
               board[1][1] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button7.isPressed()) {
               square7X.setVisibility(View.VISIBLE);
               button7.setVisibility(View.INVISIBLE);
               board[1][2] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button8.isPressed()) {
               square8X.setVisibility(View.VISIBLE);
               button8.setVisibility(View.INVISIBLE);
               board[1][3] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button9.isPressed()) {
               square9X.setVisibility(View.VISIBLE);
               button9.setVisibility(View.INVISIBLE);
               board[1][4] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button10.isPressed()) {
               square10X.setVisibility(View.VISIBLE);
               button10.setVisibility(View.INVISIBLE);
               board[2][0] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button11.isPressed()) {
               square11X.setVisibility(View.VISIBLE);
               button11.setVisibility(View.INVISIBLE);
               board[2][1] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button12.isPressed()) {
               square12X.setVisibility(View.VISIBLE);
               button12.setVisibility(View.INVISIBLE);
               board[2][2] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button13.isPressed()) {
               square13X.setVisibility(View.VISIBLE);
               button13.setVisibility(View.INVISIBLE);
               board[2][3] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button14.isPressed()) {
               square14X.setVisibility(View.VISIBLE);
               button14.setVisibility(View.INVISIBLE);
               board[2][4] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button15.isPressed()) {
               square15X.setVisibility(View.VISIBLE);
               button15.setVisibility(View.INVISIBLE);
               board[3][0] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button16.isPressed()) {
               square16X.setVisibility(View.VISIBLE);
               button16.setVisibility(View.INVISIBLE);
               board[3][1] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button17.isPressed()) {
               square17X.setVisibility(View.VISIBLE);
               button17.setVisibility(View.INVISIBLE);
               board[3][2] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button18.isPressed()) {
               square18X.setVisibility(View.VISIBLE);
               button18.setVisibility(View.INVISIBLE);
               board[3][3] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button19.isPressed()) {
               square19X.setVisibility(View.VISIBLE);
               button19.setVisibility(View.INVISIBLE);
               board[3][4] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button20.isPressed()) {
               square20X.setVisibility(View.VISIBLE);
               button20.setVisibility(View.INVISIBLE);
               board[4][0] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button21.isPressed()) {
               square21X.setVisibility(View.VISIBLE);
               button21.setVisibility(View.INVISIBLE);
               board[4][1] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button22.isPressed()) {
               square22X.setVisibility(View.VISIBLE);
               button22.setVisibility(View.INVISIBLE);
               board[4][2] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button23.isPressed()) {
               square23X.setVisibility(View.VISIBLE);
               button23.setVisibility(View.INVISIBLE);
               board[4][3] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           } else if (button24.isPressed()) {
               square24X.setVisibility(View.VISIBLE);
               button24.setVisibility(View.INVISIBLE);
               board[4][4] = CROSS;
               spaceUsed++;
               this.getComputerMove();
               this.checkForWinner();
               if (this.checkForWinner() == 2) {
                   winner.setText("Winner: " + StartActivity.name + "!");
               } else if (this.checkForWinner() == 0) {
                   winner.setText("Winner: Computer!");
               } else if (this.checkForWinner() == 1) {
                   winner.setText("Winner: Tie!");
               }
           }


    }
    //Called when the restart button is pressed and clears the game board
    public void restart(View view) {
        square0O.setVisibility(View.INVISIBLE);
        square1O.setVisibility(View.INVISIBLE);
        square2O.setVisibility(View.INVISIBLE);
        square3O.setVisibility(View.INVISIBLE);
        square4O.setVisibility(View.INVISIBLE);
        square5O.setVisibility(View.INVISIBLE);
        square6O.setVisibility(View.INVISIBLE);
        square7O.setVisibility(View.INVISIBLE);
        square8O.setVisibility(View.INVISIBLE);
        square9O.setVisibility(View.INVISIBLE);
        square10O.setVisibility(View.INVISIBLE);
        square11O.setVisibility(View.INVISIBLE);
        square12O.setVisibility(View.INVISIBLE);
        square13O.setVisibility(View.INVISIBLE);
        square14O.setVisibility(View.INVISIBLE);
        square15O.setVisibility(View.INVISIBLE);
        square16O.setVisibility(View.INVISIBLE);
        square17O.setVisibility(View.INVISIBLE);
        square18O.setVisibility(View.INVISIBLE);
        square19O.setVisibility(View.INVISIBLE);
        square20O.setVisibility(View.INVISIBLE);
        square21O.setVisibility(View.INVISIBLE);
        square22O.setVisibility(View.INVISIBLE);
        square23O.setVisibility(View.INVISIBLE);
        square24O.setVisibility(View.INVISIBLE);
        square0X.setVisibility(View.INVISIBLE);
        square1X.setVisibility(View.INVISIBLE);
        square2X.setVisibility(View.INVISIBLE);
        square3X.setVisibility(View.INVISIBLE);
        square4X.setVisibility(View.INVISIBLE);
        square5X.setVisibility(View.INVISIBLE);
        square6X.setVisibility(View.INVISIBLE);
        square7X.setVisibility(View.INVISIBLE);
        square8X.setVisibility(View.INVISIBLE);
        square9X.setVisibility(View.INVISIBLE);
        square10X.setVisibility(View.INVISIBLE);
        square11X.setVisibility(View.INVISIBLE);
        square12X.setVisibility(View.INVISIBLE);
        square13X.setVisibility(View.INVISIBLE);
        square14X.setVisibility(View.INVISIBLE);
        square15X.setVisibility(View.INVISIBLE);
        square16X.setVisibility(View.INVISIBLE);
        square17X.setVisibility(View.INVISIBLE);
        square18X.setVisibility(View.INVISIBLE);
        square19X.setVisibility(View.INVISIBLE);
        square20X.setVisibility(View.INVISIBLE);
        square21X.setVisibility(View.INVISIBLE);
        square22X.setVisibility(View.INVISIBLE);
        square23X.setVisibility(View.INVISIBLE);
        square24X.setVisibility(View.INVISIBLE);

        button.setVisibility(View.VISIBLE);
        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        button7.setVisibility(View.VISIBLE);
        button8.setVisibility(View.VISIBLE);
        button9.setVisibility(View.VISIBLE);
        button10.setVisibility(View.VISIBLE);
        button11.setVisibility(View.VISIBLE);
        button12.setVisibility(View.VISIBLE);
        button13.setVisibility(View.VISIBLE);
        button14.setVisibility(View.VISIBLE);
        button15.setVisibility(View.VISIBLE);
        button16.setVisibility(View.VISIBLE);
        button17.setVisibility(View.VISIBLE);
        button18.setVisibility(View.VISIBLE);
        button19.setVisibility(View.VISIBLE);
        button20.setVisibility(View.VISIBLE);
        button21.setVisibility(View.VISIBLE);
        button22.setVisibility(View.VISIBLE);
        button23.setVisibility(View.VISIBLE);
        button24.setVisibility(View.VISIBLE);

        this.clearBoard();
        TextView winner = (TextView) findViewById(R.id.winner);
        winner.setText("Winner: ");
    }
    /**
     * clear board and set current player
     */
    public GameActivity(){
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
        spaceUsed = 0;

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
        //sets computer spaces
        square0O = (ImageView) findViewById(R.id.imageViewO);
        square1O = (ImageView) findViewById(R.id.imageViewO2);
        square2O = (ImageView) findViewById(R.id.imageViewO3);
        square3O = (ImageView) findViewById(R.id.imageViewO4);
        square4O = (ImageView) findViewById(R.id.imageViewO5);
        square5O = (ImageView) findViewById(R.id.imageViewO6);
        square6O = (ImageView) findViewById(R.id.imageViewO7);
        square7O = (ImageView) findViewById(R.id.imageViewO8);
        square8O = (ImageView) findViewById(R.id.imageViewO9);
        square9O = (ImageView) findViewById(R.id.imageViewO10);
        square10O = (ImageView) findViewById(R.id.imageViewO11);
        square11O = (ImageView) findViewById(R.id.imageViewO12);
        square12O = (ImageView) findViewById(R.id.imageViewO13);
        square13O = (ImageView) findViewById(R.id.imageViewO14);
        square14O = (ImageView) findViewById(R.id.imageViewO15);
        square15O = (ImageView) findViewById(R.id.imageViewO16);
        square16O = (ImageView) findViewById(R.id.imageViewO17);
        square17O = (ImageView) findViewById(R.id.imageViewO18);
        square18O = (ImageView) findViewById(R.id.imageViewO19);
        square19O = (ImageView) findViewById(R.id.imageViewO20);
        square20O = (ImageView) findViewById(R.id.imageViewO21);
        square21O = (ImageView) findViewById(R.id.imageViewO22);
        square22O = (ImageView) findViewById(R.id.imageViewO23);
        square23O = (ImageView) findViewById(R.id.imageViewO24);
        square24O = (ImageView) findViewById(R.id.imageViewO25);

        //Create random num and check if space is empty, if yes: place O, if no: call function again
        ranNum = (int)(Math.random() * 24);
        if (ranNum == 0 && square0X.getVisibility() == View.INVISIBLE && square0O.getVisibility() == View.INVISIBLE) {
            square0O.setVisibility(View.VISIBLE);
            button.setVisibility(View.INVISIBLE);
        } else if (ranNum == 1 && square1X.getVisibility() == View.INVISIBLE && square1O.getVisibility() == View.INVISIBLE) {
            square1O.setVisibility(View.VISIBLE);
            button1.setVisibility(View.INVISIBLE);
        } else if (ranNum == 2 && square2X.getVisibility() == View.INVISIBLE && square2O.getVisibility() == View.INVISIBLE) {
            square2O.setVisibility(View.VISIBLE);
            button2.setVisibility(View.INVISIBLE);
        } else if (ranNum == 3 && square3X.getVisibility() == View.INVISIBLE && square3O.getVisibility() == View.INVISIBLE) {
            square3O.setVisibility(View.VISIBLE);
            button3.setVisibility(View.INVISIBLE);
        } else if (ranNum == 4 && square4X.getVisibility() == View.INVISIBLE && square4O.getVisibility() == View.INVISIBLE) {
            square4O.setVisibility(View.VISIBLE);
            button4.setVisibility(View.INVISIBLE);
        } else if (ranNum == 5 && square5X.getVisibility() == View.INVISIBLE && square5O.getVisibility() == View.INVISIBLE) {
            square5O.setVisibility(View.VISIBLE);
            button5.setVisibility(View.INVISIBLE);
        } else if (ranNum == 6 && square6X.getVisibility() == View.INVISIBLE && square6O.getVisibility() == View.INVISIBLE) {
            square6O.setVisibility(View.VISIBLE);
            button6.setVisibility(View.INVISIBLE);
        } else if (ranNum == 7 && square7X.getVisibility() == View.INVISIBLE && square7O.getVisibility() == View.INVISIBLE) {
            square7O.setVisibility(View.VISIBLE);
            button7.setVisibility(View.INVISIBLE);
        } else if (ranNum == 8 && square8X.getVisibility() == View.INVISIBLE && square8O.getVisibility() == View.INVISIBLE) {
            square8O.setVisibility(View.VISIBLE);
            button8.setVisibility(View.INVISIBLE);
        } else if (ranNum == 9 && square9X.getVisibility() == View.INVISIBLE && square9O.getVisibility() == View.INVISIBLE) {
            square9O.setVisibility(View.VISIBLE);
            button9.setVisibility(View.INVISIBLE);
        } else if (ranNum == 10 && square10X.getVisibility() == View.INVISIBLE && square10O.getVisibility() == View.INVISIBLE) {
            square10O.setVisibility(View.VISIBLE);
            button10.setVisibility(View.INVISIBLE);
        } else if (ranNum == 11 && square11X.getVisibility() == View.INVISIBLE && square11O.getVisibility() == View.INVISIBLE) {
            square11O.setVisibility(View.VISIBLE);
            button11.setVisibility(View.INVISIBLE);
        } else if (ranNum == 12 && square12X.getVisibility() == View.INVISIBLE && square12O.getVisibility() == View.INVISIBLE) {
            square12O.setVisibility(View.VISIBLE);
            button12.setVisibility(View.INVISIBLE);
        } else if (ranNum == 13 && square13X.getVisibility() == View.INVISIBLE && square13O.getVisibility() == View.INVISIBLE) {
            square13O.setVisibility(View.VISIBLE);
            button13.setVisibility(View.INVISIBLE);
        } else if (ranNum == 14 && square14X.getVisibility() == View.INVISIBLE && square14O.getVisibility() == View.INVISIBLE) {
            square14O.setVisibility(View.VISIBLE);
            button14.setVisibility(View.INVISIBLE);
        } else if (ranNum == 15 && square15X.getVisibility() == View.INVISIBLE && square15O.getVisibility() == View.INVISIBLE) {
            square15O.setVisibility(View.VISIBLE);
            button15.setVisibility(View.INVISIBLE);
        } else if (ranNum == 16 && square16X.getVisibility() == View.INVISIBLE && square16O.getVisibility() == View.INVISIBLE) {
            square16O.setVisibility(View.VISIBLE);
            button16.setVisibility(View.INVISIBLE);
        } else if (ranNum == 17 && square17X.getVisibility() == View.INVISIBLE && square17O.getVisibility() == View.INVISIBLE) {
            square17O.setVisibility(View.VISIBLE);
            button17.setVisibility(View.INVISIBLE);
        } else if (ranNum == 18 && square18X.getVisibility() == View.INVISIBLE && square18O.getVisibility() == View.INVISIBLE) {
            square18O.setVisibility(View.VISIBLE);
            button18.setVisibility(View.INVISIBLE);
        } else if (ranNum == 19 && square19X.getVisibility() == View.INVISIBLE && square19O.getVisibility() == View.INVISIBLE) {
            square19O.setVisibility(View.VISIBLE);
            button19.setVisibility(View.INVISIBLE);
        } else if (ranNum == 20 && square20X.getVisibility() == View.INVISIBLE && square20O.getVisibility() == View.INVISIBLE) {
            square20O.setVisibility(View.VISIBLE);
            button20.setVisibility(View.INVISIBLE);
        } else if (ranNum == 21 && square21X.getVisibility() == View.INVISIBLE && square21O.getVisibility() == View.INVISIBLE) {
            square21O.setVisibility(View.VISIBLE);
            button21.setVisibility(View.INVISIBLE);
        } else if (ranNum == 22 && square22X.getVisibility() == View.INVISIBLE && square22O.getVisibility() == View.INVISIBLE) {
            square22O.setVisibility(View.VISIBLE);
            button22.setVisibility(View.INVISIBLE);
        } else if (ranNum == 23 && square23X.getVisibility() == View.INVISIBLE && square23O.getVisibility() == View.INVISIBLE) {
            square23O.setVisibility(View.VISIBLE);
            button23.setVisibility(View.INVISIBLE);
        } else if (ranNum == 24 && square24X.getVisibility() == View.INVISIBLE && square24O.getVisibility() == View.INVISIBLE) {
            square24O.setVisibility(View.VISIBLE);
            button24.setVisibility(View.INVISIBLE);
        }

        if (spaceUsed > 24) {
            return this.checkForWinner();
        } else if (board[ranNum/5][ranNum%5] == EMPTY) {
            spaceUsed++;
            System.out.println("Computer Move: " + ranNum);
            return board[ranNum/5][ranNum%5] = NOUGHT;
        } else {
            return this.getComputerMove();
        }
    }

    @Override
    public int checkForWinner() {
        //Lot of code (inefficient) could check for a way that goes by numbers 0-24 rather than array
        //but checks all possible win options for player and computer, then returns winner
        int winner = 4;
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
