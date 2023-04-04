package Execution;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;


/**
 * The type Play game.
 */
public class PlayGame extends ExecutionProgram{
    private final int[][] board = new int[6][7];
    private int turn = 1, column = 0;

    /**
     * This method executes the game itself. It's the main method of this class
     *
     * @param playerOneName The name of the player one
     * @param playerTwoName The name of the player two
     */
    protected void playGame(String playerOneName, String playerTwoName) {
        try {
            printData("¡¡¡ Get ready to compete !!!");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../sonidos/batalla.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(clip.LOOP_CONTINUOUSLY);
            while (true) {

                printBoard(board);

                moveMessage(turn, playerOneName, playerTwoName);

                int input = insertCoin();

                column = (input - 1);
                int row = 5;

                while (row >= 0 && board[row][column] != 0) {
                    row--;
                }

                if (row < 0) {
                    printData("Column full, choose another one.");
                    continue;
                }

                board[row][column] = turn;

                if (ifFourInRow(board, row, column)) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    printBoard(board);
                    String name;
                    if (turn == 1) name = playerOneName;
                    else name = playerTwoName;
                    printData(name + " wins ¡¡ Congratulations !! ");
                    break;
                }

                turn = (turn == 1) ? 2 : 1;

                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param tablero The board is a two-dimensional array consisting of 0s, 1s, and 2s
     */
    private void printBoard(int[][] tablero) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("../sonidos/sonidoTexto.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print("|");
                    String ANSI_RESET = "\u001B[0m";
                    if (tablero[i][j] == 0) {
                        System.out.print(" ");
                    } else if (tablero[i][j] == 1) {
                        String ANSI_RED = "\u001B[31m";
                        System.out.print(ANSI_RED + "X" + ANSI_RESET);
                    } else {
                        String ANSI_BLUE = "\u001B[34m";
                        System.out.print(ANSI_BLUE + "O" + ANSI_RESET);
                    }
                }
                printData("|");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            clip.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        printData("----------------");
    }

    /**
     * This method prints a message indicating the player's turn and the possible inputs, ranging from 1 to 7.
     *
     * @param turn Turn of the match
     * @param PlayerOne Name of the player one
     * @param PlayerTwo Name of the player two
     */
    private void moveMessage(int turn, String PlayerOne, String PlayerTwo) {

        String color = "";
        String name = "";
        if (turn == 1) {
            color = "red";
            name = PlayerOne;
        } else {
            color = "blue";
            name = PlayerTwo;
        }
        printData(name + ", drop a " + color + " piece indicating the column between 1 and 7: ");
    }

    /**
     * This method
     * @return The choosen column number
     */
    private int insertCoin() {

        Scanner sc = new Scanner(System.in);
        String input = "";
        while (true) {
            try {
                input = sc.next();
                int columnNumber = Integer.parseInt(input);
                if (columnNumber >= 1 && columnNumber <= 7) return columnNumber;
                else throw new Exception();
            } catch (Exception e) {
                printData("--> Invalid input. Please enter a number between 1 and 7.");
            }
        }
    }

    /**
     * This method check if there's a 4 in a row, so if there's a winner.
     *
     * @param board A two-dimensional array consisting of 0s, 1s, and 2s
     * @param row   Coin's row position
     * @param column Coin's column position
     * @return boolean
     */
    private boolean ifFourInRow(int[][] board, int row, int column) {
        int player = board[row][column];
        int counter = 1;

        /*
        We check in each of the directions of the placed piece,
        if there are more identical pieces following it.

        To do this, we compare the fixed variable player
        with the rest of the pieces that are being followed.
        */


        //-----------------------------------------------------------------------------------------
        // 1.- HORIZONTAL CHECK

        /*
        We check horizontally to the left of the piece.

        That is, we compare the same row but subtract a value from the column.
        */
        int i = column - 1;

        /*
        If both hold the same value, we add 1 to the counter and subtract
        a value from i, which represents the row.

        This will continue until i is negative or jugador[row][column] and board[row][i]
        do not hold the same value, which will be 1 if the piece was introduced by the red player
        or 2 if it was introduced by the blue player.
        */
        while (i >= 0 && board[row][i] == player) {
            counter++;
            i--;
        }


        //Horizontal check to the right following the same method.
        i = column + 1;
        while (i < 7 && board[row][i] == player) {
            counter++;
            i++;
        }

        //If the counter results in 4 or a greater value, we break the loop and the winner will be announced.
        if (counter >= 4) {
            return true;
        }

        /*
        Otherwise, the counter is reset for each check (1.-HORIZONTAL, 2.-VERTICAL,
        3.- UPPER DIAGONAL, 4.- LOWER DIAGONAL)
        */

        counter = 1;

        //---------------------------------------------------------------------------------------------------

        //2.- VERTICAL CHECK

        /*
        In this case, it is done in the same way, but by subtracting the row to check the upper box
        or adding it to check the lower box.
         */

        //We check the boxes above
        int j = row - 1;
        while (j >= 0 && board[j][column] == player) {
            counter++;
            j--;
        }

        //We check the boxes below.
        j = row + 1;
        while (j < 6 && board[j][column] == player) {
            counter++;
            j++;
        }

        //If the counter results in 4 or a greater value, we break the loop and the winner will be announced.
        if (counter >= 4) {
            return true;
        }

        counter = 1;


        //---------------------------------------------------------------------------------------------------

        //3.- DIAGONAL 1 CHECK

        //We check upwards to the left.
        i = column - 1;
        j = row - 1;

        while (i >= 0 && j >= 0 && board[j][i] == player) {
            counter++;
            i--;
            j--;
        }

        //We check downwards to the right.
        i = column + 1;
        j = row + 1;

        while (i < 7 && j < 6 && board[j][i] == player) {
            counter++;
            i++;
            j++;
        }

        if (counter >= 4) {
            return true;
        }
        counter = 1;


        //-----------------------------------------------------------------------------------------------------

        // 4.- DIAGONAL 2 CHECK

        //We check upwards to the right.
        i = column + 1;
        j = row - 1;

        while (i < 7 && j >= 0 && board[j][i] == player) {
            counter++;
            i++;
            j--;
        }


        //We check downwards to the left.
        i = column - 1;
        j = row + 1;

        while (i >= 0 && j < 6 && board[j][i] == player) {
            counter++;
            i--;
            j++;
        }

        return counter >= 4;
    }

}
