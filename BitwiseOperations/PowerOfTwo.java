package BitwiseOperations;


public class PowerOfTwo {
    public static boolean PowerOf2(int n){
        return (n&n-1) == 0? true:false;
    }
    public static void main(String[] args) {
        System.out.println(PowerOf2(6));
    }
}
