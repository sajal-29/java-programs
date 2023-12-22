import java.util.Arrays;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] sudoku = {{5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };
        solver(sudoku);

    }
    public static boolean solver(int[][] board){
        int row = -1;
        int col = -1;

        boolean isNotEmpty = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    isNotEmpty = false;
                    break;
                }
                if(!isNotEmpty){
                    break;
                }
            }
        }
        if(isNotEmpty){
            return true;
        }

        //backtracking function

        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;

                if(solver(board)){
                    display(board);
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    private static void display(int[][] arr){
        for (int[] num: arr) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();
    }
    public static boolean isSafe(int[][] board, int row, int col, int num){
        // check the row

        for (int[] ints : board) {
            if (ints[col] == num) {
                return false;
            }
        }

        // check for column
        for (int i = 0; i < board[0].length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        // for block

        int sqrt =  (int) (Math.sqrt(board.length));

        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for (int i = startRow; i < startRow + sqrt; i++) {
            for (int j = startCol; j < startCol + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
