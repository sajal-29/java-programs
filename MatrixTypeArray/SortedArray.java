package MatrixTypeArray;

import java.util.Arrays;

public class SortedArray {
    public static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length-1;
        int rowStart = 0;
        int rowEnd = row-1;
        int colmid = col/2;

        if (col == 0){
            return new int[] {-1,-1};
        }
        if (row == 1) {
            return binarySearch(arr,0, 0, col-1, target);
        }
        while (rowStart < (rowEnd-1)) {
            int rowmid = rowStart + (rowEnd-rowStart)/2;
            if(arr[rowmid][colmid]==target){
                return new int[]{rowStart,colmid};
            }
            if(arr[rowmid][colmid] < target){
                rowStart = rowmid;
            }
            else{
                rowEnd = rowmid;
            }            
        }

        if(arr[rowStart][colmid] == target){
            return new int[]{rowStart,colmid};
        }
        if(arr[rowStart+1][colmid] == target){
            return new int[]{rowStart+1,colmid};
        }

        if (target <= arr[rowStart][colmid - 1]) {
            return binarySearch(arr, rowStart, 0, colmid-1, target);
        }
        // search in 2nd half
        if (target >= arr[rowStart][colmid + 1] && target <= arr[rowStart][col - 1]) {
            return binarySearch(arr, rowStart, colmid + 1, col - 1, target);
        }
        // search in 3rd half
        if (target <= arr[rowStart + 1][colmid - 1]) {
            return binarySearch(arr, rowStart + 1, 0, colmid-1, target);
        } else {
            return binarySearch(arr, rowStart + 1, colmid + 1, col - 1, target);
        }

    }
    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int mid = (cEnd-cStart)/2 + cStart;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid+1;
            }
            else{
                cEnd = mid-1;
            }
            
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }
}
