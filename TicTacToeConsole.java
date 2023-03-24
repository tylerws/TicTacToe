import java.util.Scanner;

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

    private static String printed0() {
        return "   ____   " + " ,' __ `. " + "/ ,'  `. \\" + "| | () | |" + "\\ `.__,' /" + " `.____,' ";
    }



    private static String printedX() {
        return "  .____,  " + " . \\  / , " + " |`-  -'| " + " |,-  -.| " + " ' /__\\ ` " + "  '    `  ";
    }

    private static String printedBlank() {
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
                    sol += printedBlank();
                } else if (theBoard.getCellContents(r, c) == 1) {
                    sol += printedX();
                } else if (theBoard.getCellContents(r, c) == 2) {
                    sol += printed0();
                }
            }
        }
        String[] lines = new String[54];
        int lineIndexBy10 = 0;
        for (int i = 0; i < 54; i++) {
            lines[i] = sol.substring(lineIndexBy10, lineIndexBy10 + 10);
            lineIndexBy10 += 10;
        }
        

        
        for (int j = 0; j < 54; j += 1) {
            System.out.println(lines[j] + lines[j + 6] + lines[j + 12]);
            if (j == 5) {
                j = 18;
            }
            if (j == 23){
                j = 36;
            }
            if (j== 41){
                break;
            }
        }

    }

    public static void main(String[] args) {
        TicTacToeBoard board1 = new TicTacToeBoard();
        TicTacToeConsole game1 = new TicTacToeConsole(board1);
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        int turn = 1;
        while (game){
            game1.printBoard(board1);
            if (turn == 1){
                int row;
                int col;
                System.out.println("Input row");
                row = sc.nextInt();
                System.out.println("INput column");
                col = sc.nextInt();
                board1.placePiece(row, col, turn);
            }else if (turn == 2){
                int row;
                int col;
                System.out.println("Input row");
                row = sc.nextInt();
                System.out.println("INput column");
                col = sc.nextInt();
                board1.placePiece(row, col, turn);
            }
            // 1= p1 win, 2 = p2 win, 0 = in proggers, -1 = tie
            int status = board1.getGameStatus();
        }




    }
}
