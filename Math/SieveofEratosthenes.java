package Math;

public class SieveofEratosthenes {
    //Problem : 
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        SoE(n, prime);
    }
    public static void SoE(int n, boolean[] primes){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(!primes[i]){
                for (int j = 2*i; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
