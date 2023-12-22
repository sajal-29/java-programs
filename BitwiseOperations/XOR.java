package BitwiseOperations;

public class XOR {
    public static int XorUpto(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1; 
        }
        else{
            return 0;
        }
    }
    public static int XorInRange(int a, int b){
        return XorUpto(a-1) ^ XorUpto(b);
    }
    public static void main(String[] args) {
        System.out.println(XorInRange(3, 9));
    }
}
