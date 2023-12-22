package recursionAndBackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        placeQueens(board,0,n);
        System.out.println(placeQueensWays(board,0,n));
        System.out.println(placeQueensInList(board,0,n));
    }
    public static void placeQueens(boolean[][] maze, int row, int n){
        if(n == 0){
            display(maze);
            System.out.println();
            return;
        }

        for (int col = 0; col < maze[0].length; col++) {
            if(isSafe(maze, row ,col)){
                maze[row][col] = true;
                placeQueens(maze,row+1, n-1);
                maze[row][col] = false;
            }
        }
    }
    public static List<String> placeQueensInList(boolean[][] maze, int row, int n){
        if(n == 0){
            System.out.println();
            return listDisplay(maze);
        }
        List<String> list = new ArrayList<>();

        for (int col = 0; col < maze[0].length; col++) {
            if(isSafe(maze, row ,col)){
                maze[row][col] = true;
                list.addAll(placeQueensInList(maze,row+1, n-1));
                maze[row][col] = false;
            }
        }
        return list;
    }

    private static List<String> listDisplay(boolean[][] maze) {
        List<String> list = new ArrayList<>();
        for(boolean[] value : maze){
            for (boolean element : value) {
                if(element){
                    list.add("Q");
                } else {
                    list.add(".");
                }
            }
        }
        return list;
    }

    public static int placeQueensWays(boolean[][] maze, int row, int n){
        if(n == 0){
            return 1;
        }
        int count = 0;
        for (int col = 0; col < maze[0].length; col++) {
            if(isSafe(maze, row ,col)){
                maze[row][col] = true;
                count += placeQueensWays(maze,row+1, n-1);
                maze[row][col] = false;
            }
        }
        return count;
    }
    public static void display(boolean[][] maze){
        for(boolean[] value : maze){
            for (boolean element : value) {
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][] maze, int row, int col){
        int left = Math.min(row, col);
        int right = Math.min(row, maze[0].length - 1 - col);

        //for left diagonal
        for (int i = 0; i <= left ; i++) {
            if(maze[row - i][col - i]){
                return false;
            }
        }
        //for right diagonal
        for (int i = 0; i <= right ; i++) {
            if(maze[row - i][col + i]){
                return false;
            }
        }
        //for above rows
        for (int i = 1; i <= row; i++) {
            if(maze[row - i][col]){
                return false;
            }
        }
        return true;
    }
}
