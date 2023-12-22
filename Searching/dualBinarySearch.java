package Searching;
import java.util.ArrayList;

public class dualBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        dualBS(arr, 8, 0, arr.length-1, list);
        System.out.println(list);
    }
    public static void dualBS(int[] arr, int target, int start, int end, ArrayList<Integer> ans ){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans.add(mid);
            }
            if(binarySearch(arr, target, start, mid-1)){
                dualBS(arr, target, start, mid-1, ans);
            }
            if(binarySearch(arr, target, mid+1, end)){
                dualBS(arr, target, mid+1, end, ans);
            }
    }
    public static boolean binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
