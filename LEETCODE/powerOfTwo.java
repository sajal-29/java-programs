package LEETCODE;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    public static boolean isPowerOfTwo(int n){
        if(divideByTwo((double) n) == 1){
            return true;
        } else {
            return false;
        }
    }
    public static int divideByTwo(double n){
            if(n == 1.0){
                return 1;
            }
            if(n < 1.0){
                return 0;
            }

            return divideByTwo(n/2);
    }
}
