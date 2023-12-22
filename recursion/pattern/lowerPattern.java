package recursion.pattern;

public class lowerPattern {
    public static void printLowerTriangle(int row, int column){
        if(row==0){
            return;
        }
        if(row>column){
            System.out.print("* ");
            printLowerTriangle(row, column+1);
        }else{
            System.out.println();
            printLowerTriangle(row-1, 0);
        }
    }
    public static void printUpperTriangle(int row, int column){
        if(row==0){
            return;
        }
        if(row>column){
            printUpperTriangle(row, column+1);
            System.out.print("* ");
        }
        else{
            printUpperTriangle(row-1, 0);
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        printLowerTriangle(4, 0);
        printUpperTriangle(4, 0);
    }
}
