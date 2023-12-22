package recursion;

public class BS {
    //problem: Binary Search using recursion
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,78};
        System.out.println(BinarySearch(arr, 1, 0, arr.length));
    }
    public static int BinarySearch(int[] arr, int target, int start, int end){
        if(start <= end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return BinarySearch(arr, target, mid+1, end);
        }
        return BinarySearch(arr, target, start, mid-1);
    }
}
