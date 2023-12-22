package recursion;

public class productUptoN {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
