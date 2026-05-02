import java.util.Random;

class UC7 {
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

    void computerMove() {
        Random rand = new Random();
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;
            if (board[row][col] == ' ') {
                placeMove(row, col, 'O');
                break;
            }
        }
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

    public static void main(String[] args) {
        UC7 game = new UC7();
        game.computerMove();
        game.displayBoard();
    }
}