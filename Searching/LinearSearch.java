package Searching;

public class LinearSearch {
    public static int Linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,24,6,7,4,2,43,5};
        System.out.println("Index : "+Linearsearch(arr, 4));

    }
}
