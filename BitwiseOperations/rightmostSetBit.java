package BitwiseOperations;

public class rightmostSetBit {
    public static int RightmostSetBit(int n){
        int pos = -1;
        for (int i = 0; i <= (int)Math.sqrt(n); i++) {
            int mask = 1<<i;
            if((n & mask) == mask){
               return i+1;
            }
            
        }
        return pos;
    }
    public static void main(String[] args) {
        System.out.println(RightmostSetBit(0));
    }
}
