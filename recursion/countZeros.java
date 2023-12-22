package recursion;

public class countZeros {
static int count = 0;
    public static void Zeros(int n){
        if(n>0){
            if(n%10==0){
                count++;
            }
            Zeros(n/10);
        }
    }
    public static void main(String[] args) {
        Zeros(100000);
        System.out.println(count);
    }
}
