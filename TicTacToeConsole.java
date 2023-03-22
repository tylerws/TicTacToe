public class TicTacToeConsole {
    private TicTacToeBoard board;

    TicTacToeConsole(TicTacToeBoard board){
        this.board = board;
    }

    public static void printTitle(){
        System.out.println(" _   _      _             _             ");
        System.out.println("| | (_)    | |           | |            ");
        System.out.println("| |_ _  ___| |_ __ _  ___| |_ ___   ___ ");
        System.out.println("| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\");
        System.out.println("| |_| | (__| || (_| | (__| || (_) |  __/");
        System.out.println(" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
    }


    public static String printY(){
        return "   ____" + "\n" + " ,' __ `." + "\n" + "/ ,'  `. \\" + "\n" + "| | () | |" + "\n" + "\\ `.__,' /" + "\n" + " `.____,'";
    }


    public static String printX(){
        return " .____, " + "\n" + ". \\  / ," + "\n" + "|`-  -'|" + "\n" + "|,-  -.|" + "\n" + "' /__\\ `" + "\n" + " '    ` ";
    }
        //1 = player1 win, 2 = player2 win, 0 = in progress, -1 = tie
    public String printWinner(){
        int status = board.getGameStatus();
        if (status == 1){
            return "PlayerOne wins";
        } else if (status == 2){
            return "PlayerTwo wins";
        } else if (status == 0){
            return "In progress ";
        }
        return "Tie";
    }

    public static void main(String[] args) {
        printTitle();
        System.out.println( printX());
        System.out.println(printY());
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