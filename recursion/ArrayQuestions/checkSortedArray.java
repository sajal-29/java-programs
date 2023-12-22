package recursion.ArrayQuestions;

public class checkSortedArray {
    public static boolean isSorted(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }
        
        return arr[start]<arr[start+1] && isSorted(arr, start+1);
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2,3,4,7,6}, 0));
    }
}
