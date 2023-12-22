package BitwiseOperations;

public class checkOddEven {
    public static boolean isEven(int n){
        return (n&1)==0 ? true:false;
    }
    public static void main(String[] args) {
        System.out.println(isEven(0));
    }
}
