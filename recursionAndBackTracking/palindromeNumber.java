public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
    public static boolean isPalindrome(int n){
        return n == reversePart2(n, (int) Math.log10(n)+1);
    }
    public static int reversePart2(int n, int count){
        if(n % 10 == n){
            return n;
        }
        return (n%10) * (int) Math.pow(10,count-1) + reversePart2(n/10, count-1);
    }
}
