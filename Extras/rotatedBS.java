package Extras;
public class rotatedBS {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};
        System.out.println(RotatedBS(arr));
    }
    public static int RotatedBS(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[start] && arr[mid] > arr[mid+1]){
                return start;
            }
            if(arr[start] > arr[end]){
                end = mid+1;
            }
            else{
                start = mid+1;
            }
            
        }
        return 0;

    }
}
