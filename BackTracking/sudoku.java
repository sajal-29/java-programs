package BackTracking;

public class sudoku {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        sudokuSolver(board);
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static boolean sudokuSolver(int[][] arr){
        int n = arr.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j] == 0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if(!isEmpty){
                break;
            }
        }

        if(isEmpty){
            return true;
        }

        for (int i = 1; i <= 9 ; i++) {
            if(isSafe(arr, row, col, i)){
                arr[row][col] = i;
                if(sudokuSolver(arr)){
                    display(arr);
                    System.out.println();
                    return true;
                } else {
                    arr[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] arr, int row, int col, int can) {
        for (int i = 0; i < arr.length; i++) {
            if(can == arr[row][i]){
                return false;
            }
            if(can == arr[i][col]){
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(arr.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt ; j++) {
                if(arr[i][j] == can){
                    return false;
                }
            }
        }
        return true;
    }
}
