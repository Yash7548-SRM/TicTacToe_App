class UC6 {
    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    void placeMove(int row, int col, char symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == ' ') {
                board[row][col] = symbol;
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
        UC6 game = new UC6();
        game.placeMove(0, 0, 'X');
        game.placeMove(1, 1, 'O');
        game.displayBoard();
    }
}