public class pattern1 {
    public static void main(String[] args) {
//        printPattern(4,0);
        printPatternUpperTriangle(4, 0);
    }
    public static void printPattern(int row, int col){
        if(row == 0){
            return;
        }
        if(row == col){
            System.out.println();
            printPattern(row-1, 0);
        } else {
            System.out.print("* ");
            printPattern(row, col+1);
        }

    }
    public static void printPatternUpperTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if(row == col){
            printPatternUpperTriangle(row-1, 0);
            System.out.println();
        } else {
            printPatternUpperTriangle(row, col+1);
            System.out.print("* ");
        }

    }
}
