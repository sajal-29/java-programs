package recursion.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr, int maxInd, int i, int index){
        if(i == arr.length || index == -1){
            return;
        }
        maxInd = getMaxIndex(arr,index);
        int temp = arr[maxInd];
        arr[maxInd] = arr[index];
        arr[index] = temp;
        selectionSort(arr, 0, 1, index-1);        
    }

    private static int getMaxIndex(int[] arr, int index) {
        int max = arr[0];
        int ind = 0;
        for (int j = 0; j <= index; j++) {
            if(max < arr[j]){
                ind = j;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,1,7,4,5};
        selectionSort(arr, 0, 1, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
