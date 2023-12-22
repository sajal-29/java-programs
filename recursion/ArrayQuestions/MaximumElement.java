package recursion.ArrayQuestions;

public class MaximumElement {
    public static int mountainArray(int[] arr,int target, int start, int end){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            if(target >= arr[start] && target <= arr[mid]){
                return mountainArray(arr, target, start, mid-1);
            }else{
                return mountainArray(arr, target, mid+1, end);
            }
        }
        if(arr[start] > arr[mid] && arr[end] < arr[mid]){
            return mountainArray(arr, target, start, mid-1);
        }
        else{
            return mountainArray(arr, target, mid+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int[] nums = {0,1,2,4,2,1};
        System.out.println(mountainArray(nums, 0, 0, 0));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(mountainArray(arr, arr[i], 0, arr.length-1));
        }
    }
}
