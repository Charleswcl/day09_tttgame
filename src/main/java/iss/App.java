package iss;


public final class App {
    private App() {
    }

        public static void main(String[] args) {
        String[] tttBoard = new String[9];
        // Player X and O
        String player1 = "X";

        // populating the tic-tac-toe board with 1 to 9
        for (int i = 0; i < 9; i++) {
            tttBoard[i] = String.valueOf(i + 1);
        }

        // print tic-tac-toe board
        TicTacToe ttt = new TicTacToe();
        ttt.printBoard(tttBoard);
             
        
    }

        
}
