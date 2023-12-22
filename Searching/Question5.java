package Searching;

public class Question5 {
    //PROBLEM: printing all the subarrays of an array
    public static void subArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void SumOfSubArray(int[] arr){
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    count+=arr[k];
                    max = Math.max(max, count);
                }
                System.out.println("("+arr[i]+" to "+arr[j]+") = "+count);
                count = 0;
                
            }
            System.out.println();
        }
        System.out.println("Max: "+ max);
    }
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        SumOfSubArray(arr);
    }
}
