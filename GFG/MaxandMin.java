package GFG;

class Pair
{
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class MaxandMin {
//    Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.
//
//    Examples :
//
//    Input: arr = {1, 4, 3, -5, -4, 8, 6};
//    Output: min = -5, max = 8

    public static void main(String[] args) {
        long[] num = {3, 2, 1, 56, 10000, 167};
        Pair pair = getMinMax(num, num.length);
        System.out.println(pair.first+" "+pair.second);
    }
    public static long findMin(long[] nums, long n){
        if(n == 1){
            return nums[0];
        }
        long min = nums[(int) n-2];

        return Math.min(min,findMin(nums, n-1));
    }
    public static Pair getMinMax(long a[], long n) {
        //Write your code here
        return new Pair(findMin(a, n),findMax(a, n));
    }
    public static long findMax(long[] nums, long n){
        if(n == 1){
            return nums[(int) n-1];
        }
        long max = nums[(int) n-2];

        return Math.max(max,findMax(nums, n-1));
    }
}
