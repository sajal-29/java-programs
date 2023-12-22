package recursion.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,84,6,77,8,4,3,1};
        quickSort(arr,0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int i = start;
        int j = end;
        int pivot = i + (j-i)/2;
        // int pivot = end;
        while(i<=j){
            while(arr[i]<arr[pivot]){
                i++;
            }
            while(arr[j]>arr[pivot]){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
           
        }
        quickSort(arr, start,j);
        quickSort(arr, i, end);
    }
}

