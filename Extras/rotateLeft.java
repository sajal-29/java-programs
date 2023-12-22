package Extras;
public class rotateLeft {
    public static void rotate(int[] input, int d, int n){
        for (int i = 0; i < d; i++) {
            int temp = input[0];
            for (int j = 0; j < n-1; j++) {
                input[j] = input[j+1];
            }
            input[n-1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr, 2, arr.length);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
