import java.util.Random;

public class UC2 {
    public static void main(String[] args) {
        Random random = new Random();
        int toss = random.nextInt(2);

        char player1Symbol;
        char player2Symbol;
        int currentPlayer;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = 1;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = 2;
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("Starting Player: Player " + currentPlayer);
    }
}