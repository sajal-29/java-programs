package Searching;

public class Question3 {
    //Reversing an array by reversing all the elements in array
    public static void reverseArray(int[] arr,int start, int end){
        while(start<=end){
            swap(start,end,arr);
            start++;
            end--;
        }
    }
    private static void swap(int i, int j,int[] arr) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr,3,arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
