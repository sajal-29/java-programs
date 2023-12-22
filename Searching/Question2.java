package Searching;

import java.util.ArrayList;

public class Question2 {
    //To print all the indexes of target element using BinarySearch
    static ArrayList<Integer> ll = new ArrayList<>();
    public static void BinarySearch(int[] arr, int target, int start, int end){
        int mid = (end-start)/2 + start;
        if(arr[mid] == target){
            ll.add(mid);
        }
        if(binarySearch(arr, target, start, mid-1)){
            BinarySearch(arr, target, start, mid-1);
        }
        if(binarySearch(arr, target, mid+1, end)){
            BinarySearch(arr, target, mid+1, end);
        }
        
    }
    private static boolean binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]==target){
                return true;  
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        int[] arr ={1,4,6,7,8,8};
        BinarySearch(arr, 8, 0, arr.length-1);
        System.out.println(ll);
    }
}
