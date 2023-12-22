package Searching;
public class Question6 {
    // Problem: Maximum Subarray using Prefix Sum
    public static void maxSubArray(int[] arr){
        int max=arr[0],sum=0;
        int[] copy = new int[arr.length];
        copy[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            copy[i] = copy[i-1]+arr[i];  
        }
        for (int i = 0; i < copy.length; i++) {
            for (int j = i; j < copy.length; j++) {
                sum = i>0? copy[j] - copy[i-1] : copy[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,3};
        maxSubArray(arr);
    }
}
