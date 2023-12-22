package Extras;
public class removeDupes {
    public static void removeDuplicate(int[] arr){
        int check = 0;
        int count = 0;
        check = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(check == arr[i]){
                count++;
            }
            else{
                check = arr[i];
            }
        }
        int[] copy = new int[arr.length-count]; 
        int k = 1;
        copy[0] = check = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(check != arr[i]){
                copy[k] = arr[i];
                check = arr[i];
                k++;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {11,11,12,12,13,13};
        removeDuplicate(arr);
    }
}
