package BackTracking;
import java.util.*;
public class maze1 {

    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        giveAllPaths("",maze,0,0, path, 1);
    }
    public static void giveAllPaths(String str, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length -1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(str);
            System.out.println();
            return;
        }

        if(maze[r][c]){

            maze[r][c] = false;
            path[r][c] = step;

            if(r < maze.length-1){
                giveAllPaths(str + "D",maze,r+1,c, path, step+1);
            }
            if(c < maze[0].length - 1){
                giveAllPaths(str + "R",maze, r, c+1, path, step+1);
            }
            if(r > 0){
                giveAllPaths(str + "U",maze,r-1,c, path, step+1);
            }
            if(c > 0){
                giveAllPaths(str + "L",maze,r,c-1, path, step+1);
            }
            maze[r][c] = true;
            path[r][c] = 0;
        }


    }
}
