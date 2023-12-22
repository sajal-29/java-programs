package pattern;

public class pattern7 {
    public static void patternNumber7(int n){
        for (int i = 0; i < n; i++) {
            int start = (2*(n-1))/2-i;
            int end = (2*(n-1))/2+i;
            for (int j = 0; j < 2*n-1; j++) {
                if(j >= start && j <= end){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternNumber7(5);
    }
}
