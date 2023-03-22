public class TicTacToeBoard {
    public int[][] board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    public boolean aValidMove(int x, int y) {
        if (board[x][y] != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void placePiece(int x, int y, int player) {
        
    }
}