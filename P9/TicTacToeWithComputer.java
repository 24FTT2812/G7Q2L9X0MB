import java.util.*;

public class TicTacToeWithComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        printBoard(board);
        while (true) {
            // Player's move
            System.out.println("\nPlayer's turn");
            System.out.print("Enter a row (0, 1, or 2): ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2): ");
            int col = input.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = 'X';
            } else {
                System.out.println("Cell already taken. Try again.");
                continue;
            }

            if (checkWin(board, 'X')) {
                printBoard(board);
                System.out.println("Game ended, Player Win");
                break;
            }

            // Computer's move
            int compRow, compCol;
            do {
                compRow = (int)(Math.random() * 3);
                compCol = (int)(Math.random() * 3);
            } while (board[compRow][compCol] != ' ');

            board[compRow][compCol] = 'O';

            if (checkWin(board, 'O')) {
                printBoard(board);
                System.out.println("Game ended, CPU Win");
                break;
            }

            printBoard(board);
        }

        input.close();
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---------");
        }
    }

    public static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol))
                return true;
        }
        if ((board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol))
            return true;

        return false;
    }
}
