package Searching;

public class Question10 {
    // Given a sorted array and a number x, find a pair in array whose sum is closest to x.
    public static void closestSum(int[] arr ,int x){
        int[] diff = new int[2];
        int num = arr[arr.length-1] + arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(Math.min(Math.abs(arr[i]+arr[j]-x),num)<num){
                num = Math.min(Math.abs(arr[i]+arr[j]-x),num);
                diff[0] = arr[i];
                diff[1] = arr[j];
               }
            }
        }
        for (int i : diff) {
            System.out.print(i+" and ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {10, 22, 28, 29, 30, 40};
        closestSum(arr, 54);
    }
}
