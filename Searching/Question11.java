package Searching;

public class Question11 {
    public static int[] kRotate(int[] arr , int k){
        k = k%arr.length;
        int breakpoint = arr.length-k;
        int breakpointPrev = breakpoint-1;
        int end = arr.length-1;
        int start = 0;
        while(breakpoint<=end){
            swap(breakpoint,end,arr);
            breakpoint++;
            end--;
        }
        while(start<=breakpointPrev){
            swap(breakpointPrev,start,arr);
            start++;
            breakpointPrev--;
        }
        start = 0;
        end = arr.length-1;
        while(start<=end){
            swap(start,end,arr);
            start++;
            end--;
        }
        return arr;
    }
    private static void swap(int i, int j,int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,9,0};
        kRotate(arr, 2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
     
}
