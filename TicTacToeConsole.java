public class TicTacToeConsole {
    private TicTacToeBoard board;

    TicTacToeConsole(TicTacToeBoard board) {
        this.board = board;
    }

    public static void printTitle() {
        System.out.println(" _   _      _             _             ");
        System.out.println("| | (_)    | |           | |            ");
        System.out.println("| |_ _  ___| |_ __ _  ___| |_ ___   ___ ");
        System.out.println("| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\");
        System.out.println("| |_| | (__| || (_| | (__| || (_) |  __/");
        System.out.println(" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
    }

    public static String printY() {
        return "   ____" + "\n" + " ,' __ `." + "\n" + "/ ,'  `. \\" + "\n" + "| | () | |" + "\n" + "\\ `.__,' /" + "\n"
                + " `.____,'";
    }

    public static String printX() {
        return " .____, " + "\n" + ". \\  / ," + "\n" + "|`-  -'|" + "\n" + "|,-  -.|" + "\n" + "' /__\\ `" + "\n"
                + " '    ` ";
    }

    public static String printBlank(){
        return "--------" + "\n" + "--------" + "\n" + "--------" + "\n" + "--------" + "\n" + "--------" + "\n" + "--------" + "\n" + "--------" + "\n";
    }

    // 1 = player1 win, 2 = player2 win, 0 = in progress, -1 = tie
    public String printWinner() {
        int status = board.getGameStatus();
        if (status == 1) {
            return "PlayerOne wins";
        } else if (status == 2) {
            return "PlayerTwo wins";
        } else if (status == 0) {
            return "In progress ";
        }
        return "Tie";
    }

    public String printBoard() {
        String sol = "";
        int count=0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
            if (board.board[r][c] == 1){
                sol += printX();
                count++;
            } else if (board.board[r][c] == 2){
                sol += printY();
                count++;
            } else {
                sol += printBlank();
                count++;
            }
            if (count == 3){
                sol += "\n";
                count = 0;
            }
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        TicTacToeBoard b1 = new TicTacToeBoard();
        TicTacToeConsole c1 = new TicTacToeConsole(b1);
        b1.placePiece(0, 0, 1);
        System.out.println(c1.printBoard());
        
    }
}

// ```
// ______________________________
// < Available on Maven Central! >
// ------------------------------
// \ ^__^
// \ (oo)\_______
// (__)\ )\/\
// ||----w |
// || ||
// ```