import java.util.Arrays;

public class sudokuPractice {
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
        solve(sudoku);
    }
    public static boolean solve(int[][] sudoku){
        int row = -1;
        int col = -1;

        boolean isEmpty = false;
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[0].length; j++) {
                if(sudoku[i][j] == 0){
                    isEmpty = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(isEmpty){
                break;
            }
        }
        if(!isEmpty){
            return true;
        }

        //backtrack
        for (int num = 1; num <= 9 ; num++) {
            if(isSafe(sudoku, row, col, num)){
                sudoku[row][col] = num;
                if(solve(sudoku)){
                    display(sudoku);
                    return true;
                } else {
                    sudoku[row][col] = 0;
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
