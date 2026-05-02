import java.util.Scanner;
import java.util.Random;

class UC8 {
    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    void placeMove(int row, int col, char symbol) {
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
        }
    }

    boolean checkWin(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if (board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }
        if (board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;
        if (board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;
        return false;
    }

    boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }

    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("--+---+--");
        }
    }

    void startGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char current = 'X';

        while (true) {
            displayBoard();

            if (current == 'X') {
                int slot = sc.nextInt();
                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;
                if (board[row][col] == ' ') {
                    placeMove(row, col, 'X');
                    if (checkWin('X')) {
                        displayBoard();
                        break;
                    }
                    if (isDraw()) {
                        displayBoard();
                        break;
                    }
                    current = 'O';
                }
            } else {
                while (true) {
                    int slot = rand.nextInt(9) + 1;
                    int row = (slot - 1) / 3;
                    int col = (slot - 1) % 3;
                    if (board[row][col] == ' ') {
                        placeMove(row, col, 'O');
                        break;
                    }
                }
                if (checkWin('O')) {
                    displayBoard();
                    break;
                }
                if (isDraw()) {
                    displayBoard();
                    break;
                }
                current = 'X';
            }
        }
    }

    public static void main(String[] args) {
        new UC8().startGame();
    }
}