package BitwiseOperations;

public class sumOfpascalTriangle {
    //Problem: To find sum of nth row of a pascal triangle
    public static int pascalTriangle(int n){
        return 1<<n-1;
    }
    public static void main(String[] args) {
        System.out.println(pascalTriangle(4));
    }
}
