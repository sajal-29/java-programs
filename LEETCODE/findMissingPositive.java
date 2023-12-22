package LEETCODE;

public class findMissingPositive {
    public static int firstMissingPositive(int[] nums){
        int i = 0;
        int n = nums.length;
        while(i<n){
            int correct = Math.abs(nums[i])-1;
            if(nums[i] <= n && nums[i] > 0 && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
        System.out.println(firstMissingPositive(arr));
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}
