package recursion.sorting;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {34,2,57,689,24,4};
        // System.out.println(Arrays.toString(mergeSort(arr)));
        merge_sort(arr, 0, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static int[] mergeSort(int[] arr){
        int mid = arr.length/2;
        if(arr.length == 1){
            return arr;
        }
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int[] output = new int[left.length+right.length];
        while(i < left.length && j < right.length){
            if(left[i]<right[j]){
                output[k] = left[i];
                i++;
            }
            else{
                output[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            output[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            output[k] = right[j];
            j++;
            k++;
        }
        return output;
    }

    public static void merge_sort(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid  = start + (end-start)/2;
        merge_sort(arr,start,mid);
        merge_sort(arr, mid, end);
        Merge(arr, start,mid, end);
    }
    private static void Merge(int[] arr, int start, int mid, int end) {
        int[] output = new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i]>arr[j]){
                output[k] = arr[j];
                j++;
            }
            else{
                output[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<mid){
            output[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            output[k] = arr[j];
            j++;
            k++;
        }
        for (int k2 = 0; k2 < output.length; k2++) {
            arr[start + k2] = output[k2];
        }
    }

    
}
