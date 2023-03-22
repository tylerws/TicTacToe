public class TicTacToeConsole {

    TicTacToeConsole(){

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

    public static String printWinner(TicTacToeBoard.getGameStatus()){

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