package LEETCODE;


public class setMismatch {
    public static int[] findErrorNums(int[] nums) {
        //Find the number that occurs twice and the number that is missing
        // and return them in the form of an array
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
                return new int[]{nums[j],j+1};

            }
        }
        return new int[]{-1,-1};
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        for (int i : findErrorNums(nums)) {
            System.out.print(i+" ");
        }
    }
}
