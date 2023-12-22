package Arrays;

import java.util.Scanner;

public class Question1 {
    // populating the array like 1,3,5,.....6,4,2
    public static void populate(int[] arr, int howMuch){
        int indexFront = 0;
        int indexBack = howMuch;
        for (int i = 0; i <= howMuch; i++) {
            if(i%2==0){
                arr[indexFront] = i+1;
                indexFront++;
            }else{
                arr[indexBack] = i+1;
                indexBack--;
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        populate(arr, n-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
