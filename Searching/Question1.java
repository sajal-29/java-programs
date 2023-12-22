package Searching;

public class Question1 {
    // finding total no. of numbers having even digits

    static int findEvenNumberLength(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int digits = ((int)Math.log10(arr[i])+1);
            if(digits%2 == 0 && digits!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,32,54,6654,755};
        System.out.println(findEvenNumberLength(arr));
    }
}
