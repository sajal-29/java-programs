package sorting;

public class Bubblesort {
    public static void bubbleSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j+1]<arr[j]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void OptimalbubbleSort(int[] arr){
        boolean check = false;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j+1]<arr[j]){
                    swap(arr, j, j+1);
                    check = true;
                }
            }
            if(!check){
                    break;
                }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,1};
        int[] nums = {1,2,3,4,5,6};
        OptimalbubbleSort(nums);
        bubbleSort(arr);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
