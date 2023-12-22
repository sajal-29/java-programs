public class rotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(rotatedBinarySearch(arr,1,0, arr.length-1));
    }
    public static int rotatedBinarySearch(int[] num, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(num[mid] == target){
            return mid;
        }
        if(num[start] <= num[mid]){
            if(target >= num[start] && target <= num[mid]){
                return rotatedBinarySearch(num, target, start, mid-1);
            } else {
                return rotatedBinarySearch(num, target, mid+1, end);
            }
        } else {
            if(target >= num[start] && target <= num[end]){
                return rotatedBinarySearch(num, target, mid+1, end);
            } else {
                return rotatedBinarySearch(num, target, start, mid-1);
            }
        }


    }
}
