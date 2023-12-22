package Extras;
public class removeDupesinSortedArray {
    public static int removeDuplicates(int[] nums){
        int k = 0;
        int i = nums[0]-1;
        for (int j = 0; j < nums.length; j++) {
            if(i != nums[j]){
                i = nums[j];
                nums[k] = i;
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        
    }
}
