package Searching;

public class BinarySearch {
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
        int[] arr = {3,5,6,23,425,435,568,679};
        System.out.println(binarySearch(arr, 6, 0, arr.length-1));
    }
}
