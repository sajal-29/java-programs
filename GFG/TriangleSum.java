package GFG;
import java.util.*;

public class TriangleSum {
    // problem : Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is being the Sum of consecutive two elements in the previous level.
    //Example :
    //
    //
    //Input : A = {1, 2, 3, 4, 5}
    //Output : [48]
    //         [20, 28]
    //         [8, 12, 16]
    //         [3, 5, 7, 9]
    //         [1, 2, 3, 4, 5]
    //
    //Explanation :
    //Here,   [48]
    //        [20, 28] -->(20 + 28 = 48)
    //        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
    //        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
    //        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        long[] arr = {4,7,3,6,7};
        System.out.println(Arrays.toString(getTriangle(arr,arr.length)));
//        printTriangle(nums);
    }
    public static void printTriangle(int[] nums){
        if(nums.length == 0){
            return;
        }
        int sum = 0;
        int[] arr = new int[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++){
            arr[i] = nums[i] + nums[i+1];
        }

        printTriangle(arr);

        System.out.println(Arrays.toString(nums));
    }

    // INCOMPLETE
    public static long[] getTriangle(long[] arr, long n) {
        long[] num = new long[(int) n * (int) n];
        if(n == 1){
            return helper(num,arr);
        }

        long[] nums = new long[(int) n-1];
        for (int i = 0; i < n-1; i++) {
            nums[i] = arr[i] + arr[i+1];
        }
        long[] copy = getTriangle(nums,nums.length);



        return helper(num,copy);
    }
    public static long[] helper(long[] temp, long[] num){
        for (int i = 0; i < num.length; i++) {
            temp[i] = num[i];
        }
        return temp;
    }
}
