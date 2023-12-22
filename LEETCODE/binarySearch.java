package LEETCODE;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(search(arr,5));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return BinarySearch(nums,start,end,target);
    }
    public static int BinarySearch(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return BinarySearch(nums, start, mid-1, target);
        } else {
            return BinarySearch(nums, mid+1, end, target);
        }
    }
}
