package sorting;

public class Cyclesort {
    public static void cycleSort(int[] arr){
        int i = 0;
        int n = arr.length;
        while(i<n){
            if(arr[i]-i != 1){
                swap(arr, i, arr[i]-1);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,8,6,5,1,9};
        cycleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
