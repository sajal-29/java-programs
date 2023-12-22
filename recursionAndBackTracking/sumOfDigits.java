public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(35696));
        System.out.println(product(32534));
        printUpto(5);
        System.out.println();
         printUptoReverse(5);
    }
    public static int sum(int n){
        if(n % 10 == n){
            return n;
        }
        return n%10 + sum(n/10);
    }
    public static int product(int n){
        if(n % 10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }

    public static void printUpto(int n){
        if(n == 0){
            System.out.println(n);
            return;
        }
        printUpto(n-1);
        System.out.println(n);
    }
    public static void printUptoReverse(int n){
        if(n == -1){
            return;
        }
        System.out.println(n);
        printUptoReverse(n-1);
    }
}
