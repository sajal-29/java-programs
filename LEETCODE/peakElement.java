package LEETCODE;

class peakElement{
    public static int findPeakElement(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (end-start)/2 + start;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,0,1,2,3,4};
        System.out.println(findPeakElement(arr));
    }
}