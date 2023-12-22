package BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placeKnights(board,0,0,4);
    }
    public static void placeKnights(boolean[][] board, int row, int col, int target){
        if(target == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length){
            return;
        }
        if(col == board.length){
            placeKnights(board, row+1, 0, target);
            return;
        }

        if(isSafe(board, row, col)){
            board[row][col] = true;
            placeKnights(board,row,col+1,target-1);
            board[row][col] = false;
        }

        placeKnights(board, row, col+1, target);

    }
    public static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] num : board) {
            for (boolean element: num) {
                if(element){
                    System.out.print("K ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
