package LEETCODE;

public class infiniteArraySearch {
    public static int infiniteSearch(int[] arr, int target){
        int start = 0 ;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = (end-start+1) *2 + end;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
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
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,};
        System.out.println(infiniteSearch(arr, 10));
    }
}
