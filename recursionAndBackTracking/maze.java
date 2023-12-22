import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//        boolean[][] maze = {
//                {true, true, true},
//                {true, true, true},
//                {true, true, true},
//        };
        boolean[][] maze = new boolean[3][3];
//        mazeSolver1(maze, 0, 0, "");
//        System.out.println(mazeSolverWithList(maze, 0,0, ""));
//        System.out.println(mazeSolverCount(maze, 0, 0));
        mazeSolverWithDiagonal(maze,0,0,"");
    }

    public static int mazeSolverCount(boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
             return 1;
        }

        int right = 0;
        int down = 0;
        if(row < maze.length - 1){
            down = mazeSolverCount(maze, row+1, col);
        }
        if(col < maze[0].length - 1){
            right = mazeSolverCount(maze, row, col+1);
        }

        return right+down;
    }
    public static void mazeSolver1(boolean[][] maze, int row, int col, String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(row < maze.length - 1){
            mazeSolver1(maze, row+1, col, str+"D");
        }
        if(col < maze[0].length - 1){
            mazeSolver1(maze, row, col+1, str+"R");
        }

    }
    public static void mazeSolverWithDiagonal(boolean[][] maze, int row, int col, String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(str);
            return;
        }

        if(row < maze.length - 1){
            mazeSolverWithDiagonal(maze, row+1, col, str+"D");
        }
        if(col < maze[0].length - 1){
            mazeSolverWithDiagonal(maze, row, col+1, str+"R");
        }
        if(row < maze.length - 1 && col < maze[0].length - 1){
            mazeSolverWithDiagonal(maze, row+1, col+1, str+"Di");
        }

    }
    public static ArrayList<String> mazeSolverWithList(boolean[][] maze, int row, int col, String str){
        if(row == maze.length-1 && col == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        if(row < maze.length - 1){
            l1 = mazeSolverWithList(maze, row+1, col, str+"D");
        }
        if(col < maze[0].length - 1){
            l2 = mazeSolverWithList(maze, row, col+1, str+"R");
        }

        l1.addAll(l2);
        return l1;
    }


}
