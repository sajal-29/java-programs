package BitwiseOperations;

public class findIthBit {
    public static int IthBit(int n, int ith){
        int power = (int)Math.pow(2, ith-1);
        if((n & power)==power){
            return 1;
        }else{
            return 0;
        }
    }
    public static int setBit(int n,int ith){
        int mask = 1<<ith-1;
        if(IthBit(n, ith) == 1){
            return n;
        }else{
            return n|mask;
        }
    }
    public static void main(String[] args) {
        System.out.println(IthBit(17, 4));
        System.out.println(setBit(17, 3));
    }
}
