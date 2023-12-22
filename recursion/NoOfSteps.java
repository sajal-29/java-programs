package recursion;

public class NoOfSteps {
    //Problem: Count the number of steps to reach the number to zero
    public static int numberOfSteps(int n){
        if(n==0){
            return 0;
        }
        else{
            if(n%2==0){
                return 1+numberOfSteps(n/2);
            }else{
                return 1+numberOfSteps(n-1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
}
