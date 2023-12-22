package pattern;

public class pattern3 {
    public static void patterNumber3(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void alternatePatterNumber3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // patterNumber3(5);
        alternatePatterNumber3(5);
    }
}
