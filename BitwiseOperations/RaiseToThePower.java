package BitwiseOperations;

public class RaiseToThePower {
    //Problem : Raise a number to a certain power
    public static void RaiseUpto(int n, int upto){
        int base = n;
        int ans = 1;
        int power = upto;
        while(power > 0){
            if((power&1) != 0){
                ans = ans*base;
            }
            base *= base;
            power >>= 1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        RaiseUpto(3, 1);
    }
}
