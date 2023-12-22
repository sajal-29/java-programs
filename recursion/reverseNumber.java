package recursion;

public class reverseNumber {
    public static int reverse(int n){
        int count = countDigits(n);
        if(n % 10 == n){
            return n;
        }
        return (n%10)*(int)Math.pow(10, count) + reverse(n/10);
    }
    private static int countDigits(int num) {
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }
        return --count;
    }
    public static boolean isPalindrome(int n){
        return n==reverse(n);
    }
    public static void main(String[] args) {
        System.out.println(reverse(1342));
        System.out.println(isPalindrome(1331));
    }
}
