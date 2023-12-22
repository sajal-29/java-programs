public class obstacleMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, false, true},
        };
        mazeSolver1(maze, 0,0, "");
    }
    public static void mazeSolver1(boolean[][] maze, int row, int col, String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(maze[row][col]){
            if(row < maze.length - 1){
                mazeSolver1(maze, row+1, col, str+"D");
            }
            if(col < maze[0].length - 1){
                mazeSolver1(maze, row, col+1, str+"R");
            }
        }
    }
}
