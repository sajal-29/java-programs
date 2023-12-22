package recursion;

public class printNumbers {
    //Problem: print n numbers
    public static void main(String[] args) {
        number(5);
        reverseNumbers(5);
    }
    public static void number(int n){
        if(n==0){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
    public static void reverseNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reverseNumbers(n-1);
    }
}
