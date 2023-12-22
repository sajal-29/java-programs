package Arrays;

public class arraylength {
    public static void printArray(int[] arr){
        System.out.println("In function "+arr.length);
        arr[0] = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;

        System.out.println("In main "+ n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        printArray(arr);
    }
}
