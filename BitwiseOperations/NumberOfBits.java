package BitwiseOperations;

public class NumberOfBits {
    public static int NoOfBits(int n,int base){
        //Problem : Find no. of bits in a decimal number with any base
        return (int)(Math.log(n)/Math.log(base))+1;
    }
    public static void main(String[] args) {
        System.out.println(NoOfBits(10, 2));
    }
}
