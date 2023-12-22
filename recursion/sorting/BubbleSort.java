package recursion.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int i, int j){
        if(j == arr.length-1 || i == arr.length-1){
            return;
        }
        if(arr[j]>arr[j+1]){
            swap(arr,j,j+1);
            bubbleSort(arr,i,j+1);
        }else{
            bubbleSort(arr,i,j+1);
        }
        bubbleSort(arr, i+1,0);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        bubbleSort(arr, 0,0);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
