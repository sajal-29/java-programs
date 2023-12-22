package sorting;

public class Selectionsort {
    public static void selectionSort(int[] arr){
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = arr.length-i-1;
            max = getMaxIndex(arr, index);
            swap(arr, index, max);            
        }
    }
    
    private static int getMaxIndex(int[] arr, int index) {
        int max = 0;
        for (int j = 1; j <= index; j++) {
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
        return max;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,25,648,967,4};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
