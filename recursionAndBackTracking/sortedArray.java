public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSortedModified(arr, 0));
    }
    public static boolean isSorted(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }
        if(arr[start] > arr[start + 1]){
            return false;
        } else {
            return isSorted(arr, start+1);
        }
    }
    public static boolean isSortedModified(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }
        return arr[start] < arr[start + 1] && isSortedModified(arr, start + 1);
    }
}
