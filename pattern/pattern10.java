package pattern;

public class pattern10 {
    public static void patternNumber10(int n){
        for (int row = 1; row < 2*n; row++) {
            int columnUpto = row>n?2*n-row:row;
            int spacesUpto = row>n?row-n :n-row;
            for (int spaces = spacesUpto; spaces >= 1; spaces--) {
                System.out.print(" ");
            }
            for (int col = columnUpto; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= columnUpto; col++) {
                System.out.print(col);
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternNumber10(7);
    }
}
