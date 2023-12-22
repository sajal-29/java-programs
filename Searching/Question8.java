package Searching;

public class Question8 {
    //Problem: Printing max element of array
    public static int largetElement(int[] arr){
        int compare = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(compare < arr[i]){
                compare = arr[i];
            }
        }
        return compare;
    }
    public static void main(String[] args) {
        int[] arr = {-1 ,-2 ,-3 ,-3 ,8};
        System.out.println(largetElement(arr));
    }
}
