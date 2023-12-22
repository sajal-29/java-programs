package BitwiseOperations;

public class NoOfSetBits {
    public static int countSetBits(int n){
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count ++;
            }
            n >>= 1;
        }
        return count;
    }
    public static int AlternativeCountingSetBits(int n){
        System.out.println(Integer.toBinaryString(n));
        int count = 0;
        while(n>0){
            count++;
            n = (n & (n-1));
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(11));
        System.out.println(AlternativeCountingSetBits(11));
    }
}
