import java.util.Arrays;

public class mazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[maze.length][maze[0].length];
        findAllPaths(maze,0,0,"", path, 1);
    }
    public static void findAllPaths(boolean[][] maze, int row, int col, String str, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            display(path);
            System.out.println(str);
            System.out.println();
            return;
        }

        if(maze[row][col]){
            maze[row][col] = false;
            path[row][col] = step;
            if(row < maze.length - 1){
                findAllPaths(maze, row+1, col, str+"D", path, step+1);
            }
            if(col < maze[0].length - 1){
                findAllPaths(maze, row, col+1, str+"R", path, step+1);
            }
            if(col > 0){
                findAllPaths(maze, row, col-1, str+"L",path, step+1);
            }
            if(row > 0){
                findAllPaths(maze, row-1, col, str+"U",path, step+1);
            }
            maze[row][col] = true;
        }
    }
    private static void display(int[][] path) {
        for (int[] arr: path) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
