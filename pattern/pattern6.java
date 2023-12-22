package pattern;

public class pattern6 {
    public static void patternNumber6(int n){
        for (int row = 0; row < n; row++) {
            int kabtakk = n-1-row;
            for (int col = 0; col < n; col++) {
                if(col > kabtakk-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternNumber6(5);
    }
}
