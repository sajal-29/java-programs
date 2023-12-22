package BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placeQueens(board,0);

    }
    public static void placeQueens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                placeQueens(board,row+1);
                board[row][col] = false;
            }
        }

    }

    private static void display(boolean[][] board) {
        for (boolean[] num : board) {
            for (boolean element: num) {
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(boolean[][] board, int row, int col){
        for (int i = 0; i < row; i++) {
            if(board[i][col]){

                return false;
            }
        }
        int left = Math.min(row, col);
        for (int i = 1; i <= left; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        int right = Math.min(row, board.length-col-1);
        for (int i = 1; i <= right; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

}
