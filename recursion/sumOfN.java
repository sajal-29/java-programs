package recursion;

public class sumOfN {
    // problem : sum of n numbers
    public static int sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
