package Searching;

public class Question9 {
// Given an array of integers A (sorted) and a integer Val.
// Implement a function that takes A and Val as input parameters and returns the lower bound of Val.
// Note : If Val is not present in array then Lower bound of a given integer means integer which is just smaller than given integer.
// Otherwise Val itself is the answer.
// If Val is less than smallest element of array A then return '-1' in that case.

    public static int largestElement(int[] arr,int Val){
        int min = arr[0];
        if(Val<min){
            return -1;
        }
        for (int i : arr) {
            if(i==Val){
                return i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i],Val);
        }       
        return min;

    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,3,4};
        System.out.println(largestElement(arr, 5));
    }



}
