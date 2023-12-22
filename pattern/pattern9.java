package pattern;

public class pattern9 {
    public static void patternNumber9(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = n-row; spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternNumber9(5);
    }
}
