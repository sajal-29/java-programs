package LEETCODE;

public class happyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = number(slow);
            fast = number(number(fast));
        } while (slow != fast);

        return slow == 1;

    }
    public static int number(int n){
        int count = 0;
        while(n > 0){
            int rem = n%10;
            count += rem * rem;
            n /= 10;
        }
        return count;
    }
}
