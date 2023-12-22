package BitwiseOperations;

public class NthMagicNumber {
    //Problem: Find Nth magic number 
    public static void main(String[] args) {
        System.out.println(MagicNumber(6));
    }
    public static int MagicNumber(int n){
        int count = 0;
        int i = 1;
        while(n > 0){
            count += (n&1) * (int)Math.pow(5, i);
            n = n>>1;
            i++;
        }
        return count;
    }
}
