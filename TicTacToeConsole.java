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

    public static void printEasterEgg(){                                                                                                        
        System.out.println("        GGGGGGGGGGGGGUUUUUUUU     UUUUUUUUIIIIIIIIII '::::'                                                                             kkkkkkkk            !!!  !!! ");
        System.out.println("     GGG::::::::::::GU::::::U     U::::::UI::::::::I '::::'                                                                             k::::::k           !!:!!!!:!!");
        System.out.println("   GG:::::::::::::::GU::::::U     U::::::UI::::::::I ':::''                                                                             k::::::k           !:::!!:::!");
        System.out.println("  G:::::GGGGGGGG::::GUU:::::U     U:::::UUII::::::II':::'                                                                               k::::::k           !:::!!:::!");
        System.out.println(" G:::::G       GGGGGG U:::::U     U:::::U   I::::I  ''''       ssssssssss            ssssssssss   uuuuuu    uuuuuu      cccccccccccccccc k:::::k    kkkkkkk!:::!!:::!");
        System.out.println("G:::::G               U:::::D     D:::::U   I::::I           ss::::::::::s         ss::::::::::s  u::::u    u::::u    cc:::::::::::::::c k:::::k   k:::::k !:::!!:::!");
        System.out.println("G:::::G               U:::::D     D:::::U   I::::I         ss:::::::::::::s      ss:::::::::::::s u::::u    u::::u   c:::::::::::::::::c k:::::k  k:::::k  !:::!!:::!");
        System.out.println("G:::::G    GGGGGGGGGG U:::::D     D:::::U   I::::I         s::::::ssss:::::s     s::::::ssss:::::su::::u    u::::u  c:::::::cccccc:::::c k:::::k k:::::k   !:::!!:::!");
        System.out.println("G:::::G    G::::::::G U:::::D     D:::::U   I::::I          s:::::s  ssssss       s:::::s  ssssss u::::u    u::::u  c::::::c     ccccccc k::::::k:::::k    !:::!!:::!");
        System.out.println("G:::::G    GGGGG::::G U:::::D     D:::::U   I::::I            s::::::s              s::::::s      u::::u    u::::u  c:::::c              k:::::::::::k     !:::!!:::!");
        System.out.println("G:::::G        G::::G U:::::D     D:::::U   I::::I               s::::::s              s::::::s   u::::u    u::::u  c:::::c              k:::::::::::k     !!:!!!!:!!");
        System.out.println(" G:::::G       G::::G U::::::U   U::::::U   I::::I         ssssss   s:::::s      ssssss   s:::::s u:::::uuuu:::::u  c::::::c     ccccccc k::::::k:::::k     !!!  !!! ");
        System.out.println("  G:::::GGGGGGGG::::G U:::::::UUU:::::::U II::::::II       s:::::ssss::::::s     s:::::ssss::::::su:::::::::::::::uuc:::::::cccccc:::::ck::::::k k:::::k             ");
        System.out.println("   GG:::::::::::::::G  UU:::::::::::::UU  I::::::::I       s::::::::::::::s      s::::::::::::::s  u:::::::::::::::u c:::::::::::::::::ck::::::k  k:::::k   !!!  !!! ");
        System.out.println("     GGG::::::GGG:::G    UU:::::::::UU    I::::::::I        s:::::::::::ss        s:::::::::::ss    uu::::::::uu:::u  cc:::::::::::::::ck::::::k   k:::::k !!:!!!!:!!");
        System.out.println("        GGGGGG   GGGG      UUUUUUUUU      IIIIIIIIII         sssssssssss           sssssssssss        uuuuuuuu  uuuu    cccccccccccccccckkkkkkkk    kkkkkkk !!!  !!! ");

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
                j = 17;
            }
            if (j == 23){
                j = 35;
            }
            if (j== 41){
                break;
            }
        }

    }
    // ________________________________________
    // / You have Egyptian flu: you're going to \
    // \ be a mummy.                            /
    //  ----------------------------------------
    //         \   ^__^
    //          \  (oo)\_______
    //             (__)\       )\/\
    //                 ||----w |
    //                 ||     ||
    public static void main(String[] args) {
        TicTacToeBoard board1 = new TicTacToeBoard();
        TicTacToeConsole game1 = new TicTacToeConsole(board1);
        printTitle();
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("________________________________________");

        Scanner sc = new Scanner(System.in);
        boolean game = true;
        int turn = 1;
        int invalidCount = 0;
        while (game){

            if (turn == 1){
                int row;
                int col;
                System.out.println("Player1");
                System.out.print("Input row: ");
                row = sc.nextInt();
                System.out.print("Input column: ");
                col = sc.nextInt();
                if (board1.placePiece(row, col, turn)){
                    turn = 2;
                }else {
                    invalidCount++;
                    System.out.println("________________________________________");
                    System.out.println("/          invalid input                \\");
                    System.out.println("\\                                       /");
                    System.out.println(" ----------------------------------------");
                    System.out.println("        \\   ^__^");
                    System.out.println("         \\  (oo)\\_______");
                    System.out.println("            (__)\\       )\\/\\");
                    System.out.println("                ||----w |");
                    System.out.println("                ||     ||");
                    if (invalidCount == 5){
                        printEasterEgg();
                        game = false;
                    }
                    continue;
                }
            }else if (turn == 2){
                int row;
                int col;
                System.out.println("Player2");
                System.out.print("Input row:");
                row = sc.nextInt();
                System.out.print("Input column:");
                col = sc.nextInt();
                if (board1.placePiece(row, col, turn)){
                    turn = 1;
                }else {
                    System.out.println("________________________________________");
                    System.out.println("/          invalid input                \\");
                    System.out.println("\\                                       /");
                    System.out.println(" ----------------------------------------");
                    System.out.println("        \\   ^__^");
                    System.out.println("         \\  (oo)\\_______");
                    System.out.println("            (__)\\       )\\/\\");
                    System.out.println("                ||----w |");
                    System.out.println("                ||     ||");
                    if (invalidCount == 5){
                        printEasterEgg();
                        game = false;
                    }
                    continue;
                }
            }
            int status = board1.getGameStatus();

            if (status == 1){
                game1.printBoard(board1);
                System.out.println("________________________________________");
                System.out.println("/          Player1 wins!                \\");
                System.out.println("\\                                       /");
                System.out.println(" ----------------------------------------");
                System.out.println("        \\   ^__^");
                System.out.println("         \\  (oo)\\_______");
                System.out.println("            (__)\\       )\\/\\");
                System.out.println("                ||----w |");
                System.out.println("                ||     ||");
                game = false;
            } else if (status == 2){
                game1.printBoard(board1);
                System.out.println("________________________________________");
                System.out.println("/          Player2 wins!                \\");
                System.out.println("\\                                       /");
                System.out.println(" ----------------------------------------");
                System.out.println("        \\   ^__^");
                System.out.println("         \\  (oo)\\_______");
                System.out.println("            (__)\\       )\\/\\");
                System.out.println("                ||----w |");
                System.out.println("                ||     ||");
                game = false;
            } else if (status == -1){
                game1.printBoard(board1);
                System.out.println("________________________________________");
                System.out.println("/                  tie                  \\");
                System.out.println("\\                                       /");
                System.out.println(" ----------------------------------------");
                System.out.println("        \\   ^__^");
                System.out.println("         \\  (oo)\\_______");
                System.out.println("            (__)\\       )\\/\\");
                System.out.println("                ||----w |");
                System.out.println("                ||     ||");
                game = false;
            } else{
                game1.printBoard(board1);
            }
            invalidCount = 0;
        }
        




    }
}
