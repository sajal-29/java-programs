package Extras;
public class majorityElement {
    public static int majority(int[] nums){
        int count = 0;
        int num = 0;
        // int max = 0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(num == nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
            count = 0;

        }
        return nums[0];
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majority(nums));
    }
}
