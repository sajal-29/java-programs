package LEETCODE;

public class FindMissing {
    //PROBLEM: find missing number in an array from 0...n
    public static int missingNumber(int[] nums){
        int i = 0;
        int n = nums.length;
        while(i<n){
            if(nums[i] != i && nums[i] < n){
                swap(nums, i, nums[i]);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length;j++) {
            if(nums[j] != j){
                return j;
            }
        }
        return n;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
