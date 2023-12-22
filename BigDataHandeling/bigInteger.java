package BigDataHandeling;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3456);
        int c = A.intValue();

        // for strings
        BigInteger C = new BigInteger("21432");
        BigInteger X = new BigInteger("324123");

        // constants
        BigInteger D = BigInteger.ONE;

        // add
        System.out.println(A.add(B));
        System.out.println(C.add(X));
        System.out.println(A.add(X));

        // compare
        if(C.compareTo(X) < 0){
            System.out.println("hue hue hue hue hue hue hue");
        }
        // to find the next prime number
        System.out.println(C.nextProbablePrime());

        // subtract/multiply/divide/remainder
        System.out.println(C.subtract(X)+" "+C.multiply(X)+" "+C.divide(X)+" "+C.remainder(X));

        // factorial function using BigInteger
        System.out.println(fact(20));
    }

    public static BigInteger fact(int num){
        BigInteger ans = new BigInteger("1");

        for (int i = 2; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;

    }
}
