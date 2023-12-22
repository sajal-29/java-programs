package LEETCODE;


public class findmountainArray {
    public static int findInMountainArray(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int index = 0;
        while(start<end){
            int mid = (end-start)/2 + start;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        index = BinarySearch(nums, target, 0, start);

        if(index == -1){
            return ReverseBinarySearch(nums, target, start+1, nums.length-1);
        }
        return index;
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

    private static int ReverseBinarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr[mid]<target){
                end = mid-1;
            }
            else if(arr[mid]>target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,3,1};
    System.out.println(findInMountainArray(arr, 4));
}
}
