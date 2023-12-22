package Extras;
public class sumoftowarrays {
    public static int[] sum(int[] arr, int[] nums, int sizeofarr, int sizeofnums){
        int end1 = arr.length-1;
        int end2 = nums.length-1;
        int size = arr.length > nums.length? arr.length+1 : nums.length+1;
        int carry = 0;
        int[] output = new int[size];
        while(end1 >= 0 && end2 >= 0){
            output[size - 1] = arr[end1]+nums[end2]+carry;
            carry = output[size-1]/10;
            output[size-1] = output[size-1]%10;

            end1--;
            end2--;
            size--;
    
        }
        while(end1 >= 0){
            output[size - 1] = arr[end1]+carry;
            carry = output[size-1]/10;
            output[size-1] = output[size-1]%10;

            end1--;
            size--;
        }
        while(end2 >= 0){
            output[size - 1] = nums[end2]+carry;
            carry = output[size-1]/10;
            output[size-1] = output[size-1]%10;
                
            end2--;
            size--;
        }
        if(size>=0){
            output[size-1] = carry;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {0};
        int[] nums = {6,9,8,5};
        for (int i : sum(arr, nums, arr.length, nums.length)) {
            System.out.print(i+ " ");
        }
    }
}
