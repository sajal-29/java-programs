public class sumOfN {
    public static void main(String[] args) {
        System.out.println(sumUpto(5));
    }
    public static int sumUpto(int n){
        if(n == 0){
            return 0;
        }
        return n + sumUpto(n-1);
    }
}
