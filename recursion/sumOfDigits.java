package recursion;

public class sumOfDigits {
    // Problem: sum of entire digit. For Ex: 126 = 1+2+6 = 9
    public static int DigitSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + DigitSum(n/10);
    }

    public static int DigitProduct(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * DigitProduct(n/10);
    }
    public static void main(String[] args) {
        System.out.println(DigitSum(1266));
        System.out.println(DigitProduct(12));
    }
}
