package LEETCODE;

public class ceiling {
    public static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target == arr[end]){
            return -1;
        }
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return start;
    }
    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(target == arr[start]){
            return -1;
        }
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else if(target == arr[mid]){
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceil(arr,15));
        System.out.println(floor(arr, 15));
    }
}
