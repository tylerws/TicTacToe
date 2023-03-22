public class TicTacToeBoard {
    public int[][] board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    public boolean aValidMove(int x, int y) {
        if (board[x][y] != 0) {
            return false;
        } else {
            return true;
        }
    }

    //1 = player1, 2 = player2 0 = empty
    
    public int getCellContents(int x, int y) {
        return board[x][y];
    }
    
    public boolean placePiece(int xPos, int yPos, int playerNum) {
        int x = xPos;
        int y = yPos;
        int player = playerNum;

        if (board[x][y] == 0) {
            board[x][y] = player;
            return true;
        }
        return false;
        }

        //1 = player1 win, 2 = player2 win, 0 = in progress, -1

        public int getGameStatus() {
            if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
                return 1;
            } else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
                return 1;
            } else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
                return 1;
            } else if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
                return 1;
            } else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
                return 1;
            } else if (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) {
                return 1;
            } else if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
                return 1;
            } else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
                return 1;
        } else if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
            return 2;
        } else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
            return 2;
        } else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
            return 2;
        } else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
            return 2;
        } else if (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
            return 2;
        } else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) {
            return 2;
        } else if (board[0][0] == 0 || board[0][1] == 0 || board[0][2] == 0
        || board[1][0] == 0 || board[1][1] == 0 || board[1][2] == 0
        || board[2][0] == 0 || board[2][1] == 0 || board[2][2] == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}