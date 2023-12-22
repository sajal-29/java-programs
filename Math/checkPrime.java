package Math;

public class checkPrime {
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeUpto(int n){
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
        primeUpto(40);
    }
}
