public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(30204));
    }
    public static int count(int n){
        int count = 0;
        return helper(n ,count);
    }
    public static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        if(n%10 == 0){
            return helper(n/10, count+1);
        } else {
            return helper(n/10, count);
        }
    }
}

