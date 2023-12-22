package Arrays;

public class Question1Dupe {
    public static void populate(int[] arr, int howMuch) {
    int start = 0;
    int end = howMuch;
    int val = 1;
    while(start<=end){
        if(val%2!=0){
            arr[start] = val;
            start++;
            val++;
        }
        else{
            arr[end]= val;
            val++;
            end--;
        }
    }

     
}

public static void main(String[] args) {
        int[] arr = new int[10];
        int howMuch = 4;
        populate(arr, howMuch);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
