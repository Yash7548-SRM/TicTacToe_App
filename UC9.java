class UC9 {
    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    boolean checkWin(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if (board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }
        if (board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;
        if (board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;
        return false;
    }

    void placeMove(int row, int col, char symbol) {
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
        }
    }

    public static void main(String[] args) {
        UC9 game = new UC9();
        game.placeMove(0, 0, 'X');
        game.placeMove(0, 1, 'X');
        game.placeMove(0, 2, 'X');
        System.out.println(game.checkWin('X'));
    }
}