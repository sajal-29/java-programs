public class reverseNum {
    public static void main(String[] args) {
        int n = 9578325;
        reverse(1234);
        System.out.println(sum);
        System.out.println(reversePart2(n, (int) Math.log10(n)+1));
    }
    static int sum = 0;
    public static void reverse(int n){
        if(n == 0){
            return;
        }
        int num = n % 10;
        sum = sum * 10 + num;
        reverse(n/10);
    }
    public static int reversePart2(int n, int count){
        if(n % 10 == n){
            return n;
        }
        return (n%10) * (int) Math.pow(10,count-1) + reversePart2(n/10, count-1);
    }
}
