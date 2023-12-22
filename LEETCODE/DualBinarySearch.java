package LEETCODE;

import java.util.Arrays;

public class DualBinarySearch {
    //PROBLEM: To find the first and the last occurence of an element in a sorted array
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    private static int search(int[] nums, int target, boolean check) {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                ans = mid;
                if(check){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,9};
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
}
