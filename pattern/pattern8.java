package pattern;

public class pattern8 {
    public static void patternNumber8(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int space = row > n?row-n:n-row;
            int column = row > n?2*n - row:row;
            for (int spaces = space; spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= column; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternNumber8(5);
    }
}
