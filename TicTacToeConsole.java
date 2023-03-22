public class TicTacToeConsole {
    private TicTacToeBoard theBoard;

    TicTacToeConsole(TicTacToeBoard theBoard){
        this.theBoard = theBoard;
    }

    public static void printTitle(){
        System.out.println(" _   _      _             _             ");
        System.out.println("| | (_)    | |           | |            ");
        System.out.println("| |_ _  ___| |_ __ _  ___| |_ ___   ___ ");
        System.out.println("| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\");
        System.out.println("| |_| | (__| || (_| | (__| || (_) |  __/");
        System.out.println(" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
    }


    public static String printO(){
        return "   ____" + "\n" + " ,' __ `." + "\n" + "/ ,'  `. \\" + "\n" + "| | () | |" + "\n" + "\\ `.__,' /" + "\n" + " `.____,'";
    }


    public static String printX(){
        return " .____, " + "\n" + ". \\  / ," + "\n" + "|`-  -'|" + "\n" + "|,-  -.|" + "\n" + "' /__\\ `" + "\n" + " '    ` ";
    }
        //1 = player1 win, 2 = player2 win, 0 = in progress, -1 = tie
    public String getWinner(){
        int status = theBoard.getGameStatus();
        if (status == 1){
            return "PlayerOne wins";
        } else if (status == 2){
            return "PlayerTwo wins";
        } else if (status == 0){
            return "In progress ";
        }
        return "Tie";
    }

    public void printBoard(){
        for (int row = 0; row > theBoard.board.length; row++){
            for (int col = 0; col > theBoard.board[0].length; col++){
                    System.out.println(printX());
            }
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard board1 = new TicTacToeBoard();
        TicTacToeConsole game1 = new TicTacToeConsole(board1);
        printTitle();
        System.out.println( printX());
        System.out.println(printO());
        game1.printBoard();
    }
}

// ```
//  ______________________________
// < Available on Maven Central! >
//  ------------------------------
//         \   ^__^
//          \  (oo)\_______
//             (__)\       )\/\
//                 ||----w |
//                 ||     ||
// ```