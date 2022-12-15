import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        final int NUM_ROWS = 8;
        final int NUM_COLS = 8;
        final int TOTAL_SHIPS = 10;
        char board[][] = new char[NUM_ROWS][NUM_COLS];
        char rowLetter;
        int colNumber;
        int shots = 0, sunkShips = 0;
        boolean gameOver = false;
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }

        int shipCounter = 0;
        int rowRand, colRand;
        while (shipCounter < TOTAL_SHIPS) {
            rowRand = (int) (Math.random() * NUM_ROWS);
            colRand = (int) (Math.random() * NUM_COLS);

            if (board[rowRand][colRand] == ' ') {
                board[rowRand][colRand] = 'S';
                shipCounter ++;
            }
        }
        System.out.println("-----------------");
        System.out.println("SHOTS: " + shots);
        System.out.println("SUNK SHIPS: " + sunkShips);
        do {
            System.out.print("Enter row (letter):");
            rowLetter = input.next().toUpperCase().charAt(0);
            System.out.print("Enter column (number):");
            colNumber = input.nextInt() - 1;

            int rowNumber = rowLetter - 'A';

            if (rowNumber < 0 || rowNumber >= NUM_ROWS ||
                    colNumber < 0 || colNumber >= NUM_COLS) {
                continue;
            }
            if (board[rowNumber][colNumber] == ' ') {

                board[rowNumber][colNumber] = 'O';
            } else {
                if (board[rowNumber][colNumber] == 'S') {

                    board[rowNumber][colNumber] = 'X';
                    sunkShips++;
                    if (sunkShips == TOTAL_SHIPS) {
                        gameOver = true;
                    }
                }
            }
            shots++;

            System.out.println("SHOTS: " + shots);
            System.out.println("SUNK SHIPS " + sunkShips + "\n");

            System.out.print(" ");
            for (int col = 1; col <= board[0].length; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
            char letterBoard = 'A';
            for (int row = 0; row < board.length; row++) {
                System.out.print(letterBoard + " ");
                for (int col = 0; col < board[0].length; col++) {
                    if (board[row][col] == 'S') {

                        System.out.print(" ");
                    } else {
                        System.out.print(board[row][col] + " ");
                    }
                }
                System.out.println();
                letterBoard++;
            }
        } while (!gameOver);
        System.out.println("YOU WIN. ALL SHIPS SUNK.");
    }
}

