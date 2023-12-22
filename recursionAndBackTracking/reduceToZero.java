
public class reduceToZero {
    public static void main(String[] args) {
        System.out.println(steps(123));
        System.out.println(stepsWithOddEven(41));
    }
    public static int steps(int n){
        if(n == 0){
            return 0;
        }
        return 1+steps(n/10);
    }
    public static int stepsWithOddEven(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return 1+ stepsWithOddEven(n/2);
        } else {
            return 1+ stepsWithOddEven(n-1);
        }
    }
}
