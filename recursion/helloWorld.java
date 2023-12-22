package recursion;

public class helloWorld {
    //Problem: print hello world 'n' number of times using recursion
    public static void main(String[] args) {
        hello(5);
    }
    public static void hello(int check){
        if(check == 0){
            return;
        }
        System.out.println("hello, World");
        hello(check-1);
    }
}
