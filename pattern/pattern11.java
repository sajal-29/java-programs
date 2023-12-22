package pattern;

public class pattern11 {
    public static void patternNumber11(int n){
        int rowStart = 1;
        int rowEnd = 2*n;
        int colStart = 1;
        int colEnd = 2*n;
        for (int i = colStart; i < colEnd; i++) {
            System.out.print(n);
        }
        for (int i = rowStart; i < rowEnd; i++) {
            System.out.println(n);
        }
        for (int i = rowStart; i > rowEnd; i++) {
            System.out.print(n);
        }
        
    }
    public static void main(String[] args) {
        patternNumber11(4);
    }
}
