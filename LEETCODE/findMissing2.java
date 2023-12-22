package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class findMissing2 {
    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ll = new ArrayList<>();
        int i = 0;
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
                ll.add(j+1);
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
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
