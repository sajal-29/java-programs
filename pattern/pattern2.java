package pattern;

public class pattern2 {
    public static void main(String[] args) {
        patternNumber2(4);
    }
    static void patternNumber2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
