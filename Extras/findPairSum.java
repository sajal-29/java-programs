package Extras;

import java.util.Arrays;

public class findPairSum {
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,5,4,3,2,4};
        System.out.println(pairSum(arr,0,7));
        System.out.println(pairSumLessTimeComplexity(arr, 0, 7));
    }

    public static int pairSum(int[] arr, int n, int num){
        int duplicate1 = 0;
        int duplicate2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == num){
                    n++;
                }
            }
        }
        return n;
    }
    public static int pairSumLessTimeComplexity(int[] arr, int n, int num){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while(start < arr.length-1 && end > 0){
            int sum = arr[start] + arr[end];
            if(sum == num ){
                start ++;
                end --;
                n++;
            }
            else if(sum > num){
                end--;
            } else{
                start++;
            }
        }
        return n;
    }


}
