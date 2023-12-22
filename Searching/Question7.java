package Searching;

public class Question7 {
    //Maximum Subarray using Kadane's Algorithm
    public static void maxSubArrayUsingKadane(int[] arr){
        int sum = 0,max = 0;
        for (int i : arr) {
            if(i<0){
                max = Integer.MIN_VALUE;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,-4,-1,-5,-12,-6,7,-3};
        maxSubArrayUsingKadane(arr);
    }
}
