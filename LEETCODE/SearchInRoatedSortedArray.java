package LEETCODE;

public class SearchInRoatedSortedArray {
    //Problem: Searching in a rotated sorted array. For Ex: {4,5,7,0,1,2};
    public static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (end-start)/2 + start;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        int index = BinarySearch(nums, target,0,findPivot(nums));
        if(index == -1){
            index = BinarySearch(nums, target, findPivot(nums)+1, nums.length-1);
        }
        return index;
    }
    private static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    private static int givePivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid>start && nums[mid] > nums[mid-1] && nums[mid+1] > nums[mid]){
                start = mid+1;
            }
            else if(mid>start && mid<end && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
    private static int BinarySearch(int[] arr, int target, int s, int e) {
        int start = s;
        int end = e;
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        System.out.println(givePivot(arr));
        System.out.println(search(arr, 6));
    }
}
