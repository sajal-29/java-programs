package sorting;

public class Insertionsort {
    public static void insertionSort(int[] arr){
        int j = 0;
        for (int i = 0; i <= arr.length-2; i++) {
            j = i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    j--;
                }
                else{
                    break;
                }
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {324,35,47,3,31,44,56,96};
        int[] nums = {-243,5,23,0,0,-34};
        insertionSort(nums);
        insertionSort(arr);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
