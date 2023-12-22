package pattern;

public class pattern5 {
    public static void patternNumber5(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void alternatePatternNumber5(int n){
        for (int row = 0; row < 2*n; row++) {
            int ColInRow = row < n? row: 2*n-row;  
            for (int col = 0; col < ColInRow ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // patternNumber5(1);
        alternatePatternNumber5(7);
    }
}
