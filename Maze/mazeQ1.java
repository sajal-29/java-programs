package Maze;

public class mazeQ1 {
    public static void main(String args[]){
        // System.out.println(StepsmazeSolver(3, 3));
        // mazeSolver(3, 3, "");
        // mazeSolverWithDiagonal(3, 3, "");
        // mazeSolverWithDiagonalStartWithZERO(1, 1, "");
        boolean maze[][] = {{true,true,true},{true,true,true},{true,true,true}};
        matrixMazeSolver(maze, 0, 0, "");
    }

    public static int StepsmazeSolver(int row, int col){
        int count = 0;
        if(row == 1 || col == 1){
            return 1;
        }
        int left = StepsmazeSolver(row-1, col);
        int right = StepsmazeSolver(row, col-1);
        
        count = left+right;

        return count;
    }
    public static void mazeSolver(int row, int col, String str){
        if(row == 1 && col == 1){
            System.out.println(str);
            return;
        }
        if(row > 1){
            mazeSolver(row-1, col, str+"D");
        }
        if(col > 1){
            mazeSolver(row, col-1, str+"R");
        }
    }
    public static void mazeSolverWithDiagonal(int row, int col, String str){
        if(row == 1 && col == 1){
            System.out.println(str);
            return;
        }
        if(row > 1 && col > 1){
            mazeSolverWithDiagonal(row-1, col-1, str+"dia");
        }
        if(row > 1){
            mazeSolverWithDiagonal(row-1, col, str+"D");
        }
        if(col > 1){
            mazeSolverWithDiagonal(row, col-1, str+"R");
        }
        
    }
    public static void mazeSolverWithDiagonalStartWithZERO(int row, int col, String str){
        if(row == 3 && col == 3){
            System.out.println(str);
            return;
        }
        if(row < 3 && col < 3){
            mazeSolverWithDiagonalStartWithZERO(row+1, col+1, str+"dia");
        }
        if(row < 3){
            mazeSolverWithDiagonalStartWithZERO(row+1, col, str+"D");
        }
        if(col < 3){
            mazeSolverWithDiagonalStartWithZERO(row, col+1, str+"R");
        }
        
    }
    public static void matrixMazeSolver(boolean arr[][], int row, int col, String str){
        if(row == arr.length-1 && col == arr[0].length-1){
            System.out.println(str);
            return;
        }
        // if(arr[row][col] == false){
        //     return;
        // }
        if(arr[row][col]){

        
        // if(row < arr.length-1 && col < arr[0].length-1){
        //     matrixMazeSolver(arr,row+1, col+1, str+"dia");
        // }
            
        if(row < arr.length-1){
            matrixMazeSolver(arr, row+1, col, str+"D");
            
        }
        if(col < arr[0].length-1){
            matrixMazeSolver(arr, row, col+1, str+"R");
        }
    }
    
        
    }
}
