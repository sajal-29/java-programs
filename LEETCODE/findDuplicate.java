package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class findDuplicate {
    //PROBLEM: find duplicate elements in an array from 1...N

    public static int findDupe(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else if(nums[i]==nums[correct] && i != correct){
                return nums[i];
            }
            else{
                i++;
            }
        }
        return 0;
    }
    public static List<Integer> findDuplicates(int[] nums){

        // PROBLEM: find multiple duplicates
        int i = 0;
        List<Integer> ll = new ArrayList<>();
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]-j != 1){
                ll.add(nums[j]);

            }
        }
        return ll;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDupe(nums));
        System.out.println(findDuplicates(arr));
    }
}
