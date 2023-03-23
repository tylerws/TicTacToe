import java.util.Arrays;

public class TicTacToeConsole {
    private TicTacToeBoard theBoard;

    TicTacToeConsole(TicTacToeBoard theBoard) {
        this.theBoard = theBoard;
    }

    public static void printTitle() {
        System.out.println(" _   _      _             _             ");
        System.out.println("| | (_)    | |           | |            ");
        System.out.println("| |_ _  ___| |_ __ _  ___| |_ ___   ___ ");
        System.out.println("| __| |/ __| __/ _` |/ __| __/ _ \\ / _ \\");
        System.out.println("| |_| | (__| || (_| | (__| || (_) |  __/");
        System.out.println(" \\__|_|\\___|\\__\\__,_|\\___|\\__\\___/ \\___|");
    }

    public static String printO() {
        return "   ____   " + " ,' __ `. " + "/ ,'  `. \\" + "| | () | |" + "\\ `.__,' /" + " `.____,' ";
    }

    public static String printX() {
        return "  .____,  " + " . \\  / , " + " |`-  -'| " + " |,-  -.| " + " ' /__\\ ` " + "  '    `  ";
    }

    public static String printBlank() {
        return "------------------------------------------------------------";
    }

    // 1 = player1 win, 2 = player2 win, 0 = in progress, -1 = tie
    public String getWinner() {
        int status = theBoard.getGameStatus();
        if (status == 1) {
            return "PlayerOne wins";
        } else if (status == 2) {
            return "PlayerTwo wins";
        } else if (status == 0) {
            return "In progress ";
        }
        return "Tie";
    }



    

    public void printBoard(TicTacToeBoard board) {
        String sol = "";
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (theBoard.getCellContents(r, c) == 0) {
                    sol += printBlank();
                } else if (theBoard.getCellContents(r, c) == 1) {
                    sol += printX();
                } else if (theBoard.getCellContents(r, c) == 2) {
                    sol += printO();
                }
            }
        }
        String[] lines = new String[18];
        int lineIndexBy30 = 0;
        for (int i = 0; i < 18; i++) {
            lines[i] = sol.substring(lineIndexBy30, lineIndexBy30 + 30);
            lineIndexBy30 += 30;
        }

        int linesIndexBy10 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.print(lines[j].substring(linesIndexBy10, linesIndexBy10 + 10));
                
            }
            System.out.println();
            linesIndexBy10 += 10;
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard board1 = new TicTacToeBoard();
        TicTacToeConsole game1 = new TicTacToeConsole(board1);
        board1.placePiece(0, 0, 1);
        board1.placePiece(1, 1, 2);
        board1.placePiece(2, 2, 1);

        game1.printBoard(board1);

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
git config --global user.email "you@example.com"
git config --global user.name "Your Name"