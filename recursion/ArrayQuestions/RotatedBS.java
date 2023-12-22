package recursion.ArrayQuestions;

public class RotatedBS {
    public static int rotatedBinarySearch(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBinarySearch(arr, target, start, mid-1);
            }
            else{
                return rotatedBinarySearch(arr, target, mid+1, end);
            }
        }
        if(target <= arr[end]){
            return rotatedBinarySearch(arr, target, mid+1, end);
        }

        return rotatedBinarySearch(arr, target, start, mid-1); 
        
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(rotatedBinarySearch(arr, 7, 0, arr.length-1));
        System.out.println(rotatedBinarySearch(arr, 9, 0, arr.length-1));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(rotatedBinarySearch(arr, arr[i], 0, arr.length-1));
        }
        
    }
}
