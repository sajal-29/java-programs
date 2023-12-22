package pattern;

public class pattern1 {
    public static void main(String[] args) {
        patterNumber1(8);
    }
    static void patterNumber1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
