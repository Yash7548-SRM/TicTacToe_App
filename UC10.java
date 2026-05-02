class UC10 {
    char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    void placeMove(int row, int col, char symbol) {
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
        }
    }

    public static void main(String[] args) {
        UC10 game = new UC10();
        game.placeMove(0,0,'X');
        game.placeMove(0,1,'O');
        game.placeMove(0,2,'X');
        game.placeMove(1,0,'X');
        game.placeMove(1,1,'O');
        game.placeMove(1,2,'O');
        game.placeMove(2,0,'O');
        game.placeMove(2,1,'X');
        game.placeMove(2,2,'X');
        System.out.println(game.isDraw());
    }
}