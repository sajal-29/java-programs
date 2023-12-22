package MatrixTypeArray;

public class BinarySearch {
    public static int[] binarySearch(int[][] arr, int target){
        int rowFirst = 0;
        int columnLast = arr[arr.length-1].length-1;
        while(rowFirst!=columnLast){
            if(arr[rowFirst][columnLast] < target){
                rowFirst++;
            }
            if(arr[rowFirst][columnLast] > target){
                columnLast--;
            }
            if(arr[rowFirst][columnLast] == target){
                return new int[] {rowFirst,columnLast};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {{12,13,34,49},{23,24,44,50},{35,45,93,65}};
        for (int num : binarySearch(arr, 51)) {
            System.out.print(num+" ");
        }
    
    }
}
